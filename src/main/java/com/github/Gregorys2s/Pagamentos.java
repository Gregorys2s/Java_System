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
}
