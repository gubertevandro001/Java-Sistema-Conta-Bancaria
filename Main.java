public class Main{

    public static void main(String[] args) {

        OperacoesConta operacoesConta = new OperacoesConta();
        ContaCorrente contaCorrente = new ContaCorrente("Rodrigo Parafuso", 3770, 113, 3000);
        ContaCorrente contaCorrente1 = new ContaCorrente("Ancelmo Prego", 4599, 113, 9000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Thiago Defenda", 9097, 111, 3500);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Everaldo Alicate", 9934, 111, 2000);

        operacoesConta.sacar(contaCorrente, 1500);
        operacoesConta.depositar(contaCorrente, 300);
        operacoesConta.transferir(contaCorrente, contaCorrente1, 200);
        operacoesConta.sacar(contaCorrente1, 400);
        operacoesConta.depositar(contaCorrente, 500);
        operacoesConta.transferir(contaCorrente1, contaCorrente, 400);
        operacoesConta.sacar(contaPoupanca, 1000);
        operacoesConta.depositar(contaPoupanca, 500);
        operacoesConta.transferir(contaPoupanca, contaPoupanca1,400);
        operacoesConta.sacar(contaPoupanca1, 300);
        operacoesConta.depositar(contaPoupanca1, 100);
        operacoesConta.transferir(contaPoupanca1, contaPoupanca,600);

    }
}
