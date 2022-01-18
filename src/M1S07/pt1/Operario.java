package M1S07.pt1;

public class Operario extends Empregado {
    //Exercicio 5
    private double valorProducao = 0;
    private double comissao = 0;

    public Operario() {
    }

    @Override
    public String toString() {
        return "Operario{" +
                "nome=" + this.getNome() +
                ", endereco=" + this.getEndereço()+
                ", telefone=" + this.getTelefone()+
                ", codigoSetor=" + this.getCodigoSetor() +
                ", salarioBase=" + this.getSalarioBase() +
                ", imposto=" + this.getImposto() +
                ", valorProducao=" + valorProducao +
                ", comissao=" + comissao +
                '}';
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao += valorProducao;
    }

    public double getComissao() {
        return valorProducao/10;
    }

    public void setComissao(double comissao) {
        this.comissao = getComissao();
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() - this.getImposto() + this.getComissao();
    }

    public static void main(String[] args) {
        Operario o1 = new Operario();
        o1.setNome("Jose Pereira");
        o1.setEndereço("Rua exemplo5, 1025");
        o1.setTelefone("9 1222-3876");
        o1.setCodigoSetor(3);
        o1.setSalarioBase(2500);
        o1.setImposto(300);
        o1.setValorProducao(500);
        System.out.println(o1.calcularSalario());
        System.out.println(o1.toString());
    }
}


