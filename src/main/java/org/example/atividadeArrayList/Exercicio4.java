package org.example.atividadeArrayList;

import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {

        /*- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
         */

        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("São Paulo");
        cidades.add("Mato Grosso do Sul");
        cidades.add("Brazilia");
        cidades.add("Ceará");

        System.out.println("Antes: " + cidades);

        cidades.remove(1);


        System.out.println("Depois: " + cidades);
        System.out.println("Quantidade que sobrou: " + cidades.size());

    }
}
