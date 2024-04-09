class SedexFrete implements FreteStrategy {
  @Override
  public double calcularFrete(double peso) {
    return 5.0 * peso;
  }
}