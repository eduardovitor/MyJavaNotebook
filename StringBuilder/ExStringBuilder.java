package StringBuilder;

public class ExStringBuilder {
    public static void main(String[] args) {
        // Alternativa ao uso de Strings, já que Strings são imutáveis
        StringBuilder strBuild = new StringBuilder();
        // append: insere no fim
        strBuild.append("Olá");
        strBuild.append("Mundo");
        strBuild.append(2); // O append consegue receber parâmetros de vários tipos
        strBuild.append("!");
        // insert: insere na posição especificada
        strBuild.insert(3, " ");
        // delete: deleta da posição especificada (! vai pro ralo)
        strBuild.delete(10, 11);
        System.out.println(strBuild.toString());
        // Saber o tamanho da string
        int tam = strBuild.length();
        System.out.println("O tamanho da string é: "+tam);
        // setLength: diminuir ou aumentar o tamanho da string, se 0 for definido, a string é "apagada"
        strBuild.setLength(5);
        System.out.println("String após destruição: "+strBuild.toString());
        // Susbtituindo uma substring por outra
        strBuild.replace(0, 3, "Hello");
        System.out.println("String após substituição: "+strBuild.toString());
    }
}