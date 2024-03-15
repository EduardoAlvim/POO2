import java.util.ArrayList;
import java.util.List;
class Acao {
    private String nome;
    private double preco;
    private List<Investidor> investidores;
    private AcaoBroker acaoBroker;

    public Acao(String nome, double preco, AcaoBroker acaoBroker) {
        this.nome = nome;
        this.preco = preco;
        this.investidores = new ArrayList<>();
        this.acaoBroker = acaoBroker;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        System.out.println("Novo preço da ação " + nome + ": " + preco);
        this.preco = preco;
        notificarInvestidores();
        verificarLimites(); 
    }

    public void addObserver(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removeObserver(Investidor investidor) {
        investidores.remove(investidor);
    }

    private void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(this);
        }
    }

    private void verificarLimites() {
        System.out.println("Verificando limites para a ação " + nome);
        // Verificar se o preço atingiu os limites de algum investidor
        for (Investidor investidor : investidores) {
            double precoAtual = getPreco();
            if (precoAtual >= investidor.getPrecoMaximo()) {
                // Se atingir o preço máximo vende as ações
                System.out.println("Preço da ação " + nome + " atingiu o limite máximo. Vendendo...");
                acaoBroker.venderAcao(this, 1); // Vende apenas uma ação
            } else if (precoAtual <= investidor.getPrecoMinimo()) {
                // Se atingir o preço mínimo compra as ações
                System.out.println("Preço da ação " + nome + " atingiu o limite mínimo. Comprando...");
                acaoBroker.comprarAcao(this, 1); // Compra apenas uma ação
            }
        }
    }
}