package org.example.aula19.interfaces;

public class Oracle implements BancoDeDados{
    @Override
    public String chamarBanco(){
        return "O banco conectado é Oracle.";
    }

    @Override
    public int getNumero(){
        return 2;
    }
}
