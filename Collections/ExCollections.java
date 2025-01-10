package Collections;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ExCollections {
    public static void main(String[] args) {
        Integer[] intArr = {12,7,3,7,9,45};
        Integer[] copyArr = new Integer[6];
        // Preenchendo o array cópia com o valor 2
        Arrays.fill(copyArr,2);
        // Transformando em listas
        List<Integer> intList = Arrays.asList(intArr);
        List<Integer> copyIntList = Arrays.asList(copyArr);
        // Ordenando elementos
        Collections.sort(intList);
        System.out.println("Lista ordenada: "+intList);
        // Embaralhando elementos
        Collections.shuffle(intList);
        System.out.println("Lista embaralhada: "+intList);
        // Substituindo o valor de um elemento
        Collections.replaceAll(intList, 7, 99);
        System.out.println("Lista com substituição de elemento: "+intList);
        // Copiando uma lista
        Collections.copy(copyIntList, intList);
        System.out.println("A cópia da lista é: "+copyIntList);
        // Contando a frequência de um elemento
        int cont = Collections.frequency(copyIntList, 99);
        System.out.println("A frequência do elemento 99 é: "+cont);
    }
}