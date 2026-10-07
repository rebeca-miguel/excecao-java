package org.example.atividadeArrayDeque;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio1 {
    public static void main(String[] args) {


        /*1. Crie uma fila e coloque três pessoas nela com add.
        Imprima a fila
         e quantas pessoas tem.*/

        Queue<String> fila = new LinkedList<>();

        fila.add("João");
        fila.add("Rebeca");
        fila.add("Jéssica");

        System.out.println("Fila: " + fila);
        System.out.println("Quantidade de pessoas: " + fila.size());

    }
}
