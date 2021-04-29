package br.com.rafaelbarao.exemplosjava.exemplos_interface;

import br.com.rafaelbarao.exemplosjava.util.Console;

public class Main {
    public static void main(String[] args) {
        //Criação das estações de Rádio
        EstacaoRadio estacaoJovemPan = new EstacaoRadio("JovemPan");
        estacaoJovemPan.iniciaEstacaoRadio();
        EstacaoRadio estacaoMega = new EstacaoRadio("Mega");
        estacaoMega.iniciaEstacaoRadio();

        //Criação dos canais de TV
        CanalTV canalTelecine = new CanalTV("Telecine");
        canalTelecine.iniciaCanalTV();
        CanalTV canalSporTV = new CanalTV("SporTV");
        canalSporTV.iniciaCanalTV();
        //

        //Criação dos receptores
        ReceptorTVRadio receptorClaro = new ReceptorTVRadio("Claro");
        ReceptorTVRadio receptorVivo = new ReceptorTVRadio("Vivo");

        //Adiciona um listener (ouvinte), que é o receptor da claro,
        // de eventos de mudança de programação à estação jovem pan, mega e para os canais
        // telecine e sportv
        estacaoJovemPan.adicionaInteressado(receptorClaro);
        estacaoMega.adicionaInteressado(receptorClaro);
        canalTelecine.adicionaInteressado(receptorClaro);
        canalSporTV.adicionaInteressado(receptorClaro);

        //Adiciona um listener (ouvinte), que é o receptor da vivo,
        // de eventos de mudança de programação aos canais
        // telecine e sportv
        canalTelecine.adicionaInteressado(receptorVivo);
        canalSporTV.adicionaInteressado(receptorVivo);

        //Adiciona um listener (ouvinte) que é uma classe anonima
        //ao canal telecine
        canalTelecine.adicionaInteressado(new InteressadoProgramacaoTV() {
            @Override
            public void mudouProgramacaoTV(String novaProgramacao) {
                new Console().escreveConsole("Classe anonima recebendo notificação" + novaProgramacao);
            }
        });


        do {

        }while(true);
    }
}
