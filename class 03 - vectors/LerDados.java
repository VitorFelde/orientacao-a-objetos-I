import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LerDados {

    public static void main (String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );
        //BufferedReader: buffer de leitura
        //InputStreamReader: captura um fluxo de entrada de dados
        //System.in: entrada padrão (teclado)
        //throws Exception: tira o problema do codigo e passa pro usuario

        String linha = "";
        System.out.println("Digite alguma coisa ou S para sair: ");

        
        while(!linha.toUpperCase().equals("S")){
            linha = reader.readLine();
            System.out.println("Digitou " + linha); //so colocar syso que vai esse system.out
        }
    }

}