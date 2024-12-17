package componentes.reprodutor;

public class Itunes implements Reprodutor {
  @Override
  public void tocar(String musica) {
    System.out.println("Tocando a música no iTunes: " + musica);
  }

  @Override
  public void pausar(String nome) {
    System.out.println("Pausando a música no iTunes: " + nome);
  }

  @Override
  public void escolherMusica(String musica) {
    System.out.println("Escolhendo a música no iTunes: " + musica);
  }
}
