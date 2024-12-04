package ex11;

public class main {

    public static void main(String[] args) {

        Conta conta1 = new Conta(12345, 2000, "João Pimentel");
        Conta conta2 = new Conta(11111, 1800, "Joaquim Silva");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        System.out.println(" ");

        //Deposito
        conta1.depositar(1000);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();

        System.out.println(" ");

        //tentar transferir
        conta1.transferencia(conta2, 9000);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();

        System.out.println(" ");

        //transferir
        conta1.transferencia(conta2, 200);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();




    }
}
