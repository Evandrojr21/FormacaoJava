package componentes.aparelho;

public interface Telefone {
  public void ligar(String numero);
  public void atender(String numero);
  public void enviarMensagem(String numero);
  public void iniciarCorreioVoz(String numero);
}

