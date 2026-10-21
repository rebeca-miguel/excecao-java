package org.example.aula19.interfaces;

public class Main {

    public static void conectarBanco(BancoDeDados banco){
        System.out.println(banco.chamarBanco());
    }

    public static void main(String[] args) {
        BancoDeDados mysql = new MySql();
        BancoDeDados oracle = new Oracle();

        conectarBanco(mysql);
        conectarBanco(oracle);




        //System.out.println("Número: " + banco.getNumero());




    }
}
