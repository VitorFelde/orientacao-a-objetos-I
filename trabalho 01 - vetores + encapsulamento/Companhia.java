public class Companhia {
    private String nomeCompanhia;
    private String cnpj;
    private int qtdeVoos;
    private Voos[] vetVoos;
    

    public Companhia() {
        this.vetVoos = new Voos[10]; //mesma coisa do passageiro no voo, estipulamos um limite de armazenamento
    }

    public String getNomeCompanhia() {
        return this.nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdeVoos() {
        return this.qtdeVoos;
    }
    
    public void setQtdeVoos(int qtde1) {
        this.qtdeVoos = qtde1;
    }

    public Voos getVoos(int posicao) {
        return this.vetVoos[posicao];
    }

    public void setVoos(Voos v) {
        if (this.qtdeVoos < 10) {
            this.vetVoos[qtdeVoos] = v;
            qtdeVoos++;
        }
    }
}
