package paineis;

import dao.ContasDAO;
import dao.ReceitasDAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Contas;
import model.Receitas;
import util.EstilizarTable;
import util.ValidarEntradaValores;

/**
 *
 * @author henrique
 */
public final class PnlReceitas extends javax.swing.JPanel {

    Connection con1;
    PreparedStatement insert;
    PreparedStatement insert2;
    ResultSet rs1;

    public PnlReceitas() {
        initComponents();

        EstilizarTable est = new EstilizarTable();

        est.estlizarTable(jTableReceitas);

        txtDeposito.setDocument(new ValidarEntradaValores());

    }

    /**
     * <h1>Método responsável por realizar a limpeza dos campos que contém a
     * descrição, valor, data e data esperada das {@link Receitas} .</h1>
     *
     *
     * @see {@link limparCampos}
     */
    public void limparCampos() {
        txtDesc.setText("");
        txtDeposito.setText("");
        txtDataRec.setText("");
        txtDataRecEsp.setText("");
    }

    /**
     * <h1>Método responsável por mostrar os dados referente às {@link Receitas}
     * cadastradas no sistema através do recebimento dos dados na tabela
     * jTableReceitas.</h1>
     *
     *
     * @param numConta
     * @see {@link readJTable}
     */
    public void readJTable(int numConta) {

        DefaultTableModel modelo = (DefaultTableModel) jTableReceitas.getModel();
        modelo.setNumRows(0);

        ReceitasDAO recDAO = new ReceitasDAO();

        recDAO.listarReceitas(numConta).forEach((p) -> {
            modelo.addRow(new Object[]{
                p.getId_receita(),
                p.getId_conta(),
                p.getData_Recebimento(),
                p.getData_RecebimentoEsperado(),
                p.getDescricao(),
                p.getTipo_Receita(),
                p.getValor_Receita(),
                p.getRecebimentoRegistrado()

            });
        });

    }
    /**
     * <h1>Método responsável por atualizar o valor contido nos campos referentes aos dados da conta.</h1>
     *
     *
     * 
     */
    public void atualizarLabels(){
        ContasDAO cDAO = new ContasDAO();

            Contas cont = new Contas();

            cDAO.encontrarConta(Integer.parseInt(txtNumConta.getText()));

            if (cDAO.getEncontrou() == true) {
                txtIdCliente.setText(Integer.toString(cDAO.getIdCliente()));
                txtNome.setText(cDAO.getNomeCliente() + " " + cDAO.getSobrenomeCliente());
                txtSaldoAtual.setText(Double.toString(cDAO.getSaldo()));

                ReceitasDAO daoReceitas = new ReceitasDAO();

                daoReceitas.listarReceitas(Integer.parseInt(txtNumConta.getText()));

                readJTable(Integer.parseInt(txtNumConta.getText()));
            }
        if (Double.parseDouble(txtSaldoAtual.getText()) <= 0) {
            txtSaldoAtual.setForeground(Color.red);
            lblSaldoAtual.setForeground(Color.red);
        } else {
            txtSaldoAtual.setForeground(Color.green);
            lblSaldoAtual.setForeground(Color.green);
    }
    }
    /**
     * <h1>Método responsável por mostrar os dados referente às {@link Receitas}
     * cadastradas no sistema através do recebimento dos dados na tabela
     * jTableReceitas realizando uma filtragem pelo tipo da {@link Receitas}
     * .</h1>
     *
     *
     * @param tipo
     * @param idConta
     * @see {@link readJTableForId}
     */
    public void readJTableForTipo(String tipo, int idConta) {

        DefaultTableModel modelo = (DefaultTableModel) jTableReceitas.getModel();
        modelo.setNumRows(0);
        ReceitasDAO pdao = new ReceitasDAO();

        pdao.listarReceitasPorTipo(tipo, idConta).forEach((rec) -> {
            modelo.addRow(new Object[]{
                rec.getId_receita(),
                rec.getId_conta(),
                rec.getData_Recebimento(),
                rec.getData_RecebimentoEsperado(),
                rec.getDescricao(),
                rec.getTipo_Receita(),
                rec.getValor_Receita(),
                rec.getRecebimentoRegistrado()

            });
        });

    }

