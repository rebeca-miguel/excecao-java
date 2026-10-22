package org.example.atividadeFactoryAdapterFacade;

public class AnimalFactory {
    public Animal getAnimal(String tipo){
        if(tipo.equalsIgnoreCase("Cachorro")){
            return new Cachorro();
        } else if (tipo.equalsIgnoreCase("gato")) {
            return new Gato();
        } else {
            throw new IllegalArgumentException("Tipo de animal inválido: " + tipo);
        }
    }
}
