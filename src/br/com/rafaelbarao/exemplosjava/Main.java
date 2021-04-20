package br.com.rafaelbarao.exemplosjava;

import br.com.rafaelbarao.exemplosjava.explicacaoheranca.TestesHeranca;

public class Main {
    private static enum Conta {
        CORRENTE,
        POUPANCA
    }


    public static void main(String[] args) {
        TestesHeranca.realizaTestesHeranca();

//        Venda novaVenda = new Venda();
//        novaVenda.adicionaItem("Leite", 5, 2.5);
//        novaVenda.adicionaItem("Café", 1, 7.0);
//
//        novaVenda = null;
//
//
//
//
//
//
//
//
//
//
//        Console console = new Console();
//        CadastroVeiculos cadastroVeiculos = new CadastroVeiculos(console);
//        //
//        MenuPrincipal meuMenu = new MenuPrincipal(console, cadastroVeiculos);
//        meuMenu.run();
//        //
    }
}
