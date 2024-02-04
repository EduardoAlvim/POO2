public class ToyotaMaker implements IVehicleMaker {
    private static ToyotaMaker instance;

    // Construtor privado para impor o padrão Singleton
    private ToyotaMaker() {}

    // Método de padrão Singleton para obter a instância do ToyotaMaker
    public static ToyotaMaker getInstance() {
        if (instance == null) {
            instance = new ToyotaMaker();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String model) {
        // Criando um veículo Toyota baseado no modelo fornecido
        return new Vehicle("Toyota " + model);
    }
}