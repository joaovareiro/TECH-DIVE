package M1S07.pt1;

public class Fornecedor extends Pessoa {
    //Exercicio 2
        private double valorCredito;
        private double valorDivida;

        @Override
        public String toString() {
            return "Fornecedor{" +
                    "nome=" + this.getNome() +
                    ", endereco=" + this.getEndereço()+
                    ", telefone=" + this.getTelefone()+
                    ", valorCredito=" + valorCredito +
                    ", valorDivida=" + valorDivida +
                    '}';
        }

        public Fornecedor() {
        }

        public double getValorCredito() {
            return valorCredito;
        }

        public void setValorCredito(double valorCredito) {
            this.valorCredito = valorCredito;
        }

        public double getValorDivida() {
            return valorDivida;
        }

        public void setValorDivida(double valorDivida) {
            this.valorDivida = valorDivida;
        }

        public double obterSaldo(){
            return this.valorCredito - this.valorDivida;
        }

        public static void main(String[] args) {
            Fornecedor p1 = new Fornecedor();
            p1.setNome("Joao da Silva");
            p1.setEndereço("Rua aleatoria, 123");
            p1.setTelefone("9 1234-5678");
            p1.setValorDivida(1000);
            p1.setValorCredito(100);
            System.out.println(p1.obterSaldo());
            System.out.println(p1.toString());
        }
    }

