package Sets;
import java.util.*;

public class ExHashSet {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Teste", "Teste", "Asa de Arapiraca", "Festa", "Introvertido");
        Set<String> strSet = new HashSet<String>(strList);
        // Outra forma strSet.addAll(strList);
        // Outra forma strSet = strList.stream().collect(Collectors.toSet());
        strSet.add("Alagoas");
        strSet.add("Brasil");
        strSet.remove("Festa");
        System.out.println(strSet);
    }
}
