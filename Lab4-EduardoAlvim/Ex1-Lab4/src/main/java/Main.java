
public class Main {
  public static void main(String[] args) {
    Pato pato = new Pato();
    Pavao pavao = new Pavao();

    PatoDomesticoAdapter patoDomesticoAdapter = new PatoDomesticoAdapter(pato);
    PavaoAzulAdapter pavaoAzulAdapter = new PavaoAzulAdapter(pavao);

    System.out.println("Pato Doméstico:");
    patoDomesticoAdapter.voar();
    patoDomesticoAdapter.emitirSom();

    System.out.println("\nPavão Azul:");
    pavaoAzulAdapter.voar();
    pavaoAzulAdapter.emitirSom();
  }

  
}