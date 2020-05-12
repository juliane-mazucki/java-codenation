package br.codenation.cursojava.aula3.concurrency;

public class Program implements Runnable {

    private int id;

    public Program(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Program " + id + " value: " + i);
        }
    }
}
