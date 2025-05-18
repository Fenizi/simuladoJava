package br.edu.etec.SistemaUsuarios.model;

public class Usuario {
     public static enum NivelAcesso{ //criação do enum publico e estatico
        ADMIN, USUARIO, CONVIDADO
    }

    private String login;
    private String senha;
    private NivelAcesso nivel;
    private boolean ativo;
    
    public Usuario(String login, String senha, NivelAcesso nivel, boolean ativo){
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = ativo;
    }
    
    public boolean autenticar(String senha){
        return ativo && this.senha.equals(senha);//implementação do comparador equals e parametro senha
    }
    
    public void desativar(){
        this.ativo = false;
    }
    
    public NivelAcesso getNivel(){
        return this.nivel;
    }
    
    public String getLogin(){
        return this.login;
    }
    
  
    
    
}
