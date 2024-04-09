abstract class PedidoTemplate {
  private int quantidadeItens;
  private double valorItem;
  private String formaPagamento;
  private boolean entrega;

  public PedidoTemplate(int quantidadeItens, double valorItem, String formaPagamento, boolean entrega) {
    this.quantidadeItens = quantidadeItens;
    this.valorItem = valorItem;
    this.formaPagamento = formaPagamento;
    this.entrega = entrega;
  }

  // Método template que vai definir a estrutura do pedido
  public final void processarPedido() {
    processarPagamento();
    if (verificarEntrega()) {
      efetuarEntrega();
    } else {
      System.out.println("Pedido não requer entrega.");
    }
  }

  public int getQuantidadeItens() {
    return quantidadeItens;
  }

  public double getValorItem() {
    return valorItem;
  }

  public String getFormaPagamento() {
    return formaPagamento;
  }

  public boolean isEntrega() {
      return entrega;
  }

  // Métodos abstratos que devem ser implementados quando essa classe for
  // extendida
  protected abstract void processarPagamento();

  protected abstract boolean verificarEntrega();

  protected abstract void efetuarEntrega();
}