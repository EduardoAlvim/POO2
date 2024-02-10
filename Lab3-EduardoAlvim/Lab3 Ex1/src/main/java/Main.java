public class Main {
  public static void main(String[] args) {
    Pizza pedido1 = new MassaFinaPizza();
    Pizza margueritaPedido1 = new Queijo(new Tomate(pedido1));
    Pizza pedido2 = new MassaFinaPizza();
    Pizza margueritaPedido2 = new Ervilha(new Queijo(new Tomate(pedido2)));
    System.out.println(margueritaPedido1.getDesc());
    System.out.println(margueritaPedido1.getCusto());
    System.out.println(margueritaPedido2.getDesc());
    System.out.println(margueritaPedido2.getCusto());
  }
}