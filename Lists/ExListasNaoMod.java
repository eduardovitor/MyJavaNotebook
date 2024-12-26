import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExListasNaoMod {
    private final List<Integer> numeros = new LinkedList<>();

    public List<Integer> getNumeros() {
        return Collections.unmodifiableList(numeros); // Isso torna a lista não-modificável no main
    }

    public static void main(String[] args) {
        ExListasNaoMod ex = new ExListasNaoMod();
        List<Integer> teste = new LinkedList<Integer>();
        teste = ex.getNumeros();
        // teste.add(2); // Lança UnsupportedOperationException
        List<Integer> lista = List.of(1, 2, 3); // List of cria listas imutáveis
        // lista.set(0, 30); // Lança UnsupportedOperationException
        List<String> outraLista = List.of("Java", "4", null); //NullPointerException, não aceita nulo
    }
}
