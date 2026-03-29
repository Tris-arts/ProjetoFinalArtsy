/*
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template */
 
package telas;

//https://www.arquivodecodigos.com.br/dicas/4427-java-exercAcios-resolvidos-de-java-como-validar-uma-senha-em-java-escreva-um-programa-java-para-validar-uma-senha-informada-pelo-usuArio.html

import javax.swing.JOptionPane;
import model.UsuarioBean;
import model.UsuarioDAO;

public class Cadastro extends javax.swing.JFrame {
   
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        FundoGeral = new javax.swing.JPanel();
        segfundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomefield = new javax.swing.JTextField();
        Userlabel = new javax.swing.JLabel();
        usuariofield = new javax.swing.JTextField();
        SenhaLabel1 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        SenhaLabel = new javax.swing.JLabel();
        senhafield = new javax.swing.JPasswordField();
        LoginTela = new javax.swing.JButton();
        EnviarCadastro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FundoGeral.setBackground(new java.awt.Color(218, 146, 66));
        FundoGeral.setLayout(new java.awt.GridBagLayout());

        segfundo.setBackground(new java.awt.Color(252, 247, 221));
        segfundo.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(252, 247, 221));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 113, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        nomefield.setBackground(new java.awt.Color(246, 249, 248));
        nomefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomefieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 113, 0, 93);
        jPanel1.add(nomefield, gridBagConstraints);

        Userlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Userlabel.setText("Usuário:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 113, 0, 0);
        jPanel1.add(Userlabel, gridBagConstraints);

        usuariofield.setBackground(new java.awt.Color(246, 249, 248));
        usuariofield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariofieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 113, 0, 93);
        jPanel1.add(usuariofield, gridBagConstraints);

        SenhaLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SenhaLabel1.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 113, 0, 0);
        jPanel1.add(SenhaLabel1, gridBagConstraints);

        emailfield.setBackground(new java.awt.Color(246, 249, 248));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 113, 0, 93);
        jPanel1.add(emailfield, gridBagConstraints);

        SenhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SenhaLabel.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 113, 0, 0);
        jPanel1.add(SenhaLabel, gridBagConstraints);

        senhafield.setBackground(new java.awt.Color(246, 249, 248));
        senhafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhafieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 113, 0, 93);
        jPanel1.add(senhafield, gridBagConstraints);

        LoginTela.setBackground(new java.awt.Color(252, 220, 103));
        LoginTela.setText("Login");
        LoginTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTelaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 34, 6, 0);
        jPanel1.add(LoginTela, gridBagConstraints);

        EnviarCadastro.setBackground(new java.awt.Color(218, 146, 66));
        EnviarCadastro.setText("Salvar Cadastro");
        EnviarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCadastroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.ipady = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 19, 0, 0);
        jPanel1.add(EnviarCadastro, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cadastro pronto? Faça o login!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 19, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        segfundo.add(jPanel1, new java.awt.GridBagConstraints());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Logo usuario");
        segfundo.add(jLabel3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 458;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 71, 48, 68);
        FundoGeral.add(segfundo, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(FundoGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 1588, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
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
    
    String nome = nomefield.getText().trim();
    String usuario = usuariofield.getText().trim();
    String email = emailfield.getText().trim();
    String senha = senhafield.getText().trim();

    //Mínimo 5 caracteres, se nome curto. então colocar sobrenome
    if (nome.length() < 5) {
        JOptionPane.showMessageDialog(null, "Por favor, adicione seu sobrenome: mínimo 5 letras.");
        return; 
    }

    //email validação 
    if (!email.contains("@")|| email.startsWith("@") || email.endsWith("@") ){
        JOptionPane.showMessageDialog(null, "Campo contato(email) inválido! Certifique-se de usar '@' e um domínio (ex: .com ou .com.br).");
        return;
    }
    
    
    //pelo menos 4 numeros em campo usuário
    int contadorNumeros = 0;
    for (int i = 0; i < usuario.length(); i++) {
        if (Character.isDigit(usuario.charAt(i))) {
            contadorNumeros++;
        }
    }
    if (contadorNumeros < 4) {
        JOptionPane.showMessageDialog(null, "O campo Usuário deve conter pelo menos 4 números.");
        return;
    }

    boolean tamanho = (senha.length() >= 8);
    boolean minusculo = false;
    boolean maiusculo = false; 
    boolean digito = false;

    for (int i = 0; i < senha.length(); i++) {
        char c = senha.charAt(i);
        if (Character.isDigit(c)) digito = true;
        else if (Character.isUpperCase(c)) maiusculo = true;
        else if (Character.isLowerCase(c)) minusculo = true;
    }

    if (!(minusculo && maiusculo && tamanho && digito)) {
        JOptionPane.showMessageDialog(null, "Senha fraca! Informe 8 caracteres, letras: maiúscula e  minúscula e números.");
        return;
    }

    UsuarioBean usuarios = new UsuarioBean();
    usuarios.setNome(nome);
    usuarios.setUsuario(usuario);
    usuarios.setSenha(senha);
 
    System.out.println("Cadastro salvo! Faça o login para acessar a sua conta.");
    
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
    private javax.swing.JLabel SenhaLabel1;
    private javax.swing.JLabel Userlabel;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomefield;
    private javax.swing.JPanel segfundo;
    private javax.swing.JPasswordField senhafield;
    private javax.swing.JTextField usuariofield;
    // End of variables declaration//GEN-END:variables

  
}
