package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            }
        }
    }
}