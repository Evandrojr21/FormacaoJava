import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public  class ProcessoSeletivo {
  public static void main(String[] args){
    imprimirSelecionados();
    System.out.println("Processo seletivo");
    selecaoCandidato();
  }
  
  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu= false;
    do {
      atendeu = atender();
      continuarTentando = !atendeu;

      if (continuarTentando)
        tentativasRealizadas++;
      else {
        System.out.println("Contato realizado com sucesso");
      }
    }while (continuarTentando && tentativasRealizadas < 3);

    if (atendeu) {
      System.out.println("Conseguimos contato com "+ candidato+ " na "+  tentativasRealizadas);
    }else{
      System.out.println("Não conseguimos contato com "+ candidato+ ", número máximo de tentativas"+ tentativasRealizadas+ "Realizada");
    }
  }

  static boolean atender(){
    return new Random().nextInt(3)==1;
  }

  static void imprimirSelecionados(){
    String [] candidatos = {"Fulano","Beltrano","Pipico","leo Gamalho","Caca Rato","Neymar"};
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for (int indice = 0; indice< candidatos.length;indice++) {
      System.out.println("O candidato nº "+ (indice+1) +" é o "+ candidatos[indice]);
    }
  }

  static void selecaoCandidato(){
    String [] candidatos = {"Fulano","Beltrano","Pipico","leo Gamalho","Caca Rato","Neymar"};

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while (candidatosSelecionados < 4 && candidatoAtual <candidatos.length){
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido =  valorPrtendido();
      System.out.println("O candidato "+ candidato + " solicitou esse valor de salário: "+ salarioPretendido);
      if (salarioBase>=salarioPretendido){
        System.out.println("O candidato: "+ candidato + " foi selecionado para vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }

  }

  static  double valorPrtendido(){
    return ThreadLocalRandom.current().nextDouble(1800,2200);
  }

  static  void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido){
      System.out.println("Ligar para o candidato");
    }else if(salarioBase == salarioPretendido){
      System.out.println("Ligar para o candidato com prosposta");
    }else{
      System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }

}