/*Exercício:

-Crie uma classe para representar uma conta corrente, que armazene o numero da conta, 
o nome do cliente e o saldo. Devem existir métodos para depositar uma quantia, 
sacar uma quantia e obter o saldo da conta. Para cada saque deve ser debitada uma taxa de operação equivalente a 0,5% do valor sacado. 

-Em seguida crie uma subclasse de conta corrente para representar uma conta corrente especial. 
Por padrão, clientes com conta especial pagam taxa de saque de apenas 0,3% do valor sacado. 
Além disso, também deve ser possível cobrar uma taxa personalizada de acordo com o relacionamento do cliente com o banco.

-Faça testes com as duas classes e verifique seus resultados.*/

public class contaCorrente {

    private int numeroConta;
    private String nomeCliente;
    private float saldo;
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depos (float valor){
        float depos = saldo + valor;
        saldo = depos;  
    }

    public void saque (float valor){
        if (this.saldo > valor) {
            float saq = (saldo - valor) - (valor * 0.05);
            saldo = saq;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public float obterSaldo (){
        saldo = getSaldo();
        return saldo;
    }




}