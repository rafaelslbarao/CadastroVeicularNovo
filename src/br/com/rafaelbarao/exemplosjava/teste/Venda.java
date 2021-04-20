package br.com.rafaelbarao.exemplosjava.teste;

import java.util.ArrayList;

//Exemplo de composição (Classe "todo")
public class Venda {
    private ArrayList<ItemVenda> itensVenda;

    public Venda() {
        itensVenda = new ArrayList<>();
    }

    public void adicionaItem(String descricao, Integer quantidade, Double valorUnitario)
    {
        ItemVenda novoItem = new ItemVenda(descricao, quantidade, valorUnitario);
        itensVenda.add(novoItem);
    }
}
