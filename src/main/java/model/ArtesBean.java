
package model;


public class ArtesBean {
    private int id;
    private String nome;
    private String nomevendedor;
    private String descricao;
    private double preco;
    private double estoqueminimo;
    private String estadodevenda;

    public ArtesBean() {
    }

    public ArtesBean(int id, String nome, String nomevendedor, String descricao, double preco, double estoqueminimo, String estadodevenda) {
        this.id = id;
        this.nome = nome;
        this.nomevendedor = nomevendedor;
        this.descricao = descricao;
        this.preco = preco;
        this.estoqueminimo = estoqueminimo;
        this.estadodevenda = estadodevenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomevendedor() {
        return nomevendedor;
    }

    public void setNomevendedor(String nomevendedor) {
        this.nomevendedor = nomevendedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEstoqueminimo() {
        return estoqueminimo;
    }

    public void setEstoqueminimo(double estoqueminimo) {
        this.estoqueminimo = estoqueminimo;
    }

    public String getEstadodevenda() {
        return estadodevenda;
    }

    public void setEstadodevenda(String estadodevenda) {
        this.estadodevenda = estadodevenda;
    }

    

    
}
