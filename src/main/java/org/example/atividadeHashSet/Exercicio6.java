package org.example.atividadeHashSet;

import java.util.HashSet;

public class Exercicio6 {

    public static void main(String[] args) {
        /*6. Crie um HashSet vazio. Imprima o isEmpty().
        Adicione um valor e
        imprima o isEmpty() de novo.*/

        HashSet<String> nomes = new HashSet<>();

        System.out.println(nomes.isEmpty());

        nomes.add("Rebeca");

        System.out.println(nomes.isEmpty());

    }
}
