package br.codenation.cursojava.aula2;

public class ArrayExamples {

    public static void main(String[] args) {

        Integer[] allNumbers = new Integer[10];
        Integer primeNumbers[] = new Integer[10];

        int primeIndex = 0;

        for (int index = 0; index < args.length && index < 10; index++) {

            Integer number = Integer.valueOf(args[index]);

            allNumbers[index] = number;

            if (isPrimeNumber(number)) {
                primeNumbers[primeIndex] = number;
                primeIndex++;
            }
        }

        printNumbers("Todos os números", allNumbers);
        printNumbers(" Números primos", primeNumbers);

        allNumbers[0] = null;
        printNumbers("Todos os números", allNumbers);

        removeElement(primeNumbers, 0);
        printNumbers(" Números primos", primeNumbers);
    }

    public static boolean isPrimeNumber(Integer number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {

            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printNumbers(String label, Integer numbers[]) {
        System.out.println();
        System.out.println(label + ": ");
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
    }

    private static void removeElement(Integer[] numbers, int position) {
        if (position < numbers.length) {

            for (int i = position + 1; i < numbers.length; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers[numbers.length - 1] = null;

        }
    }
}
