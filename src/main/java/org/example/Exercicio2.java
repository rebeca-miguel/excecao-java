package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /*2 — Crie um array com 5 notas. Peça uma posição para a
        pessoa e mostre a nota daquela posição. Se a posição não existir,
        trate a ArrayIndexOutOfBoundsException
        e avise que o array só vai de 0 a 4.*/

        Scanner sc = new Scanner(System.in);

        //int posicao;

        double[] notas = {5.2, 7.8, 9.6, 10.0};

        System.out.println("Digite uma posição de 0 a 4:");
        int posicao = sc.nextInt();

        try {
            System.out.println("nota: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posicao não existe, o array só vai de 0 a 4.");
        }

    }
}
