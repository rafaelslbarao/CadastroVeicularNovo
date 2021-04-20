package br.com.rafaelbarao.cadastroveicular.explicacaoheranca;

import br.com.rafaelbarao.cadastroveicular.util.Console;

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
