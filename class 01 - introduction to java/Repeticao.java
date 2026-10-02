public class Repeticao {
	public static void main (String[] args) {
		int qtde = 5;
		
		//for
		System.out.println ("Repeticao do tipo for");
		for (int i = 0; i < qtde; i++) {
			System.out.println (i);

			}
		
		//while
		System.out.println ("Repeticao do tipo while");
		int cont = 0;
		while (cont < qtde) {
			System.out.println (cont);
			cont++;
			}
		
		//do-while
		System.out.println ("Repeticao do tipo do-while");
		int top = 0;
		do {
			System.out.println (top);
			top++;
		}
		while (top < qtde);
		
		
		}
	
	
	}
