/*Crie um programa que gere um arquivo csv com a lista de preços de venda (preco_venda.csv) dos produtos de uma loja:

 -A lista de preços deve conter: código, nome produto, preço de venda

 -O programa deve solicitar ao usuário a margem de lucro a ser aplicada aos produtos

 -O formato do arquivo de entrada é: codigo, estoque, nome produto, preço de custo e categoria (para teste usar o arquivo preco_custo.csv)*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {

    preco_custo pc1 = new preco_custo(); 
    public static void main(String[] args) throws Exception{
        //like scanf
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        //writing files
        String arqEscrever = "preco_venda.csv"; 
        BufferedWriter escrever = new BufferedWriter(new FileWriter(arqEscrever));
        String camposWrite = "codigo;nome_produto;preco_venda";
        //reading files
        String arqLeitura = "preco_custo.csv";
        BufferedReader ler = new BufferedReader(new FileReader(arqLeitura));
        String camposReader = "codigo;estoque;produto;preco_custo;categoria";

        String linhaLeitura = "";
        
        linhaLeitura = ler.readLine(); //getting the infos from the .csv file

        escrever.write(camposWrite);
    
        escrever.close();
        int op;
        do {

            System.out.println("Escolha uma das opções: ");
            System.out.println("1) Cadastrar margem de lucro");
            System.out.println("2)a definir");
            System.out.println("3) Sair");
            System.out.println("Escolha: ");
            op = Integer.parseInt(leitor.readLine());

            switch (op) {
                case 1:
                    //calcularPreco();
                break;
            
                case 2:
                    
                break;

                case 3:
                    
                break;

                default:
                
                break;
            }


        } while (op != 3);


    } 
    
    public void calcularPreco (float margem){
        pc1.getCodigo(leitor.readLine);


    }
}
