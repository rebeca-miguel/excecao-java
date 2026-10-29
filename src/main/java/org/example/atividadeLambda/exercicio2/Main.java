package org.example.atividadeLambda.exercicio2;

public class Main {
    public static void main(String[] args) {

        Impressora maiscula = texto ->
                System.out.println(texto.toUpperCase());


        Impressora minuscula = texto ->
                System.out.println(texto.toLowerCase());


        maiscula.imprimir("Olá mundo!");
        minuscula.imprimir("Olá Mundo");
    }

}
