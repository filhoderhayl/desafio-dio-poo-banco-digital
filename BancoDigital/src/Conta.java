public abstract class Conta implements IConta{
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;    
    protected static int numeroConta = 1;
    protected int agencia;
    protected Cliente cliente;

    Conta(Cliente cliente){
        this.numeroConta = this.SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
        this.cliente = cliente;
        //Assume-se que no momento de criação(instanciação) da conta, o cliente tem saldo nulo
        this.saldo = 0;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(valor<=this.saldo){
            this.saldo -= valor;
        }else
            System.out.println("Saldo Insuficiente!");
    }
    public void transferir(IConta contaDestino,double valor){
        if(this.saldo>=valor){
            contaDestino.depositar(valor);
            this.saldo -= valor;
        }else
            System.out.println("Saldo Insuficiente!");
    }

    protected void imprimirInfosComuns(){
        System.out.println("Titular da conta: "+this.cliente.getNome());
        System.out.println("Número da conta: "+this.numeroConta);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Saldo na Conta: R$ "+this.saldo);
    }

}
