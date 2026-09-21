public class Turma {
    // Atributos declarados topzao
    private int nroTurma;
    private String nomeCurso;
    private int anoIngresso;
    private int qtdeAlunos;
    private Aluno[] vetAlunos; //isso aqui quer dizer que vamos criar um vetor que entram alunos que vao ter que preencher todos os dados 
    //solicitados no arquivo aluno


    public Turma (){
        this.vetAlunos = new Aluno[40]; 
        /*aqui estamos avisando o java que no vetor Aluno só podem entrar até 40 alunos*/
    }

    public int getNroTurma() {
        return this.nroTurma; 
    }

    public void setNroTurma(int nroTurma) {
        /*criamos uma variavel com nome nroTurma de tipo int para poder passar valor depois na main,
        e por isso usamos o this embaixo para que o codigo saiba que queremos salvar o valor no nroTurma do escopo topzeira*/
        this.nroTurma = nroTurma;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoIngresso() {
        return this.anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeAlunos() {
        return this.qtdeAlunos;
    }

    public Aluno getAluno(int pos){
        return this.vetAlunos[pos]; //criamos pos para poder puxar o aluno pela posição que queremos
    }

    public void setAlunos(Aluno a) {
        if (this.qtdeAlunos < 40) { //enquanto for menor que 40 podemos cadastrar alunos
        this.vetAlunos[qtdeAlunos] = a;
        qtdeAlunos++;
        }
    }
}



