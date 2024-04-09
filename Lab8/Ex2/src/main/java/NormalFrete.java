class NormalFrete implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return 3.0 * peso; 
    }
}