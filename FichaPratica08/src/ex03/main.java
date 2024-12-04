package ex03;

public class main {

    public static void main (String[] args){

        Retangulo retangulo1 = new Retangulo(1.2, 2.3);

        System.out.println("A largura do retangulo 1 é " + retangulo1.getLargura());

        System.out.println("A altura do retangulo 1 é " + retangulo1.getAltura());


        System.out.println("A area do retangulo 1 é " + retangulo1.area());
        System.out.println("O perimetro do retangulo 1 é " + retangulo1.perimetro());




    }
}
