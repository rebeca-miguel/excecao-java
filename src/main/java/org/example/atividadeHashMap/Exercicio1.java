package org.example.atividadeHashMap;

import java.util.HashMap;

public class Exercicio1 {
    public static void main(String[] args) {


        /*1. Crie um HashMap de nomes e idades com três pessoas.
        Imprima o mapa
   inteiro e depois use get para mostrar a idade de uma delas.*/


        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Maria", 30);
        pessoas.put("Carlos", 25);
        pessoas.put("Rebeca", 16);


        System.out.println("Pessoas: " + pessoas);

        System.out.println("Idade da Rebeca: " + pessoas.get("Rebeca"));

    }
}
