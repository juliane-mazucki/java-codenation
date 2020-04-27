package br.codenation.cursojava.aula2.heranca;

import java.util.Date;

public class Aluno extends Pessoa {

    public String matricula;

    public Aluno(String _nome, String _cpf, Date _data, String _matricula) {
        super(_nome, _cpf, _data);
        this.matricula = _matricula;
    }

    public double tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 0.7 * (double) qtd;
    }

    public void confirmarPresenca() {
        // TODO Responder a chamada
    }

}
