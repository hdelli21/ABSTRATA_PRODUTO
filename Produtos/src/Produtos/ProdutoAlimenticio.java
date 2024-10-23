package Produtos;

public class ProdutoAlimenticio extends Produto {
    public String dataValidade;
    public String informacoesNutricionais;

    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    @Override
    public void salvar() {
        System.out.println("Produto Alimentício salvo: " + nome);
    }

    @Override
    public void deletar() {
        System.out.println("Produto Alimentício deletado: " + nome);
    }

    @Override
    public void atualizar() {
        System.out.println("Produto Alimentício atualizado: " + nome);
    }
}
