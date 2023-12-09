/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GuitarraCwmo;
import controles.GuitarraControle;
import dao.GuitarraDAO;
import java.util.List;
import tools.Util;

/**
 *
 * @author carlo
 */
public class JDlgGuitarraIA extends javax.swing.JDialog {

    /**
     * Creates new form JDlgGuitarraIA
     */
    JDlgGuitarra jDlgGuitarra;
    GuitarraCwmo guitarraCwmo;

    public JDlgGuitarraIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

    }

    public void setTelaAnterior(JDlgGuitarra jDlgGuitarra) {
        this.jDlgGuitarra = jDlgGuitarra;
    }

    public GuitarraCwmo viewBean() {
        GuitarraCwmo guitarraCwmo = new GuitarraCwmo();
        guitarraCwmo.setIdprodutosCwmo(Util.strInt(jTxtCodGuitarra.getText()));
        if (jCboCanhoto.getSelectedIndex() == 0) {
            guitarraCwmo.setCanhotoDestroCwmo(0);
        } else if (jCboCanhoto.getSelectedIndex() == 1) {
            guitarraCwmo.setCanhotoDestroCwmo(1);
        }
        guitarraCwmo.setCaptadoresCwmo(jTxtCaptadores.getText());
        guitarraCwmo.setModeloCwmo(jTxtModelo.getText());
        guitarraCwmo.setPonteCwmo(jTxtPonte.getText());
        guitarraCwmo.setTipoCwmo(jTxtTipo.getText());
        guitarraCwmo.setTrastesCwmo(jTxtTrastes.getText());
        guitarraCwmo.setValorUnitarioCwmo(Util.strDouble(jTxtValorUni.getText()));
        return guitarraCwmo;

    }

    public void beanView(GuitarraCwmo guitarraCwmo) {
        jTxtCodGuitarra.setText(Util.intStr(guitarraCwmo.getIdprodutosCwmo()));
        if (guitarraCwmo.getCanhotoDestroCwmo() == 0) {
            jCboCanhoto.setSelectedIndex(0);
        } else if (guitarraCwmo.getCanhotoDestroCwmo() == 1) {
            jCboCanhoto.setSelectedIndex(1);
        }
        jTxtCaptadores.setText(guitarraCwmo.getCaptadoresCwmo());
        jTxtModelo.setText(guitarraCwmo.getModeloCwmo());
        jTxtPonte.setText(guitarraCwmo.getPonteCwmo());
        jTxtTipo.setText(guitarraCwmo.getTipoCwmo());
        jTxtTrastes.setText(guitarraCwmo.getTrastesCwmo());
        jTxtValorUni.setText(Util.doubleStr(guitarraCwmo.getValorUnitarioCwmo()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();
        jTxtCaptadores = new javax.swing.JTextField();
        jBtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTxtPonte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtCodGuitarra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtTrastes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtTipo = new javax.swing.JTextField();
        jCboCanhoto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTxtValorUni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Captadores");

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        jBtnConfirmar.setText("confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnCancelar.setText("cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ponte");

        jLabel1.setText("Codigo da Guitarra");

        jLabel7.setText("Canhoto ou Destro");

        jTxtCodGuitarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodGuitarraActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Guitarra");

        jLabel3.setText("Trastes");

        jLabel4.setText("Modelo");

        jCboCanhoto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canhoto", "Destro" }));

        jLabel8.setText("Valor Unitário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtPonte, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTxtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtCodGuitarra, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtTipo))
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jTxtCaptadores, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jTxtTrastes)
                            .addComponent(jCboCanhoto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtValorUni))
                        .addGap(376, 376, 376))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCodGuitarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtTrastes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCaptadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboCanhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        GuitarraCwmo guitarraCwmo = viewBean();
        GuitarraDAO guitarraDAO = new GuitarraDAO();
        setVisible(false);
        if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
            Util.limparCampos(jCboCanhoto, jTxtCaptadores, jTxtCodGuitarra, jTxtModelo, jTxtPonte, jTxtTipo, jTxtTrastes, jTxtValorUni);
            guitarraDAO.insert(guitarraCwmo);

        } else {
            guitarraDAO.update(guitarraCwmo);
            jDlgGuitarra.guitarraControle.updateBean(jDlgGuitarra.getSelectedRowProd(), guitarraCwmo);

        }


    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.limparCampos(jCboCanhoto, jTxtCaptadores, jTxtCodGuitarra, jTxtModelo, jTxtPonte, jTxtTipo, jTxtTrastes, jTxtValorUni);
        setVisible(false);

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtCodGuitarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodGuitarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodGuitarraActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgGuitarraIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgGuitarraIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgGuitarraIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgGuitarraIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgGuitarraIA dialog = new JDlgGuitarraIA(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JComboBox<String> jCboCanhoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxtCaptadores;
    private javax.swing.JTextField jTxtCodGuitarra;
    private javax.swing.JTextField jTxtModelo;
    private javax.swing.JTextField jTxtPonte;
    private javax.swing.JTextField jTxtTipo;
    private javax.swing.JTextField jTxtTrastes;
    private javax.swing.JTextField jTxtValorUni;
    // End of variables declaration//GEN-END:variables
}
