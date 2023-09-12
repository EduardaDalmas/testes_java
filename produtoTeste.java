import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class produtoTeste {
    private produtoCRUDTeste produtoCRUDTeste;

    @Before 
    public void setUp() {
        produtoCRUDTeste = new produtoCRUDTeste();
    }

    @Test
    public void testeGeral() {
        // Adicionar um novo produto
        produto produto1 = new produto(1, "calça", 30.0);
        produtoCRUDTeste.adicionar(produto1);

        // Buscar um produto pelo ID
        produto produto2 = produtoCRUDTeste.buscarID(1);
        assertNotNull(produto2);
        assertEquals("calça", produto2.getNome());

        // Atualizar um produto
        produto1.setNome("calça jeans");
        produtoCRUDTeste.atualizar(produto1);
        
        produto produto3 = produtoCRUDTeste.buscarID(1);
        assertEquals("calça jeans", produto3.getNome());

        // Remover um produto
        produtoCRUDTeste.remover(produto3);
        produto produto4 = produtoCRUDTeste.buscarID(1);
        assertNull(produto4);
        
    }

}