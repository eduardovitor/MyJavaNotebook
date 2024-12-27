package Sets;
import java.util.*;

public class ExTreeSet {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Teste", "Teste", "Asa de Arapiraca", "Festa", "Introvertido");
        Set<String> strSet = new TreeSet<String>(strList); // Consome mais memória que LinkedHashSet
        strSet.add("Alagoas");
        strSet.add("Brasil");
        strSet.remove("Festa");
        System.out.println(strSet);
        // Criando um Set imutável
        Set<Integer> imutSet = Set.of(1,2,3,4,5);
        System.out.println(imutSet);
    }
}
