public class Enfermeiro extends Funcionario{

    private String coren;

    public Enfermeiro(String nome, String cpf, String telefone, int idade, String ctps, String coren){
        super(nome, cpf, telefone, idade, ctps);
        this.coren = coren;
    }

    public String getCoren(){
        return coren;
    }

    public void setCoren(String coren){
        this.coren = coren;
    }

    public String toString(){
        return super.toString() + "COREN: " + coren + "\n";
    }
}
