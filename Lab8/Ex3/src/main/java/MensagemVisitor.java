class MensagemVisitor implements Visitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Atenção para atualização das licenças");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Comemore no parque o dia do ciclismo");
    }
}