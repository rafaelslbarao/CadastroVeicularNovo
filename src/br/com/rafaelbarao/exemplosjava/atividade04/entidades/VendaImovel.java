package br.com.rafaelbarao.exemplosjava.atividade04.entidades;

public class VendaImovel extends AnuncioImovel {
    public VendaImovel() {
    }

    public VendaImovel(Integer codigo, Double valor, String endereco, String telefone) {
        super(codigo, valor, endereco, telefone);
    }

    @Override
    public String getApresentacaoAnuncio() {
        return "### VENDA IMÓVEL ###" +
                "\r\nENDERECO: " + getEndereco()
                + "\r\nTELEFONE: " + getTelefone()
                + "\r\nVALOR: " + getValor();
    }
}
