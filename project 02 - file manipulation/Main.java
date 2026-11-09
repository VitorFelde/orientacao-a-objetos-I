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
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        
        public static void main(String[] args) throws Exception{
            Main objeto = new Main();       
            objeto.menu();
            
        } 
        
        public void lerArquivos(int margem) throws Exception {
            BufferedReader ler = new BufferedReader(new FileReader("preco_custo.csv"));
            BufferedWriter escrever = new BufferedWriter(new FileWriter("preco_venda.csv"));
            
            escrever.write("codigo;nome_produto;preco_venda");

            preco_custo pc1 = new preco_custo();
            ler.readLine();
            String linhaLeitura;

            while ((linhaLeitura = ler.readLine()) != null) {
                String[] campos = linhaLeitura.split(";");
                
                
                pc1.setCodigo(Integer.parseInt(campos[0]));
                pc1.setEstoque(Integer.parseInt(campos[1]));
                pc1.setProduto(campos[2]);
                pc1.setPrecoCusto(Float.parseFloat(campos[3].replace(",", ".")));           
                pc1.setCategoria(campos[4]);
                float precoVenda = pc1.getPrecoCusto() * (1 + (margem / 100f));
                escrever.newLine();
                escrever.write(pc1.getCodigo() + ";" + pc1.getProduto() + ";" + precoVenda);
            }
            
            escrever.close();
            ler.close();
        
        }

        public void menu () throws Exception{
        
        int op;
        int margem;

        do {

            System.out.println("Escolha uma das opções: ");
            System.out.println("1) Cadastrar margem de lucro");
            System.out.println("2) Sair");
            System.out.println("Escolha: ");
            op = Integer.parseInt(leitor.readLine());

            switch (op) {
                case 1:
                    System.out.println("Digite a margem: ");
                    margem = Integer.parseInt(leitor.readLine());
                    lerArquivos(margem);
                break;
            
                case 2:
                    System.out.println("Saindo do programa.");
                break;

                default:
                    System.out.println("Digite uma das opções válidas");
                break;
            }


        } while (op != 2);
    }
}    