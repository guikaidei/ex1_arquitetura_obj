package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;

    double avaliacao;

    ArrayList<Item> cardapio = new ArrayList<>();

    public Restaurante(String nome, double avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    void adicionarItem(Item item) {
        cardapio.add(item);
    }

    void imprimirMenu() {
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println("- Item: " + cardapio.get(i).nome);
            System.out.println("  Preço: " + cardapio.get(i).preco);
        }
    }
}
