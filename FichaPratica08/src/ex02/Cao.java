package ex02;

public class Cao {

    //2. Escreva um programa onde cria uma classe chamada "Cao" com um nome (String), um atributo de raça
    //(String) e um atributo latido (String) que por defeito deve ser “Au au au”.
    //a. Deve conter um método de ladrar (imprime na consola o respetivo latido).
    //b. Crie três instâncias da classe "Cão", defina os seus atributos (nome e raça) usando o construtor.
    //c.
    //Modifique o latido usando os métodos setter e invoque o método latir.

    private String nome;
    private String raca;
    private String latido = "Au au au";

    Cao (String nome, String raca, String latido) {
        this.nome = nome;
        this.raca = raca;
        this.latido = latido;
    }
    public String getLatido(){
        return this.latido;
    }
    public String getNome(){
        return this.nome;
    }
    public String getRaca(){
        return this.raca;
    }
    public void setLatido(String latido){
        this.latido=latido;
    }
}
