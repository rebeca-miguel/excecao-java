package org.example.atividadeHashSet;

import java.util.HashSet;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {


        /*2. Crie um HashSet de cores usando addAll.
        Depois use contains dentro de um if para avisar
        se a cor "verde" já está no conjunto ou não.*/

        HashSet<String> cores = new HashSet<>();

        cores.addAll(Set.of("Azul", "Amarelo", "Verde", "Vermelho"));

        if (cores.contains("Verde")) {
            System.out.println("A cor verde está no conjunto.");
        } else {
            System.out.println("A cor verde não está no conjunto.");
        }

    }
}
