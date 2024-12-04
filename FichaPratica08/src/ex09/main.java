package ex09;

public class main {

    public static void main (String[] args){

        //Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock (deve ser inicializada a
        //0), e os métodos comprar e vender, que recebam a quantidade desejada como parâmetro e atualizem o
        //stock.
        //a. Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
        //atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não
        //é possível por quebra de stock do produto.
        //b. No método main, crie um objeto dessa classe Produto e chame o método para comprar 5
        //unidades.
        //c.
        //Invoque o método para vender 2 unidades, e imprima a quantidade de stock.
        //d. Invoque o método para comprar 10 unidades.
        //e. Invoque o método para vender 35 unidades.

        // Instanciar o produto
        Produto bolacha = new Produto("Bolacha Oreo",2.5);
        bolacha.exibirDetalhes();

        // Comprar 10 unidades
        bolacha.comprar(10);
        bolacha.exibirDetalhes();

        // Venda falhada - só temos 10
        bolacha.vender(22);
        bolacha.exibirDetalhes();

        // Venda efetuada - temos 10
        bolacha.vender(2);
        bolacha.exibirDetalhes();

    }
}
