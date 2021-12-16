package M1S07.pt1;

public class Empregado extends Pessoa {
    //Exercicio 3
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado() {
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome=" + this.getNome() +
                ", endereco=" + this.getEndereço()+
                ", telefone=" + this.getTelefone()+
                ", codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                '}';
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        return this.getSalarioBase() - this.getImposto();
    }

    public static void main(String[] args) {
        Empregado e1 = new Empregado();
        e1.setNome("Pedro oliveira");
        e1.setEndereço("Rua exemplo1, 465");
        e1.setTelefone("9 1234-9876");
        e1.setCodigoSetor(5);
        e1.setSalarioBase(2000);
        e1.setImposto(250);
        System.out.println(e1.calcularSalario());
        System.out.println(e1.toString());
    }
}
