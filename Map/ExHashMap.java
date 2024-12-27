package Map;
import java.util.*;

public class ExHashMap {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<String,Integer>();
        mapa.put("Alagoas", 2);
        mapa.put("Pernambuco", 6);
        mapa.put("Rio de Janeiro",10);
        mapa.put("São Paulo",20);
        mapa.put("Sergipe",12);
        mapa.put("Rio de Janeiro",7); // Não permite chaves repetidas
        mapa.remove("Sergipe"); // Remove a entrada com a cahve
        System.out.println(mapa.get("Alagoas")); // Valor presente na chave Alagoas
        System.out.println("O tamanho do mapa é "+mapa.size()); // Tamanho de entradas do mapa
        System.out.println("As chaves do mapa são "+mapa.keySet()); // Retorna um set com as chaves
        System.out.println("Os valores do mapa são "+mapa.values()); // Retorna todos os valores do mapa
        mapa.forEach((chave,valor) -> System.out.println(chave+" "+valor)); // Percorrendo o mapa
        for(Map.Entry<String,Integer> entrada: mapa.entrySet()){ // Percorrendo o mapa de outra forma
            System.out.println(entrada.getKey() + ":" +entrada.getValue());
            System.out.println();
        }
        Map<String,String> mapaImutavel = Map.of("nome","João","idade","15","cpf","810981"); // Mapa imutável
        for(Map.Entry<String,String> entrada: mapaImutavel.entrySet()){
            System.out.println(entrada.getKey() + ":" +entrada.getValue());
            System.out.println();
        } 
    }
}
