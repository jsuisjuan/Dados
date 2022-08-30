package poo;

public class Loja {
    public static void main(String[] args) {
        Produto p;
        p = new Produto(123,"Computador",2500.00);

        System.out.println("\n\tBem vindo a Loja\n");

        p.mostrarAnuncio();

        System.out.println("\n*****************************");
        p.aplicarDesconto(10);
        p.mostrarAnuncio();

        // simulando descontos
        System.out.println("O preco do " + p.getDescricao() + " com mais 15% de desconto fica " + p.simularDesconto(15));
        p.mostrarAnuncio();
    }
}
