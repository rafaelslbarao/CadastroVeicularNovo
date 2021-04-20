package br.com.rafaelbarao.exemplosjava.explicacaoheranca;

import br.com.rafaelbarao.exemplosjava.util.Console;

public class Beijaflor extends Ave{
    public void seAlimentaDePolen()
    {
        new Console().escreveConsole("Beijou a flor");
    }

    @Override
    public void seMovimenta() {
        super.seMovimenta();
        setDistanciaPercorrida(getDistanciaPercorrida() + 1);
    }

    @Override
    public void seAlimenta() {
        new Console().escreveConsole("Se alimenta de sementes");
    }
}
