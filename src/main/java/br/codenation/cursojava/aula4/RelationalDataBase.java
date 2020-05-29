package br.codenation.cursojava.aula5;

import java.sql.*;

public class RelationalDataBase {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {

            String url = "jdbc:postgresql://localhost:5432/";
            String user = "postgres";
            String pass = "postgres";

            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, user, pass);

            statement = connection.createStatement();
            String sql = "SELECT * FROM cliente";

            ResultSet resultSet = statement.executeQuery(sql);
            //STEP 5: Extract data from result set
            while (resultSet.next()) {
                //Retrieve by column name
                int id = resultSet.getInt("numero_cliente");
                int age = resultSet.getInt("idade");
                String first = resultSet.getString("primeiro_nome");
                String last = resultSet.getString("sobrenome");
                String company = resultSet.getString("empresa");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.print(", Last: " + last);
                System.out.println(", Company: " + last);
            }

            resultSet.close();

            statement.executeUpdate("INSERT INTO cliente VALUES (111, 'Rose', 'Perin', 57, 'Bosch')");

            statement.executeUpdate("UPDATE cliente SET idade = idade + 1");

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO cliente VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Valdir");
            preparedStatement.setString(3, "Golf");
            preparedStatement.setInt(4, 59);
            preparedStatement.setString(5, "BCN");
            preparedStatement.executeUpdate();

            statement.executeUpdate("DELETE from cliente WHERE numero_cliente IN (111,222)");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
