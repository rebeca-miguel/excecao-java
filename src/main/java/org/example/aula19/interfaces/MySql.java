package org.example.aula19.interfaces;

public class MySql implements BancoDeDados{
    @Override
    public String chamarBanco(){
        return "O banco conectado é o Mysql.";
    }

    @Override
    public int getNumero() {
        return 1;
    }
}
