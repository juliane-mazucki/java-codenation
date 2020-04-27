package br.codenation.cursojava.aula1.model;

public class Calculadora {

    public int calcula(int a, int b) {
        return a + b;
    }

    public int calcula(int a, int b, int c) {
        return a + b + c;
    }

    public double calcula(double a, double b) {
        return a + b;
    }

    public String calcula(String nome, int a, int b) {
        int resultado = calcula(a, b);
        return "Resultado: " + resultado;
    }

    public int calcula(int a, byte b) {
        return a + b;
    }

    public void calcula(int a, byte b, int c) {
    }

    public int calcula(byte a, int b) {
        return a + b;
    }




}
