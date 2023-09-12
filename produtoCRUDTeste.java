import java.util.ArrayList;
import java.util.List;

public class produtoCRUDTeste {
    private List<produto> produtos = new ArrayList<produto>();

    public void adicionar(produto produto) {
        produtos.add(produto);
    }

    public produto buscarID(int id) {
        for (produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void atualizar(produto produto) {
        int index = produtos.indexOf(produto);
        if (index != -1) {
            produtos.set(index, produto);
        }
    }

}
