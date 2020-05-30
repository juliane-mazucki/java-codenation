package br.codenation.cursojava.aula6.designpatterns.abstractfactory;

public class TesteApp {

    public static void main(String args[]) {
        FactoryPessoa factory = new FactoryPessoa();
        factory.getPessoa("Lúcia", "F");
        factory.getPessoa("Carlos", "M");
    }
}
