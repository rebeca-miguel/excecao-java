package org.example.listaRevisaoComReferencia;

public class Exercicio1 {
    public static void main(String[] args) {

        /*Crie variáveis com seu nome, sua idade,
        sua altura e se você já programou antes. Imprima cada uma.
         */

        String nome = "Rebeca";
        int idade  = 19;
        double  altura = 1.50;

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);

        //Crie uma variável cidade e imprima: "Eu moro em Salvador."

        String cidade = "São Paulo";
        System.out.println("Eu moro em " + cidade + ".");


        //Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.

        String nome1 = "Rebeca";
        String sobrenome = "Miguel";

        System.out.println(nome1 +  " " + sobrenome);

        //Crie uma variável preco com 29.90 e imprima o valor dela numa frase.

        double preco = 29.90;
        System.out.println("O preço é: " + preco);

        //Crie uma variável temCarteira com true e imprima.

        boolean temCarteira = true;
        System.out.println(temCarteira);

        /*🔥 Mini-desafio — Você tem a = 10 e b = 20.
        Faça a valer 20 e b valer 10, sem escrever os números
        10 e 20 de novo.
         */

        int a = 10;
        int b = 20;

        int valorTemp = a;
        a = b;
        b = valorTemp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Crie a = 15 e b = 4. Imprima a soma, a subtração,
        // a multiplicação, a divisão e o resto.

        int a1 = 15;
        int b1 = 4;
        int soma = (a1 + b1);
        int subtracao = a1 - b1;
        int multiplicacao = a1 * b1;
        int divisao = a1 / b1;
        int resto = a1 % b1;

        System.out.println("soma é " + soma + ", Subtração é: " + subtracao + ", Multiplicação é: " + multiplicacao + ", Divisão é: " + divisao + ", Resto é:" + resto);

        //Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

        double saldo = 1000;
        saldo += 250;
        saldo -= 380;

        System.out.println("O saldo final é: " + saldo);

        //Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.

        int a2 = 10;
        int b2 = 10;
        System.out.println(a2 == b2);
        System.out.println(a2 != b2);
        System.out.println(a2 > b2);
        System.out.println(a2 >= b2);

        //Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

        int idade1 = 20;
        if (temCarteira = true) {

        }





    }
}
