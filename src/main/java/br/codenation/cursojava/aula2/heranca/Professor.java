package br.codenation.cursojava.aula2.heranca;

import java.util.Date;

public class Professor extends Funcionario {

    public String disciplina;

    public Professor(String _nome, String _cpf, Date _data, double _salario, Date _dataAdmissao, String _disciplina) {
        super(_nome, _cpf, _data, _salario, _dataAdmissao, "Professor");
        this.disciplina = _disciplina;
    }

    public double tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 0.0;
    }
}
