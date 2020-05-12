package br.codenation.cursojava.aula3.exceptions;

public class Run {

    public void go() {
        System.out.println("1");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.println("2");
        } finally {
            System.out.println("3");
        }
        System.out.println("4");
    }

    public void stop() {
        System.out.println("5");
        Object obj = null;
        obj.toString();
        System.out.println("6");
    }

    public static void main(String[] args) {
        new Run().go();
    }
}
