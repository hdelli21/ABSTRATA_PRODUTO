package Main;

import Produtos.ProdutoAlimenticio;
import Produtos.ProdutoVestuario;



public class Main {
    public static void main(String[] args) {
        ProdutoAlimenticio alimento = new ProdutoAlimenticio("Maçã", 2.0, 3.0, "2025-12-31", "Fruta fresca");
        alimento.salvar();
        System.out.println("Lucro: " + alimento.calcularLucro());

        ProdutoVestuario vestuario = new ProdutoVestuario ("Camisa", 20.0, 30.0, "M", "Azul", "Algodão");
        vestuario.salvar();
        System.out.println("Lucro: " + vestuario.calcularLucro());
    }
}