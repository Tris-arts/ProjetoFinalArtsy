/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

// mostrar pedidos apenas do proprio user

public class Sessao {
    //private static int id;
    //private static String nome;
    
    private static UsuarioBean usuarioLogado;

    public Sessao() {
    }

    public static void setUsuario(UsuarioBean usuario) {
        usuarioLogado = usuario;
    }

    public static UsuarioBean getUsuario() {
        return usuarioLogado;
    }
}
