package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        boolean primeiraInteracao = true;
        while (true) {
            if (primeiraInteracao = false) {
                System.out.println("");
            }

            System.out.println("Menu principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.println("");

                System.out.println("Digite o nome do restaurante: ");
                String nomeRestaurante = scanner.nextLine();

                System.out.println("Digite a avaliação do restaurante: ");
                Double avaliacaoRestaurante = scanner.nextDouble();

                Restaurante restaurante = new Restaurante(nomeRestaurante, avaliacaoRestaurante);

                restaurantes.add(restaurante);

                System.out.println("Restaurante " + restaurante.nome + " cadastrado com sucesso!");
                System.out.println("");

            } else if (opcao.equals("2")) {
                System.out.println("");
                System.out.println("Restaurantes cadastrados: ");

                for (int i = 0; i < restaurantes.size(); i++) {
                    System.out.println(i + 1 + ". " + restaurantes.get(i).nome);
                    System.out.println("Avaliação: " + restaurantes.get(i).avaliacao);
                    restaurantes.get(i).imprimirMenu();
                    System.out.println("");
                }

            } else if (opcao.equals("3")) {
                System.out.println("");
                System.out.println("Restaurantes:");

                for (int i = 0; i < restaurantes.size(); i++) {
                    System.out.println(i + 1 + ". " + restaurantes.get(i).nome);
                }

                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                Integer escolha = scanner.nextInt();
                escolha -= 1;

                System.out.println("Digite o nome do item:");
                String nomeItem = scanner.nextLine();

                System.out.println("Digite o preço do item:");
                double precoItem = scanner.nextDouble();

                Item item = new Item(nomeItem, precoItem);
                restaurantes.get(escolha).adicionarItem(item);

                System.out.println("Item " + nomeItem + " adicionado ao menu do restaurante: " + restaurantes.get(escolha).nome);

                System.out.println("");

            } else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }


        }
    }
}