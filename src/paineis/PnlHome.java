package paineis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author henrique
 */

public class PnlHome extends javax.swing.JPanel implements Runnable {

    String horas, minutos, segundos;
    Thread horaEdata;
    private String hora;
    private String minuto;
    private String segundo;

    public PnlHome() {

        initComponents();
        date();
        setVisible(true);

    }
    
    public final void date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);

        lblData.setText(date);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1620, 950));
        setMinimumSize(new java.awt.Dimension(1620, 950));
        setPreferredSize(new java.awt.Dimension(1620, 950));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DATA");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 186, 40));

        lblData.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setText("DD/MM/YYYY");
        lblData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 820, 50));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BEM VINDO AO SISTEMA");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1640, 70));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblData;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
