package org.example.atividadeInterfaces;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();


        /*
3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
   e percorra com for-each chamando emitirSom(). Repare que não
   tem nenhum if. Dica:

animais.add(new Cachorro());*/

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();

        }

        /*

4. Crie uma interface Notificacao com o método enviar(String mensagem).
   Crie duas classes que implementam ela: Email e SMS. Cada uma
   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
   e percorra com for-each, enviando a mesma mensagem.

   Saída esperada:
   E-mail enviado: Sua compra foi aprovada!
   SMS enviado: Sua compra foi aprovada!*/

        ArrayList<Notificacao> notificacaos = new ArrayList<>();

        notificacaos.add(new Email());
        notificacaos.add(new SMS());

        String mensagem = "Sua mensagem foi aprovada!";

        for (Notificacao notificacao : notificacaos) {
            notificacao.enviar(mensagem);
        }


        /*5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
   Crie Carro e Moto implementando os dois. Coloque numa lista e
   percorra com for-each chamando os dois métodos em cada um.
*/

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }
    }


}
