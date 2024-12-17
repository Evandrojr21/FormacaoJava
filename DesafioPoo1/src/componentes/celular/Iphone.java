package componentes.celular;

import componentes.aparelho.Telefone;
import componentes.camera.Camera;
import componentes.camera.CameraDevice;
import componentes.navegador.Navegador;
import componentes.reprodutor.Reprodutor;
import componentes.navegador.Safari;
import componentes.reprodutor.Itunes;

public class Iphone implements Telefone, Navegador, Camera, Reprodutor {
  private Safari safari;
  private Itunes itunes;
  private Camera Camera;

  public Iphone() {
    this.safari = new Safari();
    this.itunes = new Itunes();
    this.Camera = new CameraDevice();
  }

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero);
  }
  @Override
  public void atender(String numero) {
    System.out.println("Atendendo chamada de " + numero);
  }
  @Override
  public void enviarMensagem(String numero) {
    System.out.println("Enviando mensagem para " + numero);
  }
  @Override
  public void iniciarCorreioVoz(String numero) {
    System.out.println("Iniciando correio de voz para " + numero);
  }


  @Override
  public void tirarFoto(String foto) {
    Camera.tirarFoto(foto);
  }
  @Override
  public void deletarFoto(String foto) {
    Camera.deletarFoto(foto);
  }


  @Override
  public void exibirPagina(String pagina) {
    safari.exibirPagina(pagina);
  }
  @Override
  public void adicionarNovaAba(String pagina) {
    safari.adicionarNovaAba(pagina);
  }
  @Override
  public void favoritarAba(String pagina) {
    safari.favoritarAba(pagina);
  }


  @Override
  public void tocar(String musica) {
    itunes.tocar(musica);
  }
  @Override
  public void pausar(String nome) {
    itunes.pausar(nome);
  }
  @Override
  public void escolherMusica(String musica) {
    itunes.escolherMusica(musica);
  }

  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    
    iphone.ligar("987654321");
    iphone.atender("987654321");
    iphone.enviarMensagem("987654321");
    iphone.iniciarCorreioVoz("987654321");

    iphone.tirarFoto("Foto1");
    iphone.deletarFoto("Foto1");

    iphone.exibirPagina("www.exemplo.com");
    iphone.adicionarNovaAba("www.google.com");
    iphone.favoritarAba("www.google.com");

    iphone.tocar("Hino do Santa cruz");
    iphone.pausar("Hino do Santa cruz");
    iphone.escolherMusica("Hino do Santa cruz");
  }
}
