package ex10;

public class main {

    public static void main(String[] args) {

        // Crie uma classe Funcionário que tenha os atributos nome, salário e departamento, e os métodos
        //aumentarSalario e exibirDados.
        //a. O método aumentarSalario deve receber um valor percentual (número real) como parâmetro e
        //atualizar o salário de acordo.
        //b. O método exibirDados deve exibir na consola o nome, salário e departamento do funcionário.
        //c.
        //No método main, crie um objeto dessa classe e invoque os métodos para aumentar o salário em
        //10% e exibir os dados do funcionário.

        Funcionario funcionario1 = new Funcionario("João", 1000.0, "RH");
        Funcionario funcionario2 = new Funcionario("António", 890, "Marketing");

        funcionario1.aumentarSalario(10);
        System.out.println(" O funcionário: "+funcionario1.getNome()+ " tem um salário de: " +funcionario1.getSalario() + " e o departamento é: "+ funcionario1.getdepartamento());






    }
}
