package Arrays_Matrizes;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] numeros = {80, 22, 1, 9, 15, 19};
        int[] numeros2 = {80, 22, 1, 9, 15, 19};
        // Comparando arrays
        boolean compare = Arrays.equals(numeros, numeros2);
        if (compare == true) {
            System.out.println("Arrays são iguais");
        }
        // Convertendo um array para string
        String numerosString = Arrays.toString(numeros);
        System.out.println(numerosString);
        // Ordenando os elementos de um array
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        // Buscando um elemento usando busca binária
        int index = Arrays.binarySearch(numeros, 9);
        System.out.println("O elemento 9 está na posição "+index);
        // Criando uma cópia do Array com mais posições, preenche com zeros
        int[] copiaNums = Arrays.copyOf(numeros, 10);
        System.out.println(Arrays.toString(copiaNums));
        // Criando um Array com um valor só
        int[] vetorValor15 = new int[10];
        Arrays.fill(vetorValor15,15);
        System.out.println(Arrays.toString(vetorValor15));
        // Soma dos valores usando stream
        int soma = Arrays.stream(numeros).sum();
        System.out.println(soma);
        // Elevando os elementos a segunda potência usando stream e imprimindo
        Arrays.stream(numeros).map(elemento -> elemento * elemento).forEach(elemento -> {
            System.out.print(elemento + " ");
        });
    }
}
