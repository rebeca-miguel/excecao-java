package org.example.atividadeDecorator;

public class Main {
    public static void main(String[] args) {

        Acai acaiComGranola = new Granola(new AcaiSimples());

        System.out.println("Descrição: " + acaiComGranola.getDescricao());
        System.out.println("Preço: R$ " + acaiComGranola.getPreco() );

        System.out.println();

        Acai acaiComGranolaMorango = new Morango(new Granola(new AcaiSimples()));

        System.out.println("Descrição: " + acaiComGranolaMorango.getDescricao());
        System.out.println("Preco: R$" + acaiComGranolaMorango.getPreco());

    }


}
