package br.com.rafaelbarao.exemplosjava.atividade04;

import br.com.rafaelbarao.exemplosjava.atividade04.anunciantes.Radio;
import br.com.rafaelbarao.exemplosjava.atividade04.anunciantes.Televisao;
import br.com.rafaelbarao.exemplosjava.atividade04.controladora.CadastroAnunciosControladora;
import br.com.rafaelbarao.exemplosjava.util.Console;

public class Main {
    public static void main(String[] args) {
        CadastroAnunciosControladora anunciosControladora = new CadastroAnunciosControladora();
        //
        Radio mega = new Radio("Mega");
        Radio jovemPan = new Radio("Jovem Pan");
        Televisao globo = new Televisao("Globo");
        //
        anunciosControladora.registraAnunciante(mega);
        anunciosControladora.registraAnunciante(jovemPan);
        anunciosControladora.registraAnunciante(globo);
        //
        anunciosControladora.cadastraVendaImovel();
        anunciosControladora.cadastraVendaVeiculo();
        anunciosControladora.cadastraAluguelImovel();
        //
        anunciosControladora.imprimeAnuncios();
        //
        mega.apresentaNumeroAnuncios();
        jovemPan.apresentaNumeroAnuncios();
        globo.apresentaNumeroAnuncios();
    }
}
