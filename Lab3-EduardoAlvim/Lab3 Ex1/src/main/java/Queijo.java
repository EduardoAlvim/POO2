class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    public String getDesc() {
        return pizza.getDesc() + ", queijo";
    }

    public double getCusto() {
        return pizza.getCusto() + 2.0;
    }
}