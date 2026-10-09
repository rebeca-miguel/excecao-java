package org.example.atividadeForEach;

public class Exercicio4 {
    public static void main(String[] args) {

         /*4. Com um array de nomes, use for-each e um if para contar quantos
        têm mais de 5 letras. Mostre o total. Dica: usem o método length.*/

        String[] nomes1 = {"Rebeca", "Ana", "Mariana", "João", "Fernanda"};
        int contador = 0;

        for (String nome1 : nomes1) {
            if (nome1.length() > 5) {
                contador++;

            }
        }

        System.out.println("Quantidade de nomes com mais de 5  letras: " + contador);


        /*5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
        usando o índice. Deixe os dois na mesma classe e compare.*/

        String[] nomes2 = {"Nica", "Jéssica", "Jordania", "Rebeca"};

        System.out.println("Usando for-each:");

        for (String nome2 : nomes2) {
            System.out.println(nome2);
        }

        System.out.println("Usando for normal:");

        for (int i = 0; i < nomes2.length; i++) {
            System.out.println(nomes2[i]);
        }


        /*Minhas referências:   Referência:
    For-each:
    for (tipo apelido : coleção) {

     }
        Array normal:
        String[] nomeDoArray = {"Ana", "Maria"};

        ArrayList:
        ArrayList<String> lista = new ArrayList<>();
        */

    }
}
