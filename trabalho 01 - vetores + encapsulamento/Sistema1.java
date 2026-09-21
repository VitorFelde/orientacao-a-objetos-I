import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sistema1 {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Companhia c1 = new Companhia();
        
        public void menu () throws Exception{
        String opcao = "";
            while (!opcao.equals("4")) {
                System.out.println("\n1) Cadastrar novo vôo (máximo 10 vôos)");
                System.out.println("2) Listar todos os vôos");
                System.out.println("3) Consultar vôo");
                System.out.println("4) Sair do programa");
                opcao = this.reader.readLine(); //usamos o this para poder puxar a variavel readLine com o nome reader que fiz la em cima aqui
                //ou seja, está sendo puxada a variavel do escopo
            
                switch (opcao) {
                    case "1":
                        cadastrarVoo();
                    break;
                    
                    case "2":
                        listarVoo();
                    break;
                    
                    case "3":
                        consultarVoo();
                    break;
                    
                    case "4":
                        System.out.println("Saindo do programa");
                    break;
                }
            }
        }
        
          private void cadastrarVoo() throws Exception{
              
                System.out.println("Digite o nome da Companhia: ");
                c1.setNomeCompanhia(reader.readLine());
                    
                System.out.println("Digite o CNPJ da Companhia: ");
                c1.setCnpj(reader.readLine());

                System.out.println("Digite a quantidade de vôos da companhia (Máximo de 10 por companhia): ");
                int qtdeDesejada = Integer.parseInt(reader.readLine()); //criamos essa variavel para poder controlar a qtde de voos de cada comp

                if (qtdeDesejada < 1 || (c1.getQtdeVoos() + qtdeDesejada) > 10) {
                    System.out.println("\nQuantidade inválida! A companhia pode ter no máximo 10 voos no total.\n");
                    return;
                }

                for (int v = 0; v < qtdeDesejada; v++) { //criamos esse for para que o usuario consiga cadastrar apenas o numero de voos que colocou por companhia
                    Voos v1 = new Voos();
                    
                    int idTop = c1.getQtdeVoos() + 1;
                    v1.setIdVoo(idTop); //aqui apos fazer o "calculo" para o id, atribuimos ele para o v1 na posição que o usuario estiver
                    
                    System.out.println("\nCadastrando Voo " + (v + 1) + " de " + qtdeDesejada + " da companhia: " + c1.getNomeCompanhia() + "\n");
                    
                    System.out.println("Digite a origem do vôo: ");
                    v1.setOrigem(reader.readLine());
                    
                    System.out.println("Digite o destino do vôo: ");
                    v1.setDestino(reader.readLine());
                    
                    System.out.println("Digite a data do vôo: ");
                    v1.setData(reader.readLine());
                    
                    System.out.println("Digite a hora do vôo: ");
                    v1.setHora(reader.readLine());
                    
                    do {
                        System.out.println("Digite a quantidade de passageiros desse voo (Máximo de 50 passageiros por vôo): ");
                        v1.setQtdePassageiros(Integer.parseInt(reader.readLine()));
                        
                        if (v1.getQtdePassageiros() > 50 || v1.getQtdePassageiros() < 1) {
                            System.out.println("\nVôo precisa ter mais de 0 passageiros e menos de 51!\n");
                        }
                    }
                    while (v1.getQtdePassageiros() > 50 || v1.getQtdePassageiros() < 1);
                    
                    for (int i = 1; i <= v1.getQtdePassageiros(); i++) {
                        Passageiros p1 = new Passageiros(); 
                        System.out.println("\nDigite o nome do(a) " + i + "º" + " passageiro(a): ");
                        p1.setNome(reader.readLine());
                        
                        System.out.println("\nDigite a idade do(a) " + i + "º" + " passageiro(a): ");
                        p1.setIdade(Integer.parseInt(reader.readLine()));
                        
                        System.out.println("\nDigite o sexo do(a) " + i + "º" + " passageiro(a): ");
                        p1.setSexo(reader.readLine());
                        
                        System.out.println("\nDigite o CPF do(a) " + i + "º" + " passageiro(a): ");
                        p1.setCpf(reader.readLine());
                    
                        v1.setPassageiros2(p1);//salvando os passageiros p1 no voos que tem a classe Passageiros2
                    }

                    System.out.println("Vôo cadastrado, o id desse vôo é: " + idTop);
                    
                    c1.setVoos(v1); //salvando todo voo cadastrado (v1) na companhia, que tem a classe Voos
                }
            }
            
            private void listarVoo(){
                for (int i = 0; i < c1.getQtdeVoos(); i++) {
                    Voos v2 = c1.getVoos(i);
                    System.out.println(
                    "Companhia: " + c1.getNomeCompanhia() +
                    "\nOrigem do vôo " + (i + 1) + ": " + v2.getOrigem() +  //acredito que poderia ter feito igual no outro, e inicializar com 1, ao inves de fazer essa soma 
                    //mas decidi fazer assim para dar uma variada, e ficar fera demais
                    "\nDestino do vôo " + (i + 1) + ": " + v2.getDestino() + 
                    "\nData do vôo " + (i + 1) + ": " + v2.getData() + 
                    "\nHora do vôo " + (i + 1) + ": " + v2.getHora()
                    );
                    for (int j = 0; j < v2.getQtdePassageiros(); j++) { //fazemos esses fors alinhados pq a posicao do passageira sera independente do voo 
                    //ou seja, pode ser o primeiro voo, mas dai o terceiro passageiro, por isso precisamos de dois fors alinhados 
                        Passageiros p2 = v2.getPassageiros(j);
                        System.out.println(
                        "\nNome do passageiro de número: " + (j + 1) + ": " + p2.getNome() +
                        "\nIdade do passageiro de número: " + (j + 1) + ": " + p2.getIdade() +
                        "\nSexo do passageiro de número: " + (j + 1) + ": " + p2.getSexo() +
                        "\nCpf do passageiro de número: " + (j + 1) + ": " + p2.getCpf()
                        );
                    }
                    System.out.println("\nQuantidade de assentos restantes no avião: "  + (50 - v2.getQtdePassageiros())); //como todo voo pode ter até 50 passageiros, usei um valor fixo para ser mais facil
                }
                
            }
            
            private void consultarVoo() throws Exception{
                System.out.println("Digite o id do Vôo desejado: ");
                
                int idVoo = Integer.parseInt(reader.readLine());
                
                boolean encontrou = false; //criacao pra poder dizer se encontrou o id ou nao
                
                for (int i = 0; i < c1.getQtdeVoos(); i++) {
                    Voos v3 = c1.getVoos(i); //criamos uma variavel do tipo voos, para poder pegar os voos cadastrados, suas infos e procurar o que o usuario deseja
                    if(v3.getIdVoo() == idVoo){ //codigo abaixo vai ser executado se o idvoo que o usuario digitou for igual o idvoo que estamos procurando
                        int posVoo = 0;
                        String fera = //fiz dessa forma, igual tava no exemplo para dar uma variada tambme
                            "Companhia: " + c1.getNomeCompanhia() +
                            " - Origem: " + v3.getOrigem()
                            + " - Destino: " + v3.getDestino()
                            + " - Data: " + v3.getData() +
                            " - Hora: " + v3.getHora();
                            System.out.println(fera);
                            
                            System.out.println("\nPassageiros deste voo:");
                            for (int j = 0; j < v3.getQtdePassageiros(); j++) {
                            Passageiros p3 = v3.getPassageiros(j);
                            System.out.println(
                            "\nNome do passageiro de número: " + (j + 1) + ": " + p3.getNome() +
                            "\nIdade do passageiro de número: " + (j + 1) + ": " + p3.getIdade() +
                            "\nSexo do passageiro de número: " + (j + 1) + ": " + p3.getSexo() +
                            "\nCpf do passageiro de número: " + (j + 1) + ": " + p3.getCpf()
                            );
                            }
                        System.out.println("\nQuantidade de assentos restantes no avião: "  + (50 - v3.getQtdePassageiros()));

                        posVoo++; //serve mais para ajudar no rastreamento e persistencia na procura do id, pq ela é reinicializada toda vez
                        
                        encontrou = true; //se encontrar diz isso
                        break;
                    }
                }
            }
}
