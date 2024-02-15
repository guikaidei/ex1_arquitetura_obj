package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;

    double avaliacao;

    ArrayList<Object> cardapio = new ArrayList<>();

    public Restaurante(String nome, double avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    void adicionarItem(Object item) {
        cardapio.add(item);
    }

    void imprimirMenu() {
        System.out.println(cardapio);
    }
}
