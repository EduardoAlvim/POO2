public class Main {
  public static void main(String[] args) {
    //Fiz um exemplo de conversores de moeda
    ConversorMoeda conversorDolar = new ConversorDolar();
    double valorEmReais = 100;
    double valorConvertidoParaDolares = conversorDolar.converter(valorEmReais);
    System.out.println("Valor em reais: " + valorEmReais);
    System.out.println("Valor convertido para dólares: " + valorConvertidoParaDolares);

    ConversorEuros conversorEuros = new ConversorEuros();
    ConversorMoeda adaptadorEuros = new AdapterConversorEuros(conversorEuros);
    double valorConvertidoParaEuros = adaptadorEuros.converter(valorEmReais);
    System.out.println("Valor convertido para euros: " + valorConvertidoParaEuros);
  }
}