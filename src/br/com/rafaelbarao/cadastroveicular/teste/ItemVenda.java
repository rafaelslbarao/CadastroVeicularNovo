package br.com.rafaelbarao.cadastroveicular.teste;

//Exemplo de composição (Classe "parte")
public class ItemVenda {
    private String descricao;
    private Integer quantidade;
    private Double valorUnitario;

    public ItemVenda(String descricao, Integer quantidade, Double valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
