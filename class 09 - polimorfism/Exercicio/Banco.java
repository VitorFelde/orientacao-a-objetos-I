public class Banco {

    public static void main(String[] args) {
     
        contaCorrente cc = new contaCorrente();
        double saldo = cc.getSaldo();
        saldo = cc.setSaldo(100);
        
    }
}
