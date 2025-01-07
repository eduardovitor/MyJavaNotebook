package Queue;
import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<Integer>(); // Queue é uma interface, logo precisa de uma classe concreta
        Integer[] intArr = {29,55,23,13,18,19};
        List<Integer> intList = Arrays.asList(intArr);
        for(Integer n: intList){
            myQueue.add(n);
        }
        System.out.println("Fila atual: "+myQueue);
        myQueue.remove();
        System.out.println("Fila após a remoção: "+myQueue);
    }
}
