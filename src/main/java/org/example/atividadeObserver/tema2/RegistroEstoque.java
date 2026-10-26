package org.example.atividadeObserver.tema2;

public class RegistroEstoque implements  ObservarEstoque{

    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}
