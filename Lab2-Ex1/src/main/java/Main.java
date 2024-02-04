public class Main {
  public static void main(String[] args) {
    FabricanteCelular samsung = Samsung.getInstance();
    Celular galaxy8 = samsung.constroiCelular("Galaxy8");
    galaxy8.fazLigacao();
    galaxy8.tiraFoto();
    FabricanteCelular apple = Apple.getInstance();
    Celular iPhoneX = apple.constroiCelular("IPhoneX");
    iPhoneX.fazLigacao();
    iPhoneX.tiraFoto();
  }

  
}