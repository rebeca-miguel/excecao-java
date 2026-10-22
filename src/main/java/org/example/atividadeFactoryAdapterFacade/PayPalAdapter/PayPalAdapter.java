package org.example.atividadeFactoryAdapterFacade.PayPalAdapter;

public class PayPalAdapter implements Pagamento{

    private PayPalAPI payPal;

    public  PayPalAdapter() {
        this.payPal = new PayPalAPI();
    }

    @Override
    public void pagar() {
        payPal.sendPayment();
    }
}