    /**
     * <h1>Método responsável por mostrar os dados referente às {@link Receitas}
     * cadastradas no sistema através do recebimento dos dados na tabela
     * jTableReceitas realizando uma filtragem com o objetivo de listar somente
     * receitas registradas no sistema (Ou seja, {@link Receitas} que alteraram
     * o saldo da {@link Contas}) .</h1>
     *
     *
     * @param idConta
     * @see {@link readJTableForId}
     */
    public void readJTableSomenteReceitasRegistradas(int idConta) {

        DefaultTableModel modelo = (DefaultTableModel) jTableReceitas.getModel();
        modelo.setNumRows(0);
        ReceitasDAO pdao = new ReceitasDAO();

        pdao.listarSomenteReceitasRegistradas(idConta).forEach((rec) -> {
            modelo.addRow(new Object[]{
                rec.getId_receita(),
                rec.getId_conta(),
                rec.getData_Recebimento(),
                rec.getData_RecebimentoEsperado(),
                rec.getDescricao(),
                rec.getTipo_Receita(),
                rec.getValor_Receita(),
                rec.getRecebimentoRegistrado()

            });
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableReceitas = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRegistrarReceb = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
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
        lblDtRecEsp = new javax.swing.JLabel();
        txtDataRecEsp = new javax.swing.JFormattedTextField();
        lblDtRec = new javax.swing.JLabel();
        txtDataRec = new javax.swing.JFormattedTextField();
        lblDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JEditorPane();
        lblTipo = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        btnBuscarTipo = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receitas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1510, 60));

        jTableReceitas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableReceitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id receita", "Número da conta", "Data de recebimento", "Data de recebimento esperado", "Descrição", "Tipo da receita", "Valor da receita", "Recebimento registrado?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReceitas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableReceitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReceitasMouseClicked(evt);
            }
        });
        jTableReceitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableReceitasKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableReceitas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, 1380, 230));

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 570, 120, 60));

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, -1, 60));

        btnRegistrarReceb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrarReceb.setText("Registrar recebimento");
        btnRegistrarReceb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRecebActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarReceb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 510, -1, 60));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Visualizar total de receitas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 220, -1, 60));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Listar receitas registradas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, -1, 60));

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, 60));

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdCliente.setText("Nº da conta");
        jPanel1.add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 190, -1));

        txtIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(51, 51, 51));
        txtIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 150, 30));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 51, 51));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 70, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(51, 51, 51));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 290, 30));

        lblSaldoAtual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSaldoAtual.setForeground(new java.awt.Color(51, 51, 51));
        lblSaldoAtual.setText("Saldo atual");
        jPanel1.add(lblSaldoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, -1, -1));

        txtSaldoAtual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSaldoAtual.setForeground(new java.awt.Color(0, 102, 0));
        txtSaldoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtSaldoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 140, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Insira o número da conta");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 640, -1));

        txtNumConta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNumConta.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNumConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 120, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PnlPequeno.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 640, 220));

        lblDtRecEsp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDtRecEsp.setForeground(new java.awt.Color(51, 51, 51));
        lblDtRecEsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDtRecEsp.setText("Data de recebimento esperado");
        jPanel1.add(lblDtRecEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        txtDataRecEsp.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtDataRecEsp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataRecEsp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDataRecEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 103, 30));

        lblDtRec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDtRec.setForeground(new java.awt.Color(51, 51, 51));
        lblDtRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDtRec.setText("Data de recebimento");
        jPanel1.add(lblDtRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        txtDataRec.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtDataRec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataRec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtDataRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 117, -1));

        lblDesc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(51, 51, 51));
        lblDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc.setText("Descrição");
        jPanel1.add(lblDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        txtDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDesc.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(txtDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 450, 154));

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(51, 51, 51));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, -1, -1));

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salário", "Presente", "Prêmio", "Outros" }));
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 210, -1));

        btnBuscarTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarTipo.setText("Buscar");
        btnBuscarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 410, -1, -1));

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblValor.setForeground(new java.awt.Color(51, 51, 51));
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("Valor");
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, -1, -1));

        txtDeposito.setBackground(new java.awt.Color(0, 0, 0));
        txtDeposito.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDeposito.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 510, 182, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PnlMédio.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 370));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1902, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Receitas rec = new Receitas();
        ReceitasDAO dao = new ReceitasDAO();

        /** <h1>Validação para verificar se o usuário digitou as informações
         * necessárias para realizar o cadastro da {@link Despesas}.</h1>
         */
        if (txtIdCliente.getText().isEmpty() || txtDesc.getText().isEmpty()
                || txtDeposito.getText().isEmpty() || txtDeposito.getText().equals("0")) {

            JOptionPane.showMessageDialog(null, "Favor informar todos os campos para realizar o cadastro.");

        } else {

            rec.setId_conta(Integer.parseInt(txtNumConta.getText()));
            rec.setData_Recebimento((txtDataRec.getText()));
            rec.setData_RecebimentoEsperado((txtDataRecEsp.getText()));
            rec.setDescricao((txtDesc.getText()));
            rec.setTipo_Receita((comboTipo.getSelectedItem().toString()));
            rec.setValor_Receita(Double.parseDouble(txtDeposito.getText()));

            rec.setRecebimentoRegistrado("Não");

            dao.criarReceita(rec);

            limparCampos();         

            readJTable(Integer.parseInt(txtNumConta.getText()));

        }


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Validação para verificar se o usuário informou o número da conta
        if (txtNumConta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o número da conta.");
        } else {
            atualizarLabels();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarRecebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRecebActionPerformed

        if (jTableReceitas.getSelectedRow() != -1) {

            Receitas rec = new Receitas();
            ReceitasDAO dao = new ReceitasDAO();

            rec.setId_receita(Integer.parseInt(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 0).toString()));
            rec.setId_conta(Integer.parseInt(txtIdCliente.getText()));
            rec.setValor_Receita(Double.parseDouble(txtDeposito.getText()));

            //Validação para verificar se a receita já foi registrada no sistema
            if (jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 7).equals("Sim")) {
                JOptionPane.showMessageDialog(null, "Receita já registrada no sistema, não é possível registrá-la novamente.");
            } else {
                
                dao.registrarReceita(rec);
                atualizarLabels();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma receita para registrar.");
        }

    }//GEN-LAST:event_btnRegistrarRecebActionPerformed

    private void jTableReceitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReceitasMouseClicked

        if (jTableReceitas.getSelectedRow() != -1) {

            txtNumConta.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 1).toString());
            txtDataRec.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 2).toString());
            txtDataRecEsp.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 3).toString());
            txtDesc.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 4).toString());
            comboTipo.setSelectedItem(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 5).toString());
            txtDeposito.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 6).toString());

        }
    }//GEN-LAST:event_jTableReceitasMouseClicked

    private void jTableReceitasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableReceitasKeyReleased
        if (jTableReceitas.getSelectedRow() != -1) {

            txtNumConta.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 1).toString());
            txtDataRec.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 2).toString());
            txtDataRecEsp.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 3).toString());
            txtDesc.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 4).toString());
            comboTipo.setSelectedItem(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 5).toString());
            txtDeposito.setText(jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 6).toString());

        }
    }//GEN-LAST:event_jTableReceitasKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (jTableReceitas.getSelectedRow() != -1) {

            //Validação para verificar se a receita já foi registrada no sistema
            if (jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 7).equals("Sim")) {
                JOptionPane.showMessageDialog(null, "Receita já registrada no sistema, não é possível editá-la.");
            } else {

                Receitas rec = new Receitas();
                ReceitasDAO dao = new ReceitasDAO();

                rec.setData_Recebimento(txtDataRec.getText());
                rec.setData_RecebimentoEsperado(txtDataRecEsp.getText());
                rec.setDescricao(txtDesc.getText());
                rec.setTipo_Receita(comboTipo.getSelectedItem().toString());
                rec.setValor_Receita(Double.parseDouble(txtDeposito.getText()));

                rec.setId_receita((int) jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 0));
                dao.editarReceitas(rec);

                limparCampos();
                
                readJTable(Integer.parseInt(txtNumConta.getText()));

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma receita para editar.");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoActionPerformed

        //Validação para verificar se o usuário informou o número da conta
        if (txtIdCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor informar o número da conta para realizar a pesquisa de receitas.");
        } else {
            readJTableForTipo(comboTipo.getSelectedItem().toString(), Integer.parseInt(txtIdCliente.getText()));
        }

    }//GEN-LAST:event_btnBuscarTipoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (jTableReceitas.getSelectedRow() != -1) {

            Receitas rec = new Receitas();
            ReceitasDAO dao = new ReceitasDAO();

            rec.setId_receita((int) jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 0));

            String campoSim = (String) jTableReceitas.getValueAt(jTableReceitas.getSelectedRow(), 7);

            //Validação para verificar se a receita já foi registrada no sistema
            if (campoSim.equals("Sim")) {
                JOptionPane.showMessageDialog(null, "Não é possível excluir uma receita já registrada no sistema");
            } else {

                dao.excluirReceita(rec);

                limparCampos();

                readJTable(Integer.parseInt(txtNumConta.getText()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma receita para excluir.");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Validação para verificar se o usuário informou o número da conta
        if (txtIdCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o número da conta");
        } else {
            ContasDAO cdao = new ContasDAO();
            cdao.listarTotalReceitasPorId(Integer.parseInt(txtNumConta.getText()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Validação para verificar se o usuário informou o número da conta
        if (txtIdCliente.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe o número da sua conta.");

        } else {
            readJTableSomenteReceitasRegistradas(Integer.parseInt(txtIdCliente.getText()));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarTipo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRegistrarReceb;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableReceitas;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDtRec;
    private javax.swing.JLabel lblDtRecEsp;
    public javax.swing.JLabel lblIdCliente;
    public javax.swing.JLabel lblNome;
    public javax.swing.JLabel lblSaldoAtual;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JFormattedTextField txtDataRec;
    private javax.swing.JFormattedTextField txtDataRecEsp;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JEditorPane txtDesc;
    public javax.swing.JLabel txtIdCliente;
    public javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtNumConta;
    private javax.swing.JLabel txtResultado;
    public javax.swing.JLabel txtSaldoAtual;
    // End of variables declaration//GEN-END:variables
}
