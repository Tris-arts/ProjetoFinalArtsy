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

    private int idArte;
    
      public void inserir(ArtesBean arte){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
                    "INSERT INTO artes (nome, nomevendedor, descricao, preco, estoqueminimo, estadodevenda) VALUES (?, ? , ?, ?, ?, ?)"
            );
            stmt.setString(1, arte.getNome());
            stmt.setString(1, arte.getNomevendedor());
            stmt.setString(2, arte.getDescricao());
            stmt.setDouble(3, arte.getPreco());
            stmt.setDouble(3, arte.getEstoqueminimo());
            stmt.setString(4, arte.getEstadodevenda());
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        }
      
        public void atualizar(ArtesBean arte){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
                    "UPDATE artes SET nome = ?,descricao = ?,preco = ?,estadodevenda = ? WHERE id = ?"
            );
            stmt.setString(1, arte.getNome());
            stmt.setString(2, arte.getDescricao());
            stmt.setDouble(3, arte.getPreco());
            stmt.setString(4, arte.getEstadodevenda());
            stmt.setInt( 5, arte.getId());
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        }

    public void excluir(ArtesBean arte){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
                    "DELETE FROM artes WHERE id = ?"
            );
            
            stmt.setInt(1, arte.getId());
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        }
    
    public List<ArtesBean> listar() {//listar obras 
        
        List<ArtesBean> lista = new ArrayList<>();

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM artes");
                 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ArtesBean arte = new ArtesBean();
                arte.setId(rs.getInt("id"));
                arte.setNome(rs.getString("nome"));
                arte.setDescricao(rs.getString("descricao"));
                arte.setPreco(rs.getDouble("preco"));
                arte.setEstadodevenda(rs.getString("estadodevenda"));
                lista.add(arte);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    
        public void setIdArte(int id) {
        this.idArte = id;
    }
        
}


