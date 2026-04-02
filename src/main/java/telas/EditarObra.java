/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;
import model.ArtesBean;
import model.ArtesDAO;
import model.Sessao;

/**
 *
 * @author Aluno
 */
public class EditarObra extends javax.swing.JFrame {
    ArtesDAO dao = new ArtesDAO();
  
    private int idArte = -1;

    public EditarObra() {
        initComponents();
        this.getRootPane().setDefaultButton(SalvarEdicoes);
    }
    
    private void limparEdicao() {
        //idobra.setText(""); 
        //idvendedor.setText(""); 
        
        artista.setText("");
        titulo.setText("");

        nomevendedor.setText(""); 
        
        descricao.setText("");
        preco.setText("");
        idArte = -1;
    }
    
     public void mostrarObraEdicao(int idArte) {
         
        ArtesDAO dao = new ArtesDAO();
        ArtesBean artes = dao.buscarPorId(idArte); 

    if (artes != null) {
       
        this.idArte = idArte;
        
        //idobra.setText(String.valueOf(artes.getIdobra())); 
        //idvendedor.setText(String.valueOf(artes.getIdUsuario())); 
        
        artista.setText(artes.getArtista());
        titulo.setText(artes.getTitulo());

        nomevendedor.setText(artes.getVendedor()); 
        
        descricao.setText(artes.getDescricao());
        preco.setText(String.valueOf(artes.getPreco()));
        this.setVisible(true);
    }
    
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ArteImagem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        SalvarEdicoes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        artista = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Voltarbotao = new javax.swing.JButton();
        txtvende = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        txtpreco1 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        txtvende1 = new javax.swing.JLabel();
        nomevendedor = new javax.swing.JTextField();
        txtid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 247, 221));

        jPanel2.setBackground(new java.awt.Color(218, 146, 66));

        ArteImagem.setBackground(new java.awt.Color(252, 247, 221));

        jLabel1.setText("Obra");

        javax.swing.GroupLayout ArteImagemLayout = new javax.swing.GroupLayout(ArteImagem);
        ArteImagem.setLayout(ArteImagemLayout);
        ArteImagemLayout.setHorizontalGroup(
            ArteImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArteImagemLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(213, 213, 213))
        );
        ArteImagemLayout.setVerticalGroup(
            ArteImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArteImagemLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(ArteImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(ArteImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Descrição da obra:");

        descricao.setBackground(new java.awt.Color(246, 249, 248));
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        SalvarEdicoes.setBackground(new java.awt.Color(255, 178, 93));
        SalvarEdicoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SalvarEdicoes.setForeground(new java.awt.Color(83, 31, 9));
        SalvarEdicoes.setText("Salvar ");
        SalvarEdicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarEdicoesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        artista.setBackground(new java.awt.Color(246, 249, 248));
        artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Artista:");

        Voltarbotao.setBackground(new java.awt.Color(252, 220, 103));
        Voltarbotao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Voltarbotao.setForeground(new java.awt.Color(83, 31, 9));
        Voltarbotao.setText("Voltar ");
        Voltarbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarbotaoActionPerformed(evt);
            }
        });

        txtvende.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtvende.setText("Título:");

        titulo.setBackground(new java.awt.Color(246, 249, 248));
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        txtpreco1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpreco1.setText("Preço:");

        preco.setBackground(new java.awt.Color(246, 249, 248));
        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });

        txtvende1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtvende1.setText("Nome do vendedor:");

        nomevendedor.setBackground(new java.awt.Color(246, 249, 248));
        nomevendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomevendedorActionPerformed(evt);
            }
        });

        txtid.setBackground(new java.awt.Color(242, 232, 208));
        txtid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtid.setForeground(new java.awt.Color(83, 31, 9));
        txtid.setText("Edição de Peça de Arte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Voltarbotao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(304, 304, 304)
                                .addComponent(SalvarEdicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(artista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvende, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvende1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomevendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreco1)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtid)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtvende)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtvende1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpreco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Voltarbotao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalvarEdicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarbotaoActionPerformed
        new Inicio().setVisible(true);
        this.setVisible (false);
        
        
    }//GEN-LAST:event_VoltarbotaoActionPerformed

    private void SalvarEdicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarEdicoesActionPerformed
    
    //String IdObra = idobra.getText().trim();
    String artistaObra = artista.getText().trim();
    String tituloObra = titulo.getText().trim();
    String vendedorObra = nomevendedor.getText().trim();
    String desc = descricao.getText().trim();

   
    if (artistaObra.isEmpty() || tituloObra.isEmpty() || preco.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!");
    return;
}

    ArtesBean obra = new ArtesBean();

    
    obra.setIdUsuario(Sessao.getUsuario().getId()); 

    obra.setArtista(artistaObra);
    obra.setTitulo(tituloObra);
    obra.setVendedor(vendedorObra);
    obra.setDescricao(desc);
   obra.setPreco(Double.parseDouble(preco.getText()));

    if (this.idArte == -1) {
    
        dao.inserir(obra);
        JOptionPane.showMessageDialog(this, "Obra cadastrada!");
    } else {
    
        obra.setIdobra(this.idArte); 
        dao.atualizar(obra);
        JOptionPane.showMessageDialog(this, "Obra atualizada!");
    }

    this.dispose();

    new Inicio(Sessao.getUsuario()).setVisible(true);

    
    limparEdicao();
    this.dispose();
    
       
    }//GEN-LAST:event_SalvarEdicoesActionPerformed

    private void artistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistaActionPerformed
        
    }//GEN-LAST:event_artistaActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        
    }//GEN-LAST:event_descricaoActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        
    }//GEN-LAST:event_tituloActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void nomevendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomevendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomevendedorActionPerformed

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
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarObra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArteImagem;
    private javax.swing.JButton SalvarEdicoes;
    private javax.swing.JButton Voltarbotao;
    private javax.swing.JTextField artista;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomevendedor;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField titulo;
    private javax.swing.JLabel txtid;
    private javax.swing.JLabel txtpreco1;
    private javax.swing.JLabel txtvende;
    private javax.swing.JLabel txtvende1;
    // End of variables declaration//GEN-END:variables

   

 
}
