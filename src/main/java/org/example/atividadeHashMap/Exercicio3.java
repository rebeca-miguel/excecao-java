package org.example.atividadeHashMap;

import java.util.HashMap;

public class Exercicio3 {
    public static void main(String[] args) {

        /*
3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
   dentro de um if para mostrar o telefone de alguém que está na agenda
   e de alguém que não está.
   */

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Mauro", "11736494839");
        agenda.put("Joana", "11938264747");

        if (agenda.containsKey("Mauro")) {
            System.out.println("Telefone do Mauro: " + agenda.get("Mauro"));
        } else {
            System.out.println("Mauro não está na agenda");
        }

        if (agenda.containsKey("Rebeca")) {
            System.out.println("Telefone da Rebeca: " + agenda.get("Rebeca"));
        } else {
            System.out.println("Rebeca não está na agenda.");
        }

    }
}
