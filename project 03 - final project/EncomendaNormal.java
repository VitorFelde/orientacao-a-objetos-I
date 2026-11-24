public class EncomendaNormal {
    private int nroPedido;
    private String dataPostagem;
    private double peso;
    private double precoKg;
        
    public int getNroPedido() {
        return nroPedido;
    }
    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }
    public String getDataPostagem() {
        return dataPostagem;
    }
    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecoKg() {
        return precoKg;
    }
    public void setPrecoKg(double precoKg) {
        this.precoKg = precoKg;
    }
    public double calcularFrete() {
        return this.peso * this.precoKg;
    }
}
