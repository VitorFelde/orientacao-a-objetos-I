//nome do arquivo sempre tem que ser nomedaclasse.java

public class Exemplo4 { 
	public static void main (String args []) { 
		
		String cliente = "Vitor";
		
		Pet pet1 = new Pet ();//instancia um objeto da classe Pet do Pet.java, e pega as strings de la				
		
		pet1.especie = "cavalo";
		pet1.nome = "Connor McGregor ";
		pet1.idade = 15;

		exibirMensagem (cliente, pet1);
	
		Pet pet2 = new Pet ();//instancia um objeto da classe Pet do Pet.java, e pega as strings de la				
		
		pet2.especie = "canguru";
		pet2.nome = "Islam Makachev";
		pet2.idade = 10;
		
		exibirMensagem (cliente, pet2);
		
		}
		
		public static void exibirMensagem (String cliente, Pet p) { //passamos parametros para que o usuario possa passar eles, e escolher quem ele quer que seja exibido
			//nesse caso vai dar pq ja chamamos la em cima
			
			System.out.println ("O nome do cliente é " + cliente + ", e possui um pet chamado " + p.nome + " que é " + p.especie + ", e tem " + p.idade + " anos"); 
		
		}
		
}
