import java.io.BufferedWriter;
import java.io.FileWriter;

public class Atividade {

    public static void main(String[] args) throws Exception {
        String arqHtml = "Teste.html";
        BufferedWriter writer = new BufferedWriter(new FileWriter(arqHtml));
        
        String[] cores = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        String infos = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head><body><p>&nbsp;</p><h2 align=\"center\">Tabela de Cores HTML</h2><table width=\"400\" align=\"center\" border=\"1\"><tr><th width=\"200\" align=\"center\">Cor</th><th width=\"200\" align=\"center\">Código Hexadecimal</th></tr>";
        writer.write(infos);

        String info2 = "<tr>\n" + "<td bgcolor='#000000'>\n" + "<td align='center'>#000000</td>\n" + "</tr>";

        String info3 = "</table></body></html>";

        for (int i = 0; i < cores.length; i++) {
            for (int j = 0; j < cores.length; j++) {
                for (int k = 0; k < cores.length; k++) {
                    String cor = "#" + cores[i] + "0" + cores[j] + "0" + cores[k] + "0";
                    writer.write("<tr>");
                    writer.newLine();
                    writer.write("<td bgcolor='" +  cor + "'></td>");
                    writer.newLine();
                    writer.write("<td align='center'>" +  cor + "</td>");
                    writer.newLine();
                    writer.write("</tr>");
                    writer.newLine();
                }
            }
        }
        writer.write(info3);
        writer.close();  
    }
    
}