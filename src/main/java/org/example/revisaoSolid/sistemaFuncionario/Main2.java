package org.example.revisaoSolid.sistemaFuncionario;

public class Main2 {
    public static void main(String[] args) {
        Funcionario desenvolvedor =
                new Desenvolvedor("Ana", 5000.00);

        Funcionario gerente =
                new Gerente("Carlos", 8000.00);

        FolhaPagamento folhaEmail =
                new FolhaPagamento(new NotificadorEmail());

        folhaEmail.pagar(desenvolvedor);
        folhaEmail.pagar(gerente);

        System.out.println();

        FolhaPagamento folhaSms =
                new FolhaPagamento(new NotificadorSms());

        folhaSms.pagar(desenvolvedor);
        folhaSms.pagar(gerente);
    }
}
