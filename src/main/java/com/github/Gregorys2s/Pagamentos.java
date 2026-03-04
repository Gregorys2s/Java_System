package com.github.Gregorys2s;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    private List<Double> vendas = new ArrayList<>();
    private double lucroDiario;

    public Pagamentos(List<Double> vendas, double vendasDiarias) {
        this.vendas = vendas;
        this.lucroDiario = vendasDiarias;
    }

    public List<Double> getvendas() {
        return vendas;
    }

    public void setvendas(List<Double> vendas) {
        this.vendas = vendas;
    }

    public double getlucroDiario() {
        return lucroDiario;
    }

    public void setlucroDiario(double lucroDiario) {
        this.lucroDiario = lucroDiario;
    }

    public double pagar(int numId,Produto produto, int quantidade) {
            if (produto.getId() == numId) {
                double vendido = 0;
                vendido = quantidade * produto.getPreco();
                System.out.println(produto.getNome() + " quantidade: " + quantidade + " X " + produto.getPreco() + " = " + vendido);
                vendas.add(vendido);
                return vendido;
            }
        return 0;
    }
}
