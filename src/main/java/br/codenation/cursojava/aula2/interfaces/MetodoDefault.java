package br.codenation.cursojava.aula2.interfaces;

public interface MetodoDefault {

    public void andar();

    public default void escrever(String texto) {
        System.out.println("texto");
    }
}
