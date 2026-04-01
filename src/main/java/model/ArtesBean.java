
package model;


public class ArtesBean {
    
    private int idobra;
    private int idusuario;
    private String artista;
    private String vendedor;
    private String titulo;
    private String descricao;

    private double preco;
    
    public ArtesBean() {
    }

    public ArtesBean(int idusuario, int idobra, String artista, String vendedor, String titulo, String descricao, double preco) {
        
        this.idobra = idobra;
        this.idusuario = idusuario;
        this.artista = artista;
        this.vendedor = vendedor;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getIdUsuario() {
        return idusuario;
    }

    public void setIdUsuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdobra() {
        return idobra;
    }

    public void setIdobra(int idobra) {
        this.idobra = idobra;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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


}

    
