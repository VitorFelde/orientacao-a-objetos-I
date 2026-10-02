public class Main {

	public static void main(String[] args) throws Exception {
        //iphone 12, tela de 6.1, 256
        //f8, tela de 6.0, 512
        //s24, tela de 5.8, 128
        //objeto do tipo Celular, com o nome celularA
        Celular celularA = new Celular(); 
        //aqui instanciamos um novo celular com o nome de celularA, e passamos valores
        //para o novo celular
        //que sera salvo nos atributos do Celular.java
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";
        
        Celular celularB = new Celular(); 
        celularB.nome = "Poco F8 Pro";
        celularB.tamanhoTela = 6.0f;
        celularB.espacoArmazenamento = 512;
        celularB.sistemaOperacional = "Android";
        
        Celular celularC = new Celular(); 
        celularC.nome = "Samsung S24";
        celularC.tamanhoTela = 5.8f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";
        
        System.out.println("Celular: " + celularA.nome + " com tela de: " +
        celularA.tamanhoTela + " com armazenamento de: " + celularA.espacoArmazenamento +
        " e sistema: " + celularA.sistemaOperacional); 
        
        System.out.println("Celular: " + celularB.nome + " com tela de: " +
        celularB.tamanhoTela + " com armazenamento de: " + celularB.espacoArmazenamento +
        " e sistema: " + celularB.sistemaOperacional); 
        
        System.out.println("Celular: " + celularC.nome + " com tela de: " +
        celularC.tamanhoTela + " com armazenamento de: " + celularC.espacoArmazenamento +
        " e sistema: " + celularC.sistemaOperacional); 
	}
}
