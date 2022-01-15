package paineis;

import dao.ContasDAO;
import dao.DespesasDAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Contas;
import model.Despesas;
import util.EstilizarTable;
import util.ValidarEntradaValores;

/**
 *
 * @author henrique
 */
public final class PnlDespesas extends javax.swing.JPanel {

    Connection con1;
    PreparedStatement insert;
    PreparedStatement insert2;
    ResultSet rs1;

    public PnlDespesas() {
        initComponents();

        EstilizarTable est = new EstilizarTable();

        est.estlizarTable(jTableDespesas);

        txtDesp.setDocument(new ValidarEntradaValores());

    }
 /**
     * <h1>Método responsável por realizar a limpeza dos campos que contém a descrição, valor, data e data esperada da {@link Despesas} .</h1>
     *
     *
     * @see {@link limparCampos}
     */
    public void limparCampos() {
        txtDesc.setText("");
        txtDesp.setText("");
        txtDataDesp.setText("");
        txtDataDespEsp.setText("");
    }

     /**
     * <h1>Método responsável por mostrar os dados referente às {@link Despesas} cadastradas no sistema
     * através do recebimento dos dados na tabela jTableDespesas.</h1>
     *
     *
     * @param numConta
     * @see {@link readJTable}
     */
    public void readJTable(int numConta) {

        DefaultTableModel modelo = (DefaultTableModel) jTableDespesas.getModel();
        modelo.setNumRows(0);

        DespesasDAO despDAO = new DespesasDAO();

        despDAO.listarDespesas(numConta).forEach((rec) -> {
            modelo.addRow(new Object[]{
                rec.getId_despesa(),
                rec.getNumero_conta(),
                rec.getDescricao(),
                rec.getTipo_depesa(),
                rec.getData_despesa(),
                rec.getData_despesa_esperado(),
                rec.getDespesaRegistrada(),
                rec.getValor_despesa()
            });
        });

    }

     /**
     * <h1>Método responsável por mostrar os dados referente às {@link Despesas} cadastradas no sistema
     * através do recebimento dos dados na tabela jTableDespesas realizando uma filtragem pelo tipo da {@link Despesas} .</h1>
     *
     *
     * @param tipo
     * @param idConta
     * @see {@link readJTableForId}
     */
    public void readJTableForTipo(String tipo, int idConta) {

        DefaultTableModel modelo = (DefaultTableModel) jTableDespesas.getModel();
        modelo.setNumRows(0);
        DespesasDAO pdao = new DespesasDAO();

        pdao.listarDespesasPorTipo(tipo, idConta).forEach((rec) -> {
            modelo.addRow(new Object[]{
                rec.getId_despesa(),
                rec.getNumero_conta(),
                rec.getDescricao(),
                rec.getTipo_depesa(),
                rec.getData_despesa(),
                rec.getData_despesa_esperado(),
                rec.getDespesaRegistrada(),
                rec.getValor_despesa()
            });
        });

    }
/**
     * <h1>Método responsável por mostrar os dados referente às {@link Despesas} cadastradas no sistema
     * através do recebimento dos dados na tabela jTableDespesas realizando uma filtragem com o objetivo de listar somente
     * despesas registradas no sistema (Ou seja, despesas que alteraram o saldo da {@link Contas}) .</h1>
     *
     *
     * @param idConta
     * @see {@link readJTableForId}
     */
     public void readJTableSomenteDespesasRegistradas(int idConta) {

        DefaultTableModel modelo = (DefaultTableModel) jTableDespesas.getModel();
        modelo.setNumRows(0);
        DespesasDAO pdao = new DespesasDAO();

        pdao.listarSomenteDespesasRegistradas(idConta).forEach((rec) -> {
            modelo.addRow(new Object[]{
                rec.getId_despesa(),
                rec.getNumero_conta(),
                rec.getDescricao(),
                rec.getTipo_depesa(),
                rec.getData_despesa(),
                rec.getData_despesa_esperado(),
                rec.getDespesaRegistrada(),
                rec.getValor_despesa()
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDespesas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnRegistrarDespesa = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        lblSaldoAtual = new javax.swing.JLabel();
        txtSaldoAtual = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumConta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDtDesp = new javax.swing.JLabel();
        txtDataDesp = new javax.swing.JFormattedTextField();
        lblDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JEditorPane();
        lblTipo = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        lblValor = new javax.swing.JLabel();
        txtDesp = new javax.swing.JTextField();
        btnBuscarTipo = new javax.swing.JButton();
        txtDataDespEsp = new javax.swing.JFormattedTextField();
        lblDtDespEsp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1902, 1033));
        setMinimumSize(new java.awt.Dimension(1902, 1033));
        setPreferredSize(new java.awt.Dimension(1902, 1033));
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
        jLabel1.setText("Despesas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 400, 70));

        jTableDespesas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id despesa", "Número da conta", "Descrição", "Tipo da despesa", "Data de despesa", "Data de despesa esperado", "Despesa registrada?", "Valor da despesa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDespesas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDespesasMouseClicked(evt);
            }
        });
        jTableDespesas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableDespesasKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDespesas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 710, 1380, 220));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Valor total de despesas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 210, 240, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Listar despesas registradas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, -1, 50));

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 570, 90, 50));

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 90, 50));

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, 120, 50));

        btnRegistrarDespesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrarDespesa.setText("Registrar despesa");
        btnRegistrarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDespesaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarDespesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 500, -1, 50));

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblIdCliente.setText("Número da conta");
        jPanel1.add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 140, 30));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 51, 51));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(51, 51, 51));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 220, 30));

        lblSaldoAtual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSaldoAtual.setForeground(new java.awt.Color(51, 51, 51));
        lblSaldoAtual.setText("Saldo atual");
        jPanel1.add(lblSaldoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, -1, -1));

        txtSaldoAtual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSaldoAtual.setForeground(new java.awt.Color(0, 102, 0));
        txtSaldoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtSaldoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, 150, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Insira o número da conta");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 638, -1));

        txtNumConta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNumConta.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNumConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 280, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PnlPequeno.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, 220));

        lblDtDesp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDtDesp.setForeground(new java.awt.Color(51, 51, 51));
        lblDtDesp.setText("Data de despesa");
        jPanel1.add(lblDtDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, 30));

        try {
            txtDataDesp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDesp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDataDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 120, 30));

        lblDesc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(51, 51, 51));
        lblDesc.setText("Descrição");
        jPanel1.add(lblDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, 30));

        txtDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDesc.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(txtDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 470, 150));

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(51, 51, 51));
        lblTipo.setText("Tipo");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, -1, 30));

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentação", "Educação", "Lazer", "Moradia", "Roupa", "Saúde", "Transporte", "Outros" }));
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 240, 30));

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblValor.setForeground(new java.awt.Color(51, 51, 51));
        lblValor.setText("Valor");
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, -1, 30));

        txtDesp.setBackground(new java.awt.Color(0, 0, 0));
        txtDesp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDesp.setForeground(new java.awt.Color(255, 255, 255));
        txtDesp.setText("O");
        jPanel1.add(txtDesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 510, 174, 30));

        btnBuscarTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarTipo.setText("Buscar");
        btnBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 410, -1, 30));

        try {
            txtDataDespEsp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDespEsp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDataDespEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 114, 30));

        lblDtDespEsp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDtDespEsp.setForeground(new java.awt.Color(51, 51, 51));
        lblDtDespEsp.setText("Data de despesa esperado");
        jPanel1.add(lblDtDespEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PnlMédio.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 920, 370));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
