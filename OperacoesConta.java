public class OperacoesConta implements Repository {


    @Override
    public void sacar(Conta conta, double valor) {
        conta.saldo = conta.saldo - valor;
        System.out.println("Saque de " + valor + " Efetuado com Sucesso!");

    }

    @Override
    public void depositar(Conta conta, double valor) {
        conta.saldo = conta.saldo + valor;
        System.out.println("Depósito de " + valor + " Efetuado com Sucesso!");

    }

    @Override
    public void transferir(Conta conta, Conta destino, double valor) {
        conta.saldo = conta.saldo - valor;
        destino.saldo = destino.saldo + valor;
        System.out.println("Transferência de " + valor + " Para " + destino.titular + " Efetuada com Sucesso!");

    }
}

