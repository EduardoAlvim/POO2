public class Main {
  public static void main(String[] args) {
    AcaoBroker acaoBroker = new AcaoBroker();

    Acao acao1 = new Acao("A", 50.0, acaoBroker);
    Acao acao2 = new Acao("B", 100.0, acaoBroker);

    Investidor investidor1 = new InvestidorImpl("Alice", 40.0, 60.0);
    Investidor investidor2 = new InvestidorImpl("Bob", 90.0, 110.0);

    acao1.addObserver(investidor1);
    acao2.addObserver(investidor2);

    // Simulando variação de preço das ações
    System.out.println("Simulação de variação de preço da Ação A:");
    acao1.setPreco(45.0);
    acao1.setPreco(55.0);

    System.out.println("\nSimulação de variação de preço da Ação B:");
    acao2.setPreco(105.0);
    acao2.setPreco(95.0);
  }
}