package org.example.atividadeConstrutor;


import lombok.Builder;


@Builder
public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    @Builder.Default
    private String getObservacao = "";

    @Builder.Default
    private double getDesconto = 0.0;



    public void mostrar() {
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratacao: "+ hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + desconto);
        System.out.println("-------------------------");
    }



}
