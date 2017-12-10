/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.Conexao;
import Controle.VoluntarioDAO;
import Modelo.Voluntario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author m-oli
 */
public class JanelaCadastro extends javax.swing.JDialog {

    /**
     * Creates new form JanelaCadastro
     */
    public JanelaCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelRodape = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelContainerCadastro = new javax.swing.JPanel();
        jTextFieldP_Nome = new javax.swing.JTextField();
        jLabelP_Nome = new javax.swing.JLabel();
        jLabelPX = new javax.swing.JLabel();
        jTextFieldPX = new javax.swing.JTextField();
        jTextFieldP_Cor = new javax.swing.JTextField();
        jLabelP_Cor = new javax.swing.JLabel();
        jTextFieldP_Preco = new javax.swing.JTextField();
        jLabelP_Preco = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelHeader.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRodape.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Prova final de Banco de Dados. 5° ADS. Aluna: Marcielli Oliveira. Fatec Cruzeiro");

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContainerCadastro.setBackground(new java.awt.Color(153, 153, 255));

        jLabelP_Nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelP_Nome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelP_Nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelP_Nome.setText("P Nome");

        jLabelPX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPX.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPX.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPX.setText("PX");

        jTextFieldPX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPXFocusLost(evt);
            }
        });

        jLabelP_Cor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelP_Cor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelP_Cor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelP_Cor.setText("P Cor");

        jLabelP_Preco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelP_Preco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelP_Preco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelP_Preco.setText("P Preço");

        javax.swing.GroupLayout jPanelContainerCadastroLayout = new javax.swing.GroupLayout(jPanelContainerCadastro);
        jPanelContainerCadastro.setLayout(jPanelContainerCadastroLayout);
        jPanelContainerCadastroLayout.setHorizontalGroup(
            jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerCadastroLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelP_Nome)
                    .addComponent(jLabelP_Cor)
                    .addComponent(jLabelP_Preco)
                    .addComponent(jLabelPX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldP_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(jTextFieldP_Cor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldP_Preco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPX))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanelContainerCadastroLayout.setVerticalGroup(
            jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPX)
                    .addComponent(jTextFieldPX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldP_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP_Nome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelP_Cor)
                    .addComponent(jTextFieldP_Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldP_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP_Preco))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButtonCadastrar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 255));
        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(0, 0, 255));
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(0, 0, 255));
        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(153, 153, 255));
        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(0, 0, 255));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContainerCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCadastrar)
                        .addGap(35, 35, 35)))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanelContainerCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addGap(95, 95, 95)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        VoluntarioDAO voluntariodao = new VoluntarioDAO();
        if (voluntariodao.inserirVoluntario(getDadosFrameVoluntario()))
        {
            JOptionPane.showMessageDialog(this, "Incluido com sucesso!", "Manutenção de Aluno", 1);
        } else {
            JOptionPane.showMessageDialog(this, "Inclusão não realizada!", "Manutenção de Aluno", 0);
        }
        this.inicializaCamposETabelas();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldPXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPXFocusLost
        Voluntario voluntario = new VoluntarioDAO().getUsuarioCompleto(this.jTextFieldPX.getText());

        if(voluntario != null){
            this.jTextFieldPX.setText(""+voluntario.getPX());           
            this.jTextFieldP_Nome.setText(""+voluntario.getP_Nome());
            this.jTextFieldP_Cor.setText(""+voluntario.getP_Cor());
            this.jTextFieldP_Preco.setText(""+voluntario.getP_Preco());
            
        } 
        
      
        
    }//GEN-LAST:event_jTextFieldPXFocusLost

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        String message = "Tem certeza que deseja alterar esse usuário?";
        String title = "Manutenção de usuário";
        // display the JOptionPane showConfirmDialog
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {

           VoluntarioDAO voluntariodao = new VoluntarioDAO();

           voluntariodao.atualizarVoluntario(getDadosFrameVoluntario());
           JOptionPane.showMessageDialog(this, "Usuário alterado", "Atenção", 0);
           limpaCampos();
        } 
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String message = "Tem certeza que deseja excluir esse usuário?";
        String title = "Manutenção de usuário";
        // display the JOptionPane showConfirmDialog
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {

           VoluntarioDAO voluntariodao = new VoluntarioDAO();

           voluntariodao.excluirVoluntario(getDadosFrameVoluntario());
           JOptionPane.showMessageDialog(this, "Usuário excluído", "Atenção", 1);
           limpaCampos();
        } 
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaCadastro dialog = new JanelaCadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    //Classes
        private void inicializaCamposETabelas() {
       // getDataTableAlunos();
        limpaCampos();
    }
    
    private void limpaCampos() {
        this.jTextFieldPX.setText("");
        this.jTextFieldP_Nome.setText("");
        this.jTextFieldP_Cor.setText("");
        this.jTextFieldP_Preco.setText("");
        this.jTextFieldPX.requestFocus();
        //setStatComponents("inicio");
    }
    
        private ArrayList <Voluntario> getDataTableVoluntario() {
        int i;
 //       DefaultTableModel model=(DefaultTableModel)jTBLAlunos.getModel();
        // atribui 0 linhas à coluna
    //    model.setNumRows(0);
        // atribui um tamanho fixo a coluna codigo
      //  jTBLAlunos.getColumnModel().getColumn(0).setPreferredWidth(2);
        ArrayList<Voluntario> listVoluntarios = new ArrayList<Voluntario>();
        listVoluntarios = new VoluntarioDAO().getListaVoluntario();
        //adiciona alunos as tabelas
       // for (i=0;i<=listVoluntarios.size()-1;i++){
        //    model.addRow(new Object[]{listAlunos.get(i).getCodigo(),listAlunos.get(i).getNome()});
        //}
        return listVoluntarios;
    }
    
     private Voluntario getDadosFrameVoluntario(){
        Voluntario voluntario = new Voluntario();
        
        voluntario.setPX(this.jTextFieldPX.getText());
        voluntario.setP_Nome(this.jTextFieldP_Nome.getText());
        voluntario.setP_Cor(this.jTextFieldP_Cor.getText());
        voluntario.setP_Preco(this.jTextFieldP_Preco.getText());
        
       
       
//        voluntario.setEmail(this.jTextFieldPX.getText());
//        voluntario.setSenha(this.jTextFieldP_Nome.getText());
//        voluntario.setNome(this.jTextFieldP_Cor.getText());
//        voluntario.setTelefone(this.jTextFieldP_Preco.getText());
        
        return voluntario;
    }
    
    
    //Fim
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPX;
    private javax.swing.JLabel jLabelP_Cor;
    private javax.swing.JLabel jLabelP_Nome;
    private javax.swing.JLabel jLabelP_Preco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContainerCadastro;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JTextField jTextFieldPX;
    private javax.swing.JTextField jTextFieldP_Cor;
    private javax.swing.JTextField jTextFieldP_Nome;
    private javax.swing.JTextField jTextFieldP_Preco;
    // End of variables declaration//GEN-END:variables
}
