package org.example.aula19.interfaces;

public class BancoDeDadosFactory {
    public BancoDeDados criar(int opcao){

        if(opcao == 1){
            return new MySql();
        } else if(opcao == 2){
            return new Oracle();
        } else{
            throw new IllegalArgumentException("Opção inválida.");
        }
    }
}
