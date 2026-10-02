public class Aluno {
    //aqui é a criação de atributos, são como as váriaveis em C
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    //metodo getter - como criamos os atributos de maneira privada, com o get conseguimos puxar o valor de um atributo depois no arquivo turma
    public String getNome(){ //chamamos para pegar algo de dentro
        return this.nome;
        //this faz referencia a um atributo ou metodod declarado no escopo da classe
    }

    //metodo setter - mesma coisa do get, mas ao inves de pegar um valor com isso podemos atribuir coisas para nossos atributos em outro arquivo
    public void setNome (String n){ //passamos parametro apenas para o set, pois depois vamos pedir ao usuario digitar o nome e precisamos do parametro pra salvar o nome
        this.nome = n; //para salvar no nome que criamos la em cima 
    }

    public String getMatricula (){
        return this.matricula;
    }

    public void setMatricula (String m){
        this.matricula = m;
    }

    public float getNota1 (){
        return this.nota1;
    }   

    public void setNota1 (float n1){
        this.nota1 = n1;
    }

   public float getNota2 (){
        return this.nota2;
    }

    public void setNota2 (float n2){
        this.nota2 = n2;
    }
       public float getNota3 (){
        return this.nota3;
    }

    public void setNota3 (float n3){
        this.nota3 = n3;
    }
       public float getNota4 (){
        return this.nota4;
    }

    public void setNota4 (float n4){
        this.nota4 = n4;
    }

    public float calcularMedia (){
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
    }

}
