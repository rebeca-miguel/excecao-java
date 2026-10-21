package org.example.atividadeConstrutor;

public class Main {
    public static void main(String[] args) {

        Agendamento agendamento1 = new Agendamento(
                "Thor",
                "banho",
                "14",
                true,
                true,
                false,
                "alérgico a shampoo",
                10.0
        );

        Agendamento agendamento2 = new Agendamento(
                "Luna",
                "tosa",
                "10h",
                false,
                false,
                false,
                "",
                0.0
        );

        Agendamento agendamento3 = new Agendamento(
                "Mel",
                "banho",
                "16h",
                false,
                false,
                true,
                "",
                0.0
        );

        agendamento1.mostrar();
        agendamento2.mostrar();
        agendamento3.mostrar();
    }
}
