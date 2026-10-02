import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.temporal.Temporal;

public class SistemaEscolar {
    BufferedReader reader;
    Escola e1;
    
    public static void main (String[] args) throws Exception{
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        
        se.reader = new BufferedReader(new InputStreamReader(System.in)); //vai lendo fluxo de dados de entrada via teclado

        System.out.println("Nome da escola: ");
        se.e1.setNome(se.reader.readLine());

        System.out.println("Numero de telefone: ");
        se.e1.setFone(se.reader.readLine());

        se.menu();
    }

    private void menu () throws Exception{ //criando o menu
        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println("----------------------------");
            System.out.println("1) Cadastrar nova turma");
            System.out.println("2) Listar turmas");
            System.out.println("3) Buscar por turma");
            System.out.println("4) Sair do programa");
            System.out.println("----------------------------");
            opcao = this.reader.readLine();

            switch (opcao) {
                case "1":
                    cadastrarTurma();
                    break;
                case "2":
                    
                    break;

                case "3":
                    
                    break;
                
                case "4":
                    
                    break;

                default:
                    System.out.println("Opção inválida, selecione: 1, 2, 3 ou 4!");
                    break;
            }


        }
    }

    private void cadastrarTurma()throws Exception{
        Turma t = new Turma();
        System.out.println("Cadastro de turma");
        System.out.println("Nro da Turma:");

        /*String num = reader.readLine();
        int nroInt = Integer.parseInt(num);
        t.setNroTurma(nroInt);*/

        t.setNroTurma(Integer.parseInt(reader.readLine()));

        System.out.println("Nome do curso");
        t.setNomeCurso(reader.readLine());
        System.out.println("Ano de ingresso: ");
        t.setAnoIngresso(Integer.parseInt(reader.readLine()));

        System.out.println("---Alunos---");
        for (int i = 0; i < 40; i++) {
            System.out.println("Nome do aluno: ");
            String nome = reader.readLine();
            if (nome.equals("")){
                break; //se nao digitar nome de aluno nao consegue ser instanciado 
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Matricula: ");
            aluno.setMatricula(reader.readLine());
            System.out.println("Nota 1: ");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 2: ");
            aluno.setNota2(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 3: ");
            aluno.setNota3(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 4: ");
            aluno.setNota4(Float.parseFloat(reader.readLine()));
            t.setAlunos(aluno); //incluindo o aluno cadastrado na turma
        }
        e1.setVetTurmas(t);
    }

}
