package org.example.atividadeConstrutor;

public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;


    public Agendamento(
            String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto){
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;

    }


    public void mostrar() {
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + desconto);
        System.out.println("-------------------------");
    }

    /*
   Agora responda:
   - Olhando só a linha do new, dá pra saber o que cada
     true/false significa?

     R: Não é tão fácil. Precisamos consultar a ordem dos parâmetros no construtor
      para saber se cada valor corresponde a perfume, laço ou hidratação.

   - Se você trocar a ordem do perfume e do laço sem querer,
     o código compila? Alguém perceberia o erro?

     R: Sim, o código compila! Como os dois atributos são do tipo boolean, o Java não percebe que os valores foram trocados.
     O programa pode funcionar incorretamente sem apresentar erro.

   - No agendamento b, quantos valores você digitou só pra
     dizer "não quero isso"?
     R:
     false para perfume;

false para laço;
false para hidratação;
para observação;
0.0 para desconto.
//Isso deixa o código repetitivo e dificulta a leitura.

     */


}
