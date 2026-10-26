package org.example.atividadeObserver.tema2;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(10);
        estoque.setQuantidade(25);
    }
}
