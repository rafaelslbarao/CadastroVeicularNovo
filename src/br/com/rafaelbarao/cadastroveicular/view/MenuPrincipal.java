package br.com.rafaelbarao.cadastroveicular.view;

import br.com.rafaelbarao.cadastroveicular.controladores.CadastroVeiculos;
import br.com.rafaelbarao.cadastroveicular.util.Console;

public class MenuPrincipal {
    private static final int MENU_CADASTRAR_VEICULO = 100;
    private static final int MENU_LISTAR_VEICULOS = 101;
    private static final int MENU_EXCLUIR_VEICULO = 102;
    private static final int MENU_SAIR = 103;

    private Console console;
    private CadastroVeiculos cadastroVeiculosControlador;

    public MenuPrincipal(Console console, CadastroVeiculos cadastroVeiculosControlador) {
        this.console = console;
        this.cadastroVeiculosControlador = cadastroVeiculosControlador;
    }

    public void run() {
        try {

            //Declaração do objeto de uma determinada classe + criação ou instanciação de um novo objeto da classe
            OpcaoMenu opcaoCadastrar = new OpcaoMenu(MENU_CADASTRAR_VEICULO, "Cadastrar Veículo");
            OpcaoMenu opcaoListar = new OpcaoMenu(MENU_LISTAR_VEICULOS, "Listar Veículos Cadastros");
            OpcaoMenu opcaoExcluir = new OpcaoMenu(MENU_EXCLUIR_VEICULO, "Excluir Veículo");
            OpcaoMenu opcaoSair = new OpcaoMenu(MENU_SAIR, "Sair");

            boolean sair = false;
            do {
                console.escreveConsole("### Menu Principal ###");
                console.escreveConsole(opcaoCadastrar.getVisualizaoOpcao());
                console.escreveConsole(opcaoListar.getVisualizaoOpcao());
                console.escreveConsole(opcaoExcluir.getVisualizaoOpcao());
                console.escreveConsole(opcaoSair.getVisualizaoOpcao());
                console.escreveConsole("Digite uma opção: ");
                Integer opcaoInformada = console.leNumeroInteiro();

                switch (opcaoInformada) {
                    case MENU_CADASTRAR_VEICULO:
                        cadastroVeiculosControlador.cadastraNovoVeiculo();
                        break;
                    case MENU_LISTAR_VEICULOS:
                        cadastroVeiculosControlador.apresentaListagemVeiculos();
                        break;
                    case MENU_EXCLUIR_VEICULO:
                        cadastroVeiculosControlador.excluiVeiculo();
                        break;
                    case MENU_SAIR:
                        sair = true;
                        break;
                }

            } while (!sair);
        } catch (Exception ex) {
        }
    }
}
