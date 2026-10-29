package org.example.atividadeLambda.exercicio5;

public class Main {

    static void mostrarResusltado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }
    public static void main(String[] args) {
        mostrarResusltado(n -> n * 2, 5);
        mostrarResusltado(n -> n * n, 5);
        mostrarResusltado(n -> -n, 5);

    }
}
