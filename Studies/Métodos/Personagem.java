import java.util.Random;
public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus (){ //criação de um método para melhor controle dentro do código principal
        System.out.println("Personagem: " + nome +
        " Nivel: " + nivel +
        " Força: " + forca);
    }
    
    int calcularDano(){
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19); //gerando um dado aleatório
        //fazemos 1 + pq começa em 0, e dado nao tem 0, dai 19 é o limite do dado
        int dano = forca + dado20Faces;
        return dano;
    }
    //metodo que nao retorna e recebe parametro
    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if (habilidade.trim().length() == 0) { //se receber o parametro de habilidade mostra o else
        //usamos trim para caso o usuario digite apenas espaço em branco, seja considerado 0
        //e pegamos o length para pegar o tamanho do que sera escrito
        System.out.println("\n" + nome + " atacou " + alvo  + " e causou: " + forca + " de dano");
        } else {
            System.out.println("\n" + nome + " atacou "
            + alvo + " com o ataque: " + habilidade + 
            "e causou: " + forca + " de dano");
          }
    }
    
    void arma(String objeto){
        System.out.println("A arma utilizada para atacar foi: " + objeto);
    }
    
    
}