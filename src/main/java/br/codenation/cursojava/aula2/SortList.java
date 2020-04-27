package br.codenation.cursojava.aula2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(13, 5, 2, 1, 9);
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(13, 5, 2, 1, 9);
        list2.sort(Comparator.reverseOrder());
        System.out.println(list2);

    }
}
