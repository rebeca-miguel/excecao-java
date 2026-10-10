package org.example.atividadeHeranca;

public class Aluna extends Pessoa {

    public static void main(String[] args) {
        Aluna aluna = new Aluna();

        aluna.nome = "Rebeca";
        aluna.idade = 20;
        aluna.curso = "Java";

        /*4. Na Professora, sobrescreva o apresentar() usando @Override, pra
   imprimir "Oi, sou [nome] e ensino [disciplina]."

   Chame apresentar() na aluna e na professora e compare as saídas.*/

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 40;
        professora.disciplina = "Lógica de programação";

        aluna.apresentar();
        aluna.estudar();

        professora.apresentar();
        professora.lancarNota(aluna.nome, 9.5);


        /*5. Faça uma cadeia de três níveis:
   - Funcionario, com o atributo nome e o método baterPonto()
   - Gerente extends Funcionario, com aprovarFerias(String quem)
   - Diretora extends Gerente, com definirMeta(String meta)

   Na Main, crie uma Diretora, preencha o nome dela
   (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.

   Herança em cadeia: ela tem tudo que vem de cima.*/

        Diretora carla = new Diretora();

        carla.nome1 = "Carla";

        carla.baterPonto();
        carla.aprovarFerias("Ana");
        carla.definirMeta("Aumetar as provas");


        Gerente gerente = new Gerente();

        gerente.nome1 = "Carlos";

        gerente.baterPonto();
        gerente.aprovarFerias("Ana");
        gerente.notificar("Férias aprovadas.");
        gerente.exportar();



    }

}
