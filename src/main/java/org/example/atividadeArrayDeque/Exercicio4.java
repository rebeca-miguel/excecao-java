package org.example.atividadeArrayDeque;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio4 {
    public static void main(String[] args) {

        /*4. Crie uma fila com três nomes e atenda todos usando
   while (!fila.isEmpty()). No final, imprima "Fila vazia!".*/


        Queue<String> fila = new LinkedList<>();

        fila.add("João");
        fila.add("Rosa");
        fila.add("Ailton");


        while (!fila.isEmpty()) {
            System.out.println("Atendendo: " + fila.poll());
        }

        System.out.println("Fila vazia!");
    }
}
