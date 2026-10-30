public class preco_venda {
    
    private int codigo;
    private String nome;
    private String produto;
    private float precoVenda;

    public preco_venda p1 = new preco_venda();
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public float getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }



}
