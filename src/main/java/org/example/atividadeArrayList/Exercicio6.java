package org.example.atividadeArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*- Crie uma lista com cinco nomes. Peça um nome à pessoa e
        diga se ele está na lista e em qual posição. Se não estiver, avise.
         */

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joana");
        nomes.add("Laura");
        nomes.add("Paula");
        nomes.add("Luan");
        nomes.add("Marta");

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        if (nomes.contains(nome)) {
            System.out.println("O nome está na lista.");
            System.out.println("Posição: " + nomes.indexOf(nome));
        } else {
            System.out.println("O nome não está na lista.");
        }

    }
}
