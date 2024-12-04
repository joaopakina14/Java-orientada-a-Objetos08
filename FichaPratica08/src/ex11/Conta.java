package ex11;

public class Conta {


    //Crie uma classe chamada "Conta" com os seguintes atributos: número da conta, saldo e titular da
    //conta.

    private int numeroConta;
    private double saldo;
    private String titularConta;

    public Conta(int numeroConta, double saldo, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titularConta = titularConta;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void exibirDetalhes(){
        System.out.println(this.numeroConta + " " + this.saldo + " " + this.titularConta);
    }

    //Crie um método “transferência” que tenha como parâmetros o valor a transferir e a conta de
    //destinatário.

    public void transferencia(Conta contaDestino, double valor){

        if (this.saldo >=valor){
            System.out.println("Transferencia efetuada" + valor);
            this.saldo -= valor;
            contaDestino.saldo += valor;
        }else{
            System.out.println("Transferencia recusada. Saldo insuficiente.");
        }
    }//Crie os métodos depositar (aumentar saldo), levantar (diminuir saldo) e mostrarSaldo. (Exemplo
    //de mostarSaldo: “Saldo da conta 12345: 950 EUR”)

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito efetuado: " + valor);
    }
    //levantar (diminuir saldo)
    public void levantar(double valor){
        if (this.saldo>=valor){
            this.saldo -= valor;
            System.out.println("Levantamento efetuado " + valor);
        }else {
            System.out.println("Levantamento recusado. Falta de saldo.");
        }

    }
    public void mostrarSaldo(){
        System.out.println("Saldo da Conta " + this.numeroConta + ": " + this.saldo + " Eur.");
    }





}
