package Lists;

import java.util.*;

public class ExLinkedList {
    public static void main(String[] args) {
        List<String> listaLinkada = new LinkedList<String>();
        listaLinkada.addFirst("Teste 1"); // Adiciona no ínicio da lista
        listaLinkada.addFirst("Teste 2"); 
        listaLinkada.addLast("Teste 9"); // Adiciona no final da lista
        listaLinkada.removeFirst();
        listaLinkada.removeLast(); // Remove do fim
        String el = listaLinkada.getFirst();
        System.out.println("O elemento do início da lista é "+el);
    }
}
