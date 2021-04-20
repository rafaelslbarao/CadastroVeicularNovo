package br.com.rafaelbarao.exemplosjava.entidades;

//String - Armazenar texto
//Long - Arnazenar valores inteiros
//Integer - Armazena valores interios menores
//Double - Armazenar valores com casas decimais
//Calendar - Armazenar data e horários

//Escopo da classe
//Escopo dos métodos
//Variáveis // Parâmetros do método

public class Veiculo {
    private Integer codigo;
    private String placa;
    private String cor;
    private Integer anoFabricao;
    private Integer kmRodados;

    public Veiculo(String codigo, String placa, String cor, Integer anoFabricao) {
        this.codigo = Integer.valueOf(codigo);
        this.placa = placa;
        this.cor = cor;
        this.anoFabricao = anoFabricao;
        this.kmRodados = 0;
    }

    public Veiculo(Integer codigo, String placa, String cor, Integer anoFabricao) {
        this.codigo = codigo;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricao = anoFabricao;
        this.kmRodados = 0;
    }

    public String getCodigoTexto() {
        return codigo.toString();
    }

    public Veiculo clonaVeiculo() {
        Veiculo clone = new Veiculo(codigo, placa, cor, anoFabricao);
        clone.kmRodados = this.kmRodados;
        return clone;
    }

    public void realizaDeslocamentoEmBaixaVelocidade() {
        realizaDescolamento(1);
    }

    public void realizaDeslocamentoEmAltaVelocidade() {
        realizaDescolamento(10);
    }

    private void realizaDescolamento(Integer deslocamentoTotal)
    {
        kmRodados += deslocamentoTotal;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAnoFabricao() {
        return anoFabricao;
    }

    public Integer getKmRodados() {
        return kmRodados;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static Integer getDiferencaKm(Veiculo veiculo1, Veiculo veiculo2)
    {
        return Math.abs(veiculo1.getKmRodados() - veiculo2.getKmRodados());
    }
}
