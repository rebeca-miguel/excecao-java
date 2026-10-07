package org.example.atividadeExcecao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {


        /*5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        Trate a ArithmeticException para o caso de ela digitar 0.*/

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        try {
            int resto = 100 % numero;

            System.out.println("O resto da divisão é: " + resto);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }

    }
}
