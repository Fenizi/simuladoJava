package br.edu.etec.SistemaZoologico.teste;

import br.edu.etec.SistemaZoologico.teste.model.Animal;
import br.edu.etec.SistemaZoologico.teste.model.Arara;
import br.edu.etec.SistemaZoologico.teste.model.Golfinho;
import br.edu.etec.SistemaZoologico.teste.model.Leao;

public class Ex5 {
    public static void main(String[] args) {
     Animal leao = new Leao("Simba", 5, Animal.Habitat.TERRESTRE);
        Animal golfinho = new Golfinho("Flipper", 3, Animal.Habitat.AQUATICO);
        Animal arara = new Arara("Azul", 2, Animal.Habitat.AEREO);

        System.out.println("--------------------------");
        leao.exibirInfo();
        leao.emitirSom();

        System.out.println("--------------------------");
        golfinho.exibirInfo();
        golfinho.emitirSom();

        System.out.println("----------------------");
        arara.exibirInfo();
        arara.emitirSom();
    }
}
