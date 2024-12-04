package ex05;

public class main {

    public static void main (String[] args){

        //Crie uma classe chamada "Carro" com os seguintes atributos: marca, modelo e ano de fabrico.
        //a. Crie um método na classe "Carro" chamado "ligar" que imprime a mensagem "O carro está
        //ligado".
        //b. Crie um objeto da classe "Carro" e invoque o método "ligar".

        Carro carroNovo = new Carro("Renault", "Laguna", 1999);

        System.out.println("O meu carro novo é um:" + carroNovo.getMarca() + " " + carroNovo.getModelo() + " de " +  carroNovo.getAnoFabrico());
        carroNovo.ligar();






    }
}
