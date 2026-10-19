import java.io.BufferedReader;
import java.io.FileReader;

public class Atividade { 
    public static void main(String[] args) throws Exception{

        String leituraVendas = "vendas.csv";
        BufferedReader leitura = new BufferedReader(new FileReader(leituraVendas));

        String linha;

        while ((linha = leitura.readLine()) != null) {
            System.out.println(linha);
        }

        leitura.close();

        leitura = new BufferedReader(new FileReader (leituraVendas));
        
        linha = leitura.readLine();

        while ((linha = leitura.readLine()) != null) {
            String[] dados = linha.split(";");
            int soma = dados[2];
            System.out.println("Quantidade total de vendas = " + dados[0] + " " + dados [1] + " " + dados [2] + " " + dados [3]); 
        }
        leitura.close();


    }
}