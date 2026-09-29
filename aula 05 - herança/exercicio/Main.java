import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private int contC = 0;
    private int contG = 0;
    private int contV = 0;
    private int contCl = 0;
    
    private Caixa c1;
    private Gerente g1;
    private Vendedor v1;
    private Cliente cl1;

    static BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

  /*public static void main(String[] args) {
        try {
            Main programa = new Main();
            programa.menu();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }*/

    public void menu() throws Exception {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n1) Cadastrar novo caixa\n");
            System.out.println("2) Exibir caixa\n");
            System.out.println("3) Cadastrar novo gerente\n");
            System.out.println("4) Exibir gerente\n");
            System.out.println("5) Cadastrar novo vendedor\n");
            System.out.println("6) Exibir vendedor\n");
            System.out.println("7) Cadastrar novo cliente\n");
            System.out.println("8) Exibir cliente\n");
            System.out.println("9) Sair do programa\n");
            System.out.println("Escolha: ");
            opcao = Integer.parseInt(leitor.readLine()); 
        
            switch (opcao) {
                case 1:
                    cadastrarCaixa();
                    break;
                case 2:
                    exibirCaixa();
                    break;
                case 3:
                    cadastrarGerente();
                    break;
                case 4:
                    exibirGerente();
                    break;
                case 5:
                    cadastrarVendedor();
                    break;
                case 6:
                    exibirVendedor();
                    break;
                case 7:
                    cadastrarCliente();
                    break;
                case 8:
                    exibirCliente();
                    break;
                case 9:
                    System.out.println("Saindo do programa fera demais!");
                    break;
            

                }
                if (opcao >= 10) {
                    System.out.println("Opção invalida");
            }
    }
}

    public void cadastrarCaixa() throws Exception {
        this.c1 = new Caixa();
        System.out.println("Digite o nome do(a) caixa: \n");
        this.c1.setNome(leitor.readLine());
        System.out.println("Digite a idade do(a) caixa: \n");
        this.c1.setIdade(Integer.parseInt(leitor.readLine()));
        System.out.println("Digite o usuario do sistema do caixa: \n");
        this.c1.setUser(leitor.readLine());
        System.out.println("Digite a senha do sistema do caixa: \n");
        this.c1.setPassword(leitor.readLine());
        System.out.println("Digite o salario do(a) caixa: \n");
        this.c1.setSalario(Float.parseFloat(leitor.readLine()));
        contC++;
    }

    public void exibirCaixa() {
        if (this.c1 != null) {
            System.out.println("Nome: " + this.c1.getNome());
            System.out.println("Idade: " + this.c1.getIdade());
            System.out.println("Usuário: " + this.c1.getUser());
            System.out.println("Salário: R$ " + this.c1.getSalario());
        } else {
            System.out.println("Nenhum caixa cadastrado.");
        }
    }

    public void cadastrarGerente() throws Exception {
        this.g1 = new Gerente();
        System.out.println("Digite o nome do(a) gerente: \n");
        this.g1.setNome(leitor.readLine());
        System.out.println("Digite a idade do(a) gerente: \n");
        this.g1.setIdade(Integer.parseInt(leitor.readLine()));
        System.out.println("Digite o setor que o gerente supervisiona: \n");
        this.g1.setSetor(leitor.readLine());
        System.out.println("Digite o salario do(a) gerente: \n");
        this.g1.setSalario(Float.parseFloat(leitor.readLine()));
        contG++;
    }

    public void exibirGerente() {
        if (this.g1 != null) {
            System.out.println("Nome: " + this.g1.getNome());
            System.out.println("Idade: " + this.g1.getIdade());
            System.out.println("Setor: " + this.g1.getSetor());
            System.out.println("Salário: R$ " + this.g1.getSalario());
        } else {
            System.out.println("Nenhum gerente cadastrado.");
        }
    }

    public void cadastrarVendedor() throws Exception {
        this.v1 = new Vendedor();
        System.out.println("Digite o nome do vendedor(a): \n");
        this.v1.setNome(leitor.readLine());
        System.out.println("Digite a idade do vendedor(a): \n");
        this.v1.setIdade(Integer.parseInt(leitor.readLine()));
        System.out.println("Digite a meta do vendedor(a): \n");
        this.v1.setMeta(Float.parseFloat(leitor.readLine()));
        System.out.println("Digite a comissão do vendedor(a): \n");
        this.v1.setComissao(Float.parseFloat(leitor.readLine()));
        System.out.println("Digite o salario do vendedor(a): \n");
        this.v1.setSalario(Float.parseFloat(leitor.readLine()));
        contV++;
    }   

    public void exibirVendedor() {
        if (this.v1 != null) {
            System.out.println("Nome: " + this.v1.getNome());
            System.out.println("Idade: " + this.v1.getIdade());
            System.out.println("Meta: " + this.v1.getMeta());
            System.out.println("Comissão: " + this.v1.getComissao() + "%");
            System.out.println("Salário: R$ " + this.v1.getSalario());
        } else {
            System.out.println("Nenhum vendedor cadastrado.");
        }
    }

    public void cadastrarCliente() throws Exception {
        this.cl1 = new Cliente();
        System.out.println("Digite o nome do(a) cliente: \n");
        this.cl1.setNome(leitor.readLine());
        System.out.println("Digite a idade do(a) cliente: \n");
        this.cl1.setIdade(Integer.parseInt(leitor.readLine()));
        System.out.println("Digite o produto que o(a) cliente vai comprar: \n");
        this.cl1.setProduto(leitor.readLine());
        System.out.println("Digite o endereço do(a) cliente: \n");
        this.cl1.setEndereco(leitor.readLine());
        contCl++;
    }

    public void exibirCliente() {
        if (this.cl1 != null) {
            System.out.println("Nome: " + this.cl1.getNome());
            System.out.println("Idade: " + this.cl1.getIdade());
            System.out.println("Endereço: " + this.cl1.getEndereco());
            System.out.println("Produto de interesse: " + this.cl1.getProduto());
        } else {
            System.out.println("Nenhum cliente cadastrado.");
        }
    }
}
