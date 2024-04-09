class PedidoNaLoja extends PedidoTemplate {
    public PedidoNaLoja(int quantidadeItens, double valorItem, String formaPagamento, boolean entrega) {
        super(quantidadeItens, valorItem, formaPagamento, entrega);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento na loja para " + getQuantidadeItens() + " itens.");
    }

    @Override
    protected boolean verificarEntrega() {
        return isEntrega();
    }

    @Override
    protected void efetuarEntrega() {
      System.out.println("Entrega de " + getQuantidadeItens() + " itens realizada.");
    }
}