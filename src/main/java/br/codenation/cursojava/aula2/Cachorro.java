package br.codenation.cursojava.aula2;

import java.security.InvalidParameterException;

public class Cachorro {

    public final static String SRD = "Vira latas";

    private String nome;

    private String raca;

    private int idade;

    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.trim().length() > 40) {
            throw new InvalidParameterException();
        }
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (nome != null && nome.trim().length() > 30) {
            throw new InvalidParameterException();
        }
        this.raca = raca;
    }

    public String getIdade() {
        return String.valueOf(idade);
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new InvalidParameterException();
        }
        this.idade = idade;
    }

    public String getPeso() {
        return String.valueOf(idade);
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new InvalidParameterException();
        }
        this.peso = peso;
    }

}
