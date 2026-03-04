package com.github.Gregorys2s;

import java.util.ArrayList;
import java.util.List;

public class Estoque{

   private List<Produto> produtos = new ArrayList<>();

   public Estoque(){
       produtos.add(new Produto(1, "X-Salada", 18.90, 10));
       produtos.add(new Produto(2, "X-Bacon", 22.50,10));
       produtos.add(new Produto(3, "X-Tudo", 28.75,10));
       produtos.add(new Produto(4, "Batata Frita Média", 12.99,10));
       produtos.add(new Produto(5, "Refrigerante Lata", 6.50,10));
   }

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    //public void setProdutos(List<Produto> produtos) { foi comentado para colocar uma medida de seguridade para ninguem acessar no sistema
        //this.produtos = produtos;
    //}
    //funcao para buscar o produto por id para o main nao ter acesso a lista toda
    public Produto buscarId(int id)
    {
        for (Produto produto : produtos)
        {
            if (produto.getId() == id)
            {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
