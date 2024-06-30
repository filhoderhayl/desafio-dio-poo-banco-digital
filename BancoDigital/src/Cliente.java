public class Cliente {
    private String nome;
    private static int SEQUECIAL_ID_CLIENTE = 1;
    //Criação de uma chave primária para cada cliente
    private int idCliente;

    Cliente(String nome){
        this.nome = nome;
        this.idCliente = SEQUECIAL_ID_CLIENTE++;
    }

    public String getNome() {
        return nome;
    }

    public long getIdCliente() {
        return idCliente;
    }


    
}
