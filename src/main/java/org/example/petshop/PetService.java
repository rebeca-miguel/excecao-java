package org.example.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PetService {

    private final List<Pet> pets = new ArrayList<>();

    public void cadastrar(Pet pet) {
        if (pet == null) {
            throw  new IllegalArgumentException("O pet não pode ser nulo.");
        }

        pets.add(pet);
    }

    public List<Pet> listarTodos() {
        return new ArrayList<>(pets);
    }

    public List<Pet> buscarPorNome(String nome) {
        List<Pet> encontrados = new ArrayList<>();

        if (nome == null || nome.trim().isEmpty()) {
            return encontrados;
        }

        for (Pet pet : pets) {
            if (pet.getNome().equalsIgnoreCase(nome.trim())) {
                encontrados.add(pet);
            }
        }
        return encontrados;
    }

    public Set<String> listarEspecies() {
        Set<String> especies = new HashSet<>();

        for (Pet pet : pets) {
            especies.add(pet.getEspecie());
        }

        return especies;
    }

    public List<Pet> buscarPorPorte(String porte) {
        List<Pet> encontrados = new ArrayList<>();

        if (porte == null || porte.trim().isEmpty()) {
            return encontrados;
        }

        for (Pet pet : pets) {
            if (pet.getPorte().equalsIgnoreCase(porte.trim())) {
                encontrados.add(pet);
            }
        }

        return encontrados;
    }

    public int quantidade() {
        return pets.size();
    }

    public boolean existePet(String nome) {
        return !buscarPorNome(nome).isEmpty();
    }
}


