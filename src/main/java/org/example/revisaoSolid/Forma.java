package org.example.revisaoSolid;

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public  void exibirNome() {
        System.out.println("Forma: " + nome);
    }

    public  abstract double calcularArea();
}
