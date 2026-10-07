package org.example.atividadeHashSet;

import java.util.HashSet;

public class Exercicio4 {
    public static void main(String[] args) {
        
        /*4. Crie um HashSet com três CPFs e imprima. 
        Depois remova um deles e
        imprima de novo, junto com o tamanho.*/

        HashSet<String> cpfs = new HashSet<>();

        cpfs.add("12345678906");
        cpfs.add("76859463920");
        cpfs.add("04938475928");

        System.out.println("CPFs: " + cpfs);

        cpfs.remove("76859463920");


        System.out.println("Depois da remoção: " + cpfs);

        System.out.println("Depois da remoção: " + cpfs.size());
    }
}
