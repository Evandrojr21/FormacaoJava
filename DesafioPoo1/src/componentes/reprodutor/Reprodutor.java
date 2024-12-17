package componentes.reprodutor;

public interface Reprodutor {
  public void tocar(String musica);
  public void pausar(String nome);
  public void escolherMusica(String musica);
}