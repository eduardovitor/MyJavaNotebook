public class MinhaExcecao  extends RuntimeException {

    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
    
    public MinhaExcecao(String mensagem, Throwable error) {
        super(mensagem, error);
    }

    public static void main(String[] args) {
        throw new MinhaExcecao("Você caiu na minha exceção!");
    }
}