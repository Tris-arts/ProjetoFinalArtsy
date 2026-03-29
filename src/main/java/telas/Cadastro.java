/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;


import javax.swing.JOptionPane;
import model.UsuarioBean;
import model.UsuarioDAO;

public class Cadastro extends javax.swing.JFrame {
    UsuarioDAO dao = new UsuarioDAO();
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundoGeral = new javax.swing.JPanel();
        segfundo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Userlabel = new javax.swing.JLabel();
        SenhaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomefield = new javax.swing.JTextField();
        usuariofield = new javax.swing.JTextField();
        senhafield = new javax.swing.JPasswordField();
        EnviarCadastro = new javax.swing.JButton();
        LoginTela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FundoGeral.setBackground(new java.awt.Color(218, 146, 66));

        segfundo.setBackground(new java.awt.Color(252, 247, 221));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        Userlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Userlabel.setText("Usuário:");

        SenhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SenhaLabel.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Logo usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cadastro pronto? Faça o login!");

        nomefield.setBackground(new java.awt.Color(246, 249, 248));
        nomefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomefieldActionPerformed(evt);
            }
        });

        usuariofield.setBackground(new java.awt.Color(246, 249, 248));
        usuariofield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariofieldActionPerformed(evt);
            }
        });

        senhafield.setBackground(new java.awt.Color(246, 249, 248));
        senhafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhafieldActionPerformed(evt);
            }
        });

        EnviarCadastro.setBackground(new java.awt.Color(218, 146, 66));
        EnviarCadastro.setText("Salvar Cadastro");
        EnviarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCadastroActionPerformed(evt);
            }
        });

        LoginTela.setBackground(new java.awt.Color(252, 220, 103));
        LoginTela.setText("Login");
        LoginTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout segfundoLayout = new javax.swing.GroupLayout(segfundo);
        segfundo.setLayout(segfundoLayout);
        segfundoLayout.setHorizontalGroup(
            segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segfundoLayout.createSequentialGroup()
                .addGroup(segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(segfundoLayout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addGroup(segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Userlabel)
                                .addComponent(SenhaLabel)
                                .addComponent(usuariofield, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                .addComponent(senhafield))
                            .addGroup(segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(segfundoLayout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel2)
                                .addComponent(nomefield, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(segfundoLayout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addGroup(segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(EnviarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(segfundoLayout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(LoginTela, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(464, Short.MAX_VALUE))
        );
        segfundoLayout.setVerticalGroup(
            segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segfundoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomefield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuariofield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(SenhaLabel)
                .addGap(18, 18, 18)
                .addComponent(senhafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(EnviarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(LoginTela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout FundoGeralLayout = new javax.swing.GroupLayout(FundoGeral);
        FundoGeral.setLayout(FundoGeralLayout);
        FundoGeralLayout.setHorizontalGroup(
            FundoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoGeralLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(segfundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        FundoGeralLayout.setVerticalGroup(
            FundoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoGeralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(segfundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FundoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomefieldActionPerformed

    private void usuariofieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariofieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariofieldActionPerformed

    private void senhafieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhafieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhafieldActionPerformed

    private void EnviarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarCadastroActionPerformed
  
    UsuarioBean usuarios = new UsuarioBean();
      
      
    
    if ((nomefield.getText().isEmpty()) || ( usuariofield.getText().isEmpty()) ||
    (senhafield.getText().isEmpty())) {
        JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
    }
        else {
    
        usuarios.setNome(nomefield.getText());
        usuarios.setUsuario(usuariofield.getText());
        
        char[] Senha = senhafield.getPassword();
    
        UsuarioDAO dao = new UsuarioDAO();
    
    JOptionPane.showMessageDialog(null, "Usuário "+usuariofield.getText()+ "inserido com sucesso! ");
    }

    nomefield.setText("");
    usuariofield.setText("");
    senhafield.setText("");
        
          
    JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
    }//GEN-LAST:event_EnviarCadastroActionPerformed

    private void LoginTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTelaActionPerformed
    new Login().setVisible(true);
    this.setVisible (false);  
    }//GEN-LAST:event_LoginTelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarCadastro;
    private javax.swing.JPanel FundoGeral;
    private javax.swing.JButton LoginTela;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JLabel Userlabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomefield;
    private javax.swing.JPanel segfundo;
    private javax.swing.JPasswordField senhafield;
    private javax.swing.JTextField usuariofield;
    // End of variables declaration//GEN-END:variables

  
}
