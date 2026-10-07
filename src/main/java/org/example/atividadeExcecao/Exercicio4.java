package org.example.atividadeExcecao;

public class Exercicio4 {
    public static void main(String[] args) {

        /*4 — Crie uma variável String nome = null; e tente imprimir nome.length().
        Trate a NullPointerException e mostre "O nome não foi preenchido."*/

        String nome = null;

        try {
            System.out.println("Quantidade de letras: " +nome.length());
        } catch (NullPointerException e) {
            System.out.println("O noome não foi preenchido.");
        }
    }
}
