import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo{

    public static void main(String[] args) throws Exception {
        String nomeArqSaida = "arqSaida.csv"; //pure text, only stores information
        BufferedWriter arqGravacao /*here arqGravacao is the name to us record file*/ = new BufferedWriter(new FileWriter(nomeArqSaida));

        String linha = "Produto;Preço;Estoque";
        arqGravacao.write(linha); //recording the value of line in our file.csv
        
        arqGravacao.newLine();

        String nomeProduto = "Mouse Dell D310";
        String preco = "119,50";
        String estoque = "7";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        arqGravacao.newLine();

        nomeProduto = "Notebook Acer";
        preco = "3250,10";
        estoque = "3";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        arqGravacao.newLine();

        nomeProduto = "Monitor AlienWare";
        preco = "2200,36";
        estoque = "8";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        arqGravacao.close();
    
    }
}