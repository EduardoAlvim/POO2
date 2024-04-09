public class Main {
  public static void main(String[] args) {
    Item item1 = new Item("Camiseta", 29.99, 0.2); 
    Item item2 = new Item("Calça", 49.99, 0.5); 

    CarrinhoCompras carrinho = new CarrinhoCompras();
    carrinho.adicionaItem(item1);
    carrinho.adicionaItem(item2);
    
    carrinho.setEstrategiaPagamento(new PixPagamento());
    carrinho.setEstrategiaFrete(new SedexFrete());

    carrinho.realizaPagamento();

    carrinho.setEstrategiaPagamento(new CartaoPagamento());
    carrinho.realizaPagamento();

    carrinho.setEstrategiaFrete(new NormalFrete());
    carrinho.realizaPagamento();

    Item item3 = new Item("Tênis", 99.99, 1.0); 
    carrinho.adicionaItem(item3);
    carrinho.setEstrategiaPagamento(new BoletoPagamento());
    carrinho.realizaPagamento();
  }
}