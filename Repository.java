public interface Repository {

    public void sacar(Conta conta, double valor);
    public void depositar(Conta conta, double valor);
    public void transferir(Conta conta, Conta destino, double valor);
}
