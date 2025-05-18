package br.edu.etec.SistemPagamentos.model;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao, StatusPagamento status) {
        super(valor, StatusPagamento.PENDENTE);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão...");
        this.status = StatusPagamento.PROCESSANDO;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        this.status = StatusPagamento.CONCLUIDO;

        String ultimos4 = numeroCartao.length() >= 4
            ? numeroCartao.substring(numeroCartao.length() - 4)
            : numeroCartao;

        System.out.println("Pagamento processado com cartão final " + ultimos4);
    }
}
