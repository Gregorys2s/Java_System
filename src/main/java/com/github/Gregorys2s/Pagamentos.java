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
    
    public double pagar(String nomeProduto,int quantidade,double valor)
    {
        double vendido = 0;
        vendido = quantidade * valor;
        System.out.println(nomeProduto + " quantidade: " + quantidade + " X " + valor + " = " + vendido);
        vendas.add(vendido);
        return vendido;
    }


}
