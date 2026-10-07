package org.example.atividadeHashSet;

import java.util.HashSet;

public class Exercicio5 {
    public static void main(String[] args) {

       /*5. Crie um HashSet com três frutas e percorra ele com for,
   imprimindo uma por linha.*/

        HashSet<String> frutas = new HashSet<>();


        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Uva");


        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }
}
