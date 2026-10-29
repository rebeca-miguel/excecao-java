package org.example.atividadeLambda;

public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = () -> System.out.println("Oi");


        saudacao.executar();
    }
}
