package principal;

import java.util.ArrayList;

public class ConjuntoProdutos {
    private ArrayList<produto> produtos;

    public ConjuntoProdutos() {
        produtos = new ArrayList<>();
    }

    public boolean inserirProduto(produto produto) {
        for (produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                return false; 
            }
        }
        produtos.add(produto);
        return true;
    }

    public boolean removerProduto(int codigo) {
        for (produto p : produtos) {
            if (p.getCodigo() == codigo) {
                produtos.remove(p);
                return true;
            }
        }
        return false; 
    }

    public boolean atualizarProduto(produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == produto.getCodigo()) {
                produtos.set(i, produto);
                return true;
            }
        }
        return false;
    }

    public void mostrarProdutos() {
        for (produto p : produtos) {
            System.out.println("Código: " + p.getCodigo() + ", Nome: " + p.getNome() + ", Valor: " + p.getValor() + ", Fornecedor: " + p.getFornecedor().getNome());
        }
    }

    public void atualizarPrecoPorcentagem(float percentual) {
        for (produto p : produtos) {
            p.atualizarPreco(percentual);
        }
    }
}
