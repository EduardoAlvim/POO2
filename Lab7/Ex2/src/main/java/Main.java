public class Main {
  /*O Template é como um esqueleto de um algoritmo, onde algumas partes específicas são preenchidas pelas subclasses, já o padrão Decorator é como um adicional que podemos colocar em um objeto de forma flexível e dinâmica. */
  public static void main(String[] args) {
    System.out.println("Pedido online:");
    PedidoTemplate pedidoOnline = new PedidoOnline(5, 10.0, "cartao", true);
    pedidoOnline.processarPedido();

    System.out.println("\nPedido na loja:");
    PedidoTemplate pedidoNaLoja = new PedidoNaLoja(3, 8.0, "dinheiro", false);
    pedidoNaLoja.processarPedido();

    System.out.println("\nPedido com criptomoedas:");
    PedidoTemplate pedidoCriptomoeda = new PedidoCriptomoeda(2, 15.0, "bitcoin",true);
    pedidoCriptomoeda.processarPedido();
  }
}