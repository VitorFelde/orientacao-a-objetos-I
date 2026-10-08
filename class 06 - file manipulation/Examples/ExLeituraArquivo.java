import java.io.BufferedReader;
import java.io.FileReader;

public class ExLeituraArquivo {

    //created this functions, almost the same as the writer, but now were just reading a file
    public static void main(String[] args) throws Exception{
        String nomeArqEntrada = "arqEntrada.csv";
        BufferedReader arqLeitura = new BufferedReader(new FileReader(nomeArqEntrada));

        String linha;

        while ((linha = arqLeitura.readLine()) != null) {
            linha = arqLeitura.readLine();
            System.out.println(linha);
        }
        arqLeitura.close();
    
        //showing only 1 field
        arqLeitura = new BufferedReader(new FileReader(nomeArqEntrada));
        linha = arqLeitura.readLine();
    
        while ((linha = arqLeitura.readLine()) != null) {
            String[] vetCampos = linha.split(";");
            System.out.println("Aluno: " + vetCampos[0] );
        }
        arqLeitura.close();


    }

}
