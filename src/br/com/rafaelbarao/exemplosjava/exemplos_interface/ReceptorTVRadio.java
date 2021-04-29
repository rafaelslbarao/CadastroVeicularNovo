package br.com.rafaelbarao.exemplosjava.exemplos_interface;

import br.com.rafaelbarao.exemplosjava.util.Console;

public class ReceptorTVRadio implements InteressadoProgramacaoTV, InteressadoProgramacaoRadio{

    private String nome;

    public ReceptorTVRadio(String nome) {
        this.nome = nome;
    }

    @Override
    public void mudouProgramacaoRadio(String novaProgramacao) {
        new Console().escreveConsole("O receptor " + nome + " recebeu uma nova programação de radio: " + novaProgramacao);
    }

    @Override
    public void mudouProgramacaoTV(String novaProgramacao) {
        new Console().escreveConsole("O receptor " + nome + " recebeu uma nova programação de TV: " + novaProgramacao);
    }
}
