import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo{

    public static void main(String[] args) throws Exception {
        String nomeArqSaida = "arqSaida.csv"; //pure text, only stores information
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));

        String linha = "Produto;Preço;Estoque";
        arqGravacao.write(linha);
        arqGravacao.newLine();
        arqGravacao.close();
    
    }
}