class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void realizarPagamento(double total) {
        System.out.println("Pagamento via Boleto Bancário no valor de: R$" + total);
    }
}