import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Conta> contas;


    public String getNome() {
        return nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}
