package br.com.rafaelbarao.cadastroveicular.explicacaoheranca;

import br.com.rafaelbarao.cadastroveicular.util.Console;

public class Homem extends Mamifero{
    public void fala()
    {
        new Console().escreveConsole("Blablabla");
    }

    @Override
    public void seAlimenta() {
        new Console().escreveConsole("Se alimenta de vários tipos de comida");
    }
}
