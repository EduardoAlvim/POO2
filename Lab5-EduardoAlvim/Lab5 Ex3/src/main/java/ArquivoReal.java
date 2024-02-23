class ArquivoReal implements Arquivo {
    private String conteudo;

    public ArquivoReal(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void ler() {
        System.out.println("Conteúdo do arquivo: " + conteudo);
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo no arquivo...");
    }
}