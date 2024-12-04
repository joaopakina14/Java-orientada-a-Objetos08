package ex05;

public class Carro {

    //Crie uma classe chamada "Carro" com os seguintes atributos: marca, modelo e ano de fabrico.
    //a. Crie um método na classe "Carro" chamado "ligar" que imprime a mensagem "O carro está
    //ligado".
    //b. Crie um objeto da classe "Carro" e invoque o método "ligar".

    private String marca;
    private String modelo;
    private int anoFabrico;

    Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAnoFabrico() {
        return this.anoFabrico;


    }public void ligar(){
        System.out.println("O carro está ligado");
    }

}
