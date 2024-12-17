package componentes.camera;

public class CameraDevice implements Camera {
  @Override
  public void tirarFoto(String foto) {
    System.out.println("Tirando foto com a câmera: " + foto);
  }

  @Override
  public void deletarFoto(String foto) {
    System.out.println("Deletando a foto: " + foto);
  }
}
