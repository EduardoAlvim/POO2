class Pavao implements Ave {
    @Override
    public void voar() {
        System.out.println("Pavão não pode voar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ahn Ahn Ahn");
    }
}