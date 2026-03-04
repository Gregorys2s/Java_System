package com.github.Gregorys2s;

import java.util.ArrayList;
import java.util.List;

public class Estoque{

   private List<Produto> produtos = new ArrayList<>();

   public Estoque(){
        produtos.add(new Produto(1, "Arroz 5kg", 28.90));
        produtos.add(new Produto(2, "Feijão 1kg", 8.50));
        produtos.add(new Produto(3, "Macarrão", 4.75));
        produtos.add(new Produto(4, "Óleo de Soja", 6.99));
        produtos.add(new Produto(5, "Leite Integral", 5.49));
   }

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
