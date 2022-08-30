import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArquivoFisico {
    public static void main(String[] args) throws IOException {
        ArrayList<String> nomeClientes = new ArrayList<String>();

        nomeClientes.add("Pretolina");
        nomeClientes.add("Givanildo");
        nomeClientes.add("Adroaldo");
        nomeClientes.add("Tarciano");

        FileWriter arquivo = new FileWriter("C:\\Users\\juanc\\Desktop\\clientes.txt");
        PrintWriter gravarArquivo = new PrintWriter((arquivo));

        for(String i: nomeClientes) {
            gravarArquivo.println(i);
        }
        arquivo.close();

        //System.out.println("Criacao do arquivo na unidade c:\clientes.txt");
    }
}
