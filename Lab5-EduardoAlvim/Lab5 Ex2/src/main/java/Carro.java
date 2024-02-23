public class Carro {
    private Motor motor;
    private CintoDeSeguranca cintoDeSeguranca;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public Carro() {
        this.motor = new Motor();
        this.cintoDeSeguranca = new CintoDeSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void comecarCorrida() {
        motor.iniciar();
        porta.trancar();
        cintoDeSeguranca.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacaoPreferida();
    }

    public void finalizarCorrida() {
        motor.parar();
        porta.destrancar();
        cintoDeSeguranca.destravar();
        farol.apagar();
        radio.desligar();
    }
  
}
