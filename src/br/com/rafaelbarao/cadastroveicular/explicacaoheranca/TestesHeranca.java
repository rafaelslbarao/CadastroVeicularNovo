package br.com.rafaelbarao.cadastroveicular.explicacaoheranca;

import br.com.rafaelbarao.cadastroveicular.util.Console;

public class TestesHeranca {

    public static void realizaTestesHeranca() {
        // Distância inicia em 0
        // Animal Movimento = ditancia + 1
        // Mamífero Movimento = ditancia + 3
        // Ave Movimento = ditancia + 2
        // Beija Flor Movimento = movimento ave + 1 = 3

        Animal animal1    = new Beijaflor();
        Animal animal2    = new Homem();
        Animal animal3    = new Cachorro();

        animal1.seAlimenta();
        animal2.seAlimenta();
        animal3.seAlimenta();


        //animal3.seMovimenta();
        //animal3.setNome("Animal Qualquer");

        //new Console().escreveConsole(animal1.getDistanciaPercorrida().toString());
        //new Console().escreveConsole(animal2.getDistanciaPercorrida().toString());
        //new Console().escreveConsole(animal3.getDistanciaPercorrida().toString());

        //new Console().escreveConsole(animal3.toString());

        //































//        Animal animal01 = new Animal();
//        animal01.setNome("Águia");
//        Animal animalBeijaFlor = new Beijaflor();
//        animalBeijaFlor.setNome("Beija Flor");
//        Animal animalCachorro = new Cachorro();
//        animalCachorro.setNome("Pit Bull");
//        Animal animalHomem = new Homem();
//        animalHomem.setNome("josé");
//        Animal animalMamifero = new Mamifero();
//        animalMamifero.setNome("Baleia");
//        //
//
//        if (animal01 instanceof Ave) {
//            Ave ave = (Ave) animal01;
//            ave.voa();
//            Animal animalAve2 = ave;
//        }
//
//        Beijaflor beijaflor = (Beijaflor) animalBeijaFlor;
//        Cachorro cachorro = (Cachorro) animalCachorro;
//        Homem homem = (Homem) animalHomem;
//        Mamifero mamifero = (Mamifero) animalMamifero;
//
//
//        beijaflor.voa();
//        beijaflor.seAlimentaDePolen();
//        cachorro.seAlimentaComLeite();
//        cachorro.late();
//        homem.seAlimentaComLeite();
//        homem.fala();
//        mamifero.seAlimentaComLeite();


    }
}
