class PedidoOnline extends PedidoTemplate {
    public PedidoOnline(int quantidadeItens, double valorItem, String formaPagamento, boolean entrega) {
        super(quantidadeItens, valorItem, formaPagamento, entrega);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento online para " + getQuantidadeItens() + " itens.");
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