package org.example.atividadeStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

 //1 - Dada uma lista de números inteiros de 1 a 6, use Streams para filtrar apenas os números pares e salve o resultado em uma nova lista.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares);

//2 - Dada uma lista com nomes de frutas em letras minúsculas, use o map para transformar todas as palavras em letras maiúsculas e imprima cada uma na tela.
 //Transformar frutas em letras maiúscula, usando toUperCase.
        //.map para transformar todas as frutas em maiúsculas.

        List<String> frutas = Arrays.asList(
                "banana", "maçâ", "uva", "laranja"
        );

        frutas.stream()
                .map(fruta -> fruta.toUpperCase())
                .forEach(System.out::println);

//3 -Dada uma lista de nomes de cidades, filtre apenas as cidades que começam com a letra "S" e conte quantas cidades passaram pelo filtro.
        List<String> cidades = Arrays.asList(
                "São Paulo", "Santo", "Rio de Janeiro", "Salvador", "Curitiba"
        );

        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S")).count();

        System.out.println("Quantidade de cidades: " + quantidade);

    }
}
