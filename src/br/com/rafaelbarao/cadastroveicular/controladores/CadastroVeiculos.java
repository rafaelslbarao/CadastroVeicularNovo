package br.com.rafaelbarao.cadastroveicular.controladores;

import br.com.rafaelbarao.cadastroveicular.entidades.AutomovelEletrico;
import br.com.rafaelbarao.cadastroveicular.entidades.Motocicleta;
import br.com.rafaelbarao.cadastroveicular.entidades.Veiculo;
import br.com.rafaelbarao.cadastroveicular.util.Console;

import java.util.ArrayList;

public class CadastroVeiculos {
    //Variável compartilhada na aplicação independente de instância de objetos da classe a qual ela pertence
    //Alterações dessa variável irá alterar para todos
    private static int proximoCodigo = 1;

    //Variável compartilhada na aplicação independente de instância de objetos da classe a qual ela pertence
    //Por ser final não podem alteradas
    private static final String COR_BRANCO = "BRANCO";
    private static final String COR_PRATA = "PRATA";
    private static final String COR_PRETO = "PRETO";
    private static final String[] CORES = new String[]{COR_BRANCO, COR_PRATA, COR_PRETO};

    private static final int TIPO_MOTOCICLETA = 1;
    private static final int TIPO_AUTOMOVEL_ELETRICO = 2;

    private Console console;
    private ArrayList<Veiculo> listaVeiculos;

    public CadastroVeiculos(Console console) {
        this.console = console;
        listaVeiculos = new ArrayList<Veiculo>();
    }

    public void cadastraNovoVeiculo() {
        Integer codigo = proximoCodigo++;
        console.escreveConsole("Digite a placa do novo veículo:");
        String placa = console.leLinhaTexto();
        String cor;
        do {
            console.escreveConsole("Digite a cor do novo veículo:");
            cor = console.leLinhaTexto();
            boolean encontrouCor = false;
            for (String cadastroCor : CORES) {
                if (cor.equalsIgnoreCase(cadastroCor)) {
                    cor = cadastroCor;
                    encontrouCor = true;
                    break;
                }
            }
            if (!encontrouCor)
                console.escreveConsole("Cor Inválida");
            else
                break;
        }
        while (true);
        console.escreveConsole("Digite o ano de fabricação do novo veículo:");
        Integer ano = console.leNumeroInteiro();
        //
        int tipo;
        do {
            console.escreveConsole("Qual o tipo do veículo: [1] Motocicleta / [2] Automóvel Elétrico");
            tipo = console.leNumeroInteiro();
            if (tipo != TIPO_MOTOCICLETA && tipo != TIPO_AUTOMOVEL_ELETRICO)
                console.escreveConsole("Tipo inválido");
            else
                break;
        } while (true);
        //
        Veiculo novoVeiculo = null;
        switch (tipo) {
            case TIPO_MOTOCICLETA:
                novoVeiculo = finalizaCadastroMotocicleta(codigo, placa, cor, ano);
                break;
            case TIPO_AUTOMOVEL_ELETRICO:
                novoVeiculo = finalizaCadastroAutomovelEletrico(codigo, placa, cor, ano);
                break;
        }
        listaVeiculos.add(novoVeiculo);
        console.escreveConsole("Veículo cadastro com sucesso!\n");
    }

    private AutomovelEletrico finalizaCadastroAutomovelEletrico(Integer codigo, String placa, String cor, Integer ano) {
        console.escreveConsole("Digite o nro de passageiros:");
        Integer nroPassageiros = console.leNumeroInteiro();
        //
        console.escreveConsole("Digite o nro de portas:");
        Integer nroPortas = console.leNumeroInteiro();
        //
        AutomovelEletrico novoAutomovelEletrico = new AutomovelEletrico(codigo, placa, cor, ano, nroPassageiros, nroPortas);
        return novoAutomovelEletrico;
    }

    private Motocicleta finalizaCadastroMotocicleta(Integer codigo, String placa, String cor, Integer ano) {
        console.escreveConsole("Digite a capacidade do tanque:");
        Integer capacidadeTanque = console.leNumeroInteiro();
        //
        Motocicleta motocicleta = new Motocicleta(codigo, placa, cor, ano, capacidadeTanque);
        return motocicleta;
    }

    public void apresentaListagemVeiculos() {
        console.escreveConsole("Veículos cadastros:");
        for (Veiculo veiculo : listaVeiculos) {
            String descricao = "Código:" + veiculo.getCodigo() + "\n" +
                    "Placa:" + veiculo.getPlaca() + "\n" +
                    "Cor:" + veiculo.getCor() + "\n" +
                    "Ano Fabricação:" + veiculo.getAnoFabricao() + "\n";

            if (veiculo instanceof Motocicleta) {
                descricao += "Tipo: " + Motocicleta.class.getSimpleName() + "\n" +
                        "Cap Tanque: " + ((Motocicleta) veiculo).getCapacidadeTanque() + "\n";
            } else if (veiculo instanceof AutomovelEletrico) {
                descricao += "Tipo: " + AutomovelEletrico.class.getSimpleName() + "\n" +
                        "Nro Passageiros: " + ((AutomovelEletrico) veiculo).getNroPassageiros()  + "\n" +
                        "Nro Portas: " + ((AutomovelEletrico) veiculo).getNroPortas()  + "\n";
            }

            console.escreveConsole(descricao);
        }
        console.escreveConsole("");
    }

    public void excluiVeiculo() {
        console.escreveConsole("Digite o código do veículo para excluir:");
        Integer codigo = console.leNumeroInteiro();
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getCodigo().equals(codigo)) {
                listaVeiculos.remove(veiculo);
                console.escreveConsole("Veículo removido com sucesso!\n");
                return;
            }
        }
        console.escreveConsole("Veículo não encontrado!\n");
    }
}
