package com.github.Gregorys2s;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int numId = 3;
        //aqui estao sendo inicializadas todas as classes para testar se estao funcioando
        List<Cliente> cliente = new ArrayList<>();
        Pagamentos pagamento = new Pagamentos(new ArrayList<>(), 0);
        List<Produto> produto = new ArrayList<>();
        List<ItemCarrinho> item = new ArrayList<>();
        Carrinho carrinho = new Carrinho(cliente,item);
        Estoque estoque = new Estoque();
        //aqui foi inizializado o escaner
        Scanner sc = new Scanner(System.in);
        //variavel usada dentro do switch
        int opcao = 0;

        //aqui e feita a estrutura para o usuario escolher a suas opcoes

        do {
            menu();
            opcao = sc.nextInt();
            switch (opcao)
            {
                case 1:
                    mostrarProdutos(estoque.getProdutos());
                    System.out.println("Digite o id do produto");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite a quantidade desejada");
                    int quantidade = sc.nextInt();
                    Produto itens = estoque.buscarPorId(id);
                    System.out.println(itens.getNome());
                    carrinho.adicionarCarrinho(itens,quantidade);

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:

                    break;
            }
        }while (opcao != 4);

    }
    //funcao para mostrar o menu
    static void menu()
    {
        System.out.println("Seja bem-vido ao sistema/n");
        System.out.println("1.Comprar produto");
        System.out.println("2.Mostrar o carrinho");
        System.out.println("3.Tirar produto da lista");
        System.out.println("4.Sair");
    }
    //funcao para mostrar todos os produtos que podem ser escolhidos
    static void mostrarProdutos (List<Produto> produto)
    {
        System.out.println("Menu\n");
        for (Produto itens : produto)
        {
            System.out.println(itens.getId() + " - " + itens.getNome() + " - R$ " + itens.getPreco());
        }
    }
    static void mostrarCarrinho (List<Produto> produto, int quantidade)
    {
        System.out.println("Menu\n");
        for (Produto itens : produto)
        {
            System.out.println("() " + itens.getNome() + " - R$ " + quantidade);
        }
    }
}