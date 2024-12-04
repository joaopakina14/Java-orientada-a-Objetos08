package ex08;

import ex05.Carro;

public class main {

    public static void main (String[] args){

//Crie uma classe Aluno que tenha os atributos nome, idade, curso e média.
//a. Crie um construtor que receba os quatro atributos como parâmetros.
//b. Crie um método chamado situacao que retorne "Aprovado" se a média for maior ou igual a 9.5,
//"Reprovado" caso contrário.
//c.
//No método main, crie um objeto dessa classe e apresente a situação do aluno.

        Aluno aluno1 = new Aluno("João", 41, "SOFTWARE_DEVELOPER", 10);

        System.out.println("Situação do aluno " + aluno1.getNome() + ": " + aluno1.situacao());






    }
}
