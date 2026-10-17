package org.example.revisaoSolid.sistemaFuncionario;

public class NotificadorSms implements Notificador{
    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}
