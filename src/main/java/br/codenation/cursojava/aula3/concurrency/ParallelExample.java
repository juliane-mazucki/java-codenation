package br.codenation.cursojava.aula3.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ParallelExample {
    public static void main(String[] args) {

        System.out.println("\nNormal...");

        List<String> alpha = getData();
        alpha.stream().forEach(a -> System.out.println(a));

        System.out.println("\nParallel...");

        List<String> alpha2 = getData();
        //alpha2.parallelStream().forEach(a -> System.out.println(a));
        alpha2.parallelStream().forEach(a -> System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + a));
    }

    private static List<String> getData() {

        List<String> alpha = new ArrayList<>();

        int n = 97;  // 97 = a , 122 = z
        while (n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }

        return alpha;

    }
}
