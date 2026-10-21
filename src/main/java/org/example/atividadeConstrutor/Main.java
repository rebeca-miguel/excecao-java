package org.example.atividadeConstrutor;

public class Main {
    public static void main(String[] args) {

        Agendamento thor =  Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .observacao("alérgico a shampoo")
                .desconto(10.0)
                .build();


        Agendamento luna =  Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();


        Agendamento mel = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();


        thor.mostrar();
        luna.mostrar();
        mel.mostrar();
    }
}
