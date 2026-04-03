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
        setTitle("ProjetoFinalArtsy - Tela de Cadastro");
        this.getRootPane().setDefaultButton(EnviarCadastro);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FundoGeral.setBackground(new java.awt.Color(218, 146, 66));

        segfundo.setBackground(new java.awt.Color(252, 247, 221));
        segfundo.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(153, 51, 0)));

        jPanel1.setBackground(new java.awt.Color(252, 247, 221));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        nomefield.setBackground(new java.awt.Color(246, 249, 248));
        nomefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomefieldActionPerformed(evt);
            }
        });

        Userlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Userlabel.setText("Usuário:");

        usuariofield.setBackground(new java.awt.Color(246, 249, 248));
        usuariofield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariofieldActionPerformed(evt);
            }
        });

        SenhaLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SenhaLabel1.setText("Email:");

        emailfield.setBackground(new java.awt.Color(246, 249, 248));

        SenhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SenhaLabel.setText("Senha:");

        senhafield.setBackground(new java.awt.Color(246, 249, 248));
        senhafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhafieldActionPerformed(evt);
            }
        });

        LoginTela.setBackground(new java.awt.Color(252, 220, 103));
        LoginTela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginTela.setForeground(new java.awt.Color(83, 31, 9));
        LoginTela.setText("Login");
        LoginTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTelaActionPerformed(evt);
            }
        });

        EnviarCadastro.setBackground(new java.awt.Color(218, 146, 66));
        EnviarCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EnviarCadastro.setForeground(new java.awt.Color(83, 31, 9));
        EnviarCadastro.setText("Salvar Cadastro");
        EnviarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarCadastroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Cadastro pronto? Faça o login!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nomefield, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Userlabel)
                            .addComponent(usuariofield, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenhaLabel1)
                            .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenhaLabel)
                            .addComponent(senhafield, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(EnviarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(LoginTela, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nomefield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuariofield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SenhaLabel1)
                .addGap(18, 18, 18)
                .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SenhaLabel)
                .addGap(18, 18, 18)
                .addComponent(senhafield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EnviarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(LoginTela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout segfundoLayout = new javax.swing.GroupLayout(segfundo);
        segfundo.setLayout(segfundoLayout);
        segfundoLayout.setHorizontalGroup(
            segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segfundoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        segfundoLayout.setVerticalGroup(
            segfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segfundoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FundoGeralLayout = new javax.swing.GroupLayout(FundoGeral);
        FundoGeral.setLayout(FundoGeralLayout);
        FundoGeralLayout.setHorizontalGroup(
            FundoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoGeralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(segfundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        FundoGeralLayout.setVerticalGroup(
            FundoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoGeralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(segfundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FundoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FundoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    
    String nome = nomefield.getText().trim();
    String usuario = usuariofield.getText().trim();
    String email = emailfield.getText().trim();
    String senha = senhafield.getText().trim();

    
    
    //Mínimo 5 caracteres, se nome curto, então colocar sobrenome
    if (nome.length() < 5) {
        JOptionPane.showMessageDialog(null, "Por favor, adicione seu sobrenome: mínimo 5 letras.");
        return; 
    }

    //email validação 
    if (!email.contains("@")|| email.startsWith("@") || email.endsWith("@") || !email.contains(".")){
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

    //vef geral
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
    
    try{
        usuarios.setNome(nome);
        usuarios.setUsuario(usuario);
        usuarios.setEmail(email);
        usuarios.setSenha(senha);
    
        UsuarioDAO dao= new UsuarioDAO();
        dao.cadastro(usuarios);
        JOptionPane.showMessageDialog(null, "Cadastro salvo! Faça o login para acessar a sua conta.");
        
    } catch (Exception e){
    JOptionPane.showMessageDialog(null, "Erro ao salvar cadastro: "+ e.getMessage());
    }
    
   
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomefield;
    private javax.swing.JPanel segfundo;
    private javax.swing.JPasswordField senhafield;
    private javax.swing.JTextField usuariofield;
    // End of variables declaration//GEN-END:variables

  
}
