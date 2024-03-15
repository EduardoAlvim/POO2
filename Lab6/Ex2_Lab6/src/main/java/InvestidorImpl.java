class InvestidorImpl implements Investidor {
    private String nome;
    private double precoMinimo;
    private double precoMaximo;

    public InvestidorImpl(String nome, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }

    @Override
    public void atualizar(Acao acao) {
        double precoAtual = acao.getPreco();
        if (precoAtual <= precoMinimo) {
            System.out.println("Investidor " + nome + ": Preço da ação " + acao.getNome() + " abaixo do limite mínimo. Comprando...");
            // Comprar ações
        } else if (precoAtual >= precoMaximo) {
            System.out.println("Investidor " + nome + ": Preço da ação " + acao.getNome() + " atingiu o limite máximo. Vendendo...");
            // Vender ações
        }
    }

    @Override
    public double getPrecoMinimo() {
        return precoMinimo;
    }

    @Override
    public double getPrecoMaximo() {
        return precoMaximo;
    }
}