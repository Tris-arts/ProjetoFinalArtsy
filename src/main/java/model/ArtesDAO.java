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

    //private int idobras;
    
      public void inserir(ArtesBean obras){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
                    "INSERT INTO obras (idusuario, artista, titulo, vendedor, descricao, estoque, preco) VALUES (?,?,?,?,?,?)"
            );
            
           
            stmt.setInt(2, obras.getIdusuario());
            stmt.setString(3, obras.getArtista());
            stmt.setString(4, obras.getTitulo());
            stmt.setString(5, obras.getVendedor());
            stmt.setString(6, obras.getDescricao());
            stmt.setDouble(7, obras.getPreco());
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
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
            
            stmt.setInt(1,obras.getIdusuario());
            stmt.setString(2, obras.getArtista());
            stmt.setString(3, obras.getTitulo());
            stmt.setString(4, obras.getVendedor());
            stmt.setString(5, obras.getDescricao());
            stmt.setDouble(6, obras.getPreco());
            
            //buscar respectiva obra e vended
            stmt.setInt(7, obras.getIdobra());
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        }

    public void excluir(ArtesBean obras){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
                    "DELETE FROM obras WHERE idobras = ?"
            );
            
            stmt.setInt(1, obras.getIdobra());
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        }
    
    public List<ArtesBean> listar() {//listar obras 
        
        List<ArtesBean> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM obras");
                 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                
                ArtesBean obras = new ArtesBean();
                obras.setIdobra(rs.getInt("idobras"));
                obras.setIdusuario(rs.getInt("idusuario"));
                obras.setArtista(rs.getString("artista"));
                obras.setTitulo(rs.getString("titulo"));
                obras.setVendedor(rs.getString("vendedor"));
                obras.setDescricao(rs.getString("descricao"));
                obras.setPreco(rs.getDouble("preco"));
                
                lista.add(obras);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    
        //public void setIdArte(int idobras) {
        //this.idobras = idobras;
    //}
        
}


