package org.example.atividadeArrayDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {

        /*3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
   depois. Compare com o exercício 2.*/

        Queue<String> fila = new LinkedList<>();

        fila.addAll(Set.of("Maria", "Paulo", "Joana"));

        System.out.println("Fila antes: " + fila);

        fila.poll();

        System.out.println("Fila depois: " + fila);

    }
}
