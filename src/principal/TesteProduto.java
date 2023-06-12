package principal;

public class TesteProduto {
    public static void main(String[] args) {
        
        fornecedor fornecedor1 = new fornecedor("1234321", "Telefone do Fornecedor 1", "Zé Maria");
        fornecedor fornecedor2 = new fornecedor("543212345", "Telefone do Fornecedor 2", "Cláudio");
        
        produto produto1 = new produto(1, "TV LCD", 3500.00f, fornecedor1);
        produto produto2 = new produto(2, "Notebook", 2000.00f, fornecedor2);
        produto produto3 = new produto(3, "Impressora", 232.00f, fornecedor2);
        
        produto1.atualizarPreco(10.0f);
        
        System.out.println("Produto 1:");
        System.out.println("Código: " + produto1.getCodigo());
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Valor: R$" + produto1.getValor());
        System.out.println("Fornecedor: " + produto1.getFornecedor().getNome());
        System.out.println();
        
        System.out.println("Produto 2:");
        System.out.println("Código: " + produto2.getCodigo());
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Valor: R$" + produto2.getValor());
        System.out.println("Fornecedor: " + produto2.getFornecedor().getNome());
        System.out.println();
        
        System.out.println("Produto 3:");
        System.out.println("Código: " + produto3.getCodigo());
        System.out.println("Nome: " + produto3.getNome());
        System.out.println("Valor: R$" + produto3.getValor());
        System.out.println("Fornecedor: " + produto3.getFornecedor().getNome());
    }
}

