import java.util.*;

public class ExemploString {
    public static void main(String[] args) {
        String teste = "Oi, eu sou Goku";
        // Como pegar o tamanho da string?
        System.out.println(teste.length());
        // Como pegar somente um caractere?
        System.out.println(teste.charAt(2));
        // Separando a string por um caractere
        String[] testeSeparado = teste.split(",");
        // Criando uma lista para iterar mais facilmente
        List<String> testeLista = new ArrayList<String>();
        // Colocando o vetor testeSeparado na lista testeLista
        Collections.addAll(testeLista, testeSeparado);
        // Percorrendo a lista com forEach
        testeLista.forEach(vetor -> System.out.println(vetor));
        // Maiúsculas e mínusculas
        String s = "Paulo Rievrs Oliveira";
        System.out.println(s.toLowerCase());
        // Exibe: paulo rievrs oliveira
        System.out.println(s.toUpperCase());
        // Exibe: PAULO RIEVRS OLIVEIRA
        String n_1 = "111";
        String n_2 = "1.7";
        String n_3 = "5.1";
        int num_1 = Integer.parseInt(n_1);
        double num_2 = Double.parseDouble(n_2);
        float num_3 = Float.parseFloat(n_3);
        System.out.printf("%d %f %f",num_1,num_2,num_3);
    }
}
