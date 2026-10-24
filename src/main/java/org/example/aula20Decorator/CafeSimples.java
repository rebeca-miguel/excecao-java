package org.example.aula20Decorator;

public class CafeSimples implements Cafe{

    @Override
    public String getDescricao() {

        return "Café Simples";
    }


    @Override
    public double getPreco() {

        return 5.0;
    }

    public void naoFazerBarulhoApos10Horas(){


    }
}

