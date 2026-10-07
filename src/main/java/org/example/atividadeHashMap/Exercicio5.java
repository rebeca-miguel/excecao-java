package org.example.atividadeHashMap;

import java.util.HashMap;

public class Exercicio5 {
    public static void main(String[] args) {

        /*5. Crie um HashMap de notas com três alunas.
        Imprima o mapa e o tamanho.
        Remova uma delas e imprima de novo.*/

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Rosa", 7.8);
        notas.put("Paulo", 8.5);
        notas.put("Aiden", 9.0);

        System.out.println("Notas: " + notas);
        System.out.println("Tamanho depois: " + notas.size());


        notas.remove("Paulo");

        System.out.println("Notas depois da remoção: " + notas);
        System.out.println("Tamanho depois: " + notas.size());
    }
}
