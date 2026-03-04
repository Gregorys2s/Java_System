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

    public double pagar(int numId, List<Produto> produto, int quantidade) {

        for (Produto p : produto) {

            if (p.getId() == numId) {
                double vendido = 0;
                vendido = quantidade * p.getPreco();
                System.out.println(p.getNome() + " quantidade: " + quantidade + " X " + p.getPreco() + " = " + vendido);
                vendas.add(vendido);
                return vendido;
            }
        }
        return 0;
    }
}
