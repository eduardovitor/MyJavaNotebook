public class OrdemCapturaExcecoes {
    public static void main(String[] args) {
        try {
            // Exemplo de código que pode lançar exceções
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Lança ArrayIndexOutOfBoundsException
            int resultado = 10 / 0;         // Lança ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura específica para exceções de índice de array inválido
            System.out.println("Erro: Tentou acessar um índice inválido do array.");
        } catch (ArithmeticException e) {
            // Captura específica para divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            // Captura genérica para outras exceções
            System.out.println("Erro: Ocorreu uma exceção inesperada.");
        }

        System.out.println("Programa continua após o tratamento de exceções.");
    }
}
