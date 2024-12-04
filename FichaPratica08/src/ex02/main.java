package ex02;

import ex01.Pessoa;

public class main {

    public static void main (String[] args){

        Cao cao1 = new Cao("Ruca", "Labrador", "Au au au");
        Cao cao2 = new Cao("Floky", "Pastor Alemão", "Uof Uof");
        Cao cao3 = new Cao("Benny", "Labradore", "UAU UAU");

        System.out.println("O " + cao1.getNome() + " é um " + cao1.getRaca() + " e faz " + cao1.getLatido());
        System.out.println("O " + cao2.getNome() + " é um " + cao2.getRaca() + " e faz " + cao2.getLatido());
        System.out.println("O " + cao3.getNome() + " é um " + cao3.getRaca() + " e  faz " + cao3.getLatido());

        cao1.setLatido("HI hihihihi");

        System.out.println(" ");

        System.out.println("Agora o " + cao1.getNome() + " faz " +  cao1.getLatido());

    }
}
