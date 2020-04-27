package br.codenation.cursojava.aula2.heranca;

import java.util.Date;

public class AplicacaoEscola {


    public static void main(String[] args) {

        Pessoa aluno = new Aluno("João", "11111111111", new Date(), "1234567890");
        Pessoa funcionario = new Funcionario("Maria", "22222222222", new Date(), 1000.0, new Date(), "Secretária");
        Pessoa professor = new Professor("Rita", "33333333333", new Date(), 1500.0, new Date(), "Matemática");

        System.out.println(aluno.tirarCopias(5));
        System.out.println(funcionario.tirarCopias(7));
        System.out.println(professor.tirarCopias(100));

    }

}
