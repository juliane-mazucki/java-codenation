package br.codenation.cursojava.aula2;

public class SortArray {

    public static void main(String[] args) {

        int i = 0;

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);


        System.out.println("Bubble");
        bubbleSort(new int[]{13, 5, 2, 1, 9});

        System.out.println("Selection");
        selectionSort(new int[]{13, 5, 2, 1, 9});

        System.out.println("Insertion");
        insertionSort(new int[]{13, 5, 2, 1, 9});

        System.out.println("Quick");
        quicksort(new int[]{13, 5, 2, 1, 9}, 0, 5, true);
    }

    private static void bubbleSort(int[] original) {
        printNumbers(original);
        System.out.println();

        for (int i = original.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (original[j - 1] > original[j]) {
                    int aux = original[j];
                    original[j] = original[j - 1];
                    original[j - 1] = aux;
                    printNumbers(original);
                }
            }
        }

        System.out.println("\n");
    }

    private static void selectionSort(int[] original) {
        printNumbers(original);
        System.out.println();

        for (int indice = 0; indice < original.length; ++indice) {
            int indiceMenor = indice;
            for (int indiceSeguinte = indice + 1; indiceSeguinte < original.length; ++indiceSeguinte) {
                if (original[indiceSeguinte] < original[indiceMenor]) {
                    indiceMenor = indiceSeguinte;
                }
            }
            int aux = original[indice];
            original[indice] = original[indiceMenor];
            original[indiceMenor] = aux;
            printNumbers(original);
        }

        System.out.println("\n");
    }

    private static void insertionSort(int original[]) {
        printNumbers(original);
        System.out.println();

        int i, key, j;
        for (i = 1; i < original.length; i++) {
            key = original[i];
            j = i - 1;
            while (j >= 0 && original[j] > key) {
                original[j + 1] = original[j];
                j = j - 1;
            }
            original[j + 1] = key;
            printNumbers(original);
        }

        System.out.println("\n");
    }

    private static void quicksort(int values[], int began, int end, boolean start) {
        if (start) {
            printNumbers(values);
        }
        System.out.println();

        int i, j, pivo, aux;
        i = began;
        j = end - 1;
        pivo = values[(began + end) / 2];
        while (i <= j) {
            while (values[i] < pivo && i < end) {
                i++;
            }
            while (values[j] > pivo && j > began) {
                j--;
            }
            if (i <= j) {
                aux = values[i];
                values[i] = values[j];
                values[j] = aux;
                i++;
                j--;
            }
        }
        printNumbers(values);
        if (j > began)
            quicksort(values, began, j + 1, false);
        if (i < end)
            quicksort(values, i, end, false);
    }

    private static void printNumbers(int numbers[]) {
        System.out.println();
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
