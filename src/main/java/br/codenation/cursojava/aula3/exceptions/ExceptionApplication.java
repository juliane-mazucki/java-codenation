package br.codenation.cursojava.aula3.exceptions;

public class ExceptionApplication {

    public static void main(String[] args) {

        // System.out.println(30 / 5);

        // System.out.println(args[5]);

        Integer a = null;
        // System.out.println(a.toString());

        //catchExceptions(args);

        //throwsException();

    }

    private static void catchExceptions(String[] args) {

        try {
            System.out.println("Começou a execução");

            System.out.println(30 / 6);

            //System.out.println(args[0]);

            Integer a = null;
            System.out.println(a.toString());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            System.out.println("Caiu em Exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminou a execução");
        }

        System.out.println("Retomou");

    }

    private static void throwsException() throws DogException {
        Dog dog = new Dog();
        dog.setAge(0);
        dog.setBreed("Labrador");
        dog.setWeigth(30);
        dog.setName("Thor");
    }
}
