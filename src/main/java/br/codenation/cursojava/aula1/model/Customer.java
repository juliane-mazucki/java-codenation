package br.codenation.cursojava.aula1.model;

public class Customer {
    public String name;
    private int age;
    private String document;


    public Customer() {
        name = "nome";
        age = 28;
        Customer.metodoEstatico();
    }

    public Customer(String n, int a) {
        name = n;
        age = a;
    }

    public Customer(String n, int a, String d) {
        this(n, a);
        document = d;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Customer)) {
            return false;
        }
        Customer object = ((Customer) obj);

        if (this.age != object.age) {
            return false;
        }
        if (this.name == null ^ object.name == null) {
            return false;
        }

        Customer.metodoEstatico();

        return this.name == null || this.name.equals(object.name);
    }

    public static void metodoEstatico() {
        //System.out.println(this.name);
        //this.equals(new Customer());
    }

}
