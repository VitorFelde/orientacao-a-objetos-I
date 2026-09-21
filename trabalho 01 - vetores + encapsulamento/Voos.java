public class Voos {
    private String origem;
    private String destino;
    private String data;
    private String hora;
    private int qtdePassageiros;
    private int qtdePassageiros2;
    private int idVoo;
    private Passageiros[] vetPassageiros;



    public Voos() {
        this.vetPassageiros = new Passageiros[50];
    }
    
    public void setPassageiros2(Passageiros p) {
        if (this.qtdePassageiros2 < 50) {
            this.vetPassageiros[qtdePassageiros2] = p;
            qtdePassageiros2++;
        }
    }
    
    public Passageiros getPassageiros(int posicao) {
        return this.vetPassageiros[posicao];
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getQtdePassageiros() {
        return this.qtdePassageiros;
    }
    
    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }
    
    public int getIdVoo (){
        return this.idVoo;
    }
     public void setIdVoo (int id){
        this.idVoo = id;
    }
    
}
