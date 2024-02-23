class ProxyArquivo implements Arquivo {
    private final Arquivo arquivoReal;
    private final boolean acessoPermitido;

    public ProxyArquivo(String conteudo, boolean acessoPermitido) {
        this.arquivoReal = new ArquivoReal(conteudo);
        this.acessoPermitido = acessoPermitido;
    }

    @Override
    public void ler() {
        arquivoReal.ler();
    }

    //verificacao do booleano para permitir ou nao o acesso
    @Override
    public void escrever() {
        if (acessoPermitido) {
            arquivoReal.escrever();
        } else {
            System.out.println("Acesso negado! Você não tem permissão para escrever no arquivo.");
        }
    }
}