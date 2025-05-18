package br.edu.etec.SistemaZoologico.teste.model;

public class Arara extends Animal {
    
    public Arara(String nome, int idade, Habitat habitat){
        super(nome, idade, Habitat.AEREO);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("A arara canta: Araaaraa!");
    }
    
}
