package br.com.rafaelbarao.cadastroveicular.util;

import br.com.rafaelbarao.cadastroveicular.view.OpcaoMenu;

import java.util.Scanner;

public class Console {
    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public Integer leNumeroInteiro() {
        do {
            try {
                Integer valorLido = scanner.nextInt();
                scanner.nextLine();
                return valorLido;
            } catch (Exception ex) {
                escreveConsole("Valor inteiro inválido");
                scanner.nextLine();
            }
        } while (true);
    }

    public Double leNumeroDouble() {
        do {
            try {
                Double valorLido = scanner.nextDouble();
                scanner.nextLine();
                return valorLido;
            } catch (Exception ex) {
                escreveConsole("Valor double inválido");
                scanner.nextLine();
            }
        } while (true);
    }

    public String leLinhaTexto() {
        return scanner.nextLine();
    }

    public void escreveConsole(String textoASerEscrito) {
        System.out.println(textoASerEscrito);
    }

    public void escreveConsole(Integer numeroASerEscrito) {
        System.out.println(numeroASerEscrito);
    }

    public void escreveConsole(Double numeroASerEscrito) {
        System.out.println(numeroASerEscrito);
    }
}
