package br.edu.etec.SistemaZoologico.teste.model;

public class Golfinho extends Animal {
    
    public Golfinho(String nome, int idade, Habitat habitat){
        super(nome, idade, Habitat.AQUATICO);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("O golfinho faz: ?");
    }
}
