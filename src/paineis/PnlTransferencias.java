package paineis;

import dao.ContasDAO;
import dao.ReceitasDAO;
import dao.TransferenciasDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Contas;
import model.Transferencias;
import util.EstilizarTable;
import util.ValidarEntradaValores;

/**
 *
 * @author henrique
 */
public final class PnlTransferencias extends javax.swing.JPanel {

    boolean encontradoDe = false;
    boolean encontradoPara = false;

    public PnlTransferencias() {
        initComponents();
        
        EstilizarTable est = new EstilizarTable();
        est.estlizarTable(tableTransferencias);
        
        camposVisiveis();
        
        txtValorTransf.setDocument(new ValidarEntradaValores());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numContaDe = new javax.swing.JTextField();
        btnPesqDe = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        lblSaldoAtual = new javax.swing.JLabel();
        txtSaldoAtual = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        numContaPara = new javax.swing.JTextField();
        btnPesqPara = new javax.swing.JButton();
        lblNomePara = new javax.swing.JLabel();
        txtNomePara = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtValorTransf = new javax.swing.JTextField();
        btnTransf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransferencias = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1680, 940));
        setMinimumSize(new java.awt.Dimension(1680, 940));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1620, 950));
        jPanel1.setMinimumSize(new java.awt.Dimension(1620, 950));
        jPanel1.setPreferredSize(new java.awt.Dimension(1620, 950));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1911, 264, 66, 54));

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1713, 281, 191, 27));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transferências entre contas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1720, 70));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Número da conta de origem");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 550, -1));

        numContaDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numContaDe.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(numContaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 150, 30));

        btnPesqDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPesqDe.setText("Pesquisar");
        btnPesqDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqDeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesqDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 51, 51));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Transferir de:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 570, -1));

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(51, 51, 51));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 550, 30));

        lblSaldoAtual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSaldoAtual.setForeground(new java.awt.Color(0, 102, 0));
        lblSaldoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoAtual.setText("Saldo");
        jPanel1.add(lblSaldoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 550, 40));

        txtSaldoAtual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSaldoAtual.setForeground(new java.awt.Color(0, 102, 0));
        txtSaldoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtSaldoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 550, 40));

        lblDestino.setBackground(new java.awt.Color(0, 0, 0));
        lblDestino.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(51, 51, 51));
        lblDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDestino.setText("Número da conta de destino");
        jPanel1.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, 550, -1));

        numContaPara.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numContaPara.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(numContaPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 740, 150, 30));

        btnPesqPara.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPesqPara.setText("Pesquisar");
        btnPesqPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqParaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesqPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 740, 110, -1));

        lblNomePara.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNomePara.setForeground(new java.awt.Color(51, 51, 51));
        lblNomePara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomePara.setText("Transferir para:");
        jPanel1.add(lblNomePara, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 790, 550, -1));

        txtNomePara.setBackground(new java.awt.Color(51, 51, 51));
        txtNomePara.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNomePara.setForeground(new java.awt.Color(51, 51, 51));
        txtNomePara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtNomePara, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 820, 550, 30));

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblValor.setText("Valor");
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 870, -1, 50));

        txtValorTransf.setBackground(new java.awt.Color(0, 0, 0));
        txtValorTransf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtValorTransf.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtValorTransf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 870, 190, 50));

        btnTransf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTransf.setText("Transferir");
        btnTransf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 950, 150, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PnlGrande.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        tableTransferencias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableTransferencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id transferência", "Conta origem", "Conta destino", "Valor da transferência"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTransferencias.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tableTransferencias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, 660, 310));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -240, 1720, 1230));
    }// </editor-fold>//GEN-END:initComponents
