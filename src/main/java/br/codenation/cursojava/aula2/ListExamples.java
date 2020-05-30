package br.codenation.cursojava.aula2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author julianemazucki
 * @version
 *
 */
public class ListExamples {

    /**
     * Método prinicipal da classe
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> primeNumbers = new ArrayList<Integer>();


        for (String string : args) {

            Integer number = Integer.valueOf(string);

            allNumbers.add(number);

            if (isPrimeNumber(number)) {
                primeNumbers.add(number);
            }
        }

        printNumbers("Todos os números", allNumbers);
        printNumbers("Números primos", primeNumbers);

        allNumbers.remove(0);
        printNumbers("Todos os números", allNumbers);
    }

    private static boolean isPrimeNumber(Integer number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {

            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @deprecated dsgshgsd
     * @throws Exception
     * @param label askjfasfhk
     * @param numbers djshghsdkjgh
     */
    private static void printNumbers(String label, List<Integer> numbers) {
        System.out.println();
        System.out.println(label + ": ");

        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
