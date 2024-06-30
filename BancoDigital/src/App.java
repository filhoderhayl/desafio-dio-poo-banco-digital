public class App {
    public static void main(String[] args) throws Exception {
        //Conta corrente
        Cliente cliente = new Cliente("Rhaylson");
        Conta cc = new ContaCorrente(cliente);
        //Conta poupança
        Conta cp = new ContaPoupanca(cliente);
        //Depositando R$ 100 reais na conta corrente
        cc.depositar(100);
        //Exibe o saldo da conta corrente após o depósito
        cc.imprimirExtrato();
        //Transfere R$ 75 para a conta poupança
        cc.transferir(cp, 75);
        //Imprime o saldo nas contas poupanças e correntes após a transferência
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
