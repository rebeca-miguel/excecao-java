package org.example.atividadeFactoryAdapterFacade.PayPalAdapter;

public class Main {
    public static void main(String[] args) {


        Pagamento pagamento = new PayPalAdapter();

        pagamento.pagar();
    }
}
