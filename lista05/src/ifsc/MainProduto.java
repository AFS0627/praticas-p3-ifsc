package ifsc;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setNome("Fone de ouvido");
        produto1.setCodBarras(1234567890L);
        produto1.setPreco(69.99);
        produto1.setFornecedor("Americanas");

        Produto produto2 = new Produto();
        produto2.setNome("Notebook Dell i5");
        produto2.setCodBarras(9876543210L);
        produto2.setPreco(3999.99);
        produto2.setFornecedor("Amazon");

        Produto produto3 = new Produto();
        produto3.setNome("Mouse sem fio");
        produto3.setCodBarras(5432109876L);
        produto3.setPreco(8.98);
        produto3.setFornecedor("Kaboom");

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        for (Produto produto:listaProdutos){
            System.out.println("Nome: "+produto.getNome());
            System.out.println("Código de Barras: "+produto.getCodBarras());
            System.out.println("Preço: R$"+produto.getPreco());
            System.out.println("Fornecedor: "+produto.getFornecedor()+"\n");
        }
    }
}
