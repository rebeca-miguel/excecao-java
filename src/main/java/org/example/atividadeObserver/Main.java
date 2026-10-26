package org.example.atividadeObserver;

public class Main {
    public static void main(String[] args) {


        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(passageiro);
        voo.adicionarObservador(painel);


        voo.mudarStatu("Atrasado");
    }
}
