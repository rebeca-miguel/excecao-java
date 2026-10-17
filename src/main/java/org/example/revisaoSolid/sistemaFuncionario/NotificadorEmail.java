package org.example.revisaoSolid.sistemaFuncionario;

public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[E-mail] " + mensagem);
    }
}
