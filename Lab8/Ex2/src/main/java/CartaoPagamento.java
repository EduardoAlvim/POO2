class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void realizarPagamento(double total) {
        System.out.println("Pagamento via Cartão de Crédito no valor de: R$" + total);
    }
}