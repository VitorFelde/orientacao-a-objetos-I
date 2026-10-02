//nome do arquivo sempre tem que ser nomedaclasse.java

public class Exemplo3 { 
	public static void main (String args []) { 
		
		String cliente = "Vitor";
		
		Pet pet1 = new Pet ();//instancia um objeto da classe Pet do Pet.java, e pega as strings de la				
		
		pet1.especie = "cavalo";
		pet1.nome = "Connor McChicken";
		pet1.idade = 15;
		
		System.out.println ("O nome do cliente é " + cliente + ", e possui um pet chamado " + pet1.nome + " que é " + pet1.especie + ", e tem " + pet1.idade + " anos"); 


		Pet pet2 = new Pet ();//instancia um objeto da classe Pet do Pet.java, e pega as strings de la				
		
		pet2.especie = "canguru";
		pet2.nome = "Islam Nurmagomedov";
		pet2.idade = 10;
		
		}
}
