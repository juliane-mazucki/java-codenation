package br.codenation.cursojava.aula3.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 3);
        Stream<Integer> stream = numbers.stream();
        stream = stream.sorted().distinct();
        List<Object> result = stream.collect(Collectors.toList());
    }

    public void removeEmptyStrings() {
        List<String> strings = Arrays.asList("abc", "", "bc", "abcd", "", "xyz", "foo");
        strings = strings.stream().filter(var -> !var.isEmpty()).collect(Collectors.toList());
    }

    public void sortListAlphabetically() {
        List<String> strings = Arrays.asList("z", "x", "a", "c", "b", "y");
        strings = strings.stream().sorted().collect(Collectors.toList());
    }

    public void sortNumbersReversed() {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        numbers = numbers.stream().sorted((num1, num2) -> num2 - num1).collect(Collectors.toList());
    }

    public void distinctElements() {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5);
        numbers = numbers.stream().distinct().collect(Collectors.toList());
    }

    public void countStringCharacters() {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        List<Integer> totals = strings.stream().map(str -> str.length()).collect(Collectors.toList());
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void sumEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer result = numbers.stream().reduce(0, (total, nextNumber) -> isEven(nextNumber) ? total + nextNumber : total);
    }
}
