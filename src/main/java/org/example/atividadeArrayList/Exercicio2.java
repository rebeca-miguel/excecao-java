package org.example.atividadeArrayList;

import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {

        /*- Crie uma lista já preenchida com quatro frutas. Imprima a primeira,
        a última e quantas frutas tem.
         */

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Laranja");
        frutas.add("Cajú");
        frutas.add("Goiaba");
        frutas.add("Manga");

        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("última fruta: " + frutas.get(frutas.size() - 1));
        System.out.println("Quantidade de frutas: " + frutas.size());
    }
}
