package br.codenation.cursojava.aula3.functional;

import java.util.Arrays;
import java.util.List;

interface Operator {
    float calc(float number1, float number2);
}

class Sum implements Operator {

    @Override
    public float calc(float number1, float number2) {
        return number1 + number2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        System.out.println(
                calculate(15, 10, new Operator() {
                    @Override
                    public float calc(float number1, float number2) {
                        return number1 + number2;
                    }
                })
        );

        System.out.println("Imprime o quadrado de todos os elementos da lista!");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(n -> System.out.println(n * n));
    }

    public static float calculate(float number1, float number2, Operator operator) {
        return operator.calc(number1, number2);
    }
}