package br.codenation.cursojava.aula6.tdd.calculadora;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void deveriaSomarDoisValoresPassados() throws Exception {
        int primeiroValor = 1;
        int segundoValor = 2;

        int soma = calculadora.soma(primeiroValor, segundoValor);

        assertEquals(3, soma);
    }

    @Test
    public void deveriaSubtrairDoisValoresPassados() throws Exception {
        int primeiroValor = 5;
        int segundoValor = 3;

        int subtracao = calculadora.subtracao(primeiroValor, segundoValor);

        assertEquals(2, subtracao);
    }

    @Test
    public void deveriaDividirDoisValoresPassados() throws Exception {
        int primeiroValor = 8;
        int segundoValor = 2;

        int divisao = calculadora.divisao(primeiroValor, segundoValor);

        assertEquals(4, divisao);
    }

    @Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero() {
        int primeiroValor = 8;
        int segundoValor = 0;

        calculadora.divisao(primeiroValor, segundoValor);
    }
}
