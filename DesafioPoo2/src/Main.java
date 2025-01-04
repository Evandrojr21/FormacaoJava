public class Main {

    public static void main(String[] args) {
        Cliente pipico = new Cliente();
        pipico.setNome("Pipico");

        Conta cc = new ContaCorrente(pipico);
        Conta poupanca = new ContaPoupanca(pipico);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}