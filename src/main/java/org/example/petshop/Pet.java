
package org.example.petshop;

public class Pet {

    private String nome;
    private String especie;
    private double peso;

    public Pet() {
    }

    public Pet(String nome, String especie, double peso) {
        setNome(nome);
        setEspecie(especie);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "O nome do pet não pode estar vazio."
            );
        }

        this.nome = nome.trim();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "A espécie não pode estar vazia."
            );
        }

        this.especie = especie.trim();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (!Double.isFinite(peso) || peso <= 0) {
            throw new IllegalArgumentException(
                    "O peso deve ser maior que zero."
            );
        }

        this.peso = peso;
    }

    public String getPorte() {
        return definirPorte();
    }

    private String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public void emitirSom() {
        System.out.println(getNome() + " está fazendo um som.");
    }
}
