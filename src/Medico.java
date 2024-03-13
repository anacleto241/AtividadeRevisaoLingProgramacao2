public class Medico extends Funcionario{
    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, String telefone, int idade, String ctps, String crm, String especialidade){
        super(nome, cpf, telefone, idade, ctps);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm(){
        return crm;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setCrm(String crm){
        this.crm = crm;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String toString(){
        return super.toString() + "CRM: " + crm + "\nEspecialidade: " + especialidade + "\n";
    }
}
