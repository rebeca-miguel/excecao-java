package org.example.atividadeHeranca;

public class Professora extends Pessoa{

    public String disciplina;

    public  void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }

    /*4. Na Professora, sobrescreva o apresentar() usando @Override, pra
   imprimir "Oi, sou [nome] e ensino [disciplina]."

   Chame apresentar() na aluna e na professora e compare as saídas.*/

    /*@Override
    public void apresentar() {

        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }

     */

    /*7. Polimorfismo (a armadilha)

   Na Professora, troque o apresentar() sobrescrito por este,
   com um parâmetro a mais e SEM o @Override:

   void apresentar(String cargo) {
       System.out.println("Oi, sou " + nome + ", " + cargo);
   }

   Rode o exercício 3 de novo. O que a professora imprime agora?
   Deu algum erro?

   Depois coloque o @Override nesse método e veja o que o Java diz.

   Essa questão mostra por que o @Override existe.*/


    public void apresentar(String cargo) {

        System.out.println("Oi, sou " + nome + ", " + cargo);
    }


}
