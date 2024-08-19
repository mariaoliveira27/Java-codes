import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Arquivo {
       public static void main(String[] args) {
        String path = "C:/Users/maria/OneDrive/Área de Trabalho/JAVA/Java-codes/JAVA/Arqu.txt";

        try {
            OutputStream os = new FileOutputStream(path);
            OutputStreamWriter wr = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(wr);

            br.write("<!DOCTYPE html>\r\n" + //
                                "<html>\r\n" + //
                                "  <head>\r\n" + //
                                "    <meta charset=\"UTF-8\">\r\n" + //
                                "    <title>Hello, World!</title>\r\n" + //
                                "  </head>\r\n" + //
                                "  <body>\r\n" + //
                                "    <h1>Hello World!</h1>\r\n" + //
                                "  </body>\r\n" + //
                                "</html>");
            br.newLine();
            br.newLine();
            br.write("Outra Linha!");
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
