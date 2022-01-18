package M1S09.sistemacontas;

public class Main {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("001");
        Cliente cliente1 = new Cliente("Mauricio");
        ContaCorrente c1 = new ContaCorrente(cliente1,1500);
        Cliente cliente2 = new Cliente("Matilda");
        ContaPoupanca c2 = new ContaPoupanca(cliente2,5000);
        agencia.adiciona(c1);
        agencia.adiciona(c2);
        System.out.println(agencia.getQuantidadeDeContas());
    }
}
