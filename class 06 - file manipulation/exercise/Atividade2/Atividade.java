import java.io.BufferedReader;
import java.io.FileReader;

public class Atividade { 
    public static void main(String[] args) throws Exception{

        String leituraVendas = "vendas.csv";
        BufferedReader leitura = new BufferedReader(new FileReader(leituraVendas));

        String linha;

        while ((linha = leitura.readLine()) != null) {
            //System.out.println(linha);
        }

        leitura.close();

        leitura = new BufferedReader(new FileReader (leituraVendas));
        
        linha = leitura.readLine();
        
        float soma = 0;

        float somaV = 0;
        float somaP = 0;

        int contador = 0;

        while ((linha = leitura.readLine()) != null) {
            String[] dados = linha.split(";");
            
            if (dados[3].equals("V")) {
                somaV = somaV + Float.parseFloat(dados[2].replace(",", "."));
            }

            if (dados[3].equals("P")) {
                somaP = somaP + Float.parseFloat(dados[2].replace(",", "."));
            }
            soma = soma + Float.parseFloat(dados[2].replace(",", "."));

            contador++;

        }
        System.out.println("Quantidade total de vendas: " + contador);
        System.out.println("Valor total das vendas: " + soma); 
        System.out.println("Valor total das vendas pagas a vista: " + somaV); 
        System.out.println("Valor total das vendas pagas a prazo: " + somaP); 

        leitura.close();


    }
}