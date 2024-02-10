class Acucar extends Decorator {
    public Acucar(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.2;
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Sugar";
    }
}