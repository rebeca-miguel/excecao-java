package org.example.atividadeExcecao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

    /*1 — Faça um programa que peça dois números inteiros e
    mostre a divisão do primeiro pelo segundo.
    Se a pessoa digitar 0 no segundo, trate a ArithmeticException
    e mostre uma mensagem explicando que não dá pra dividir por zero.*/

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número:");
         numero1 = sc.nextInt();


        System.out.println("Digite o primeiro número:");
        numero2 = sc.nextInt();


        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }


    }
}
