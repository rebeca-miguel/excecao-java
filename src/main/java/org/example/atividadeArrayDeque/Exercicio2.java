package org.example.atividadeArrayDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {

        /*2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
   imprima a fila logo depois. Repare que ela não mudou.*/


        Queue<String> fila = new LinkedList<>();

        fila.addAll(Set.of("Rebeca", "Lito", "Júlia"));

        //O peek serve para olhar quem é o primeiro da fila sem remover a pessoa.
        System.out.println("Próximo: " + fila.peek());

        System.out.println("Fila: " + fila);
    }
}
