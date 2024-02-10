abstract class Decorator implements Cafe {
    protected Cafe cafe;
    public Decorator(Cafe cafe) {
        this.cafe = cafe;
    }
    public double calculaCusto() {
        return cafe.calculaCusto();
    }
    public String getDescricao() {
        return cafe.getDescricao();
    }
}