/**<h1>Validação para verificar se o usuário digitou as informações necessárias para realizar o cadastro da {@link Despesas}.</h1>*/


        Despesas desp = new Despesas();
        DespesasDAO dao = new DespesasDAO();

        if (txtIdCliente.getText().isEmpty() || txtDesc.getText().isEmpty()
                || txtDesp.getText().isEmpty() || txtDesp.getText().equals("0")) {

            JOptionPane.showMessageDialog(null, "Favor informar todos os campos para realizar o cadastro.");

        } else {

            desp.setNumero_conta(Integer.parseInt(txtNumConta.getText()));
            desp.setDescricao((txtDesc.getText()));
            desp.setTipo_depesa((comboTipo.getSelectedItem().toString()));
            desp.setData_despesa((txtDataDesp.getText()));
            desp.setData_despesa_esperado((txtDataDespEsp.getText()));
            desp.setDespesaRegistrada("Não");
            desp.setValor_despesa(Double.parseDouble(txtDesp.getText()));

            dao.criarDespesa(desp);

            limparCampos();

            int numeroConta = Integer.parseInt(txtNumConta.getText());

            readJTable(numeroConta);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Validação para verificar se o usuário informou o número da conta
        if (txtNumConta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o número da conta.");
        } else {

            ContasDAO cDAO = new ContasDAO();

            Contas cont = new Contas();

            int numConta = Integer.parseInt(txtNumConta.getText());

            cDAO.encontrarConta(numConta);

            if (cDAO.getEncontrou() == true) {

                txtIdCliente.setText(Integer.toString(cDAO.getIdCliente()));
                txtNome.setText(cDAO.getNomeCliente() + " " + cDAO.getSobrenomeCliente());
                txtSaldoAtual.setText(Double.toString(cDAO.getSaldo()));

                DespesasDAO daoDespesas = new DespesasDAO();

                daoDespesas.listarDespesas(numConta);

                readJTable(numConta);
            }

        }

        if(Double.parseDouble(txtSaldoAtual.getText()) <= 0){
            txtSaldoAtual.setForeground(Color.red);
            lblSaldoAtual.setForeground(Color.red);
        }
        else{
            txtSaldoAtual.setForeground(Color.green);
            lblSaldoAtual.setForeground(Color.green);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDespesaActionPerformed

        if (jTableDespesas.getSelectedRow() != -1) {

            Despesas desp = new Despesas();
            DespesasDAO dao = new DespesasDAO();

            desp.setId_despesa(Integer.parseInt(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 0).toString()));
            desp.setNumero_conta(Integer.parseInt(txtIdCliente.getText()));
            desp.setValor_despesa(Double.parseDouble(txtDesp.getText()));

            //Validação para verificar se a {@link Despesas} já foi registrada no sistema
            if (jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 6).equals("Sim")) {
                JOptionPane.showMessageDialog(null, "Despesa já registrada no sistema, não é possível registrá-la novamente.");
            } else {

                dao.registrarDespesa(desp);

                ContasDAO cDAO = new ContasDAO();

                cDAO.encontrarConta(Integer.parseInt(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 1).toString()));

                txtIdCliente.setText(Integer.toString(cDAO.getIdCliente()));
                txtNome.setText(cDAO.getNomeCliente() + " " + cDAO.getSobrenomeCliente());
                txtSaldoAtual.setText(Double.toString(cDAO.getSaldo()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma despesa para registrá-a no sistema.");
        }

    }//GEN-LAST:event_btnRegistrarDespesaActionPerformed

    private void jTableDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDespesasMouseClicked

        if (jTableDespesas.getSelectedRow() != -1) {

            txtNumConta.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 1).toString());
            txtDesc.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 2).toString());
            comboTipo.setSelectedItem(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 3).toString());
            txtDataDesp.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 4).toString());
            txtDataDespEsp.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 5).toString());
            txtDesp.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 7).toString());

        }


    }//GEN-LAST:event_jTableDespesasMouseClicked

    private void jTableDespesasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableDespesasKeyReleased
        if (jTableDespesas.getSelectedRow() != -1) {

            txtNumConta.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 1).toString());
            txtDataDesp.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 2).toString());
            txtDataDespEsp.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 3).toString());
            txtDesc.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 4).toString());
            comboTipo.setSelectedItem(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 5).toString());
            txtDesp.setText(jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 7).toString());

        }
    }//GEN-LAST:event_jTableDespesasKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (jTableDespesas.getSelectedRow() != -1) {

            //Validação para verificar se o usuário informou o número da conta
            if (jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 6).equals("Sim")) {
                JOptionPane.showMessageDialog(null, "Despesa já registrada no sistema, não é possível editá-la .");
            } else {

                Despesas desp = new Despesas();
                DespesasDAO dao = new DespesasDAO();

                desp.setDescricao(txtDesc.getText());
                desp.setTipo_depesa(comboTipo.getSelectedItem().toString());
                desp.setData_despesa(txtDataDesp.getText());
                desp.setData_despesa_esperado(txtDataDespEsp.getText());
                desp.setValor_despesa(Double.parseDouble(txtDesp.getText()));

                desp.setId_despesa((int) jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 0));
                dao.editarDespesa(desp);

                limparCampos();

                int numeroConta = Integer.parseInt(txtNumConta.getText());

                readJTable(numeroConta);

            }
        } else {

            JOptionPane.showMessageDialog(null, "Selecione uma despesa para editar.");

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoActionPerformed
        
        //Validação para verificar se o usuário informou o número da conta
        if (txtIdCliente.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe o número da sua conta.");

        } else {
            readJTableForTipo(comboTipo.getSelectedItem().toString(), Integer.parseInt(txtIdCliente.getText()));
        }
    }//GEN-LAST:event_btnBuscarTipoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (jTableDespesas.getSelectedRow() != -1) {

            Despesas desp = new Despesas();
            DespesasDAO dao = new DespesasDAO();

            desp.setId_despesa((int) jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 0));

            String campoSim = (String) jTableDespesas.getValueAt(jTableDespesas.getSelectedRow(), 6);
            
            //Validação para verificar se a {@link Despesas} já foi registrada no sistema
            if (campoSim.equals("Sim")) {
                JOptionPane.showMessageDialog(null, "Não é possível excluir uma despesa já registrada");
            } else {

                dao.excluirDespesa(desp);

                limparCampos();

                int numeroConta = Integer.parseInt(txtNumConta.getText());

                readJTable(numeroConta);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma despesa para excluir.");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //Validação para verificar se o usuário informou o número da conta
        if (txtIdCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione o número da conta");
        } else {
            ContasDAO cdao = new ContasDAO();
            int idConta = Integer.parseInt(txtIdCliente.getText());
            cdao.listarTotalDespesasPorId(idConta);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        //Validação para verificar se o usuário informou o número da conta
        if (txtIdCliente.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe o número da sua conta.");

        } else {
            readJTableSomenteDespesasRegistradas(Integer.parseInt(txtIdCliente.getText()));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarTipo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRegistrarDespesa;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDespesas;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDtDesp;
    private javax.swing.JLabel lblDtDespEsp;
    public javax.swing.JLabel lblIdCliente;
    public javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblResultado;
    public javax.swing.JLabel lblSaldoAtual;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JFormattedTextField txtDataDesp;
    private javax.swing.JFormattedTextField txtDataDespEsp;
    private javax.swing.JEditorPane txtDesc;
    private javax.swing.JTextField txtDesp;
    public javax.swing.JLabel txtIdCliente;
    public javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtNumConta;
    private javax.swing.JLabel txtResultado;
    public javax.swing.JLabel txtSaldoAtual;
    // End of variables declaration//GEN-END:variables
}
