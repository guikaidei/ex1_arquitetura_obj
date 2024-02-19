package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> restaurantes = new ArrayList<>();
        while (true) {
            System.out.println("Menu principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite o nome do restaurante: ");
                String nomeRestaurante = scanner.nextLine();

                System.out.println("Digite a avaliação do restaurante: ");
                Double avaliacaoRestaurante = scanner.nextDouble();


                Restaurante restaurante = new Restaurante(nomeRestaurante, avaliacaoRestaurante);

                System.out.println("Restaurante " + restaurante.nome + " cadastrado com sucesso!");
                break;
            } else if (opcao.equals("2")) {
                System.out.println("Restaurantes cadastrados: ");
                //falta tudo
            } else if (opcao.equals("3")) {
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                Integer escolha = scanner.nextInt();
                Object restauranteEscolhido = restaurantes.get(escolha); // era pra ser uma lista?
                System.out.println("Digite o nome do item: ");
                String nomeItem = scanner.nextLine();
                System.out.println("Digite o preço do item: ");
                Double precoItem = scanner.nextDouble();
                Item item = new Item(nomeItem, precoItem);
                restauranteEscolhido.adicionarItem(item); // era pra ser uma lista?
                String.format("Item %s, adicionado ao menu do restaurante, %d!", nomeItem, restauranteEscolhido.nome);
                System.out.println();
            } else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}