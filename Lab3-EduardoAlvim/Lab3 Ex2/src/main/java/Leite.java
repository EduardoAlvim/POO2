class Leite extends Decorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 0.5;
    }
    @Override
    public String getDescricao(){
        return super.getDescricao() + ", Leite";
    }
}