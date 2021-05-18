package br.com.rafaelbarao.exemplosjava.atividade04.entidades;

public class AluguelImovel  extends AnuncioImovel{
    private String nomeImobiliaria;
    private boolean necessidadeFiador;

    public AluguelImovel() {
    }

    public AluguelImovel(Integer codigo, Double valor, String endereco, String telefone, String nomeImobiliaria, boolean necessidadeFiador) {
        super(codigo, valor, endereco, telefone);
        this.nomeImobiliaria = nomeImobiliaria;
        this.necessidadeFiador = necessidadeFiador;
    }

    public String getNomeImobiliaria() {
        return nomeImobiliaria;
    }

    public void setNomeImobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }

    public boolean isNecessidadeFiador() {
        return necessidadeFiador;
    }

    public void setNecessidadeFiador(boolean necessidadeFiador) {
        this.necessidadeFiador = necessidadeFiador;
    }

    @Override
    public String getApresentacaoAnuncio() {
        return "### ALUGUEL IMÓVEL ###" +
                "\r\nENDERECO: " + getEndereco()
                + "\r\nTELEFONE: " + getTelefone()
                + "\r\nVALOR: " + getValor();
    }
}
