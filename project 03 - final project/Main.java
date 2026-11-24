import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        Main objeto = new Main();
        objeto.menu();
    }

    public void menu () throws Exception{
        int op;

        do { 
            System.out.println("1 - Importar arquivo de encomendas");
            System.out.println("2 - Exibir a lista de encomendas Normais");
            System.out.println("3 - Exibir a lista de encomendas Expressas");
            System.out.println("4 - Sair do programa");
            System.out.println("Escolha uma das opções: ");
            op = Integer.parseInt(leitor.readLine());
        

            switch (op) {
                case 1:
                    //importarArquivo();
                break;
                case 2:
                //exibirNormais(); 
                break;
                case 3:
                    //exibirExpressas(); 
                break;
                case 4:
                    System.out.println("Saindo do programa!");
                break;
            
                default:
                    System.out.println("Escolha uma das opções válidas!");
                break;
            }
        } while (op != 4);
    }
}