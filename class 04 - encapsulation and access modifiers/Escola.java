public class Escola {
    private String nome;
    private String fone;
    private int qtdeTurmas;
    private Turma[] vetTurmas; //puxando a Turma e criando um vetor que tera um limite logo abaixo

    public Escola(){
        this.vetTurmas = new Turma[20]; //deixando reservado um espaço de memória ja para 20 turmas na escola
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone() {
        return fone;
    }

    public int getQtdeTurmas() {
        return qtdeTurmas;
    }

    public Turma getTurma(int pos1){
        return this.vetTurmas[pos1];
    }

    public void setVetTurmas(Turma a) {
        if (this.qtdeTurmas < 20) {
        this.vetTurmas[qtdeTurmas] = a;
        qtdeTurmas++;
        }

    }
}
