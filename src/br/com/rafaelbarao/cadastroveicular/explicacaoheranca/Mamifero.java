package br.com.rafaelbarao.cadastroveicular.explicacaoheranca;

import br.com.rafaelbarao.cadastroveicular.util.Console;

public abstract class Mamifero extends Animal {

    public void seAlimentaComLeite() {
        new Console().escreveConsole("O mamífero " + getNome() + " se alimentou de leite");
    }

    @Override
    public void seMovimenta() {
        setDistanciaPercorrida(getDistanciaPercorrida() + 3);
    }
}
