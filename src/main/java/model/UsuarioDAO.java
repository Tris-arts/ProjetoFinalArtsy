/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
 
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
  

    public void cadastro (UsuarioBean usuario){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
           
            stmt = conn.prepareStatement(
                    "INSERT INTO usuarios (nome, usuario, email, senha, role) VALUES (?, ?, ?, ?, ?)"
            );
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            
            stmt.setString(5, "CLIENTE");
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
        
        }
        
        public void excluir(int id) {
            String sql = "DELETE FROM usuarios WHERE idusuario = ?";
    
            try (Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
        
                stmt.setInt(1, id); 
                stmt.executeUpdate();
        
        } catch (SQLException e) {
        throw new RuntimeException("Erro ao excluir usuário: " + e.getMessage());
        }
}
    
    
    public UsuarioBean logar(String usuario, String senha) {
    UsuarioBean user = new UsuarioBean();
    
    try {
        Connection conn = Conexao.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE usuarios.usuario = ? AND usuarios.senha = ?");
        stmt.setString(1, usuario);
        stmt.setString(2, senha);
        
        rs = stmt.executeQuery();
        
        if(rs.next()){
            user.setId(rs.getInt("idusuario"));
            user.setNome(rs.getString("nome"));
            user.setUsuario(rs.getString("usuario"));
            user.setEmail(rs.getString("email"));
            user.setSenha(rs.getString("senha"));
            user.setAdmin(rs.getString("role"));
        }
        
        rs.close();
        stmt.close();
        conn.close();
        
    }catch(SQLException e){
        e.printStackTrace();
    }
    
    return user;
    
    
    }

    
           
}
