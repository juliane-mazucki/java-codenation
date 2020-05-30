package br.codenation.cursojava.aula6.designpatterns.strategy;

public class CalculadoraDeImposto {

    public double calcular(Imposto imposto) {
        return imposto.calcular();
    }
}
