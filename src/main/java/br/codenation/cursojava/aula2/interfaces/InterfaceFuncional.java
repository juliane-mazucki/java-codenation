package br.codenation.cursojava.aula2.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceFuncional {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("In another thread");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("In another thread"));
        thread2.start();


        List<String> lista1 = Arrays.asList("Denilson", "Roberto", "Aline", "Janaína");
        Collections.sort(lista1, new Comparator<String>(){
            public int compare(String valor1, String valor2){
                return valor1.length() - valor2.length();
            }
        });
        System.out.println(lista1);

        List<String> lista2 = Arrays.asList("Denilson", "Roberto", "Aline", "Janaína");
        Collections.sort(lista2, (v1, v2) -> v1.length() - v2.length());
        System.out.println(lista2);

        MetodoDefault md = new ImplementaMetodoDefault();

        md.andar();
        md.escrever("bla");
    }
}
