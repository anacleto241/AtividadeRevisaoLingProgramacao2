import java.util.Scanner;

public class Teste {

    public static void MostrarInternacao(Internacao internacao){
        System.out.println("Nome do paciente: " + internacao.getPaciente().getNome());
        System.out.println("Nome do médico: " + internacao.getMedico().getNome());
        System.out.println("Nome do enfermeiro: " + internacao.getEnfermeiro().getNome());
        System.out.println("Id da internação: " + internacao.getIdInternacao());
        System.out.println("Motivo da internacao: " + internacao.getMotivoInternacao());
        System.out.println("Valor diario de Internacao: " + internacao.getValorTotal());
        System.out.println("Dias internados: " + internacao.getDiasInternados());
        System.out.println("Valor total da internacao: " + internacao.getValorTotal());
        System.out.println("Valor total de todas as internacoes: " + internacao.getPaciente().getValorTotalInternacoes());
    }

        public static void ScannerInternacao(Internacao internacao){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o motivo da internação: ");
            String motivo = scanner.nextLine();
            internacao.setMotivoInternacao(motivo);
            System.out.println("Digite o número de dias internados: ");
            int dias = scanner.nextInt();
            internacao.setDiasInternados(dias);
            System.out.println("Digite o valor diário da internação: ");
            double valor = scanner.nextDouble();
            internacao.setValorDiaInterncao(valor);
            internacao.atualizaValorTotalInternacao();
        }
    public static void main(String[] args) {


        Enfermeiro enfermeiro = new Enfermeiro("João", "123.456.789-00", "1234-5678", 25, "1234", "1234");
        Paciente paciente = new Paciente("Maria", "987.654.321-00", "9876-5432", 30, "Unimed");
        Medico medico = new Medico("José", "111.222.333-44", "1111-2222", 40, "1234", "CRM1234", "Cardiologista");

        Internacao internacao = new Internacao(paciente, medico, enfermeiro);
        ScannerInternacao(internacao);
        Internacao internacao2 = new Internacao(paciente, medico, enfermeiro);
        ScannerInternacao(internacao2);
        Internacao internacao3 = new Internacao( paciente, medico, enfermeiro);
        ScannerInternacao(internacao3);

        MostrarInternacao(internacao3);

    }
}
