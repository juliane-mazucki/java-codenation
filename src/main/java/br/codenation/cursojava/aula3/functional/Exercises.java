package br.codenation.cursojava.aula3.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 3, 5, 1, 4, 2, 5, 0, 1, 2, 4, 9);

        System.out.println(ex1(numbers));

        System.out.println(ex2(numbers));

    }

    private static List<Integer> ex1(List<Integer> list) {
        return list
                .stream()
                .distinct()
                .sorted((n1, n2) -> n2 - n1)
                .map(obj -> obj * 5)
                .collect(Collectors.toList());

    }

    private static Integer ex2(List<Integer> list) {
        return list
                .stream()
                .filter(obj -> obj % 3 == 0)
                .findFirst()
                .orElseThrow(() -> new NullPointerException());
    }
}
