class AdapterConversorEuros implements ConversorMoeda {
    private ConversorEuros conversorEuros;

    public AdapterConversorEuros(ConversorEuros conversorEuros) {
        this.conversorEuros = conversorEuros;
    }

    @Override
    public double converter(double valor) {
        return conversorEuros.converterParaEuros(valor);
    }
}