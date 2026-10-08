import java.io.BufferedWriter;
import java.io.FileWriter;

public class Atividade {

    public static void main(String[] args) throws Exception {
        String arqHtml = "Teste.html";
        BufferedWriter writer = new BufferedWriter(new FileWriter(arqHtml));


        String infos = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head><body><p>&nbsp;</p><h2 align=\"center\">Tabela de Cores HTML</h2><table width=\"400\" align=\"center\" border=\"1\"><tr><th width=\"200\" align=\"center\">Cor</th><th width=\"200\" align=\"center\">Código Hexadecimal</th></tr></table></body></html>";
        writer.write(infos);
    
        writer.close();
    
    }

}