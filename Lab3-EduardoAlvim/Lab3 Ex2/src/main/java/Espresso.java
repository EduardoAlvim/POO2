class Espresso implements Cafe {
  @Override
  public double calculaCusto() {
      return 1.0;
  }

  @Override
  public String getDescricao() {
      return "Espresso";
  }
}