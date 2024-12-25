import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filtrando nomes que começam com 'A' e convertendo para maiúsculas
        List<String> nomesFiltrados = nomes.stream()
            .filter(nome -> nome.startsWith("A")) // Filtra elementos que começam com A
            .map(String::toUpperCase) // Converte tudo para maiúsculas
            .collect(Collectors.toList()); // Termina as operações e traz a lista resultante

        // Filtrando nomes que terminam com 'e' e convertendo para minúsculas
        List<String> nomesFiltrados2 = nomes.stream()
        .filter(nome -> nome.endsWith("e"))
        .map(String::toLowerCase)
        .collect(Collectors.toList());

        System.out.println(nomesFiltrados); // [ALICE]
        System.out.println(nomesFiltrados2); // [alice,charlie]

        // Usando Stream paralelo para processar elementos
        IntStream.range(1, 10)
            .parallel()
            .forEach(System.out::println);
    }
}
