class Chocolate extends Decorator {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.4;
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Chocolate";
    }
}