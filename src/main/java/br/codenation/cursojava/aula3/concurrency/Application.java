package br.codenation.cursojava.aula3.concurrency;

public class Application {
    public static void main(String[] args) {

        GeneratePDF generatePDF = new GeneratePDF();
        Thread pdfThread = new Thread(generatePDF);
        pdfThread.start();

        ProgressBar progressBar = new ProgressBar();
        Thread barThread = new Thread(progressBar);
        barThread.start();

        Program p1 = new Program(1);
        Thread t1 = new Thread(p1);
        t1.start();

        Program p2 = new Program(2);
        Thread t2 = new Thread(p2);
        t2.start();

        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++)
                    System.out.println("Value " + i);
            }
        };
        Thread t = new Thread(r);
        t.start();

        FactorialTask factorialTask = new FactorialTask(20);
        factorialTask.call();
    }
}
