package M1S09.sistemacontas;

public abstract class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
