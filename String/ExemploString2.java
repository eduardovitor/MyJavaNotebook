package String;

public class ExemploString2 {
    public static void main(String[] args) {
        // Convertendo um vetor de caracteres em uma String
        char[] charVetor = {'a','b','c'};
        String strChar = new String(charVetor);
        System.out.println(strChar);
        // Verificando se uma string contém outra
        String teste = "Olá mundo";
        String teste2 = "loucura";
        boolean check = teste.contains(teste2);
        System.out.println(check ? "Contém a substring": "Não contém a substring");
        // Verificando se strings são iguais
        String tigual = "Real Madrid é o meu time";
        String tigual2 = "Real Madrid é o MEU TIME";
        boolean checkIgual = tigual.equals(tigual2);
        System.out.println(checkIgual ? "Strings são iguais (case importa)": "Strings não são iguais (case importa)");
        // Verificando se strings são iguais (case não importa)
        boolean checkIgualCase = tigual.equalsIgnoreCase(tigual2);
        System.out.println(checkIgualCase ? "Strings são iguais (case não importa)": "Strings não são iguais (case não importa)");
        // Localizando uma letra/substring em uma string
        int index = tigual.indexOf("Madrid");
        System.out.println("O index onde Madrid se encontra é " +index);
        // Substituindo substrings em uma string
        String tigualReplace = tigual.replace("Real Madrid", "Botafogo");
        System.out.println("A string substituída é: "+tigualReplace);
        // Criando substrings
        String tigualSubst = tigual.substring(0,3);
        System.out.println(tigualSubst);
        // Convertendo número para string
        System.out.println(String.valueOf(5));
        // Removendo espaços em branco
        String espacada = "       Fui ao banco   ";
        String espacadaStrip = espacada.strip();
        System.out.println("A string sem espaçamento é "+espacadaStrip);
        // Verificando se uma string é vazia
        String vazia = "";
        boolean eVazia = vazia.isBlank();
        System.out.println(eVazia ? "Sim, é vazia": "Não, não é vazia");
        // Juntando uma string com outra
        String str1 = "Coca";
        String str2 = " Cola";
        String strConcat = str1.concat(str2);
        System.out.println(strConcat);
        // Formatando uma string e transformando
        String strEx = "O céu estrelado é uma benção divina para %s humanos";
        String strFormat = strEx.formatted("nós");
        System.out.println(strFormat);
        String strTransform = strFormat.transform(s -> s.concat(", isso é maravilhoso")).transform(String::toUpperCase);
        System.out.println(strTransform);
    }
}
