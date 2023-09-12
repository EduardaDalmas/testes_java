// Criando um produto
public class produto {
    private int id;
    private String nome;
    private double preco;

    public produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getId() {
        return id;
    }

}