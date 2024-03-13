public class Paciente extends Pessoa{

    private String convenio;
    private double valorTotalInternacoes;

    public Paciente(String nome, String cpf, String telefone, int idade, String convenio){
        super(nome, cpf, telefone, idade);
        this.convenio = convenio;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public double getValorTotalInternacoes() {
        return valorTotalInternacoes;
    }

    public void setValorTotalInternacoes(double valorTotalInternacoes) {
        this.valorTotalInternacoes = valorTotalInternacoes;
    }

    public double ValorTotalInternacoes(double valorInternacao) {
        this.valorTotalInternacoes += valorInternacao;
        return valorTotalInternacoes;
    }
}
