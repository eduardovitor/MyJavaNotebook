import java.io.IOException;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscritorArquivo {
    public static void escreve() throws IOException {
        Path caminho = Paths.get("arquivo_teste.txt");
        BufferedWriter escritor = new BufferedWriter(new FileWriter("arquivo_teste.txt",true)); 
        // O true do FileWriter ativa o modo append
        escritor.write("Teste");
        escritor.close();
    }
    public static void main(String[] args) {
        try {
            escreve();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
