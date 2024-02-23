public class Main {
  /* O problema que escolhi propor foi o de controle de acesso a arquivos, em que em uma simulação feita a partir de um número aleatório, se for par o acesso será concedido e se for ímpar não. Dependendo do número o sistema deverá permitir o conteúdo ser escrito no arquivo ou não.
   */
  public static void main(String[] args) {
    /* Sorteio de um número, se for par o acesso será permitido, se for ímpar será negado (apenas para imerssão)
     */
    int numeroSorteado = (int) (Math.random() * 100) + 1;
    System.out.println("Numero: " + numeroSorteado);
    // Verificação do numero
    boolean acesso;
    if (numeroSorteado % 2 == 0) {
      acesso = true;
    } else {
      acesso = false;
    }
    // Criando um Proxy para o serviço de arquivo
    Arquivo arquivo = new ProxyArquivo("Poo2 é legal demais", acesso);

    // Ler o conteúdo do arquivo
    arquivo.ler();

    // Tentar escrever no arquivo (só será permitido se o acesso for permitido)
    arquivo.escrever();
  }
}