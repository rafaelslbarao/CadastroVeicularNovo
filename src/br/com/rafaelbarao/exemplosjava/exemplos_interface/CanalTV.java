package br.com.rafaelbarao.exemplosjava.exemplos_interface;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CanalTV {

    private List<InteressadoProgramacaoTV> listaInteressados = new ArrayList<>();
    private String nome;

    public CanalTV(String nome) {
        this.nome = nome;
    }

    public void iniciaCanalTV() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                do {
                    trocarProgramacao("Programação de TV (" + nome + ") do horário:" + new Date().toString());
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while (true);
            }
        }).start();
    }

    public void trocarProgramacao(String informacaoProgramacao) {
        for (InteressadoProgramacaoTV interessado : listaInteressados)
            interessado.mudouProgramacaoTV(informacaoProgramacao);
    }

    public void adicionaInteressado(InteressadoProgramacaoTV interessado) {
        listaInteressados.add(interessado);
    }
}
