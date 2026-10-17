package org.example.petshop;

public class Gato extends Pet{

    public Gato() {
        super();
    }

    public Gato(String nome, double peso) {
        super(nome, "Gato", peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando: Miau miau!");
    }
}



