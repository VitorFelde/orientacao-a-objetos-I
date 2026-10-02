import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atividade {
/*Crie um programa java que:

-Considerando um vetor "vetA" com 4 posições do tipo int, solicite ao usuário um valor ser armazenado em cada posição.

-Considerando um vetor "vetB" com 4 posições do tipo String, solicite ao usuário um valor ser armazenado em cada posição.

-Imprima na tela o conteúdo armazenado em cada posição do vetor "vetB", repetindo-o a quantidade de vezes 

expressa na mesma posição do vetor "vetA".

Ex: Se vetA[0] tiver o valor 4 e vetB[0] tiver a palavra "java", escreve "java" 4 vezes na tela*/
    
public static void main(String[] args) throws Exception {

BufferedReader reader = new BufferedReader( //criamos o objeto de leitura que vamos usar posteriormente top
    new InputStreamReader(System.in));
    
    int tamanhoVetor = 4; //ideia top pra nao usar valor fixo toda vez, boa pratica de programacao
    int vetA[] = new int[tamanhoVetor];
    String vetB[] = new String[tamanhoVetor];

    System.out.println("Digite quatro valores para o vetA: ");
    for (int i = 0; i < tamanhoVetor; i++) {
        vetA[i] = Integer.parseInt(reader.readLine());
        /*o Integer.parseInt pega a string e converte em int
        o reader.readLine serve para leitura, vai ser sempre assim a sintaxe*/
    }
    
    System.out.println("Digite quatro nomes para o vetB: ");
    for (int i = 0; i < tamanhoVetor; i++) {
        vetB[i] = reader.readLine(); 
        /*aqui queremos ler a string mesmo entao na fazemos nada]
        dai armazenamos na posicao i do vetB tudo que o usuario digitar
        por isso tem esse for topzaço*/
    }
    
    for (int i = 0; i < tamanhoVetor; i++) {
        for (int j = 0; j < vetA[i]; j++) {
        /*aqui criamos outro for para poder percorrer o valor 
        que o usuario vai digitar, se fosse fazer so um for
        colocando como limite o tamanhoVetor, ele sempre mostraria
        as palavras 4 vezes, dessa forma, pegamos o numero na posicao i do vetA
        e dizemos ao programa para printar esse numero de vezes*/
        System.out.println (vetB[i]);
            
        }
    }
}

}
