package ex07;

public class Livro {

    //Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e
    //ISBN. Em seguida, crie um método na classe "Livro" chamado "exibirDetalhes" que imprime na consola
    //todos os atributos do livro. De seguida, crie dois objetos da classe "Livro" e invoque o método
    //"exibirDetalhes" para cada um deles.

    private String titulo;
    private String autor;
    private String categoria;
    private int numero_de_paginas;
    private int isbn;

    public Livro(int numero_de_paginas, String titulo, String autor, String categoria, int isbn) {

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numero_de_paginas = numero_de_paginas;
        this.isbn = isbn;


        }public void exibirDetalhesCompleto() {
        System.out.println("********************** " + this.titulo + " **********************");
        System.out.println(this.autor + "\t| " + this.categoria + "\t| " + this.numero_de_paginas + " páginas\t| ISBN: " + this.isbn);
    }
}
