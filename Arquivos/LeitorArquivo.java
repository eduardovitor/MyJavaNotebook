import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LeitorArquivo {
    // Inicializar o arquivo com BufferedReader e ler linha por linha
    public static void leitor1() throws IOException{
        BufferedReader leitor = new BufferedReader(new FileReader("arquivo_teste.txt"));
        String linha = leitor.readLine();
        while(linha!=null){
            System.out.println(linha);
            linha = leitor.readLine();
        }
        leitor.close();
    }
    public static void leitor2() throws IOException{
        // Usando o inicializador do BufferedReader no try, não é necessário usar o close()
        try(BufferedReader leitor = new BufferedReader(new FileReader("arquivo_teste.txt"))){
            String linha = leitor.readLine();
            while(linha!=null){
                System.out.println(linha);
                linha = leitor.readLine();
            }
        }
    }
    public static void leitor3() throws IOException{
        // Lê todas as linhas e coloca em uma lista (Pacote nio)
        Path caminho = Paths.get("arquivo_teste.txt");
        List<String> linhas = Files.readAllLines(caminho);
        System.out.println(linhas);
    }
    public static void leitor4() throws IOException{
        Path caminho = Paths.get("arquivo_teste.txt");
        try(BufferedReader leitor = Files.newBufferedReader(caminho)){
            String linha = leitor.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
        }
    }
    public static void main(String[] args) {
        try {
            leitor4();
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
}
