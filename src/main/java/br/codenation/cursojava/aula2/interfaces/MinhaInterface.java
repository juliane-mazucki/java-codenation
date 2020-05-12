package br.codenation.cursojava.aula2.interfaces;

import br.codenation.cursojava.aula3.annotation.MyAnnotation;

import java.io.File;

@FunctionalInterface
@MyAnnotation(number = 1, date = "25/04/2020")
public interface MinhaInterface {

    public void escrever(String texto);

    // public void ler(File arquivo);

}
