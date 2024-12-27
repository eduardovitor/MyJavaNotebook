package Sets;
import java.util.*;

public class ExLinkedHashSet {
    public static void main(String[] args) {
      Set<String> linkedHashSet = new LinkedHashSet<>(); // Usa mais memória que o HashSet
      linkedHashSet.add("B");
      linkedHashSet.add("A");
      linkedHashSet.add("C");
      System.out.println("LinkedHashSet: " + linkedHashSet); // Ordem de inserção garantida
    }
}
