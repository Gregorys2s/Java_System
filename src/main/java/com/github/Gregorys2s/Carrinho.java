package com.github.Gregorys2s;

import java.util.List;

public class Carrinho {
    private List<Cliente> clientel;
    private List<Produto> produto;

    public Carrinho(List<Cliente> clientel, List<Produto> produto) {
        this.clientel = clientel;
        this.produto = produto;
    }

    public List<Cliente> getClientel() {
        return clientel;
    }

    public void setClientel(List<Cliente> clientel) {
        this.clientel = clientel;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}
