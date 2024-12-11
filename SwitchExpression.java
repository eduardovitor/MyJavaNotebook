public class SwitchExpression {
    public static void main(String[] args) {
        int idade1 = 37;
        int idade2 = 80;
        int maiorIdade = idade1>idade2 ? idade1 : idade2;
        String saida = switch (maiorIdade) {
            case 37 -> "Idade 1 é maior";
            case 80 -> "Idade 2 é maior";
            default -> "Deu errado";
        };
        System.out.println(saida);
    }
}