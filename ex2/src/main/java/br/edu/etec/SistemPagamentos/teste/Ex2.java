package br.edu.etec.SistemPagamentos.teste;

import br.edu.etec.SistemPagamentos.model.Pagamento;
import br.edu.etec.SistemPagamentos.model.PagamentoCartao;

public class Ex2 {

    public static void main(String[] args) {
       PagamentoCartao pagamento = new PagamentoCartao(150.75, "1234567890123456" , Pagamento.StatusPagamento.PENDENTE);

        System.out.println("Antes do processamento:");
        pagamento.exibirStatus();

        pagamento.processarPagamento();

        System.out.println("Depois do processamento:");
        pagamento.exibirStatus();
    }
}
