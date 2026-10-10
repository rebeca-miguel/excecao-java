package org.example.atividadeHeranca;

public interface Exportavel {

    /*6. Crie duas interfaces:
   - Notificavel, com notificar(String mensagem)
   - Exportavel, com exportar()

   Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
   extends Funcionario:

   class Gerente extends Funcionario implements Notificavel, Exportavel

    Na Main, crie um gerente, preencha o nome e chame os quatro
   métodos nele: baterPonto(), aprovarFerias(), notificar()
   e exportar().

   */
    void exportar();
}
