package br.com.rafaelbarao.exemplosjava.atividade04.controladora;

import br.com.rafaelbarao.exemplosjava.atividade04.entidades.AluguelImovel;
import br.com.rafaelbarao.exemplosjava.atividade04.entidades.Anuncio;
import br.com.rafaelbarao.exemplosjava.atividade04.entidades.VendaImovel;
import br.com.rafaelbarao.exemplosjava.atividade04.entidades.VendaVeiculo;
import br.com.rafaelbarao.exemplosjava.atividade04.interfaces.Anunciante;
import br.com.rafaelbarao.exemplosjava.util.Console;

import java.util.ArrayList;

public class CadastroAnunciosControladora {
    private Console console;
    private ArrayList<Anuncio> listaAnuncios;
    private ArrayList<Anunciante> listaAnunciantes;

    public CadastroAnunciosControladora() {
        listaAnuncios = new ArrayList<>();
        listaAnunciantes = new ArrayList<>();
        console = new Console();
    }

    public void cadastraVendaImovel()
    {
        //Pega os valores do usuario
        console.escreveConsole("Digite o endereco:");
        String endereco = console.leLinhaTexto();
        console.escreveConsole("Digite o valor da venda:");
        Double valorVenda = console.leNumeroDouble();
        console.escreveConsole("Digite o telefone de contato:");
        String telefone = console.leLinhaTexto();

        //Instancia um novo objeto
        VendaImovel novoAnuncio = new VendaImovel();
        novoAnuncio.setCodigo(getNovoCodigo());
        novoAnuncio.setEndereco(endereco);
        novoAnuncio.setValor(valorVenda);
        novoAnuncio.setTelefone(telefone);

        //Adiciona o novo objeto à lista de cadastros de anuncio
        cadastraAnuncio(novoAnuncio);
    }

    public void cadastraAluguelImovel()
    {
        //Pega os valores do usuario
        console.escreveConsole("Digite o endereco:");
        String endereco = console.leLinhaTexto();
        console.escreveConsole("Digite o valor do aluguel:");
        Double valorAluguel = console.leNumeroDouble();
        console.escreveConsole("Digite o telefone de contato:");
        String telefone = console.leLinhaTexto();
        console.escreveConsole("Digite o nome da imobiliaria:");
        String nomeImobiliaria = console.leLinhaTexto();
        console.escreveConsole("Necessita de fiador [1 - Sim / 0 - Não]");
        boolean necessitaFiadlor = console.leNumeroInteiro() == 1;

        //Instancia um novo objeto
        AluguelImovel novoAnuncio = new AluguelImovel(getNovoCodigo(), valorAluguel, endereco, telefone, nomeImobiliaria, necessitaFiadlor);

        //Adiciona o novo objeto à lista de cadastros de anuncio
        cadastraAnuncio(novoAnuncio);
    }

    public void cadastraVendaVeiculo()
    {
        //Pega os valores do usuario
        console.escreveConsole("Digite o modelo do veiculo:");
        String modelo = console.leLinhaTexto();
        console.escreveConsole("Digite a cor do veículo:");
        String cor = console.leLinhaTexto();
        console.escreveConsole("Digite o ano do veículo:");
        Integer ano = console.leNumeroInteiro();
        console.escreveConsole("Digite o valor da venda?");
        Double valorVenda = console.leNumeroDouble();

        //Instancia um novo objeto
        VendaVeiculo novoAnuncio = new VendaVeiculo(getNovoCodigo(), valorVenda, modelo, cor, ano);

        //Adiciona o novo objeto à lista de cadastros de anuncio
        cadastraAnuncio(novoAnuncio);
    }

    private void cadastraAnuncio(Anuncio novoAnuncio)
    {
        listaAnuncios.add(novoAnuncio);
        for(Anunciante anunciante : listaAnunciantes)
            anunciante.onNovoAnuncioCadastrado(novoAnuncio);
    }

    private Integer getNovoCodigo()
    {
        return listaAnuncios.size() + 1;
    }

    public void imprimeAnuncios()
    {
        for(Anuncio anuncio : listaAnuncios)
            console.escreveConsole(anuncio.getApresentacaoAnuncio());
    }

    public void registraAnunciante(Anunciante anunciante)
    {
        listaAnunciantes.add(anunciante);
    }
}
