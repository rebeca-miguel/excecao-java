package org.example.atividadeArrayDeque;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio6 {
    public static void main(String[] args) {

        /*6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
   - se estiver vazia  -> "Não tem ninguém na fila."
   - se tiver gente    -> "Próximo: [nome]"
   Depois adicione uma pessoa e teste de novo.*/

        Queue<String> fila = new LinkedList<>();

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

        fila.add("Rebeca");

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

    }
}
