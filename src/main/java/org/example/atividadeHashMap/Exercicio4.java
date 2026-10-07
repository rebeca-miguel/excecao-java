package org.example.atividadeHashMap;

import java.util.HashMap;

public class Exercicio4 {
    public static void main(String[] args) {


        /*4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
   Use getOrDefault para mostrar a quantidade de um produto que existe
   e de um que não existe (devolvendo 0). Depois tente com get normal
   no que não existe e compare.*/

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Café", 5);
        estoque.put("Uva", 10);

        System.out.println("Quantidade de café: " + estoque.getOrDefault("Café", 0));

        System.out.println("Quantidade de Feijão: " + estoque.getOrDefault("Feijão", 0));

        System.out.println("Usando get: " + estoque.get("Feijão"));
    }
}