/**
     * <h1>Método responsável por mostrar os campos na tela conforme o usuário
     * informa os dados na tela .</h1>
     *
     *
     * @see {@link readJTableForId}
     */
    public void camposVisiveis() {

        lblSaldoAtual.setVisible(encontradoDe);
        txtSaldoAtual.setVisible(encontradoDe);
        lblNome.setVisible(encontradoDe);
        txtNome.setVisible(encontradoDe);

        lblDestino.setVisible(encontradoDe);
        numContaPara.setVisible(encontradoDe);
        btnPesqPara.setVisible(encontradoDe);

        lblNomePara.setVisible(encontradoPara);
        txtNomePara.setVisible(encontradoPara);
        lblValor.setVisible(encontradoPara);
        txtValorTransf.setVisible(encontradoPara);
        btnTransf.setVisible(encontradoPara);

    }
    
       /**
     * <h1>Método responsável por mostrar os dados referente às {@link Transferências}
     * registradas no sistema.</h1>
     *
     *
     * @param numConta
     * @see {@link readJTable}
     */
    public void readJTable(int numConta) {

        DefaultTableModel modelo = (DefaultTableModel) tableTransferencias.getModel();
        modelo.setNumRows(0);

        TransferenciasDAO transfDAO = new TransferenciasDAO();

        transfDAO.listarTransferencias(numConta).forEach((transf) -> {
            modelo.addRow(new Object[]{
                transf.getId_transferencia(),
                transf.getConta_origem(),
                transf.getConta_destino(),
                transf.getValor_transferencia()
               
            });
        });

    }

    private void btnTransfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfActionPerformed
        //Validação para verificar se o usuário informou o valor da transferência

        if (txtValorTransf.getText().trim().isEmpty()) {
            lblValor.setText("Valor *");
            JOptionPane.showMessageDialog(null, "É necessário digitar o valor da transferência");
        } else {

            Transferencias transf = new Transferencias();
            TransferenciasDAO dao = new TransferenciasDAO();

            Double saldoAtual = Double.parseDouble(txtSaldoAtual.getText());

            //Validação para verificar se o saldo atual da conta permite realizar transferências
            if (saldoAtual < Double.parseDouble(txtValorTransf.getText())) {

                JOptionPane.showMessageDialog(null, "Não é possível realizar transferências maiores do que o saldo atual da conta.");

            } else {
                transf.setConta_origem(Integer.parseInt(numContaDe.getText()));
                transf.setConta_destino(Integer.parseInt(numContaPara.getText()));
                transf.setValor_transferencia(Double.parseDouble(txtValorTransf.getText()));

                dao.realizarTransferencia(transf);
            }

        }
        
        encontradoDe = false;
        encontradoPara = false;
        
        camposVisiveis();

    }//GEN-LAST:event_btnTransfActionPerformed

    private void btnPesqDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqDeActionPerformed

        
        if (numContaDe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o número da conta");

        } else {
            ContasDAO cDAO = new ContasDAO();

            int numConta = Integer.parseInt(numContaDe.getText());

            cDAO.encontrarConta(numConta);

            //Validação para verificar se o saldo atual da conta permite realizar transferências
            if (cDAO.getSaldo() <= 0) {
                JOptionPane.showMessageDialog(null, "O saldo atual da conta não permite realizar transferências");
            } else {
                
                 readJTable(numConta);
                
                encontradoDe = cDAO.getEncontrou();

                camposVisiveis();

                txtNome.setText(cDAO.getNomeCliente() + " " + cDAO.getSobrenomeCliente());
                txtSaldoAtual.setText(Double.toString(cDAO.getSaldo()));

                ContasDAO daoTransf = new ContasDAO();

                daoTransf.listarContasPorId(numConta);
            }
        }

    }//GEN-LAST:event_btnPesqDeActionPerformed

    private void btnPesqParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqParaActionPerformed
//Validação para verificar se o usuário informou o número da conta
        if (numContaPara.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o número da conta");

        } else {

            ContasDAO cDAO = new ContasDAO();

            Contas cont = new Contas();

            int numConta2 = Integer.parseInt(numContaPara.getText());

            cDAO.encontrarConta(numConta2);

            encontradoPara = cDAO.getEncontrou();

            camposVisiveis();

            txtNomePara.setText(cDAO.getNomeCliente() + " " + cDAO.getSobrenomeCliente());

            ContasDAO daoTransf = new ContasDAO();

            int numConta = Integer.parseInt(numContaPara.getText());

            daoTransf.listarContasPorId(numConta);

        }
    }//GEN-LAST:event_btnPesqParaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesqDe;
    private javax.swing.JButton btnPesqPara;
    private javax.swing.JButton btnTransf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomePara;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSaldoAtual;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField numContaDe;
    private javax.swing.JTextField numContaPara;
    private javax.swing.JTable tableTransferencias;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNomePara;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JLabel txtSaldoAtual;
    private javax.swing.JTextField txtValorTransf;
    // End of variables declaration//GEN-END:variables
}
