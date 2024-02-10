class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    public String getDesc() {
        return pizza.getDesc() + ", tomate";
    }

    public double getCusto() {
        return pizza.getCusto() + 1.5;
    }
}