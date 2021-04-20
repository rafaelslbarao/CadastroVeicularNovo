package br.com.rafaelbarao.cadastroveicular.teste;

//Classe para demosntrar sobrecarga (overload)
public class Calculadora {

    public static Integer soma(Integer numero1, Integer numero2)
    {
        return numero1 + numero2;
    }

    public static Integer soma(Integer numero1, Integer numero2, Integer numero3)
    {
        return numero1 + numero2 + numero3;
    }

    public static Double soma(Double numero1, Double numero2)
    {
        return numero1 + numero2;
    }

    public static Double soma(Double numero1, Double numero2, Double numero3)
    {
        return numero1 + numero2 + numero3;
    }

}
