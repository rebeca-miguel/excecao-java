package org.example.atividadeHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio3 {
    public static void main(String[] args) {

        /*3. Crie um ArrayList com nomes repetidos.
        Use new HashSet<>(lista) para
        tirar os repetidos. Imprima os dois e compare.*/

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Paula");
        lista.add("Maria");
        lista.add("Rebeca");
        lista.add("Paula");

        HashSet<String> conjunto = new HashSet<>(lista);

        System.out.println("ArrayList: " + lista);
        System.out.println("HashSet: " +conjunto);



    }
}
