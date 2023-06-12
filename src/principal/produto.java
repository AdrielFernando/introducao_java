package principal;

public class produto {
    private int codigo;
    private String nome;
    private float valor;
    private fornecedor fornecedor;
    
    public produto(int codigo, String nome, float valor, fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }
    
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
    
    public float getValor() {
        return valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public fornecedor getFornecedor() {
        return fornecedor;
    }
    
    public void setFornecedor(fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public void atualizarPreco(float percentual) {
        float aumento = this.valor * (percentual / 100);
        this.valor += aumento;
    }
}
