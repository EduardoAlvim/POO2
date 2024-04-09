public class Main {
  public static void main(String[] args) {
    Veiculo carro = new Carro("Vermelho", "Toyota", "Corolla");
    Veiculo onibus = new Onibus(50, 2015);
    Veiculo bicicleta = new Bicicleta("Azul");

    Visitor imprimirVisitor = new ImprimirVisitor();
    Visitor mensagemVisitor = new MensagemVisitor();

    carro.accept(imprimirVisitor);
    onibus.accept(imprimirVisitor);
    bicicleta.accept(imprimirVisitor);

    carro.accept(mensagemVisitor);
    onibus.accept(mensagemVisitor);
    bicicleta.accept(mensagemVisitor);
  }
}