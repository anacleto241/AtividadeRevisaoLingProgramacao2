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

        public static void ScannerInternacao(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a data de entrada: ");
            String dataEntrada = scanner.nextLine();
            System.out.println("Digite a data de saída: ");
            String dataSaida = scanner.nextLine();
        }
    public static void main(String[] args) {


        Enfermeiro enfermeiro = new Enfermeiro("João", "123.456.789-00", "1234-5678", 25, "1234", "1234");
        Paciente paciente = new Paciente("Maria", "987.654.321-00", "9876-5432", 30, "Unimed");
        Medico medico = new Medico("José", "111.222.333-44", "1111-2222", 40, "1234", "CRM1234", "Cardiologista");

        Internacao internacao = new Internacao("01/01/2021", "10/01/2021", "Dor no peito", 10, paciente, medico, enfermeiro, 100);
        Internacao internacao2 = new Internacao("02/01/2021", "11/01/2021", "Dor de cabeça", 9, paciente, medico, enfermeiro, 100);
        Internacao internacao3 = new Internacao("03/01/2021", "12/01/2021", "Dor no pé", 8, paciente, medico, enfermeiro, 100);

        MostrarInternacao(internacao3);

    }
}
