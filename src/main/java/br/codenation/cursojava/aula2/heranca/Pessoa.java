package br.codenation.cursojava.aula2.heranca;

import java.util.Date;

public abstract class Pessoa {

    public String nome;
    public String cpf;
    public Date dataNascimento;

    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.dataNascimento = _data;
    }

    public double tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 0.10 * (double) qtd;
    }

    public abstract void confirmarPresenca();

}
