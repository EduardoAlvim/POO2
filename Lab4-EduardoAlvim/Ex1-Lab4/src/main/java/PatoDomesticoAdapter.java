class PatoDomesticoAdapter implements Ave {
    private Pato pato;

    public PatoDomesticoAdapter(Pato pato) {
        this.pato = pato;
    }

    @Override
    public void voar() {
      System.out.println("Pato domestico voando");
    }

    @Override
    public void emitirSom() {
        pato.emitirSom();
    }
}