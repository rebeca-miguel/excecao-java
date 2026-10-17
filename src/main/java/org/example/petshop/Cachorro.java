package org.example.petshop;

public class Cachorro extends Pet{

    public Cachorro() {
        super();
    }

    public Cachorro(String nome, double peso) {
        super(nome, "Cachorro", peso);
    }

    @Override
    public void emitirSom() {

        System.out.println(getNome() + " está latindo: Au au!");
    }

    public void buscarBolinha() {

        System.out.println(getNome() + " foi buscar a bolinha!");
    }
}

