import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ArquivoTexto {
    public static void main(String[] args) {
        String path = "./JAVA/arq.txt";

        try {
            OutputStream os = new FileOutputStream(path);
            OutputStreamWriter wr = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(wr);

            br.write("Escrevendo nosso primeiro arquivo em java");
            br.newLine();
            br.newLine();
            br.write("Outra Linha!");
            br.close();
        } catch (Exception e) {
            
        }
    }
}
