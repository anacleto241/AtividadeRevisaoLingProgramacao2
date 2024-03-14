public class Internacao {

    private String motivoInternacao;
    private int idInternacao=0, diasInternados, totalInterncoes;
    private double valorDiaInterncao, valorTotal;
    private Paciente paciente;
    private Medico medico;
    private Enfermeiro enfermeiro;


    public Internacao(Paciente paciente, Medico medico, Enfermeiro enfermeiro){
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.idInternacao++;
    }
    public Internacao( String motivoInternacao, int diasInternados, Paciente paciente, Medico medico, Enfermeiro enfermeiro, double valorDiaInterncao) {
        this.motivoInternacao = motivoInternacao;
        this.idInternacao++;
        this.diasInternados = diasInternados;
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.valorDiaInterncao = valorDiaInterncao;
        this.atualizaValorTotalInternacao();
    }

    public Internacao(String idInternacao){
        totalInterncoes++;
        this.idInternacao = this.totalInterncoes + 1;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public int getIdInternacao() {
        return idInternacao;
    }

    public void setIdInternacao(int idInternacao) {
        this.idInternacao = idInternacao;
    }

    public int getDiasInternados() {
        return diasInternados;
    }

    public void setDiasInternados(int diasInternados) {
        this.diasInternados = diasInternados;
    }

    public double getValorTotal(){
        return valorTotal;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public int getTotalInterncoes() {
        return totalInterncoes;
    }

    public void setTotalInterncoes(int totalInterncoes) {
        this.totalInterncoes = totalInterncoes;
    }

    public double getValorDiaInterncao() {
        return valorDiaInterncao;
    }

    public void setValorDiaInterncao(double valorDiaInterncao) {
        this.valorDiaInterncao = valorDiaInterncao;
    }

    public void atualizaValorTotalInternacao(){
        this.valorTotal = this.valorDiaInterncao * this.diasInternados;
        this.paciente.ValorTotalInternacoes(this.getValorTotal());
    }
}

