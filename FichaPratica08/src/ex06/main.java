package ex06;

public class main {

    public static void main (String[] args){




    //Crie uma classe sem atributos chamada "Calculadora".
    //a. Elabore métodos para adição, subtração, multiplicação e divisão (Estes métodos devem receber
    //dois números reais como argumentos e, no final, apresentar na consola o resultado).
    //b. Crie um objeto dessa classe e use os métodos para realizar algumas operações matemáticas (deve
    //realizar, pelo menos, uma de cada).


    Calculadora cl = new Calculadora();

        System.out.println(cl.adicao(10,20));
        System.out.println(cl.subtracao(100,20));
        System.out.println(cl.multipli(100,20));
        System.out.println(cl.divisao(100,20));
        
    }
}