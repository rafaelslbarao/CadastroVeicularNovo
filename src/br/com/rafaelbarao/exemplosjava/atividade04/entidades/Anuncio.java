package br.com.rafaelbarao.exemplosjava.atividade04.entidades;

import br.com.rafaelbarao.exemplosjava.atividade04.interfaces.ApresentacaoAnuncio;

public abstract class Anuncio implements ApresentacaoAnuncio {
    private Integer codigo;
    private Double valor;

    public Anuncio() {
    }

    public Anuncio(Integer codigo, Double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
