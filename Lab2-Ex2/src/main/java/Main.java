public class Main {
  public static void main(String[] args) {
    // Usando o padrão Singleton para obter instâncias de ToyotaMaker e HondaMaker
      ToyotaMaker toyotaMaker = ToyotaMaker.getInstance();
      HondaMaker hondaMaker = HondaMaker.getInstance();

      // Criando veículos usando o padrão Factory
      IVehicle corolla = toyotaMaker.makeVehicle("Corolla");
      IVehicle city = hondaMaker.makeVehicle("City");

      // Demonstrando o comportamento padrão dos veículos
      corolla.start();
      corolla.drive();
      corolla.stop();

      city.start();
      city.drive();
      city.stop();
  }
}