public class Vendedor {
    //overloading of method

    //calculates the comission of a salesperson by the rule: R$ 20,00 + 5% of the value of the sale
    public float calcularComissao(float venda){
        float comissao = (venda * 0.05f) + 20.0f;
        return comissao;
    }
    
    //calculates the comission of a salesperson by the rule: changing percent of the value of the sale
    public float calcularComissao(float venda, float perc){
        float comissao = venda * perc;
        return comissao;
    }
}