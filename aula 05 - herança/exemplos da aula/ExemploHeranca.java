public class ExemploHeranca {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Vitor");
        p1.setEmail("vitor@gmail.com");
        p1.setIdade(18);

        Pessoa p2 = new Pessoa("Amanda", "amanda@gmail.com", 18);

        Aluno a1 = new Aluno();
        a1.setNome("Cristiano Ronaldo");
        a1.setEmail("cr7@gmail.com");
        a1.setIdade(41);
        a1.setNota1(8.5f); //usamos o f pra dizer que é do tipo float 
        
        Aluno a2 = new Aluno("Rodinei", "rodinei@gmail.com", 35, 10f, 8f, 6.6f, 9f);

        //System.out.println(a2.getNome()); testezinho bolado


    }
}