package br.com.rafaelbarao.cadastroveicular.explicacaoheranca;

import br.com.rafaelbarao.cadastroveicular.util.Console;

public class Cachorro extends Mamifero{
    public void late()
    {
        new Console().escreveConsole("O cachorro " + getNome() + " latiu");
    }

    @Override
    public void seAlimenta() {
        new Console().escreveConsole("Se alimenta ração");
    }
}
