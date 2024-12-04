package ex04;

public class Circulo {

    //Escreva um programa onde cria uma classe chamada "Circulo" com um atributo raio.
    //a. Instancie um círculo.
    //b. Crie métodos para calcular a área e a circunferência do círculo.

    private double raio;

    public Circulo(double raio){
        this.raio=raio;



    }
    public double getRaio() {
        return this.raio;

    }public double area(){
        return this.raio*this.raio*3.14;
    }

}
