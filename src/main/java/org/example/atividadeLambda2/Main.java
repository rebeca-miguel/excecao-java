package org.example.atividadeLambda2;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//Runnable: Não recebe nada e também não devolve nada. Representa apenas uma tarefa.
        Runnable acao = () ->
                System.out.println("Executando tarefa");


        Runnable segundaAcao = () ->
                System.out.println("Segunda tarefa executado");

        acao.run();
        segundaAcao.run();

// Consumer: recebe alguma coisa, mas não devolve nada.
        Consumer<String> saudacao = (nome) ->
                System.out.println("Olá,  " + nome);

        saudacao.accept("Flora");

        Consumer<String> maiusculo = (nome) ->
                System.out.println(nome.toUpperCase());

        maiusculo.accept("Flora");

//Supplier: não recebe nada, mas devolve alguma coisa.

        Supplier<String> avisoSistema = () ->
                "Aviso: O sistema está online!";

        System.out.println(avisoSistema.get());

        Supplier<Integer> geradorNumero = () ->
                new Random().nextInt(100);

        System.out.println("Primeira chamada: " + geradorNumero.get());
        System.out.println("Segunda chamada: " + geradorNumero.get());

//Predicate: Recebe alguma coisa e devlve true ou false.

        Predicate<Integer> maiorQueDez = (numero) ->
                numero > 10;

        System.out.println(maiorQueDez.test(5));
        System.out.println(maiorQueDez.test(15));


        Predicate<String> textoVazio = (txto) ->
                txto.isEmpty();

        System.out.println(textoVazio.test(""));
        System.out.println(textoVazio.test("Java"));

//Function: recebe um valor e devolve outro valor, pode ser de um tipo diferente.
        Function<Integer, String> formatarNota = (numero) ->
                "Nota fiscal nº: " + numero;


        String notaFormatada = formatarNota.apply(1542);

        System.out.println(notaFormatada);

        Function<String, Integer> contarLetras = (palavras) ->
                palavras.length();

        Integer totalLetras = contarLetras.apply("Professor");
        System.out.println("A palavra Professor tem " + totalLetras + " letras.");



    }
}
