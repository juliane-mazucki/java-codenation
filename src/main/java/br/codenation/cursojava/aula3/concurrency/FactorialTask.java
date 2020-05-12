package br.codenation.cursojava.aula3.concurrency;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Long> {
    int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    public Long call() {

        if (number <= 0) {
            throw new IllegalArgumentException();
        }

        Long fact = 1L;
        for (int count = number; count > 1; count--) {
            fact = fact * count;
            System.out.println(fact);
        }

        return fact;
    }
}
