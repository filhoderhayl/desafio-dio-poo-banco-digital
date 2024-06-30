interface IConta {
    double saldo = 0;
    void depositar(double valor);
    void sacar(double valor);
    void transferir(IConta conta, double valor);
    //void imprimirInfosComuns();
    void imprimirExtrato();
}
