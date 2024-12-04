package ex10;

public class Funcionario {

    // Crie uma classe Funcionário que tenha os atributos nome, salário e departamento, e os métodos
    //aumentarSalario e exibirDados.
    //a. O método aumentarSalario deve receber um valor percentual (número real) como parâmetro e
    //atualizar o salário de acordo.
    //b. O método exibirDados deve exibir na consola o nome, salário e departamento do funcionário.
    //c.
    //No método main, crie um objeto dessa classe e invoque os métodos para aumentar o salário em
    //10% e exibir os dados do funcionário.

    private String nome;
    private double salario;
    private String departamento;

    // Construtor da classe
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getdepartamento() {
        return departamento;
    }

    // Método para aumentar o salário
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        } else {
            System.out.println("O percentual deve ser maior que 0.");
        }
    }
    // Método para exibir os dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }
}
