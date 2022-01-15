package paineis;


import dao.ContasDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Contas;
import util.EstilizarTable;
import util.ValidarEntradaValores;

/**
 *
 * @author henrique
 */
public final class PnlContas extends javax.swing.JPanel {

    public PnlContas() {
        
        initComponents();
        
        txtBuscarId.setDocument(new ValidarEntradaValores());
        
        EstilizarTable util = new EstilizarTable();

        util.estlizarTable(jContas);

        readJTable();

    }

    /**
     * <h1>Método responsável por realizar a limpeza dos campos referentes ao nome e sobrenome da pessoa vinculada à {@link Contas}.</h1>
     *
     *
     * @see {@link limparCampos}
     */
    public void limparCampos() {
        
        txtNomeCliente.setText("");
        txtSobrenomeCliente.setText("");
        
    }

    /**
     * <h1>Método responsável por mostrar os dados referente às contas cadastradas no sistema
     * através do recebimento dos dados na tabela jContas.</h1>
     *
     *
     * @see {@link readJTable}
     */
    
    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) jContas.getModel();
        modelo.setNumRows(0);

        ContasDAO clidao = new ContasDAO();

        clidao.listarContas().forEach((conta) -> {
            modelo.addRow(new Object[]{
                conta.getId_conta(),
                conta.getNome(),
                conta.getSobrenome(),
                conta.getAgenciaBancaria(),
                conta.getTipoConta(),
                conta.getSaldo()
                
            });
        });

    }

    /**
     * <h1>Método responsável por mostrar os dados referente às contas cadastradas no sistema
     * através do recebimento dos dados na tabela jContas realizando uma filtragem pelo número da conta desejado.</h1>
     *
     *
     * @param id
     * @see {@link readJTableForId}
     */
    
    public void readJTableForId(int id) {

        DefaultTableModel modelo = (DefaultTableModel) jContas.getModel();
        modelo.setNumRows(0);
        ContasDAO clidao = new ContasDAO();

        clidao.listarContasPorId(id).forEach((conta) -> {
            modelo.addRow(new Object[]{
                conta.getId_conta(),
                conta.getNome(),
                conta.getSobrenome(),
                conta.getAgenciaBancaria(),
                conta.getTipoConta(),
                conta.getSaldo()
                
            });
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jContas = new javax.swing.JTable();
        txtBuscarId = new javax.swing.JTextField();
        btnBuscarPorId = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAgenciaBancaria = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtSobrenomeCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipoConta = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1902, 1033));
        setMinimumSize(new java.awt.Dimension(1902, 1033));
        setPreferredSize(new java.awt.Dimension(1902, 1033));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1902, 1033));
        jPanel1.setMinimumSize(new java.awt.Dimension(1902, 1033));
        jPanel1.setPreferredSize(new java.awt.Dimension(1902, 1033));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1911, 264, 66, 54));

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1713, 281, 191, 27));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 50, 1720, 70));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jContas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Instituição Financeira", "Tipo de conta", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jContas.setToolTipText("");
        jContas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jContas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 1190, 390));

        txtBuscarId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtBuscarId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 210, 130, 40));

        btnBuscarPorId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarPorId.setText("Buscar");
        btnBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorIdActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarPorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 210, 100, 40));

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 140, 50));

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 150, 50));

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setText("Atualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 140, 50));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 240, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Instituição financeira");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        txtAgenciaBancaria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAgenciaBancaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nubank", "Viacredi", "Sicoob", "Banco do Brasil", "Caixa", "Santander" }));
        jPanel1.add(txtAgenciaBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 250, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Sobrenome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, -1, -1));

        txtSobrenomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtSobrenomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 195, 32));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tipo de conta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 150, -1));

        txtTipoConta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTipoConta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carteira", "Poupança", "Corrente" }));
        jPanel1.add(txtTipoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 195, 29));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PnlPequeno.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorIdActionPerformed
//Validação para verificar se o usuário informou o número da conta
        if(txtBuscarId.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Informe o Id da conta que desejas pesquisar.");
        }
        else{
            
        readJTableForId(Integer.parseInt(txtBuscarId.getText()));
        limparCampos();
        
        }
    }//GEN-LAST:event_btnBuscarPorIdActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
/**<h1>Validação para verificar se o usuário digitou as informações necessárias para realizar o cadastro da {@link Contas}.</h1>*/
     
        if (txtNomeCliente.getText().trim().isEmpty() || txtSobrenomeCliente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos para cadastrar a conta no banco de dados.");
        } else {

            Contas cli = new Contas();
            ContasDAO dao = new ContasDAO();

            cli.setNome(txtNomeCliente.getText());

            cli.setSobrenome(txtSobrenomeCliente.getText());

            cli.setAgenciaBancaria(txtAgenciaBancaria.getSelectedItem().toString());

            cli.setTipoConta(txtTipoConta.getSelectedItem().toString());

            cli.setSaldo(0.0);
            
            cli.setTotal_receitas(0.0);
            
            cli.setTotal_despesas(0.0);

            dao.criarConta(cli);

            limparCampos();

            readJTable();
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
/**<h1>Validação para verificar se o usuário selecionou uma {@link Contas}.</h1>*/

        if (jContas.getSelectedRow() != -1) {

            Contas cli = new Contas();
            ContasDAO dao = new ContasDAO();

            cli.setId_conta((int) jContas.getValueAt(jContas.getSelectedRow(), 0));

            dao.excluirConta(cli);

            limparCampos();

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma registro na tabela para excluir a conta do banco de dados.");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
/**<h1>Validação para verificar se o usuário selecionou uma {@link Contas}.</h1>*/

        if (jContas.getSelectedRow() != -1) {

            Contas cli = new Contas();
            ContasDAO dao = new ContasDAO();

            cli.setNome(txtNomeCliente.getText());

            cli.setSobrenome(txtSobrenomeCliente.getText());

            cli.setAgenciaBancaria(txtAgenciaBancaria.getSelectedItem().toString());

            cli.setTipoConta(txtTipoConta.getSelectedItem().toString());

            cli.setId_conta((int) jContas.getValueAt(jContas.getSelectedRow(), 0));

            dao.editarConta(cli);

            limparCampos();

            readJTable();

        } else {
            
            JOptionPane.showMessageDialog(null, "Selecione uma registro na tabela para atualizar os dados da conta.");

        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContasMouseClicked

        if (jContas.getSelectedRow() != -1) {

            txtNomeCliente.setText(jContas.getValueAt(jContas.getSelectedRow(), 1).toString());
            txtSobrenomeCliente.setText(jContas.getValueAt(jContas.getSelectedRow(), 2).toString());
            txtAgenciaBancaria.setSelectedItem(jContas.getValueAt(jContas.getSelectedRow(), 3).toString());
            txtTipoConta.setSelectedItem(jContas.getValueAt(jContas.getSelectedRow(), 4).toString());

        }

    }//GEN-LAST:event_jContasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorId;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTable jContas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JComboBox txtAgenciaBancaria;
    private javax.swing.JTextField txtBuscarId;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JTextField txtSobrenomeCliente;
    private javax.swing.JComboBox txtTipoConta;
    // End of variables declaration//GEN-END:variables
}
