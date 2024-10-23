package Produtos;

public class ProdutoVestuario extends Produto {
    public String tamanho;
    public String cor;
    public String material;

    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    @Override
    public void salvar() {
        System.out.println("Produto Vestuário salvo: " + nome);
    }

    @Override
    public void deletar() {
        System.out.println("Produto Vestuário deletado: " + nome);
    }

    @Override
    public void atualizar() {
        System.out.println("Produto Vestuário atualizado: " + nome);
    }
}
