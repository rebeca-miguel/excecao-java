package org.example.atividadeForEach;

import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {

        /*1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
   um por linha.*/

        String[] nomes = {"Maria", "Manuel", "Paulo", "João"};

        for (String nome : nomes) {
            System.out.println(nome);

        }

        /*2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        */

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.0);
        notas.add(6.7);
        notas.add(9.0);
        notas.add(7.8);
        notas.add(10.0);

        for (Double nota : notas) {
            System.out.println(nota);
        }

        /*3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
        todas e mostrar a soma e a média.*/

        int[] notas1 = {9, 6, 10, 7};
        int soma = 0;

        for (int nota1 : notas1) {
            soma += nota1;
        }

        double media = (double) soma / notas1.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);




    }

}
