public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro();

    System.out.println("Iniciando a corrida:");
    carro.comecarCorrida();

    try {
        Thread.sleep(3000); // apenas um delay para imerssão
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    System.out.println("\nFinalizando a corrida:");
    carro.finalizarCorrida();
  }
}