package componentes.navegador;

public class Safari implements Navegador {
  @Override
  public void exibirPagina(String pagina) {
    System.out.println("Exibindo página no Safari: " + pagina);
  }

  @Override
  public void adicionarNovaAba(String pagina) {
    System.out.println("Abrindo nova aba no Safari com: " + pagina);
  }

  @Override
  public void favoritarAba(String pagina) {
    System.out.println("Favoritando a página no Safari: " + pagina);
  }
}
