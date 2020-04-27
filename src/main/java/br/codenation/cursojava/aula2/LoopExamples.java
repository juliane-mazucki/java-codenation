package br.codenation.cursojava.aula2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopExamples {

    public static void main(String[] args) {
        forExamples();
        System.out.println();
        foreachExamples();
        System.out.println();
        whileExample();
        System.out.println();
        doWhileExample();
        System.out.println();
        breakExample();
        System.out.println();
        continueExample();
        System.out.println();
        labeledInstruction();

    }

    private static void forExamples() {

        System.out.print("for: [");
        for (int x = 0; x < 10 | (x % 2) == 0; x++) {
            System.out.print(x);
            if (x < 10) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("for iterator: ");
        List<String> words = Arrays.asList("Hoje", "está", "um", "lindo", "dia!");
        for (Iterator<String> i = words.iterator(); i.hasNext(); ) {
            System.out.print(i.next() + " ");
        }
    }


    private static void foreachExamples() {
        System.out.print("foreach: ");
        List<String> words = Arrays.asList("Hoje", "está", "um", "lindo", "dia!");
        for (String s : words) {
            System.out.print(s + " ");
        }
    }

    private static void whileExample() {
        System.out.print("while: ");
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            sum += x;
            System.out.println("x = " + x + " e soma = " + sum);
            x++;
        }
    }

    private static void doWhileExample() {
        System.out.print("do while: ");
        int x1 = 0;
        int x2 = 1;

        do {
            int fibonacci = x1 + x2;
            x1 = x2;
            x2 = fibonacci;

            System.out.println("x1 = " + x1 + " e fibonacci = " + fibonacci);
        } while (x1 < 100);
    }

    private static void breakExample() {
        int sum = 0;

        for (int i = 0; i < 40; i++) {
            sum += i;
            System.out.println("i = " + i + " e sum: " + sum);
            if (sum > 500) {
                break;
            }
        }

        for (int i = 6; i < 40; i++) {
            if (!ArrayExamples.isPrimeNumber(i)) {
                System.out.println(i + " não é primo.");
            } else {
                System.out.println(i + " é primo!");
                break;
            }
        }


    }

    private static void continueExample() {
        int sum = 0;

        for (int i = 0; i < 40; i++) {
            sum += i;
            if (sum > 500 && sum < 600) {
                continue;
            }
            System.out.println("i = " + i + " e sum: " + sum);
            System.out.println("olá");
        }

        for (int i = 1; i < 40; i++) {
            if (ArrayExamples.isPrimeNumber(i)) {
                System.out.println(i + " é primo!");
                continue;
            }
            System.out.println(i + " não é primo");
        }
    }

    private static void labeledInstruction() {
        rotulo:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                break rotulo;
            }
            System.out.println("CERTIFICACAO");
        }
        System.out.println("Good-Bye");

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("CERTIFICACAO");
        }
        System.out.println("Good-Bye");

    }
}
