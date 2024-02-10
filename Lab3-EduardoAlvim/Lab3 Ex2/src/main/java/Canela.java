class Canela extends Decorator {
    public Canela(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.3;
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Canela";
    }
}