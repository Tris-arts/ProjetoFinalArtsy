/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ArtesBean;
/**
 *
 * @author Beatrice
 */
public class ArtesDAO {

    private int idobras;
    
    public void inserir(ArtesBean obras) {
    try {
        Connection conn = Conexao.conectar();
        // REMOVIDO: idobras da lista de campos e o primeiro '?' do VALUES
        String sql = "INSERT INTO obras (idusuario, artista, titulo, vendedor, descricao, preco) VALUES (?,?,?,?,?,?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        // A contagem agora começa do 1 para o idusuario
        stmt.setInt(1, obras.getIdUsuario());
        stmt.setString(2, obras.getArtista());
        stmt.setString(3, obras.getTitulo());
        stmt.setString(4, obras.getVendedor());
        stmt.setString(5, obras.getDescricao());
        stmt.setDouble(6, obras.getPreco());
        
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }   
      
    public void atualizar(ArtesBean obras){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
                    "UPDATE obras SET idusuario = ?, artista = ?, titulo = ?, vendedor = ?, descricao = ?, preco = ? WHERE idobras = ?"
            );
            
            stmt.setInt(1, obras.getIdUsuario());
            stmt.setString(2, obras.getArtista());
            stmt.setString(3, obras.getTitulo());
            stmt.setString(4, obras.getVendedor());
            stmt.setString(5, obras.getDescricao());
            stmt.setDouble(6, obras.getPreco());
            
            //buscar respectiva obra e vended
            stmt.setInt(7, obras.getIdobra());
            stmt.executeUpdate();
            
           
        stmt.close();
        conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

    public void excluir(int id){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement("DELETE FROM obras WHERE idobras = ?");
            
            stmt.setInt(1, id);
            
            
        stmt.executeUpdate();    
        stmt.close();
        conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public List<ArtesBean> listarPorUsuario(int idLogado) {//listar obras pelo idlogado
        List<ArtesBean> listar = new ArrayList<>();
      
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM obras WHERE idusuario = ?");
        
            stmt.setInt(1, idLogado);
        
        
            ResultSet rs = stmt.executeQuery(); 

            while (rs.next()) {
                ArtesBean obras = new ArtesBean();
                obras.setIdobra(rs.getInt("idobras"));
                obras.setIdUsuario(rs.getInt("idusuario"));
                obras.setArtista(rs.getString("artista"));
                obras.setTitulo(rs.getString("titulo"));
                obras.setVendedor(rs.getString("vendedor"));
                obras.setDescricao(rs.getString("descricao"));
                obras.setPreco(rs.getDouble("preco"));
            
                    listar.add(obras);
            
            }
        
        
        rs.close();
        stmt.close();
        conn.close();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listar;
              
    }
    
    
    public ArtesBean buscarPorId(int idObra) {
    ArtesBean obra = null;
    try {
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM obras WHERE idobras = ?");
        stmt.setInt(1, idObra);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            obra = new ArtesBean();
            obra.setIdobra(rs.getInt("idobras"));
            obra.setIdUsuario(rs.getInt("idusuario"));
            obra.setArtista(rs.getString("artista"));
            obra.setTitulo(rs.getString("titulo"));
            obra.setVendedor(rs.getString("vendedor"));
            obra.setDescricao(rs.getString("descricao"));
            obra.setPreco(rs.getDouble("preco"));
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return obra; 
}
    
    
    
}


