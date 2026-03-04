package com.github.Gregorys2s;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;

    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    /*cliente.add(new Cliente(1, "Gregory","Rua alameda manganes"));
            cliente.add(new Cliente(2, "Maria Silva", "Avenida Brasil"));
            cliente.add(new Cliente(3, "João Pereira", "Avenida Jorge Schimmelpfeng"));
            cliente.add(new Cliente(4, "Ana Souza", "Rua Tarobá"));
            cliente.add(new Cliente(5, "Carlos Mendes", "Avenida Paraná"));
            cliente.add(new Cliente(6, "Fernanda Lima", "Rua Marechal Deodoro"));
            cliente.add(new Cliente(7, "Lucas Ferreira", "Avenida JK"));*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
