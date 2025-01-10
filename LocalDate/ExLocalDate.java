package LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExLocalDate {
    public static void main(String[] args) {
        // Extraindo a data atual, formato: yyyy-mm-dd
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Hoje: " + dataAtual.toString());
        // Inicializando um objeto com uma data qualquer
        LocalDate dataQualquer = LocalDate.of(2023,5,24);
        System.out.println("Data qualquer: " + dataQualquer);
        // Fazendo parse de uma data por meio de uma string
        LocalDate dataString = LocalDate.parse("2022-04-18");
        System.out.println("Data a partir de string: " + dataString);
        // Adicionando uma quantidade de dias após uma data
        LocalDate dataAtual15 = dataAtual.plusDays(15);
        System.out.println("Data atual depois de 15 dias: " + dataAtual15);
        // Adicionando uma quantidade de meses após uma data
        LocalDate dataAtual6Meses = dataAtual.plusMonths(6);
        System.out.println("Data atual depois de 6 meses: " + dataAtual6Meses);
        // Formatando uma data de forma diferente da padrão
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatador);
        System.out.println(dataFormatada);
    }
}
