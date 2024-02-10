class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    public String getDesc() {
        return pizza.getDesc() + ", ovo";
    }

    public double getCusto() {
        return pizza.getCusto() + 3.0;
    }
}