class PedidoCriptomoeda extends PedidoTemplate {
    public PedidoCriptomoeda(int quantidadeItens, double valorItem, String formaPagamento, boolean entrega) {
        super(quantidadeItens, valorItem, formaPagamento, entrega);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento com criptomoedas para " + getQuantidadeItens() + " itens.");
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