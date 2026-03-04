package com.github.Gregorys2s;

import java.util.List;

public class Carrinho {
    private List<Cliente> clientel;
    private List<ItemCarrinho> produto;

    public Carrinho(List<Cliente> clientel, List<ItemCarrinho> produto) {
        this.clientel = clientel;
        this.produto = produto;
    }

    public void adicionarCarrinho(Produto produto,int quantidade)
    {
       ItemCarrinho item = new ItemCarrinho(produto,quantidade);
        this.produto.add(item);
    }

    public List<Cliente> getClientel() {
        return clientel;
    }

    public void setClientel(List<Cliente> clientel) {
        this.clientel = clientel;
    }

    public List<ItemCarrinho> getProduto() {
        return produto;
    }

    public void setProduto(List<ItemCarrinho> produto) {
        this.produto = produto;
    }
}



