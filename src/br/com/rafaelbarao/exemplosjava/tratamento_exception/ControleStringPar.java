package br.com.rafaelbarao.exemplosjava.tratamento_exception;

public class ControleStringPar {
    void verificaStringPar(String textoParaVerificar) throws StringNaoParException {
        if(textoParaVerificar.length() % 2 != 0)
            throw new StringNaoParException("A string não é par", textoParaVerificar.length());
    }
}
