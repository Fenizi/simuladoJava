package br.edu.etec.CadastroEquipamentos.teste;

import br.edu.etec.CadastroEquipamentos.model.Computador;
import br.edu.etec.CadastroEquipamentos.model.Equipamentos;

public class Ex1 {
    public static void main(String[] args) {
    Equipamentos equipa = new Equipamentos("Xiaomi" , "Poco x6");
    equipa.exibirDados();
    
    System.out.println("---------------------------------------------------------");
    
    Computador pc = new Computador("Acer" , "Aspire 5" , "Ryzen 7500");
    pc.exibirDados();
    }
}
