package br.codenation.cursojava.aula6.designpatterns.strategy;

public class TesteCalculadora {

    public static void main(String[] args) {
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        ICMS icms = new ICMS(100.0);
        IPI ipi = new IPI(100.0);
        System.out.println(calculadora.calcular(icms));
        System.out.println(calculadora.calcular(ipi));
    }
}
