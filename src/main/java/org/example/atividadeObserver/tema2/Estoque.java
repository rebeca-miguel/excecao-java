package org.example.atividadeObserver.tema2;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<ObservarEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public  void adicionarObservador(ObservarEstoque observador) {
        observadores.add(observador);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

        for (ObservarEstoque observador : observadores) {
            observador.atualizar(this.quantidade);
        }
    }
}
