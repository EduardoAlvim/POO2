class AcaoBroker {
  public void comprarAcao(Acao acao, int quantidade) {
      System.out.println("Compra de " + quantidade + " ações da empresa " + acao.getNome());
      // Comprar ações
      acao.setPreco(acao.getPreco() - 10.0); // Simula uma queda no preço após a compra
  }

  public void venderAcao(Acao acao, int quantidade) {
      System.out.println("Venda de " + quantidade + " ações da empresa " + acao.getNome());
      // Vender ações
      acao.setPreco(acao.getPreco() + 10.0); // Simula um aumento no preço após a venda
  }
}