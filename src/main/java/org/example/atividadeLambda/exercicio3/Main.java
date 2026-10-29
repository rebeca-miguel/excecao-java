package org.example.atividadeLambda.exercicio3;

public class Main {
    public static void main(String[] args) {

        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maior = (a, b) -> a > b ? a : b;


        System.out.println(soma.calcular(5, 3));
        System.out.println(multiplicacao.calcular(5, 3));
        System.out.println(maior.calcular(5, 3));
    }
}
