public class Arrays {
    public static double mediaInteiros(int[] inteiros){
        int soma = 0;
        for(int inteiro: inteiros){
            soma = soma + inteiro;
        }
        double media = (double) soma / inteiros.length;
        return media;
    }
    public static int acimaMedia(int[] inteiros){
        int cont_acima = 0;
        double media = mediaInteiros(inteiros);
        for(int inteiro:inteiros) {
            if (inteiro > media) {
                cont_acima ++;
            }
        }
        return cont_acima;
    }
    public static void main(String[] args) {
        int vetor[] = {10,5,6,4,9};
        double media = mediaInteiros(vetor);
        int cont_acima = acimaMedia(vetor);
        System.out.printf("A média foi: %.2f\n%d números está/estão acima da média\n",media,cont_acima);
    }
}
