package br.com.rafaelbarao.exemplosjava.exemplos_interface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EstacaoRadio {

    private String nome;
    private List<InteressadoProgramacaoRadio> listaInteressados = new ArrayList<>();

    public EstacaoRadio(String nome) {
        this.nome = nome;
    }

    public void iniciaEstacaoRadio() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                do {
                    trocarProgramacao("Programação de Rádio (" + nome + ") do horário:" + new Date().toString());
                    try {
                        Thread.sleep(15000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while (true);
            }
        }).start();
    }

    public void trocarProgramacao(String informacaoProgramacao) {
        for (InteressadoProgramacaoRadio interessado : listaInteressados)
            interessado.mudouProgramacaoRadio(informacaoProgramacao);
    }

    public void adicionaInteressado(InteressadoProgramacaoRadio interessado) {
        listaInteressados.add(interessado);
    }
}
