public class ExemploString {
		public static void main (String args[]){
			String str1, str2, str3;
			str1 = "	Um texto qualquer 	.xxxx....	";
			System.out.println ("[" + str1 + "]");
			str1 = str1.trim(); //posso usar o mesmo nome, vai criar uma nova, e dai o garbage collector limpa a antiga que ficara vazia
			System.out.println ("Após trim [" + str1 + "]");
			System.out.println ("Tamanho do str1 = " + str1.length()); //tamanho da string - quantidade de caracteres
			
			//substitui um substring dentro de um String
			str2 = str1.replace ("texto", "teste"); //trocando frase nesse caso
			System.out.println ("str2[" + str2 + "]");
			str2 = str2.replace (".", "$$");
			System.out.println ("str2[" + str2 + "]"); //um ponto vira 2 cifrãos 
			
			//extrair um substring
			str2 = str1.substring(3, 8);//inclusive 3, exclusive 8
			System.out.println ("str2[" + str2 + "]");
			
			//procurar substring
			str2 = "joao.silva@gmail.com";
			int pos = str2.indexOf("@"); //pegando a posição nesse caso do caracter: @
			System.out.println ("@ está na posição - " + pos);
			System.out.println ("Usuário: " + str2.substring(0, pos)); //vai até posição, podia ser o str2.indexOf("@"); também no lugar do pos
			System.out.println ("Domínio: " + str2.substring(pos + 1).toUpperCase()); //pega do @ até o fim nesse caso
	
			//converter de outros tipos para String
			int valor = 5;
			str3 = String.valueOf(valor);
			
			//quebrar um String em vetor
			String valores = "45/61/20/39/47/52";
			String[] arrayValores = valores.split("/");
			System.out.println ("arrayValores[3] = " + arrayValores[3]);
			
			//percorra o arrayValores mostrando todos os valores na tela
			
			for (int i = 0; i < arrayValores.length; i++) {
			
			System.out.println ("Valor [" + i + "]: " + arrayValores[i]);//fiz pra deixar bem frescurento
				
			}
	
	
			
		}

	
}
	
