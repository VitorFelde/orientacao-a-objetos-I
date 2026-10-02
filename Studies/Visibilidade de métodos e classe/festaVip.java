public class festaVip {
//modificador - tipo - nome-atributo 
    private int quantidadeCafe = 30;
    private int quantidadeSalgados = 50;
    
    public void entrar (){
        beberCafe();
        comerSalgado();
        beberCafe();
    }
    
    //modificador privado, so fica visivel nessa classe
    private void beberCafe (){
        quantidadeCafe = quantidadeCafe - 1;
        System.out.println("Bebeu 1 xícara de café");
    }
    private void comerSalgado(){
        quantidadeSalgados = quantidadeSalgados - 1;
        System.out.println("Comeu 3 salgados");
    }
    
}