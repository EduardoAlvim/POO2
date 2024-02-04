public class HondaMaker implements IVehicleMaker {
    private static HondaMaker instance;

    // Construtor privado para impor o padrão Singleton
    private HondaMaker() {}

    // Método padrão Singleton para obter a instância do HondaMaker
    public static HondaMaker getInstance() {
        if (instance == null) {
            instance = new HondaMaker();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String model) {
        // Criando um veículo Honda baseado no modelo fornecido
        return new Vehicle("Honda " + model);
    }
}