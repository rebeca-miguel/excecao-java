package org.example.atividadeLambda.exercicio6;

public class Main {

    static  void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor)) {
            acao.executar();
        }
    }
    public static void main(String[] args) {
        executarSe(
                n -> n % 2 == 0,
                4,
            () -> System.out.println("é par!")
        );
        executarSe(
                n -> n % 2 == 0,
                7,
                () -> System.out.println("é impar!")

        );

    }
}
