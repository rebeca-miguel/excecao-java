package org.example.atividadeArrayList;

import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        /*- Crie uma lista com seis nomes e imprima todos usando um laço,
        no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
         */

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Nica");
        nomes.add("Rosa");
        nomes.add("Júlia");
        nomes.add("Maria");
        nomes.add("Joana");
        nomes.add("Luíza");

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(i + " : " + nomes.get(i));
        }


    }
}
