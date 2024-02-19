package org.example;

public class Item {

    String nome;
    Double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        // isso é a mesma coisa que o def __init__ ?
    }

    void GetNome(){ //eu preciso receber algum argumento?
        System.out.println("Nome: " + nome);
    }
}
