public class ExMetodoGenerico { // Classes e interfaces também podem ser genéricas
    public static <T> void mostrarValor(T valor) { // T representa um tipo genérico
        System.out.println("O valor é: " + valor);
    }

    public static void main(String[] args) {
        ExMetodoGenerico.mostrarValor("Oi");
    }
}
