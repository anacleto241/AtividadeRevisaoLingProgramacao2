public class Funcionario extends Pessoa{

    String ctps;

    public Funcionario(String nome, String cpf, String telefone, int idade, String ctpse) {
        super(nome, cpf, telefone, idade);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
}
