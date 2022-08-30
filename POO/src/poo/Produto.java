package poo;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;

    public Produto(int codigo, String descricao, double preco) {
        System.out.println("acabei de criar um novo produto");
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Produto(int codigo, String descricao) {
        System.out.println("acabei de criar um novo produto");
        this.codigo = codigo;
        this.descricao = descricao;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void mostrarAnuncio() {
        System.out.println("----------PRODUTO----------");
        System.out.println(codigo + " : " + descricao + " : R$ " + preco);
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - preco * percentual / 100;
    }

    public double simularDesconto(double percentual) {
        double precoSimulado;
        precoSimulado = preco - preco * percentual / 100;
        return precoSimulado;
    }
}
