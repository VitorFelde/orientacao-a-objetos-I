public class Decisao {
	public static void main (String[] args) {
	//operadores logicos: && -> AND, || -> OR, ! -> NOT
	//relacionais: == -> igual, != -> diferente, >,<, <=, >=, = -> atribuicao
	//valores numericos se comparam com ==
	//Strings se comparam com "equals"
	
	if (args.length < 2) {
		
		
		System.out.println ("Precisa de 2 parâmetros"); //se o usuario nao passar 2 parametros
		System.exit (0); //sair do system
		
		
	}
	
	int val1 =  Integer.parseInt (args[0]); //converte String para int
	int val2 =  Integer.parseInt (args[1]);
	
	if ((val1 < 5) && (val2 != 2)) {
		System.out.println ("Entrou no if");
	}else if (val2 < 5) {
		System.out.println ("Entrou no else if");	
	}else {
		System.out.println ("Entrou no else");	
	}


		
	String resp = "u";
	switch (resp.toUpperCase()) {
		case "S": 
			System.out.println ("Sim");
			break;
		case "N": 
			System.out.println ("Não");
			break;
		default:
			System.out.println ("Outro valor");
		}
	
	}
	
}
