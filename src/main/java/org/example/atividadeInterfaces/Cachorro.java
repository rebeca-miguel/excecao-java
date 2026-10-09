package org.example.atividadeInterfaces;

public class Cachorro implements Animal{

    /*1. Crie uma interface Animal com o método emitirSom().
   Crie a classe Cachorro que implementa ela e imprime "Au au!".
   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.*/

    @Override
    public void emitirSom() {
        System.out.println("Au au!!");
    }
}
