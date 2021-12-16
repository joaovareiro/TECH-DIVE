package M1S07.pt1;

import M1S07.pt1.Empregado;

public class Vendedor extends Empregado {
    //Exercicio 6
    private double valorVendas = 0;
    private double comissao = 0;

    public Vendedor(){
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome=" + this.getNome() +
                ", endereco=" + this.getEndereço()+
                ", telefone=" + this.getTelefone()+
                ", codigoSetor=" + this.getCodigoSetor() +
                ", salarioBase=" + this.getSalarioBase() +
                ", imposto=" + this.getImposto() +
                ", valorVendas" + valorVendas +
                ", comissao=" + comissao +
                '}';
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas += valorVendas;
    }

    public double getComissao() {
        return valorVendas/10;
    }

    public void setComissao(double comissao) {
        this.comissao = getComissao();
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() - this.getImposto() + this.getComissao();
    }

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        v1.setNome("Camilla da Cunha");
        v1.setEndereço("Avenida exemplo10, 3");
        v1.setTelefone("9 1202-3806");
        v1.setCodigoSetor(0);
        v1.setSalarioBase(3500);
        v1.setImposto(350);
        v1.setValorVendas(100);
        v1.setValorVendas(200);
        System.out.println(v1.calcularSalario());
        System.out.println(v1.toString());
    }
}
