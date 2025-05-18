package br.edu.etec.SistemaZoologico.teste.model;

public abstract class Animal {
    public static enum Habitat{
        TERRESTRE, AQUATICO, AEREO
    }
    
    private String nome;
    private int idade;
    private Habitat habitat;
    
    public Animal(String nome, int idade, Habitat habitat){
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public Habitat getHabitat(){
        return habitat;
    }
    
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habitate: " + this.habitat);
    }
    
    public abstract void emitirSom();
}
