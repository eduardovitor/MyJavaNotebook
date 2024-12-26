package Lists;

import java.util.*;

public class ExArrayList {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<Integer>();
        Integer[] intarray = {13,0,45,2,70};
        List<Integer> intarrayList = Arrays.asList(intarray);
        Integer num = 7;
        inteiros.add(5);
        inteiros.add(6);
        inteiros.add(7);
        inteiros.remove(0);
        inteiros.removeIf(e -> e == 6); // Remove com condição
        inteiros.remove(num);
        inteiros.add(10);
        inteiros.add(15);
        inteiros.add(1,12); // Adiciona na posição e passa o elemento da posição para a direita
        System.out.println("Lista antes do clear é "+inteiros);
        inteiros.clear(); // Limpa a lista, excluindo todos os elementos
        inteiros.add(5);
        Integer pos0 = inteiros.get(0); /// Retorna o elemento do índice passado
        System.out.println("O número da posição 0 é o "+pos0);
        inteiros.addAll(intarrayList); // Adiciona todos os elementos da lista intarraylist para a coleção inteiros
        Collections.sort(inteiros); // Ordenando em ordem crescente
        inteiros.replaceAll(n -> n * 2); // Dobra os elementos da lista
        inteiros.add(5);
        int pos5 = inteiros.indexOf(5); // Recebe o número a ser buscado e retorna o índice
        System.out.println("A posição do elemento 5 é "+pos5);
        if (inteiros.contains(5)){
            System.out.println("Contém 5");
        }
        if (!inteiros.isEmpty()){
            System.out.println("Lista não está vazia");
        }
        
        System.out.println("A lista é a seguinte "+inteiros);
    }
}