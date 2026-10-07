package org.example.atividadeArrayDeque;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio5 {
    public static void main(String[] args) {

        /*5. Crie uma fila com três nomes e use contains para responder duas
   perguntas: se "Bia" está na fila e se "Zoe" está.*/

        Queue<String> fila = new LinkedList<>();

        fila.add("Paulo");
        fila.add("Maria");
        fila.add("Carlos");

        if (fila.contains("Paulo")) {
            System.out.println("Paulo está na fila.");
        } else {
            System.out.println("Paulo não está na fila");
        }

        if (fila.contains("Júlia")) {
            System.out.println("Júlia está na fila.");
        } else {
            System.out.println("Júlia não está na fila.");
        }

    }
}
