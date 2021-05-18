package br.com.rafaelbarao.exemplosjava.atividade04.interfaces;

import br.com.rafaelbarao.exemplosjava.atividade04.entidades.Anuncio;

public interface Anunciante {
    void onNovoAnuncioCadastrado(Anuncio anuncio);

    void apresentaNumeroAnuncios();
}
