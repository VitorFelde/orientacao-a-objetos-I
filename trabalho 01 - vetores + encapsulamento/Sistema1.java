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
                opcao = this.reader.readLine();
            
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
                Voos v1 = new Voos();
            
                int idTop = c1.getQtdeVoos() + 1;
                v1.setIdVoo(idTop);
                
                if (c1.getQtdeVoos() > 10) {
                    System.out.println("\nA quantidade máxima de voos que podem ser cadastrados é 10!\n");
                    return;
                }
            
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
                        System.out.println("\nVôo precisa ter mais de 1 passageiro e menos de 50!\n");
                    }
                }
                
                while (v1.getQtdePassageiros() > 50 || v1.getQtdePassageiros() < 1);
                
                for (int i = 1; i <= v1.getQtdePassageiros(); i++) {
                    Passageiros p1 = new Passageiros(); //dessa forma, toda vez que tiver um novo passageiro pra ser cadastrado, ele cadastra um novo
                    System.out.println("\nDigite o nome do(a) " + i + "º" + " passageiro(a): ");
                    p1.setNome(reader.readLine());
                    
                    System.out.println("\nDigite a idade do(a) " + i + "º" + " passageiro(a): ");
                    p1.setIdade(Integer.parseInt(reader.readLine()));
                    
                    System.out.println("\nDigite o sexo do(a) " + i + "º" + " passageiro(a): ");
                    p1.setSexo(reader.readLine());
                    
                    System.out.println("\nDigite o CPF do(a) " + i + "º" + " passageiro(a): ");
                    p1.setCpf(reader.readLine());
                
                    v1.setPassageiros2(p1);
                    
                }

            
                System.out.println("Vôo cadastrado, o id desse vôo é: " + idTop);
                
                c1.setVoos(v1);
            }
            
            private void listarVoo(){
                for (int i = 0; i < c1.getQtdeVoos(); i++) {
                    Voos v2 = c1.getVoos(i);
                    System.out.println(
                    "\nOrigem do vôo " + (i + 1) + ": " + v2.getOrigem() + 
                    "\nDestino do vôo " + (i + 1) + ": " + v2.getDestino() + 
                    "\nData do vôo " + (i + 1) + ": " + v2.getData() + 
                    "\nHora do vôo " + (i + 1) + ": " + v2.getHora()
                    );
                    for (int j = 0; j < v2.getQtdePassageiros(); j++) {
                        Passageiros p2 = v2.getPassageiros(j);
                        System.out.println(
                        "\nNome do passageiro de número: " + (j + 1) + ": " + p2.getNome() +
                        "\nIdade do passageiro de número: " + (j + 1) + ": " + p2.getIdade() +
                        "\nSexo do passageiro de número: " + (j + 1) + ": " + p2.getSexo() +
                        "\nCpf do passageiro de número: " + (j + 1) + ": " + p2.getCpf()
                        );
                    }
                    System.out.println("\nQuantidade de assentos restantes no avião: "  + (50 - v2.getQtdePassageiros()));
                }
                
            }
            
            private void consultarVoo() throws Exception{
                System.out.println("Digite o id do Vôo desejado: ");
                
                int idVoo = Integer.parseInt(reader.readLine());
                
                boolean encontrou = false;
                
                for (int i = 0; i < c1.getQtdeVoos(); i++) {
                    Voos v3 = c1.getVoos(i);
                    if(v3.getIdVoo() == idVoo){
                        int posVoo = 0;
                        String fera = "Origem: " + v3.getOrigem()
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

                        posVoo++;
                        
                        encontrou = true;
                        break;
                    }
                }
            }
}

