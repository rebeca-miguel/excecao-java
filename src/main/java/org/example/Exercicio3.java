package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        /*
3 — Peça a idade da pessoa com scanner.nextInt().
Se ela digitar um texto em vez de um número, trate a InputMismatchException
e mostre uma mensagem pedindo um número.*/

        Scanner sc = new Scanner(System.in);

        int idade;

        try {
            System.out.println("Digite sua idade:");
            idade = sc.nextInt();

            System.out.println("A sua idade é: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digitar um número.");
        }

    }

}
