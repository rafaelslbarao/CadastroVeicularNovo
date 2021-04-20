package br.com.rafaelbarao.exemplosjava.explicacaoheranca;

import br.com.rafaelbarao.exemplosjava.util.Console;

public abstract class Ave extends Animal {
    public void voa() {
        new Console().escreveConsole("A ave " + getNome() + " voou");
    }

    @Override
    public void seMovimenta()
    {
        setDistanciaPercorrida(getDistanciaPercorrida() + 2);
    }
}
