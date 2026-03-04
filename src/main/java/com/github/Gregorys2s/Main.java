package com.github.Gregorys2s;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int numId = 3;

        List<Cliente> cliente = new ArrayList<>();
        List<Carrinho> carrinho = new ArrayList<>();
        Pagamentos pagamento = new Pagamentos(new ArrayList<>(), 0);
        List<Produto> produto = new ArrayList<>();
        Estoque estoque = new Estoque();

            cliente.add(new Cliente(1, "Gregory","Rua alameda manganes"));
            cliente.add(new Cliente(2, "Maria Silva", "Avenida Brasil"));
            cliente.add(new Cliente(3, "João Pereira", "Avenida Jorge Schimmelpfeng"));
            cliente.add(new Cliente(4, "Ana Souza", "Rua Tarobá"));
            cliente.add(new Cliente(5, "Carlos Mendes", "Avenida Paraná"));
            cliente.add(new Cliente(6, "Fernanda Lima", "Rua Marechal Deodoro"));
            cliente.add(new Cliente(7, "Lucas Ferreira", "Avenida JK"));

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o id do produto");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite a quantidade desejada");
            int quantidade = sc.nextInt();

            pagamento.pagar(numero,estoque.getProdutos(),quantidade);

    }
}