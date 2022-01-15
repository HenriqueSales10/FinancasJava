package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Contas;
import paineis.PnlReceitas;

/**
 *
 * @author Henrique
 * <p>
 * Classe reponsável por realizar consultas, inserções e edições nas {@link Contas}
 * cadastradas no banco de dados .</p>
 *
 *
 */
public class ContasDAO {

 /**
 *
 * @author Henrique
 * <p>
 * Método responsável por realizar a criação das {@link Contas} no banco de dados .</p>
     * @param conta
 *
 *
 */
    public void criarConta(Contas conta) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO contas (nome,sobrenome,instituicaoFinanceira,tipoConta,saldo,total_receitas, total_despesas)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, conta.getNome());
            stmt.setString(2, conta.getSobrenome());
            stmt.setString(3, conta.getAgenciaBancaria());
            stmt.setString(4, conta.getTipoConta());
            stmt.setDouble(5, conta.getSaldo());
            stmt.setDouble(6, conta.getTotal_receitas());
            stmt.setDouble(7, conta.getTotal_despesas());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Sucesso ao realizar a criação da conta");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
/**
 *
 * @author Henrique
 * <p>
 * Método responsável por realizar a listagem das {@link Contas} cadastradas no banco de dados .</p>
     * @return 
 *
 *
 */
    public List<Contas> listarContas() {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Contas> contas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM contas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Contas conta = new Contas();

                conta.setId_conta(rs.getInt("id_conta"));
                conta.setNome(rs.getString("nome"));
                conta.setSobrenome(rs.getString("sobrenome"));
                conta.setAgenciaBancaria(rs.getString("instituicaoFinanceira"));
                conta.setTipoConta(rs.getString("tipoConta"));
                conta.setSaldo(rs.getDouble("saldo"));
                conta.setTotal_receitas(rs.getDouble("total_receitas"));
                conta.setTotal_despesas(rs.getDouble("total_despesas"));
                contas.add(conta);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return contas;

    }
/**
 *
 * @author Henrique
 * <p>
 * Método responsável por realizar a listagem do total de receitas cadastradas no banco de dados
 * para uma {@link Contas} específica.</p>
     * @param id
     * @return 
 *
 *
 */
    public List<Contas> listarTotalReceitasPorId(int id) {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Contas> contas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT total_receitas FROM contas WHERE id_conta = ?");
            stmt.setInt(1, id);

            rs = stmt.executeQuery();
            
            while (rs.next()) {

                Contas conta = new Contas();

                conta.setTotal_receitas(rs.getDouble("total_receitas"));
                JOptionPane.showMessageDialog(null, "O valor total de receitas registradas nesta conta é R$" + conta.getTotal_receitas());
                contas.add(conta);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return contas;
    }
/**
 *
 * @author Henrique
 * <p>
 * Método responsável por realizar a listagem do total de despesas cadastradas no banco de dados
 * para uma {@link Contas} específica.</p>
     * @param id
     * @return 
 *
 *
 */ 
    public List<Contas> listarTotalDespesasPorId(int id) {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Contas> contas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT total_despesas FROM contas WHERE id_conta = ?");
            stmt.setInt(1, id);

            rs = stmt.executeQuery();
            
            while (rs.next()) {

                Contas conta = new Contas();

                conta.setTotal_despesas(rs.getDouble("total_despesas"));
                JOptionPane.showMessageDialog(null, "O valor total de despesas registradas nesta conta é R$" + conta.getTotal_despesas());
                contas.add(conta);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return contas;
    }

/**
 *
 * @author Henrique
 * <p>
 * Método responsável por realizar a listagem das {@link Contas} cadastradas no banco de dados
 * realizando uma filtragem pelo id da conta.</p>
     * @param id
     * @return 
 *
 *
 */
    public List<Contas> listarContasPorId(int id) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Contas> contas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM contas WHERE id_conta = ?");
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            while (rs.next()) {

                Contas conta = new Contas();

                conta.setId_conta(rs.getInt("id_conta"));
                conta.setNome(rs.getString("nome"));
                conta.setSobrenome(rs.getString("sobrenome"));
                conta.setAgenciaBancaria(rs.getString("instituicaoFinanceira"));
                conta.setTipoConta(rs.getString("tipoConta"));
                conta.setSaldo(rs.getDouble("saldo"));
                conta.setTotal_receitas(rs.getDouble("total_receitas"));
                conta.setTotal_receitas(rs.getDouble("total_despesas"));
                contas.add(conta);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return contas;

    }
/**
 *
 * @author Henrique
 * <p>
 * Método responsável por realizar a edição de dados pertencetes às {@link Contas}
 * cadastradas no sistema.</p> 
     * @param cont 
 *
 *
 */
    public void editarConta(Contas cont) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE contas SET nome = ? ,sobrenome = ?,instituicaoFinanceira = ?, tipoConta = ? WHERE id_conta = ?");
            stmt.setString(1, cont.getNome());
            stmt.setString(2, cont.getSobrenome());
            stmt.setString(3, cont.getAgenciaBancaria());
            stmt.setString(4, cont.getTipoConta());
            stmt.setInt(5, cont.getId_conta());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
/**
 *
 * @author Henrique
 * <p>
 * Método responsável por realizar a exclusão de {@link Contas} cadastradas no banco de dados.</p>
     * @param cont 
 *
 *
 */
    public void excluirConta(Contas cont) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM contas WHERE id_conta = ?");
            stmt.setInt(1, cont.getId_conta());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Conta excluída com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
/**
 *
 * @author Henrique
 * <p>
 * Método responsável por verificar se determinada {@link Contas} existe no banco de dados.</p>
     * @param numConta 
 *
 *
 */
    public void encontrarConta(int numConta) {

        PnlReceitas pnl = new PnlReceitas();

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("select id_conta,nome,sobrenome,saldo from contas where id_conta = ?");
            stmt.setInt(1, numConta);

            ResultSet rs1;

            rs1 = stmt.executeQuery();

            if (rs1.next() == false) {

                setEncontrou(false);

                JOptionPane.showMessageDialog(null, "Conta não registrada no sistema ou excluída");

            } else {

                setEncontrou(true);

                setIdCliente(rs1.getInt(1));

                setNomeCliente(rs1.getString(2));

                setSobrenomeCliente(rs1.getString(3));

                setSaldo(rs1.getDouble(4));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    int idCliente;
    String nomeCliente, sobrenomeCliente;
    Double saldo;
    public boolean encontrou;

    public boolean getEncontrou() {
        return encontrou;
    }

    public void setEncontrou(boolean encontrou) {
        this.encontrou = encontrou;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
