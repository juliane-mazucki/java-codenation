package br.codenation.cursojava.aula2.CollectionAPI;

public class Cliente {

    private Long id;

    private String nome;

    private String document;

    public Cliente() {
    }

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private String endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



}
