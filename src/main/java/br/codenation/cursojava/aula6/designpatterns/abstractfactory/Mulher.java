package br.codenation.cursojava.aula6.designpatterns.abstractfactory;

public class Mulher extends Pessoa {

    public Mulher(String nome) {
        this.nome = nome;
        System.out.println("Olá Senhora " + this.nome);
    }
}
