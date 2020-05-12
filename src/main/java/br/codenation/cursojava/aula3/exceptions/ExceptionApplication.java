package br.codenation.cursojava.aula3.exceptions;

public class ExceptionApplication {

    public static void main(String[] args) {

        //System.out.println(30 / 0);

        //System.out.println(args[0]);

        Integer a = null;
        //System.out.println(a.toString());

        catchExceptions(args);

        // throwsException();

    }

    private static void catchExceptions(String[] args) {

        try {
            System.out.println("Começou a execução");

            //System.out.println(30 / 0);

            //System.out.println(args[0]);

            Integer a = null;
            //System.out.println(a.toString());
        } catch (ArithmeticException e) {
            System.out.println("Caiu em ArithmeticException");
            System.err.println(e.getStackTrace());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caiu em ArrayIndexOutOfBoundsException");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caiu em NullPointerException");
            e.printStackTrace();
        } finally {
            System.out.println("Terminou a execução");
        }

    }

    private static void throwsException() throws DogInvalidNameException {
        Dog dog = new Dog();
        dog.setAge(0);
        dog.setBreed("Labrador");
        dog.setWeigth(30);
        dog.setName("Thor");
    }
}
