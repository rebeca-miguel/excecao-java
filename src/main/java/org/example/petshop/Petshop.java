
package org.example.petshop;

import java.util.*;
import org.example.petshop.servicos.*;

public class Petshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PetService petService = new PetService();

        ArrayDeque<String> fila = new ArrayDeque<>();

        List<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());
        servicos.add(new Vacina());

        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarPet(sc, petService);
                        break;

                    case 2:
                        listarPets(petService);
                        break;

                    case 3:
                        buscarPet(sc, petService);
                        break;

                    case 4:
                        mostrarEspecies(petService);
                        break;

                    case 5:
                        adicionarFila(sc, petService, fila);
                        break;

                    case 6:
                        atenderProximo(fila);
                        break;

                    case 7:
                        executarServicos(sc, petService, servicos);
                        break;

                    case 8:
                        System.out.println(
                                "Total de pets cadastrados: "
                                        + petService.quantidade()
                        );
                        break;

                    case 9:
                        listarPetsPorPorte(sc, petService);
                        break;

                    case 0:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }

        sc.close();
    }

    static void exibirMenu() {
        System.out.println("\n=== PETSHOP ===");
        System.out.println("1 - Cadastrar novo pet");
        System.out.println("2 - Listar pets");
        System.out.println("3 - Buscar pet pelo nome");
        System.out.println("4 - Mostrar espécies cadastradas");
        System.out.println("5 - Entrar na fila de banho");
        System.out.println("6 - Atender próximo pet");
        System.out.println("7 - Executar serviços");
        System.out.println("8 - Mostrar quantidade de pets");
        System.out.println("9 - Listar pets por porte");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    static void cadastrarPet(Scanner sc, PetService petService) {
        try {
            System.out.print("Nome do pet: ");
            String nome = sc.nextLine();

            System.out.print("Espécie (Cachorro ou Gato): ");
            String especie = sc.nextLine();

            Pet pet;

            if (especie.equalsIgnoreCase("Cachorro")) {
                pet = new Cachorro();
            } else if (especie.equalsIgnoreCase("Gato")) {
                pet = new Gato();
            } else {
                System.out.println("Espécie inválida. Digite Cachorro ou Gato.");
                return;
            }

            pet.setNome(nome);
            pet.setEspecie(especie);

            double peso;

            while (true) {
                System.out.print("Peso (kg): ");

                try {
                    peso = sc.nextDouble();
                    sc.nextLine();

                    if (!Double.isFinite(peso) || peso <= 0) {
                        System.out.println(
                                "O peso deve ser um número maior que zero."
                        );
                        continue;
                    }

                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Digite um peso numérico válido.");
                    sc.nextLine();
                }
            }

            pet.setPeso(peso);
            petService.cadastrar(pet);

            System.out.println(
                    "Pet cadastrado! Agora são "
                            + petService.quantidade() + " pet(s)."
            );

            pet.emitirSom();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }

    static void listarPets(PetService petService) {
        List<Pet> pets = petService.listarTodos();

        System.out.println("\n--- PETS CADASTRADOS ---");

        if (pets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }

        for (Pet pet : pets) {
            mostrarFicha(pet, "FICHA DO PET");
            pet.emitirSom();

            if (pet instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) pet;
                cachorro.buscarBolinha();
            }
        }
    }

    static void buscarPet(Scanner sc, PetService petService) {
        System.out.print("Qual pet você procura? ");
        String nome = sc.nextLine();

        List<Pet> encontrados = petService.buscarPorNome(nome);

        if (encontrados.isEmpty()) {
            System.out.println("Pet não encontrado.");
            return;
        }

        for (Pet pet : encontrados) {
            mostrarFicha(pet, "PET ENCONTRADO");
        }
    }

    static void mostrarEspecies(PetService petService) {
        Set<String> especies = petService.listarEspecies();

        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");

        if (especies.isEmpty()) {
            System.out.println("Nenhuma espécie cadastrada.");
        } else {
            for (String especie : especies) {
                System.out.println("- " + especie);
            }
        }

        System.out.println(
                "Total de espécies diferentes: " + especies.size()
        );
    }

    static void adicionarFila(
            Scanner sc,
            PetService petService,
            ArrayDeque<String> fila
    ) {
        System.out.print("Nome do pet para entrar na fila: ");
        String nome = sc.nextLine();

        if (!petService.existePet(nome)) {
            System.out.println("Pet não cadastrado. Cadastre-o primeiro.");
            return;
        }

        fila.add(nome);

        System.out.println(nome + " entrou na fila.");
        System.out.println("Fila agora: " + fila);
    }

    static void atenderProximo(ArrayDeque<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila de banho está vazia.");
            return;
        }

        String proximoPet = fila.poll();

        System.out.println("Atendendo " + proximoPet + "...");
    }

    static void executarServicos(
            Scanner sc,
            PetService petService,
            List<Servico> servicos
    ) {
        System.out.print("Nome do pet: ");
        String nome = sc.nextLine();

        if (!petService.existePet(nome)) {
            System.out.println("Pet não encontrado.");
            return;
        }

        for (Servico servico : servicos) {
            servico.executar(nome);
        }
    }

    static void listarPetsPorPorte(
            Scanner sc,
            PetService petService
    ) {
        System.out.print(
                "Qual porte deseja buscar (Pequeno, Médio ou Grande)? "
        );

        String porte = sc.nextLine();

        List<Pet> encontrados = petService.buscarPorPorte(porte);

        if (encontrados.isEmpty()) {
            System.out.println("Nenhum pet encontrado com esse porte.");
            return;
        }

        for (Pet pet : encontrados) {
            mostrarFicha(pet, "PETS POR PORTE");
        }
    }

    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.getNome());
    }

    static void mostrarFicha(Pet pet, String titulo) {
        System.out.println("\n--- " + titulo + " ---");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Espécie: " + pet.getEspecie());
        System.out.println("Peso: " + pet.getPeso() + " kg");
        System.out.println("Porte: " + pet.getPorte());
    }
}
