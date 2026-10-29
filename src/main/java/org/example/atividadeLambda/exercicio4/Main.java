package org.example.atividadeLambda.exercicio4;

public class Main {

    static void repetir(Acao acao){
        acao.executar();
        acao.executar();
    }
    public static void main(String[] args) {
        repetir(() -> System.out.println("oi"));


    }
}
