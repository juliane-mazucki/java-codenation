package br.codenation.cursojava.aula2;

import br.codenation.cursojava.aula1.Aplicacao;

public class Operacao {

    private int operando1;
    private int operando2;

    Operacao(int _operando1, int _operando2) {
        this.operando1 = _operando1;
        this.operando2 = _operando2;
    }

    public Integer somar() {
        return operando1 + operando2;
    }


    public Integer subtrair() {
        return operando1 - operando2;
    }

    public Integer multiplicar() {
        return operando1 * operando2;
    }

    public Integer dividir() {
        return operando1 / operando2;
    }

    public void teste() {

        Aplicacao.contador++;

        Aplicacao.main(new String[]{});

        System.out.println(Aplicacao.contador);

    }

}
