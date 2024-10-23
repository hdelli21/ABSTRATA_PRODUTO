package Produtos;

public abstract class Produto {
    protected String nome;
    protected double precoCusto;
    protected double precoVenda;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    public abstract void salvar();
    public abstract void deletar();
    public abstract void atualizar();
}
