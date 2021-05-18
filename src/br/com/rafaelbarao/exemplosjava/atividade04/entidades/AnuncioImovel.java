package br.com.rafaelbarao.exemplosjava.atividade04.entidades;

public abstract class AnuncioImovel extends Anuncio{
    private String endereco;
    private String telefone;

    public AnuncioImovel() {
    }

    public AnuncioImovel(Integer codigo, Double valor, String endereco, String telefone) {
        super(codigo, valor);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
