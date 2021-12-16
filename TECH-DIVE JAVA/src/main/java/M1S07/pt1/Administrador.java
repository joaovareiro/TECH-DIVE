package M1S07.pt1;

public class Administrador extends Empregado {
    //Exercicio 4
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nome=" + this.getNome() +
                ", endereco=" + this.getEndereço()+
                ", telefone=" + this.getTelefone()+
                ", codigoSetor=" + this.getCodigoSetor() +
                ", salarioBase=" + this.getSalarioBase() +
                ", imposto=" + this.getImposto() +
                ", ajudaDeCusto=" + ajudaDeCusto +
                '}';
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return (this.getSalarioBase() + this.ajudaDeCusto) - this.getImposto();
    }

    public static void main(String[] args) {
        Administrador e2 = new Administrador();
        e2.setNome("Maria joaquina");
        e2.setEndereço("Avenida exemplo3, 528");
        e2.setTelefone("9 1253-9876");
        e2.setCodigoSetor(5);
        e2.setSalarioBase(2000);
        e2.setImposto(250);
        e2.setAjudaDeCusto(500);
        System.out.println(e2.calcularSalario());
        System.out.println(e2.toString());
    }
}
