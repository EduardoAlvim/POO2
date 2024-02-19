public class Main {
  public static void main(String[] args) {
    CalculadoraBinaria calculadoraBinaria = new CalculadoraBinariaImpl();

    System.out.println("Calculadora Binária:");
    System.out.println(calculadoraBinaria.somar("101", "11"));
    System.out.println(calculadoraBinaria.subtrair("101", "11"));

    CalculadoraDecimal calculadoraDecimalAdapter = new CalculadoraDecimalAdapter(calculadoraBinaria);

    System.out.println("\nCalculadora Decimal:");
    System.out.println("5 + 3 = " + calculadoraDecimalAdapter.somar(5, 3));
    System.out.println("5 - 3 = " + calculadoraDecimalAdapter.subtrair(5, 3));
    System.out.println("5 * 3 = " + calculadoraDecimalAdapter.multiplicar(5, 3));
  }

}