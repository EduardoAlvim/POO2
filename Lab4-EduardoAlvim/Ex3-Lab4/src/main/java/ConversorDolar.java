class ConversorDolar implements ConversorMoeda {
    @Override
    public double converter(double valor) {
        return valor * 0.2; // 1 real = 0.2 dólares
    }
}