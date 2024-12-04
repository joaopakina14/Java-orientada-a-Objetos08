package ex01;

public class main {

    public static void main(String[] args){

        Pessoa pessoa1= new Pessoa("Joao", 41, 1.7);
        Pessoa pessoa2= new Pessoa("Regina", 45, 1.68);
        Pessoa pessoa3= new Pessoa("Maria João", 8, 1.4);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        System.out.println(pessoa2.getNome());

        pessoa1.setIdade(26);


        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        System.out.println(pessoa2.getNome() + " tem " + pessoa1.getIdade() + " anos.");

    }
}
