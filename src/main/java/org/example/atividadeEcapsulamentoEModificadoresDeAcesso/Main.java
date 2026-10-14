package org.example.atividadeEcapsulamentoEModificadoresDeAcesso;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println();

        conta.setTitular("");
        System.out.println("Titlar: " + conta.getTitular());


        conta.setTitular("Rebeca");
        System.out.println("Titlar: " + conta.getTitular());

        System.out.println();

        conta.depositar(500);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.depositar(-100);
        conta.sacar(2000);
        conta.sacar(200);

        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println();

        //conta.registrarLog("teste");

        Produto produto = new Produto();
        System.out.println(produto.nome);
        System.out.println(produto.preco);

        //System.out.println(produto.codigoInterno);


        System.out.println("Número da conta: " + conta.getNumeroConta());

        //conta.setNumeroConta("999-Z");

    }
}
