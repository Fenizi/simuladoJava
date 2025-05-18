package br.edu.etec.SistemaUsuarios.teste;

import br.edu.etec.SistemaUsuarios.model.Usuario;

public class Ex3 {

    public static void main(String[] args) {
        Usuario admin = new Usuario("adminUser", "senha123", Usuario.NivelAcesso.ADMIN, true);

        //autenticação atraves de instanciamento
        if (admin.autenticar("senha123")) {
            System.out.println("Usuário autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação.");
        }

        System.out.println("Nível de acesso: " + admin.getNivel());

        admin.desativar();

        if (admin.autenticar("senha123")) {
            System.out.println("Usuário autenticado.");
        } else {
            System.out.println("Usuário inativo ou senha incorreta.");
        }
    }
}

