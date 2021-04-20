package br.com.rafaelbarao.cadastroveicular.teste;

import java.util.ArrayList;

//Exemplo associação unária
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Pessoa pessoaComRelacionamento;
    private ArrayList<Pessoa> listaFilhos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa getPessoaComRelacionamento() {
        return pessoaComRelacionamento;
    }

    public void setPessoaComRelacionamento(Pessoa pessoaComRelacionamento) {
        this.pessoaComRelacionamento = pessoaComRelacionamento;
    }

    public ArrayList<Pessoa> getListaFilhos() {
        return listaFilhos;
    }

    public void setListaFilhos(ArrayList<Pessoa> listaFilhos) {
        this.listaFilhos = listaFilhos;
    }
}
