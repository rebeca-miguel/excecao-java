package org.example.atividadeHashSet;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;

public class Exercicio1 {
    public static void main(String[] args) {

        /*1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido.*/

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Paula");
        nomes.add("Maria");
        nomes.add("Rebeca");
        nomes.add("Paula");

        System.out.println(nomes);
        System.out.println("Tamanho: " + nomes.size());

    }
}
