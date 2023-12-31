    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.UsuariosCwmo;
import dao.UsuariosDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author carlo
 */
public class JDlgUsuarios extends javax.swing.JDialog {
   
    private boolean incluindo;
    MaskFormatter mascaraCpf;
    MaskFormatter mascaraData;
    /**
     * Creates new form JDlgUsuarios
     */
    public JDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnAlterar);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        setLocationRelativeTo(null);
        setTitle("Usuario");
        try{
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtDataNascimento.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    public UsuariosCwmo viewBean(){
    UsuariosCwmo usuariosCwmo = new UsuariosCwmo();
    int id = Integer.valueOf(jTxtCodigo.getText());
    usuariosCwmo.setIdusuariosCwmo(id);
    usuariosCwmo.setNomeCwmo(jTxtNome.getText());
    usuariosCwmo.setApelidoCwmo(jTxtApelido.getText());
    usuariosCwmo.setCpfCwmo(JFmtCpf.getText());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try{
        usuariosCwmo.setDataNascimentoCwmo(formato.parse(jFmtDataNascimento.getText()));
        } catch (ParseException ex) {
            System.out.println("Erro seu otario" + ex.getMessage());
        }
        usuariosCwmo.setNivelCwmo(jCboNivel.getSelectedIndex());
        usuariosCwmo.setSenhaCwmo(jPwfSenha.getText());
        if(jchbAtivo.isSelected()==true){
        usuariosCwmo.setAtivoCwmo("S");
        }else{
        usuariosCwmo.setAtivoCwmo("N");
        }    
    return usuariosCwmo;
    }
    
    public void beanView(UsuariosCwmo usuariosCwmo){
        String valor = String.valueOf(usuariosCwmo.getIdusuariosCwmo());
        jTxtCodigo.setText(valor);
        jTxtNome.setText(usuariosCwmo.getNomeCwmo());
        jTxtApelido.setText(usuariosCwmo.getApelidoCwmo());
        JFmtCpf.setText(usuariosCwmo.getCpfCwmo());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtDataNascimento.setText(formato.format(usuariosCwmo.getDataNascimentoCwmo()));
        jPwfSenha.setText(usuariosCwmo.getSenhaCwmo());
        jCboNivel.setSelectedIndex(usuariosCwmo.getNivelCwmo());
        if(usuariosCwmo.getAtivoCwmo().equals("S") == true) {
        jchbAtivo.setSelected(true);
        }else{
        jchbAtivo.setSelected(false);
        }
        
                
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPwfSenha = new javax.swing.JPasswordField();
        jTxtNome = new javax.swing.JTextField();
        jchbAtivo = new javax.swing.JCheckBox();
        jTxtApelido = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnAlterar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBtnExcluir = new javax.swing.JButton();
        jFmtDataNascimento = new javax.swing.JFormattedTextField();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        JFmtCpf = new javax.swing.JFormattedTextField();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCboNivel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("código");

        jLabel8.setText("Nível");

        jLabel3.setText("Nome");

        jPwfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwfSenhaActionPerformed(evt);
            }
        });

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jchbAtivo.setText("ativo");
        jchbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchbAtivoActionPerformed(evt);
            }
        });

        jTxtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApelidoActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Apelido");

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jFmtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataNascimentoActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        jBtnConfirmar.setText("confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel6.setText("Data Nascimento");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnCancelar.setText("cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        JFmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFmtCpfActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel7.setText("senha");

        jCboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visitante", "Cliente", "Adm", "Especial" }));
        jCboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnAlterar)
                            .addGap(10, 10, 10)
                            .addComponent(jBtnExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBtnPesquisar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtApelido, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                                    .addComponent(jTxtNome))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(JFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jchbAtivo)
                                            .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6)
                                        .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addGap(1, 1, 1)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jchbAtivo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnAlterar)
                        .addComponent(jBtnExcluir)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnCancelar)
                        .addComponent(jBtnPesquisar)
                        .addComponent(jBtnIncluir))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jPwfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwfSenhaActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jchbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchbAtivoActionPerformed

    private void jTxtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApelidoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar,  jBtnPesquisar,jBtnExcluir);
        Util.limparCampos( jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel);
        incluindo = true;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        if (Util.perguntar("deseja excluir o registro?")== true) {
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        UsuariosCwmo usuariosCwmo = viewBean();
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.delete(usuariosCwmo);
        Util.mensagem("Registro excluido");
        } else {
            Util.mensagem("Exclusão cancelada");
        }
        Util.limparCampos( jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jFmtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataNascimentoActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        UsuariosCwmo usuariosCwmo = viewBean();
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        
        if(incluindo==true){
        usuariosDAO.insert(usuariosCwmo);
        }else{
        usuariosDAO.update(usuariosCwmo);
        }
        
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel, jBtnCancelar, jBtnConfirmar, jBtnExcluir);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnPesquisar);
        Util.limparCampos( jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        //    desabilitar();
        Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel, jBtnCancelar, jBtnConfirmar, jBtnExcluir, jBtnAlterar);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
  
        Util.mensagem("Operação cancelada");
        Util.limparCampos( jTxtCodigo, jTxtNome, jTxtApelido, JFmtCpf, jFmtDataNascimento, jPwfSenha, jchbAtivo, jCboNivel);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void JFmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFmtCpfActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        //habilitar();
        //String resp = JOptionPane.showInputDialog(null, "Entre com o codigo(chave primaria)");
        //Usuarios_DAO usuarios_DAO = new Usuarios_DAO();
        //int id = Integer.valueOf(resp);
        //Usuarios usuarios = (Usuarios) usuarios_DAO.list(id);//o list retorna o bean, o list pega o bean e transforma em  objeto
        //beanView(usuarios);
        JDlgUsuariosPesquisa jDlgUsuariosPesquisa = new JDlgUsuariosPesquisa(null, true);
        jDlgUsuariosPesquisa.setTelaAnterior(this);
        jDlgUsuariosPesquisa.setVisible(true);
        Util.habilitar(true,  jBtnAlterar, jBtnPesquisar, jBtnCancelar,jBtnExcluir);
        Util.habilitar(false, jBtnIncluir, jBtnConfirmar);
        
        

    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jCboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboNivelActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgUsuarios dialog = new JDlgUsuarios(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField JFmtCpf;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboNivel;
    private javax.swing.JFormattedTextField jFmtDataNascimento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPwfSenha;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JCheckBox jchbAtivo;
    // End of variables declaration//GEN-END:variables
}
