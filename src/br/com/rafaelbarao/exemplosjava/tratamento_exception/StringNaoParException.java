package br.com.rafaelbarao.exemplosjava.tratamento_exception;

public class StringNaoParException extends Exception{
    private int tamanhoString;

    public StringNaoParException(String message, int tamanhoString) {
        super(message);
        this.tamanhoString = tamanhoString;
    }

    @Override
    public String toString() {
        return super.toString() + " O tamanho da string era " + tamanhoString;
    }

    public int getTamanhoString() {
        return tamanhoString;
    }

    public void setTamanhoString(int tamanhoString) {
        this.tamanhoString = tamanhoString;
    }
}
