package org.example.petshop;

public class Gato extends Pet{

    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando: Miau miau!");
    }
}
