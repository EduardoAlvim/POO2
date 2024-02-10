public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDesc() {
        return pizza.getDesc();
    }

    public double getCusto() {
        return pizza.getCusto();
    }
}
