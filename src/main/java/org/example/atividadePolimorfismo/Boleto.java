package org.example.atividadePolimorfismo;

public class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto de R$ %.2f gerado para pagamento.%n", valor);
    }
}
