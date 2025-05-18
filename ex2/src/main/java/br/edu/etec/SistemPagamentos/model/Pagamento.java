
package br.edu.etec.SistemPagamentos.model;

public abstract class Pagamento {
    public  enum StatusPagamento {
    PENDENTE,
    PROCESSANDO,
    CONCLUIDO,
    FALHA
}
    
    protected double valor;
    protected StatusPagamento status;

    public Pagamento(double valor, StatusPagamento status) {
        this.valor = valor;
        this.status = StatusPagamento.PENDENTE;
    }

    public void exibirStatus() {
        System.out.println("Status do pagamento: " + status);
    }

    public abstract void processarPagamento();
}
