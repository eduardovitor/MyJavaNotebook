import java.util.*;

public class LambdaExpression {
    public static void main(String[] args) {
        /* 
            O método forEach é usado apenas para impressão de elementos de uma coleção.
            O método recebe funções Consumer que não têm retorno.
        */ 
        List<Integer> lista_nums = new ArrayList<Integer>();
        lista_nums.add(2);
        lista_nums.add(5);
        lista_nums.add(6);
        // Função Lambda tem a estrutura <elemento da lista> -> <ação>
        lista_nums.forEach(elemento -> System.out.println(elemento));
        lista_nums.forEach(elemento -> { // Chaves: código maiores na função
            if (elemento % 2 == 0) {
                System.out.printf("O elemento %d é par \n",elemento);
            }
        });
        /*  
        Com os :: não se pode usar mais de um parâmetro, nem manipular elementos
        */
        lista_nums.forEach(System.out::println);
    }
}
