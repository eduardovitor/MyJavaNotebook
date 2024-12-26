package Lists;
import java.util.*;
public class ExList {
    public static void main(String[] args) {
        List<Integer> lista_int = Arrays.asList(1,2,3,4,5);
        lista_int.set(0, 30);
        System.out.println(lista_int.size());
        System.out.println(lista_int);
    }
}
