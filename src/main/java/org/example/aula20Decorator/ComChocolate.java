package org.example.aula20Decorator;

public class ComChocolate extends CafeDecorator {
    public ComChocolate(Cafe cafe) {
        super(cafe);
    }


    @Override
    public String getDescricao() {
        return cafeEmbrulhado.getDescricao() + " + Chocolate";
    }

    @Override
    public double getPreco() {
        return cafeEmbrulhado.getPreco() + 3.50;
    }

}
