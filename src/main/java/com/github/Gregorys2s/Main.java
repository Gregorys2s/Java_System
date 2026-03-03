package com.github.Gregorys2s;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int numId = 3;

        List<Cliente> cliente = new ArrayList<>();
        List<Carrinho> carrinho = new ArrayList<>();
        Pagamentos pagamento = new Pagamentos(new ArrayList<>(), 0);
        List<Produto> produto = new ArrayList<>();

            cliente.add(new Cliente(1, "Gregory","Rua alameda manganes"));
            cliente.add(new Cliente(2, "Maria Silva", "Avenida Brasil"));
            cliente.add(new Cliente(3, "João Pereira", "Avenida Jorge Schimmelpfeng"));
            cliente.add(new Cliente(4, "Ana Souza", "Rua Tarobá"));
            cliente.add(new Cliente(5, "Carlos Mendes", "Avenida Paraná"));
            cliente.add(new Cliente(6, "Fernanda Lima", "Rua Marechal Deodoro"));
            cliente.add(new Cliente(7, "Lucas Ferreira", "Avenida JK"));

            produto.add(new Produto(1, "Arroz 5kg", 28.90));
            produto.add(new Produto(2, "Feijão 1kg", 8.50));
            produto.add(new Produto(3, "Macarrão", 4.75));
            produto.add(new Produto(4, "Óleo de Soja", 6.99));
            produto.add(new Produto(5, "Leite Integral", 5.49));

            for (Produto p : produto)
            {

                if(p.getId() == numId)
                {
                    pagamento.pagar(p.getNome(),2,p.getPreco());
                    numId++;
                }
            }


    }
}