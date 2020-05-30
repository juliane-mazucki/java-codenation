package br.codenation.cursojava.aula6.designpatterns.abstractfactory;

public class Homem extends Pessoa {

    public Homem(String nome) {
        this.nome = nome;
        System.out.println("Olá Senhor " + this.nome);
    }
}
