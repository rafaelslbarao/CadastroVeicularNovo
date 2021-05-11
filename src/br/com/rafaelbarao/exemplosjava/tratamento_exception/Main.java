package br.com.rafaelbarao.exemplosjava.tratamento_exception;

import br.com.rafaelbarao.exemplosjava.exemplos_interface.CanalTV;
import br.com.rafaelbarao.exemplosjava.exemplos_interface.EstacaoRadio;
import br.com.rafaelbarao.exemplosjava.exemplos_interface.InteressadoProgramacaoTV;
import br.com.rafaelbarao.exemplosjava.exemplos_interface.ReceptorTVRadio;
import br.com.rafaelbarao.exemplosjava.util.Console;

public class Main {
    public static void main(String[] args) {
        try {
            Integer valor1 = 10;
            Integer valor2 = 2;
            Integer valor3 = valor1 / valor2;
            new Console().escreveConsole(valor3);

            String textoLido = new Console().leLinhaTexto();
            new ControleStringPar().verificaStringPar(textoLido);
        } catch (NullPointerException exception) {
            new Console().escreveConsole("Tentou utilizar um objeto nulo");
        } catch (ArithmeticException exception) {
            new Console().escreveConsole("Ocorreu um erro matemático");
        } catch (StringNaoParException exception) {
            new Console().escreveConsole(exception.toString());
        } finally {
            new Console().escreveConsole("Finalizou a execução!");
        }
    }
}
