package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;

    Integer avaliacao;

    ArrayList<Object> cardapio = new ArrayList<>();

    void adicionarItem(Object item) {
        cardapio.add(item);
    }

    void imprimirMenu() {
        System.out.println(cardapio);
    }
}
