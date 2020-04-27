package br.codenation.cursojava.aula1;

import br.codenation.cursojava.aula1.model.Calculadora;
import br.codenation.cursojava.aula1.model.Customer;

import br.codenation.cursojava.aula2.Cachorro;
import java.lang.System;

public class Aplicacao {

    public static int contador = 0;

    public static void main(String[] args) {

        Customer c = new Customer();

        Customer c1 = new Customer("Igor", 23);
        Customer c2 = new Customer("Igor", 23);
        boolean isEqual = c1.equals(c2);

        System.out.println(isEqual);

        System.out.println(Cachorro.SRD);


    }

    private void teste(int a, int b, String diaDaSemana, boolean deveEscrever, Integer inteiro1, Integer inteiro2) {

        Aplicacao aplicacao = new Aplicacao();
        //aplicacao.teste();

        Aplicacao.main(new String[]{"2", "bla"});
        Aplicacao.contador++;

        String resultado = a > b ? "a > b" : "a <= b";

        if (a > b) {
            resultado = "a > b";
        } else {
            resultado = "a <= b";
        }


        if ((inteiro1 == null && inteiro2 != null) || (inteiro1 != null && inteiro2 == null)) {

        }

        if (inteiro1 == null ^ inteiro2 == null) {

        }


        if (a > 10 && diaDaSemana.equals("DOMINGO")) {
            System.out.println("Lindo dia!");
        } else if (b < -2 || diaDaSemana.equals("SÁBADO")) {
            System.out.println("Dia de curso!");
        } else if (b == 0 ^ deveEscrever) {
            System.out.println("");
        } else if (!deveEscrever) {
            System.out.println(":(");
        } else {
            System.out.println("-");
        }

        if (a == b) {
            System.out.println("Valores iguais");
        }

        if (a != b) {
            System.out.println("Valores diferentes");
        }
        if (a > b) {
            System.out.println("a maior que b");
        }
        if (a >= b) {
            System.out.println("a maior ou igual a b");
        }
        if (a < b) {
            System.out.println("a menor que b");
        }
        if (a <= b) {
            System.out.println("a menor ou igual a b");
        }
    }

    public String exampleOfSwitch(String animal) {
        String result = null;
        switch (animal) {
            case "DOG":
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        return result;
    }

    private String format(double moneyValue) {
        return "Valor: " + moneyValue;
    }

    protected double average(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    public int count(String text, char character) {
        return text.length();
    }

    String getName() {
        return "";
    }

}
