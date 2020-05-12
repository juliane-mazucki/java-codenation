package br.codenation.cursojava.aula3.exceptions;

public class Cat {

    public String name;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("A");
        try {
            System.out.println("B");
            name.toString();
            System.out.println("C");
        } catch (NullPointerException e) {
            System.out.println("D");
            throw e;
        }
        System.out.println("E");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.meow();
        System.out.println("F");
    }
}
