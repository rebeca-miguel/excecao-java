package org.example.petshop;

import java.util.*;

import org.example.petshop.servicos.*;

public class Petshop {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Pet[] pets = new Pet[5];
        int opcao = - 1;
        int total = 0;

        ArrayDeque<String> fila = new ArrayDeque<>();

        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());
        servicos.add(new Vacina());


        System.out.println("Nome do pet: ");
            String nomeInicio = sc.nextLine();

        System.out.println("Especie: ");
        String especieIncio = sc.nextLine();

        Pet meuPet;

        if (especieIncio.equalsIgnoreCase("Cachorro")){
            meuPet = new Cachorro();
        } else if (especieIncio.equalsIgnoreCase("Gato")) {
            meuPet = new Gato();
        } else {
            meuPet = new Pet();
        }

        meuPet.nome = nomeInicio;
        meuPet.especie = especieIncio;

        System.out.println("Peso (kg): ");
        meuPet.peso = sc.nextDouble();
        sc.nextLine();

        System.out.println();

        meuPet.porte = meuPet.definirPorte();

        pets[total] = meuPet;
        total++;

        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");

        meuPet.emitirSom();


        while (opcao != 0) {
            System.out.println("\n===PETSHOP===");
            System.out.println("1 - Cadastrar novo pet ");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pet pelo nome");
            System.out.println("4 - Mostrar espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo pet");
            System.out.println("7 - Executar serviços");
            System.out.println("8 - Mostrar quantidade de pets");
            System.out.println("9 - Listar pets por porte");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");

            try {

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total < pets.length) {

                            System.out.println("Nome do pet:");
                            String nomeNovo = sc.nextLine();

                            System.out.println("Especie: ");
                            String especieNova = sc.nextLine();

                            Pet novoPet;

                            if (especieNova.equalsIgnoreCase("Cachorro")) {
                                novoPet = new Cachorro();
                            } else if (especieNova.equalsIgnoreCase("Gato")) {
                                novoPet = new Gato();

                            } else {
                                novoPet = new Pet();
                            }

                            novoPet.nome = nomeNovo;
                            novoPet.especie = especieNova;

                            System.out.println("Peso (Kg): ");
                            novoPet.peso = sc.nextDouble();
                            sc.nextLine();

                            novoPet.porte = novoPet.definirPorte();

                            pets[total] = novoPet;
                            total++;

                            System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");

                            novoPet.emitirSom();

                        } else {
                            System.out.println("Cadastro cheio!");
                        }
                        break;

                    case 2:
                            System.out.println("\n--- PETS CADASTRADOS---");

                            for (int i = 0; i < total; i++) {
                                mostrarFicha(meuPet);
                                mostrarFicha(meuPet, "FICHA DO PET");
                                pets[i].emitirSom();

                                if (pets[i] instanceof Cachorro) {
                                    Cachorro cachorro = (Cachorro) pets[i];
                                    cachorro.buscarBolinha();
                                }
                            }

                        break;

                    case 3:
                        System.out.println("Qual pet você procura?");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (pets[i].nome.equalsIgnoreCase(busca)) {
                                System.out.printf(
                                        "Encontrado: %s (%s) - %.1f kg - Porte %s%n",
                                        pets[i].nome,
                                        pets[i].especie,
                                        pets[i].peso,
                                        pets[i].porte
                                );

                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(pets[i].especie);

                    }
                        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");

                        for (String especie : especies) {
                            System.out.println("- " + especie);
                        }

                        System.out.println("Total de espécies diferentes: " + especies.size());
                        break;


                    case 5:
                        System.out.println("Nome do pet pra entrar na fila:");
                        String nomePet = sc.nextLine();

                        fila.add(nomePet);

                        System.out.println(nomePet + " entrou na fila.");
                        System.out.println("Fila agora: " + fila);
                        break;


                    case 6:
                        if (fila.isEmpty()) {
                            System.out.println("A fila de banho está vazia.");
                        } else {
                            String proximoPet = fila.peek();

                            System.out.println("Próximo da fila: " + proximoPet);
                            System.out.println("Atendendo " + proximoPet + "...");

                            fila.poll();
                        }
                        break;

                    case 7:
                        System.out.println("Nome do pet:");
                        String nomePetServico = sc.nextLine();

                        for (Servico servico : servicos) {
                            servico.executar(nomePetServico);
                        }
                        break;

                    case 8:
                        System.out.println("Total de pets cadastrados: " + total);
                        break;

                    case 9:
                        System.out.println("Qual porte deseja buscar (pequeno, Médio ou Grande");
                        String porteBusca = sc.nextLine();

                        boolean encontrou = false;

                        for (int i = 0; i < total; i++){
                            if (pets[i].definirPorte().equalsIgnoreCase(porteBusca)) {
                                System.out.printf(
                                        "%s (%s) - %.1f kg - Porte %s%n",
                                        pets[i].nome,
                                        pets[i].especie,
                                        pets[i].peso,
                                        pets[i].porte,
                                        pets[i].definirPorte()

                                );

                                encontrou = true;
                            }
                        }

                        if (!encontrou) {
                            System.out.println("Nnenhu pet encontrado com esse porte.");
                        }
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


    }

    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    static void mostrarFicha(Pet pet, String titulo) {
        System.out.println("---");
        System.out.println("=== " + titulo + "===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + "kg");
        System.out.println("Porte: " + pet.definirPorte());
    }
}
