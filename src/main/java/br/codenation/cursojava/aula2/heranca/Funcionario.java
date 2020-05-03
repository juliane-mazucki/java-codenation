package br.codenation.cursojava.aula2.heranca;

import java.util.Date;

public class Funcionario extends Pessoa {

    public double salario;
    public Date dataAdmissao;
    public String cargo;

    public Funcionario(String _nome, String _cpf, Date _data, double _salario, Date _dataAdmissao, String _cargo) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.dataAdmissao = _dataAdmissao;
        this.cargo = _cargo;
    }

    @Override
    @Deprecated
    public void confirmarPresenca() {
        // Bater o ponto
    }
}
