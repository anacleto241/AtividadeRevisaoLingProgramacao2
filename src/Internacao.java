public class Internacao {

    private String dataInternacao, dataAlta, motivoInternacao;
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
    public Internacao(String dataInternacao, String dataAlta, String motivoInternacao, int diasInternados, Paciente paciente, Medico medico, Enfermeiro enfermeiro, double valorDiaInterncao) {
        this.dataInternacao = dataInternacao;
        this.dataAlta = dataAlta;
        this.motivoInternacao = motivoInternacao;
        this.idInternacao++;
        this.diasInternados = diasInternados;
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.valorDiaInterncao = valorDiaInterncao;
        atualizaValorTotalInternacao();
    }

    public Internacao(String idInternacao){
        totalInterncoes++;
        this.idInternacao = this.totalInterncoes + 1;
    }
    public String getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(String dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
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
        paciente.ValorTotalInternacoes(this.getValorTotal());
    }
}

