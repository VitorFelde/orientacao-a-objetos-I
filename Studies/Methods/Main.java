public class Main
{
	public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.nome = "He-Man";
        personagem.nivel = 2;
        personagem.forca = 10;
     
        personagem.mostrarStatus();
        personagem.atacar("Hydra", "Fera demais");
        System.out.println(personagem.calcularDano()); //retorno de um método criado anteriormente
        personagem.arma("Martelo");
        
	}
}
