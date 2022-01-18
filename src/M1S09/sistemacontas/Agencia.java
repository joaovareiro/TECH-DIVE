package M1S09.sistemacontas;

import java.util.ArrayList;

public class Agencia {
    public String nomeAgencia;
    ArrayList<Conta> contas = new ArrayList<>();

    public Agencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public void adiciona(Conta c){
        contas.add(c);
    }

    public int getQuantidadeDeContas(){
        return contas.size();
    }

    public Conta buscaPorTitular(String nomeDoTitular){
        for(Conta busca: contas){
            if(nomeDoTitular.equals(busca.getCliente().getNome()))
                return busca;
            }
            return null;
        }
}

