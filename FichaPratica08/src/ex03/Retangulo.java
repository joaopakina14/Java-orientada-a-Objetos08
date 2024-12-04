package ex03;

public class Retangulo {

    //Escreva um programa onde cria uma classe chamada "Retângulo" com atributos de largura e altura.
    //a. Instancie um retângulo.
    //b. Crie métodos para calcular a área e o perímetro do retângulo.

    //A area é = a largura x altura
    //O perimetro é = largura + largura + altura + altura

    private double largura;
    private double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }

    public double getLargura() {
        return this.largura;

    }

    public double getAltura() {
        return this.altura;

    }

    public double area() {
        return this.altura * this.largura;
    }
    public double perimetro(){
        return this.altura + this.altura + this.largura + this.largura;
    }
}

