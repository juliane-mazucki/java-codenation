package br.codenation.cursojava.aula6.designpatterns.abstractfactory;

import java.security.InvalidParameterException;

public class FactoryPessoa {

    public Pessoa getPessoa(String nome, String sexo) {
        if (sexo.equals("M")) {
            return new Homem(nome);
        }
        if (sexo.equals("F")) {
            return new Mulher(nome);
        }
        throw new InvalidParameterException();
    }
}
