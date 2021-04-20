package br.com.rafaelbarao.exemplosjava.entidades;

import br.com.rafaelbarao.exemplosjava.util.Console;

public class Motocicleta extends Veiculo {
    public boolean estadoDescanso;
    public Integer capacidadeTanque;

    public Motocicleta(Integer codigo, String placa, String cor, Integer anoFabricao, Integer capacidadeTanque) {
        super(codigo, placa, cor, anoFabricao);
        this.capacidadeTanque = capacidadeTanque;
        this.estadoDescanso = true;
    }

    public Integer getPotenciaMotor() {
        return 150;
    }

    public void abaixaDescanso()
    {
        estadoDescanso = true;
        new Console().escreveConsole("Descanso abaixado");
    }

    public void sobeDescanso()
    {
        estadoDescanso = false;
        new Console().escreveConsole("Descanso levantado");
    }

    public boolean isEstadoDescanso() {
        return estadoDescanso;
    }

    public void setEstadoDescanso(boolean estadoDescanso) {
        this.estadoDescanso = estadoDescanso;
    }

    public Integer getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Integer capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
}
