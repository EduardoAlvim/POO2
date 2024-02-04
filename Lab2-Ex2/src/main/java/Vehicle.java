public class Vehicle implements IVehicle {
    private String model;

    // Construtor para definir o modelo quando é criado um novo veículo
    public Vehicle(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Ligando " + model);
    }

    @Override
    public void drive() {
        System.out.println(model + " esta em funcionamento");
    }

    @Override
    public void stop() {
        System.out.println("Parando " + model);
    }
}