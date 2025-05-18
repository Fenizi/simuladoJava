package br.edu.etec.CadastroEquipamentos.model;

public class Equipamentos {
    protected String nome;
    protected String modelo;
    
    public Equipamentos(String nome, String modelo){
        this.nome = nome;
        this.modelo = modelo;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
    }
}
