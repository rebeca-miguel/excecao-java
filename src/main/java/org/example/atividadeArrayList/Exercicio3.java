package org.example.atividadeArrayList;

import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {

        /*- Crie uma lista com quatro nomes. Troque o nome da posição 2
         por outro e imprima a lista antes e depois.
         */

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ailton");
        nomes.add("Yola");
        nomes.add("Maura");
        nomes.add("Nicolly");

        System.out.println("Antes: " + nomes);

        nomes.set(2, "João");

        System.out.println("Depois: " +nomes);
    }
}
