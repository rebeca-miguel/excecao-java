package org.example.revisaoSolid.sistemaFuncionario;

public class FolhaPagamento {

        private Notificador notificador;

        public FolhaPagamento(Notificador notificador) {
            this.notificador = notificador;
        }

        public void pagar(Funcionario funcionario) {
            double salario = funcionario.calcularSalario();

            System.out.printf(
                    "Pagamento de %s: R$ %.2f%n",
                    funcionario.getNome(),
                    salario
            );

            notificador.notificar(
                    "O salário de " + funcionario.getNome()
                            + " foi calculado: R$ "
                            + String.format("%.2f", salario)
            );
        }

}
