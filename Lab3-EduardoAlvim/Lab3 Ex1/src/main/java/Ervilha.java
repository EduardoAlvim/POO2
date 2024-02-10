class Ervilha extends PizzaDecorator {
    public Ervilha(Pizza pizza) {
        super(pizza);
    }

    public String getDesc() {
        return pizza.getDesc() + ", ervilha";
    }

    public double getCusto() {
        return pizza.getCusto() + 1.0;
    }
}