package br.com.rafaelbarao.exemplosjava.atividade04.entidades;

public class VendaVeiculo extends Anuncio {
    private String modeloVeiculo;
    private String cor;
    private Integer ano;

    public VendaVeiculo() {
    }

    public VendaVeiculo(Integer codigo, Double valor, String modeloVeiculo, String cor, Integer ano) {
        super(codigo, valor);
        this.modeloVeiculo = modeloVeiculo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String getApresentacaoAnuncio() {
        return "### VENDA VEICULO ###"
                + "\r\nMODELO: " + getModeloVeiculo()
                + "\r\nANO: " + getAno()
                + "\r\nVALOR: " + getValor();
    }
}
