package org.example.atividadeInterfaces;

public class SMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviando: " + mensagem);
    }
}
