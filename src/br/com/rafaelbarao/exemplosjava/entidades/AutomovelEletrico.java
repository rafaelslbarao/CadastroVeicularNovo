package br.com.rafaelbarao.exemplosjava.entidades;

import br.com.rafaelbarao.exemplosjava.util.Console;

public class AutomovelEletrico extends Veiculo {
    public boolean estadoArCondicionado;
    public Integer nroPassageiros;
    public Integer nroPortas;

    public AutomovelEletrico(Integer codigo, String placa, String cor, Integer anoFabricao, Integer nroPassageiros, Integer nroPortas) {
        super(codigo, placa, cor, anoFabricao);
        this.nroPassageiros = nroPassageiros;
        this.nroPortas = nroPortas;
        this.estadoArCondicionado = false;
    }

    public Integer getPotenciaMotor() {
        return 2000;
    }

    public void ligaArCondicionado() {
        estadoArCondicionado = true;
        new Console().escreveConsole("Ar condicionado ligado");
    }

    public void desligaArCondicionado() {
        estadoArCondicionado = false;
        new Console().escreveConsole("Ar condicionado desligado");
    }

    public Integer getNroPassageiros() {
        return nroPassageiros;
    }

    public void setNroPassageiros(Integer nroPassageiros) {
        this.nroPassageiros = nroPassageiros;
    }

    public boolean isEstadoArCondicionado() {
        return estadoArCondicionado;
    }

    public void setEstadoArCondicionado(boolean estadoArCondicionado) {
        this.estadoArCondicionado = estadoArCondicionado;
    }

    public Integer getNroPortas() {
        return nroPortas;
    }

    public void setNroPortas(Integer nroPortas) {
        this.nroPortas = nroPortas;
    }
}
