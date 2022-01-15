package telaPrincipal;

import java.awt.Color;
import paineis.LigarPainel;
import paineis.PnlContas;
import paineis.PnlDespesas;
import paineis.PnlHome;
import paineis.PnlReceitas;
import paineis.PnlTransferencias;

/**
 *
 * @author henri
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.BtnHome.setSelected(true);

        new LigarPainel(pnPrincipal, new PnlHome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BtnHome = new rsbuttom.RSButtonMetro();
        BtnContas = new rsbuttom.RSButtonMetro();
        BtnDepositos = new rsbuttom.RSButtonMetro();
        BtnDespesas = new rsbuttom.RSButtonMetro();
        BtnTransferencias = new rsbuttom.RSButtonMetro();
        pnPrincipal = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMenu.setBackground(new java.awt.Color(0, 0, 0));
        pnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        pnMenu.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BtnHome.setBackground(new java.awt.Color(0, 0, 0));
        BtnHome.setText("Tela inicial");
        BtnHome.setColorHover(new java.awt.Color(0, 0, 0));
        BtnHome.setColorNormal(new java.awt.Color(0, 0, 0));
        BtnHome.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BtnHome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnHome.setIconTextGap(30);
        BtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnHomeMousePressed(evt);
            }
        });
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        BtnContas.setBackground(new java.awt.Color(0, 0, 0));
        BtnContas.setText("Contas");
        BtnContas.setColorHover(new java.awt.Color(0, 0, 0));
        BtnContas.setColorNormal(new java.awt.Color(0, 0, 0));
        BtnContas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BtnContas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnContas.setIconTextGap(25);
        BtnContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnContasMousePressed(evt);
            }
        });
        BtnContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContasActionPerformed(evt);
            }
        });

        BtnDepositos.setBackground(new java.awt.Color(0, 0, 0));
        BtnDepositos.setText("Receitas");
        BtnDepositos.setColorHover(new java.awt.Color(0, 0, 0));
        BtnDepositos.setColorNormal(new java.awt.Color(0, 0, 0));
        BtnDepositos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BtnDepositos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnDepositos.setIconTextGap(25);
        BtnDepositos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnDepositosMousePressed(evt);
            }
        });
        BtnDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDepositosActionPerformed(evt);
            }
        });

        BtnDespesas.setBackground(new java.awt.Color(0, 0, 0));
        BtnDespesas.setText("Despesas");
        BtnDespesas.setColorHover(new java.awt.Color(0, 0, 0));
        BtnDespesas.setColorNormal(new java.awt.Color(0, 0, 0));
        BtnDespesas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BtnDespesas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnDespesas.setIconTextGap(25);
        BtnDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnDespesasMousePressed(evt);
            }
        });
        BtnDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDespesasActionPerformed(evt);
            }
        });

        BtnTransferencias.setBackground(new java.awt.Color(0, 0, 0));
        BtnTransferencias.setText("Transferências");
        BtnTransferencias.setColorHover(new java.awt.Color(0, 0, 0));
        BtnTransferencias.setColorNormal(new java.awt.Color(0, 0, 0));
        BtnTransferencias.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BtnTransferencias.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnTransferencias.setIconTextGap(25);
        BtnTransferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnTransferenciasMousePressed(evt);
            }
        });
        BtnTransferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransferenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnContas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(BtnDepositos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnDespesas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnTransferencias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnContas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnTransferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 1080));

        pnPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        pnPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        pnPrincipal.setToolTipText("");
        pnPrincipal.setMaximumSize(new java.awt.Dimension(1620, 950));
        pnPrincipal.setMinimumSize(new java.awt.Dimension(1620, 950));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(1620, 950));
        pnPrincipal.setLayout(new javax.swing.BoxLayout(pnPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(pnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1620, 1030));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Tela Principal");

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        new LigarPainel(pnPrincipal, new PnlHome());
        if (this.BtnHome.isSelected()) {

            this.BtnHome.setColorNormal(new Color(51, 51, 51));
            this.BtnHome.setColorHover(new Color(51, 51, 51));
            this.BtnHome.setColorPressed(new Color(51, 51, 51));

            this.BtnContas.setColorNormal(new Color(0, 0, 0));
            this.BtnContas.setColorHover(new Color(51, 51, 51));
            this.BtnContas.setColorPressed(new Color(0, 0, 0));
            
            this.BtnDespesas.setColorNormal(new Color(0, 0, 0));
            this.BtnDespesas.setColorHover(new Color(51, 51, 51));
            this.BtnDespesas.setColorPressed(new Color(0, 0, 0));
            
            this.BtnTransferencias.setColorNormal(new Color(0, 0, 0));
            this.BtnTransferencias.setColorHover(new Color(51, 51, 51));
            this.BtnTransferencias.setColorPressed(new Color(0, 0, 0));

            this.BtnDepositos.setColorNormal(new Color(0, 0, 0));
            this.BtnDepositos.setColorHover(new Color(51, 51, 51));
            this.BtnDepositos.setColorPressed(new Color(0, 0, 0));

        } else {

            this.BtnHome.setColorNormal(new Color(0, 0, 0));
            this.BtnHome.setColorHover(new Color(51, 51, 51));
            this.BtnHome.setColorPressed(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnContasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnContasMousePressed
        this.BtnHome.setSelected(false);
        this.BtnDepositos.setSelected(false);
        this.BtnDespesas.setSelected(false);
        this.BtnTransferencias.setSelected(false);
        this.BtnContas.setSelected(true);
    }//GEN-LAST:event_BtnContasMousePressed

    private void BtnContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContasActionPerformed

        new LigarPainel(pnPrincipal, new PnlContas());
        if (this.BtnContas.isSelected()) {

            this.BtnHome.setColorNormal(new Color(0, 0, 0));
            this.BtnHome.setColorHover(new Color(51, 51, 51));
            this.BtnHome.setColorPressed(new Color(0, 0, 0));

            this.BtnDepositos.setColorNormal(new Color(0, 0, 0));
            this.BtnDepositos.setColorHover(new Color(51, 51, 51));
            this.BtnDepositos.setColorPressed(new Color(0, 0, 0));
            
            this.BtnDespesas.setColorNormal(new Color(0, 0, 0));
            this.BtnDespesas.setColorHover(new Color(51, 51, 51));
            this.BtnDespesas.setColorPressed(new Color(0, 0, 0));
            
            this.BtnTransferencias.setColorNormal(new Color(0, 0, 0));
            this.BtnTransferencias.setColorHover(new Color(51, 51, 51));
            this.BtnTransferencias.setColorPressed(new Color(0, 0, 0));

            this.BtnContas.setColorNormal(new Color(51, 51, 51));
            this.BtnContas.setColorHover(new Color(51, 51, 51));
            this.BtnContas.setColorPressed(new Color(51, 51, 51));

        } else {

            this.BtnContas.setColorNormal(new Color(0, 0, 0));
            this.BtnContas.setColorHover(new Color(51, 51, 51));
            this.BtnContas.setColorPressed(new Color(0, 0, 0));

        }

    }//GEN-LAST:event_BtnContasActionPerformed

    private void BtnDepositosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDepositosMousePressed
        this.BtnHome.setSelected(false);
        this.BtnContas.setSelected(false);
        this.BtnDespesas.setSelected(false);
        this.BtnTransferencias.setSelected(false);
        this.BtnDepositos.setSelected(true);
    }//GEN-LAST:event_BtnDepositosMousePressed

    private void BtnDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDepositosActionPerformed

        new LigarPainel(pnPrincipal, new PnlReceitas());
        if (this.BtnDepositos.isSelected()) {

            this.BtnHome.setColorNormal(new Color(0, 0, 0));
            this.BtnHome.setColorHover(new Color(51, 51, 51));
            this.BtnHome.setColorPressed(new Color(0, 0, 0));

            this.BtnContas.setColorNormal(new Color(0, 0, 0));
            this.BtnContas.setColorHover(new Color(51, 51, 51));
            this.BtnContas.setColorPressed(new Color(0, 0, 0));
            
            this.BtnDespesas.setColorNormal(new Color(0, 0, 0));
            this.BtnDespesas.setColorHover(new Color(51, 51, 51));
            this.BtnDespesas.setColorPressed(new Color(0, 0, 0));
            
            this.BtnTransferencias.setColorNormal(new Color(0, 0, 0));
            this.BtnTransferencias.setColorHover(new Color(51, 51, 51));
            this.BtnTransferencias.setColorPressed(new Color(0, 0, 0));

            this.BtnDepositos.setColorNormal(new Color(51, 51, 51));
            this.BtnDepositos.setColorHover(new Color(51, 51, 51));
            this.BtnDepositos.setColorPressed(new Color(51, 51, 51));

        } else {

            this.BtnDepositos.setColorNormal(new Color(0, 0, 0));
            this.BtnDepositos.setColorHover(new Color(51, 51, 51));
            this.BtnDepositos.setColorPressed(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_BtnDepositosActionPerformed

    private void BtnDespesasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDespesasMousePressed
        this.BtnHome.setSelected(false);
        this.BtnContas.setSelected(false);
        this.BtnDepositos.setSelected(false);
        this.BtnTransferencias.setSelected(false);
        this.BtnDespesas.setSelected(true);
        
    }//GEN-LAST:event_BtnDespesasMousePressed

    private void BtnDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDespesasActionPerformed
        new LigarPainel(pnPrincipal, new PnlDespesas());
        if (this.BtnDespesas.isSelected()) {

            this.BtnHome.setColorNormal(new Color(0, 0, 0));
            this.BtnHome.setColorHover(new Color(51, 51, 51));
            this.BtnHome.setColorPressed(new Color(0, 0, 0));

            this.BtnContas.setColorNormal(new Color(0, 0, 0));
            this.BtnContas.setColorHover(new Color(51, 51, 51));
            this.BtnContas.setColorPressed(new Color(0, 0, 0));

            this.BtnDepositos.setColorNormal(new Color(0, 0, 0));
            this.BtnDepositos.setColorHover(new Color(51, 51, 51));
            this.BtnDepositos.setColorPressed(new Color(0, 0, 0));
            
            this.BtnTransferencias.setColorNormal(new Color(0, 0, 0));
            this.BtnTransferencias.setColorHover(new Color(51, 51, 51));
            this.BtnTransferencias.setColorPressed(new Color(0, 0, 0));
            
            this.BtnDespesas.setColorNormal(new Color(51, 51, 51));
            this.BtnDespesas.setColorHover(new Color(51, 51, 51));
            this.BtnDespesas.setColorPressed(new Color(51, 51, 51));

        } else {

            this.BtnDespesas.setColorNormal(new Color(0, 0, 0));
            this.BtnDespesas.setColorHover(new Color(51, 51, 51));
            this.BtnDespesas.setColorPressed(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_BtnDespesasActionPerformed

    private void BtnTransferenciasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTransferenciasMousePressed
        this.BtnHome.setSelected(false);
        this.BtnContas.setSelected(false);
        this.BtnDepositos.setSelected(false);
        this.BtnDespesas.setSelected(false);
        this.BtnTransferencias.setSelected(true);
    }//GEN-LAST:event_BtnTransferenciasMousePressed

    private void BtnTransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransferenciasActionPerformed
         new LigarPainel(pnPrincipal, new PnlTransferencias());
        if (this.BtnTransferencias.isSelected()) {

            this.BtnHome.setColorNormal(new Color(0, 0, 0));
            this.BtnHome.setColorHover(new Color(51, 51, 51));
            this.BtnHome.setColorPressed(new Color(0, 0, 0));

            this.BtnContas.setColorNormal(new Color(0, 0, 0));
            this.BtnContas.setColorHover(new Color(51, 51, 51));
            this.BtnContas.setColorPressed(new Color(0, 0, 0));

            this.BtnDepositos.setColorNormal(new Color(0, 0, 0));
            this.BtnDepositos.setColorHover(new Color(51, 51, 51));
            this.BtnDepositos.setColorPressed(new Color(0, 0, 0));
            
            this.BtnDespesas.setColorNormal(new Color(0, 0, 0));
            this.BtnDespesas.setColorHover(new Color(51, 51, 51));
            this.BtnDespesas.setColorPressed(new Color(0, 0, 0));
            
            this.BtnTransferencias.setColorNormal(new Color(51, 51, 51));
            this.BtnTransferencias.setColorHover(new Color(51, 51, 51));
            this.BtnTransferencias.setColorPressed(new Color(51, 51, 51));

        } else {

            this.BtnTransferencias.setColorNormal(new Color(0, 0, 0));
            this.BtnTransferencias.setColorHover(new Color(51, 51, 51));
            this.BtnTransferencias.setColorPressed(new Color(0, 0, 0));

        }
    }//GEN-LAST:event_BtnTransferenciasActionPerformed

    private void BtnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomeMousePressed
        this.BtnHome.setSelected(true);
        this.BtnContas.setSelected(false);
        this.BtnDepositos.setSelected(false);
        this.BtnDespesas.setSelected(false);
        this.BtnTransferencias.setSelected(false);
    }//GEN-LAST:event_BtnHomeMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro BtnContas;
    private rsbuttom.RSButtonMetro BtnDepositos;
    private rsbuttom.RSButtonMetro BtnDespesas;
    private rsbuttom.RSButtonMetro BtnHome;
    private rsbuttom.RSButtonMetro BtnTransferencias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
