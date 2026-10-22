package org.example.atividadeFactoryAdapterFacade;

public class Main {
    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();

        Animal cachorro = factory.getAnimal("cachorro");
        Animal gato = factory.getAnimal("gato");


        cachorro.emitirSom();
        gato.emitirSom();
    }
}
