import java.util.ArrayList;
import java.util.List;
class CarrinhoCompras {
    private List<Item> itens;
    private PagamentoStrategy estrategiaPagamento;
    private FreteStrategy estrategiaFrete;

    public CarrinhoCompras() {
        this.itens = new ArrayList<Item>();
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public double calculaFrete(double peso) {
        return estrategiaFrete.calcularFrete(peso);
    }

    public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void setEstrategiaFrete(FreteStrategy estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public void realizaPagamento() {
        double total = calculaTotal();
        double pesoTotal = calculaPesoTotal();
        double frete = calculaFrete(pesoTotal);
        total += frete; // Adiciona o valor do frete ao total
        estrategiaPagamento.realizarPagamento(total);
    }

    private double calculaPesoTotal() {
        double pesoTotal = 0;
        for (Item item : itens) {
            pesoTotal += item.getPeso();
        }
        return pesoTotal;
    }
}