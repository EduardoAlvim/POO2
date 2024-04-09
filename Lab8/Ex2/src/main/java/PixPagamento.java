class PixPagamento implements PagamentoStrategy {
    @Override
    public void realizarPagamento(double total) {
        System.out.println("Pagamento via Pix no valor de: R$" + total);
    }
}