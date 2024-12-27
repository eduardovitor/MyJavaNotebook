package Map;
import java.util.*;

public class ExTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new TreeMap<String,Integer>(); // Mantém a ordem natural dos elementos
        mapa.put("Alagoas", 2); 
        mapa.put("Pernambuco", 6);
        mapa.put("Rio de Janeiro",10);
        mapa.put("São Paulo",20);
        mapa.put("Sergipe",12);
        mapa.put("Rio de Janeiro",7); // Não permite chaves repetidas
        mapa.remove("Sergipe"); // Remove a entrada com a cahve
        System.out.println(mapa.get("Alagoas")); // Valor presente na chave Alagoas
        System.out.println("O tamanho do mapa é "+mapa.size()); // Tamanho de entradas do mapa
        System.out.println();
        for(Map.Entry<String,Integer> entrada: mapa.entrySet()){ // Percorrendo o mapa de outra forma
            System.out.println(entrada.getKey() + ":" +entrada.getValue());
            System.out.println();
        }
    }
}
