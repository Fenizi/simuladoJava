package br.edu.etec.CadastroEquipamentos.model;

public class Computador extends Equipamentos {
    private String Processador;
    
    public Computador(String nome, String modelo, String Processador){
        super(nome, modelo);
        this.Processador = Processador;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Processador: " + this.Processador);
    }
}
