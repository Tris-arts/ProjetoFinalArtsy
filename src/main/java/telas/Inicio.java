
package telas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UsuarioBean;
import model.ArtesBean;
import model.ArtesDAO;
import model.Sessao;

/**
 *
 * @author Aluno
 */

public class Inicio extends javax.swing.JFrame {
        DefaultTableModel model;
        ArtesDAO dao = new ArtesDAO();
        
        private UsuarioBean usuarioLogado;
         
  
    public Inicio() {
        setTitle("ProjetoFinalArtsy - Tabela de Listagem.");
        initComponents();

    }
    
    public Inicio(UsuarioBean usuario){
        initComponents();
      
        
        this.usuarioLogado = usuario;
        setTitle("Gerenciador de Obras - Bem vindo");
        preencherTabela();
        
    }
    
    public void preencherTabela(){
        DefaultTableModel model = (DefaultTableModel) tabelaObras.getModel();
    
        tabelaObras.getModel();
        model.setRowCount(0);
    
        ArtesDAO dao = new ArtesDAO();
    
    
    int idLogado = Sessao.getUsuario().getId();
    
    for (ArtesBean obra : dao.listarPorUsuario(idLogado)){
        model.addRow(new Object[]{
            
        obra.getIdobra(),
        obra.getIdUsuario(),
        obra.getArtista(),
        obra.getTitulo(),
        obra.getVendedor(),
        obra.getDescricao(),
        obra.getPreco(),
       });
    }

    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        incio = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaObras = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();
        excluirObra = new javax.swing.JButton();
        editarPedido = new javax.swing.JButton();
        criarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(218, 146, 66));

        incio.setBackground(new java.awt.Color(252, 247, 221));

        tabelaObras.setBackground(new java.awt.Color(246, 249, 248));
        tabelaObras.setForeground(new java.awt.Color(64, 3, 3));
        tabelaObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idObra", "idUsuario", "Artista", "Titulo", "Descrição", "Vendedor", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaObras.setGridColor(new java.awt.Color(255, 153, 51));
        tabelaObras.setSelectionBackground(new java.awt.Color(248, 236, 184));
        tabelaObras.setSelectionForeground(new java.awt.Color(136, 23, 23));
        tabelaObras.getTableHeader().setReorderingAllowed(false);
        tabelaObras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaObrasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaObras);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 31, 9));
        jLabel2.setText("Listagem de obras:");

        Sair.setBackground(new java.awt.Color(246, 249, 248));
        Sair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sair.setForeground(new java.awt.Color(83, 31, 9));
        Sair.setText("Deslogar");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        excluirObra.setBackground(new java.awt.Color(220, 136, 89));
        excluirObra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        excluirObra.setForeground(new java.awt.Color(83, 31, 9));
        excluirObra.setText("Excluir Pedido");
        excluirObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirObraActionPerformed(evt);
            }
        });

        editarPedido.setBackground(new java.awt.Color(242, 220, 177));
        editarPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarPedido.setForeground(new java.awt.Color(83, 31, 9));
        editarPedido.setText("Editar Obra");
        editarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPedidoActionPerformed(evt);
            }
        });

        criarPedido.setBackground(new java.awt.Color(238, 171, 98));
        criarPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        criarPedido.setForeground(new java.awt.Color(83, 31, 9));
        criarPedido.setText("Criar Obra");
        criarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout incioLayout = new javax.swing.GroupLayout(incio);
        incio.setLayout(incioLayout);
        incioLayout.setHorizontalGroup(
            incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incioLayout.createSequentialGroup()
                .addGroup(incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(incioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(incioLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(incioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307)
                        .addComponent(excluirObra, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(criarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        incioLayout.setVerticalGroup(
            incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirObra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(incio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(incio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Executar o logout da conta?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_SairActionPerformed

    private void tabelaObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaObrasMouseClicked
    if (evt.getClickCount() == 2) { 
        int selectedRow = tabelaObras.getSelectedRow();
        
        if (selectedRow != -1) {
            
            int obraId = (int) tabelaObras.getValueAt(selectedRow, 0);
            EditarObra editar = new EditarObra();
            editar.mostrarObraEdicao(obraId); 
            
            editar.setVisible(true);
            this.dispose(); // Fecha a tela atual
        }
    }

    }//GEN-LAST:event_tabelaObrasMouseClicked

    private void excluirObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirObraActionPerformed
       
        int selectedRow = tabelaObras.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma obra para deletar", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
        int obraId = (int) tabelaObras.getValueAt(selectedRow, 0);
        int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente deletar esta obra?", "Confirmação", JOptionPane.YES_NO_OPTION);
    
        if (confirm == JOptionPane.YES_OPTION) {
            ArtesDAO dao = new ArtesDAO(); 
            dao.excluir(obraId);       
            JOptionPane.showMessageDialog(this, "Obra deletada com sucesso!");
            preencherTabela();              
        }
        
        
    }//GEN-LAST:event_excluirObraActionPerformed

    private void editarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPedidoActionPerformed
        int selectedRow = tabelaObras.getSelectedRow();
        
        if (selectedRow == -1){
            JOptionPane.showMessageDialog(this," É preciso que uma obra esteja selecionada para a edição!");
        }
        
        int obraId = (int) tabelaObras.getValueAt(selectedRow, 0);
        
        EditarObra editar = new EditarObra();
        editar.setVisible(true);
        this.setVisible (false);
        
        
        editar.mostrarObraEdicao(obraId);
        
    }//GEN-LAST:event_editarPedidoActionPerformed

    private void criarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarPedidoActionPerformed
        
        EditarObra f = new EditarObra();
        f.setVisible(true);
        this.dispose();
       
        
    }//GEN-LAST:event_criarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JButton criarPedido;
    private javax.swing.JButton editarPedido;
    private javax.swing.JButton excluirObra;
    private javax.swing.JPanel incio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaObras;
    // End of variables declaration//GEN-END:variables
}
    

