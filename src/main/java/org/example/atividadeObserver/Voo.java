package org.example.atividadeObserver;

import java.util.ArrayList;
import java.util.List;

public class Voo {

    private List<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        observadores.add(o);
    }

    public void mudarStatu(String satus) {
        for (ObservadorVoo observadore : observadores) {
            observadore.atualizar(satus);
        }
    }


}
