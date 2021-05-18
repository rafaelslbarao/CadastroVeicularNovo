package br.com.rafaelbarao.exemplosjava.atividade04.anunciantes;

import br.com.rafaelbarao.exemplosjava.atividade04.entidades.Anuncio;
import br.com.rafaelbarao.exemplosjava.atividade04.interfaces.Anunciante;
import br.com.rafaelbarao.exemplosjava.util.Console;

public class Televisao implements Anunciante {
    private String nome;
    private Integer nroAnunciosRecebidos;

    public Televisao(String nome) {
        this.nome = nome;
        this.nroAnunciosRecebidos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNroAnunciosRecebidos() {
        return nroAnunciosRecebidos;
    }

    @Override
    public void onNovoAnuncioCadastrado(Anuncio anuncio) {
        nroAnunciosRecebidos++;
        new Console().escreveConsole(
                "" +
                        "INICIO IMAGENS DA TV\r\n" +
                        anuncio.getApresentacaoAnuncio()
        );
    }

    @Override
    public void apresentaNumeroAnuncios() {
        new Console().escreveConsole(
                "" + nome + " recebeu " + nroAnunciosRecebidos + " anuncios"
        );
    }
}
