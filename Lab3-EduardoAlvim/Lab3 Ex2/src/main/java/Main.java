public class Main {
  public static void main(String[] args) {
    Cafe espresso = new Espresso();
    espresso = new Leite(espresso);
    espresso = new Acucar(espresso);
    espresso = new Chocolate(espresso);
    System.out.println("Preço: " + espresso.calculaCusto());
    System.out.println("Descricao: " + espresso.getDescricao());

    Cafe descaf = new Descaf();
    descaf = new Canela(descaf);
    System.out.println("\nDescaf:");
    System.out.println("Preço: " + descaf.calculaCusto());
    System.out.println("Descrição: " + descaf.getDescricao());
  }
  
}