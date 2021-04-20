package br.com.rafaelbarao.cadastroveicular;

import br.com.rafaelbarao.cadastroveicular.controladores.CadastroVeiculos;
import br.com.rafaelbarao.cadastroveicular.entidades.Veiculo;
import br.com.rafaelbarao.cadastroveicular.explicacaoheranca.TestesHeranca;
import br.com.rafaelbarao.cadastroveicular.teste.Venda;
import br.com.rafaelbarao.cadastroveicular.util.Console;
import br.com.rafaelbarao.cadastroveicular.view.MenuPrincipal;

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
