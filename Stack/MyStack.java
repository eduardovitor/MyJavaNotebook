package Stack;
import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>(); // Stack é uma classe e pode ser instanciada
        Integer[] intArr = {1,2,3,4,5};
        List<Integer> intList = Arrays.asList(intArr);
        intList.forEach(elemento -> {
            myStack.push(elemento); // Colocando elementos na pilha
        });
        Integer topo = (Integer) myStack.peek(); // Espiando o topo da pilha
        System.out.println(topo);
        myStack.pop(); // Removendo da pilha
        myStack.pop();
        topo = (Integer) myStack.peek();
        System.out.println(topo);
    }
}
