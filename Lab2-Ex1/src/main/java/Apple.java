public class Apple implements FabricanteCelular {
  private static Apple instance;
  private Apple() {}
  public static Apple getInstance() {
    if (instance == null) {
      instance = new Apple();
    }
    return instance;
  }
  public Celular constroiCelular(String modelo) {
    if (modelo.equals("IPhoneX")) {
      return new IPhoneX();
    } else if (modelo.equals("IPhoneS")) {
      return new IPhoneS();
    } else {
      return null;
    }
  }
}