package br.com.rafaelbarao.exemplosjava.explicacaoheranca;

public abstract class Animal {
    private String nome;
    private Long distanciaPercorrida;

    public Animal() {
        distanciaPercorrida = 0L;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void setDistanciaPercorrida(Long distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public Long getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void seMovimenta()
    {
        distanciaPercorrida = distanciaPercorrida + 1;
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        retorno += " Nome: " + nome + " Distância: " + distanciaPercorrida;
        return retorno;
    }

    public abstract void seAlimenta();
}
