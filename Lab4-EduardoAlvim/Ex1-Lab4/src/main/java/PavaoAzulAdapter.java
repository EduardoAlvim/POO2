class PavaoAzulAdapter implements Ave {
    private Pavao pavao;

    public PavaoAzulAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Pavão Azul não pode voar");
    }

    @Override
    public void emitirSom() {
        pavao.emitirSom();
    }
}