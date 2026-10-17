
package org.example.revisaoSolid;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto();


        Retangulo retangulo = new Retangulo("Retângulo", 5.0, 3.0);

        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea());

        produto.setNome("Notebook");
        produto.setPreco(3500.00);
        produto.setQuantidade(5);

        produto.setPreco(-100.00);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
