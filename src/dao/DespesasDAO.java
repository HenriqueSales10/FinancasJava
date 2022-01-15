package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import model.Contas;
import model.Despesas;

/**
 *
 * @author Henrique
 * <p>
 * Classe responsável por realizar consultas, inserções e atualizações de {@link Despesas}
 * no banco de dados .</p>
 *
 *
 */
public class DespesasDAO {
/**
 *
 * 
 * <p>
 * Método responsável por inserir {@link Despesas} no banco de dados .</p>
     * @param desp
 *
 *
 */
    public void criarDespesa(Despesas desp) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO despesas (numero_conta,descricao,tipo_despesa,data_despesa,data_despesa_esperado,despesa_registrada,valor_despesa)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, desp.getNumero_conta());
            stmt.setString(2, desp.getDescricao());
            stmt.setString(3, desp.getTipo_depesa());
            stmt.setString(4, desp.getData_despesa());
            stmt.setString(5, desp.getData_despesa_esperado());
            stmt.setString(6, desp.getDespesaRegistrada());
            stmt.setDouble(7, desp.getValor_despesa());
            
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Despesa cadastrada com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
/**
 *
 * 
 * <p>
 * Método responsável por registrar as {@link Despesas} no banco de dados. Este método realiza a
 * a diminuição do saldo da {@link Contas} conforme o valor da despesa.</p>
     * @param desp
 *
 *
 */
    public void registrarDespesa(Despesas desp){
        Connection con = ConnectionFactory.getConnection();
        
        Contas cont = new Contas();
        
        PreparedStatement stmt = null, stmt2;

        try {
          
            String sqlupdate = "update contas set saldo= saldo- ?, total_despesas= total_despesas+ ? where id_conta= ?";
            stmt = con.prepareStatement(sqlupdate);
            stmt.setDouble(1, desp.getValor_despesa());
            stmt.setDouble(2, desp.getValor_despesa());
            stmt.setInt(3, desp.getNumero_conta());

            stmt.executeUpdate();
            
            String sqlupdate2 = "update despesas set despesa_registrada = 'Sim' where id_despesa= ?";
            stmt2 = con.prepareStatement(sqlupdate2);
            stmt2.setInt(1, desp.getId_despesa());
            
            
            stmt2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Despesa registrada com sucesso! O saldo da sua conta foi atualizado.");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
/**
 *
 * 
 * <p>
 * Método responsável por listar as {@link Despesas} cadastradas no banco de dados.</p>
     * @param numConta
     * @return 
 *
 *
 */ 
    public List<Despesas> listarDespesas(int numConta) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Despesas> despesas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM despesas where numero_conta = ?");
            stmt.setInt(1, numConta);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Despesas despesa = new Despesas();

                despesa.setId_despesa(rs.getInt("id_despesa"));
                despesa.setNumero_conta (rs.getInt("numero_conta"));
                despesa.setDescricao(rs.getString("descricao"));
                despesa.setTipo_depesa(rs.getString("tipo_despesa"));
                despesa.setData_despesa(rs.getString("data_despesa"));
                despesa.setData_despesa_esperado(rs.getString("data_despesa_esperado"));
                despesa.setDespesaRegistrada(rs.getString("despesa_registrada"));
                despesa.setValor_despesa(rs.getDouble("valor_despesa"));
                despesas.add(despesa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReceitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return despesas;

    }
/**
 *
 * 
 * <p>
 * Método reponsável por listar as {@link Despesas} cadastradas no banco de dados realizando uma filtragem pelo tipo 
 * da despesa.</p>
     * @param tipo
     * @param idConta
     * @return 
 *
 *
 */ 
    public List<Despesas> listarDespesasPorTipo(String tipo, int idConta) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Despesas> despesas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM despesas WHERE tipo_despesa = ? and numero_conta = ?");
            stmt.setString(1, tipo);
            stmt.setInt(2, idConta);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Despesas despesa = new Despesas();

                despesa.setId_despesa(rs.getInt("id_despesa"));
                despesa.setNumero_conta (rs.getInt("numero_conta"));
                despesa.setDescricao(rs.getString("descricao"));
                despesa.setTipo_depesa(rs.getString("tipo_despesa"));
                despesa.setData_despesa(rs.getString("data_despesa"));
                despesa.setData_despesa_esperado(rs.getString("data_despesa_esperado"));
                despesa.setDespesaRegistrada(rs.getString("despesa_registrada"));
                despesa.setValor_despesa(rs.getDouble("valor_despesa"));
                despesas.add(despesa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReceitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return despesas;

    }
/**
 *
 * 
 * <p>
 * Método reponsável por listar somente as {@link Despesas} registradas no banco de dados.
 * Ou seja, {@link Despesas} que foram registradas no sistema e descontaram valores do saldo da {@link Contas}</p>
     * @param idConta
     * @return 
 *
 *
 */ 
    public List<Despesas> listarSomenteDespesasRegistradas(int idConta) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Despesas> despesas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM despesas WHERE despesa_registrada = 'Sim' and numero_conta = ?");
            stmt.setInt(1, idConta);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Despesas despesa = new Despesas();

                despesa.setId_despesa(rs.getInt("id_despesa"));
                despesa.setNumero_conta (rs.getInt("numero_conta"));
                despesa.setDescricao(rs.getString("descricao"));
                despesa.setTipo_depesa(rs.getString("tipo_despesa"));
                despesa.setData_despesa(rs.getString("data_despesa"));
                despesa.setData_despesa_esperado(rs.getString("data_despesa_esperado"));
                despesa.setDespesaRegistrada(rs.getString("despesa_registrada"));
                despesa.setValor_despesa(rs.getDouble("valor_despesa"));
                despesas.add(despesa);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReceitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return despesas;

    }
    /**
 *
 * 
 * <p>
 * Método responsável por editar as {@link Despesas} cadastradas no banco de dados.</p>
     * @param desp 
 *
 *
 */ 
    public void editarDespesa(Despesas desp) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE despesas SET  descricao = ?, tipo_despesa = ?, data_despesa = ? ,data_despesa_esperado = ?,  valor_despesa = ? WHERE id_despesa = ?");
            
            stmt.setString(1, desp.getDescricao());
            stmt.setString(2, desp.getTipo_depesa());
            stmt.setString(3, desp.getData_despesa());
            stmt.setString(4, desp.getData_despesa_esperado());    
            stmt.setDouble(5, desp.getValor_despesa());
            stmt.setInt(6, desp.getId_despesa());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Despesa atualizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar despesa: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
/**
 *
 * 
 * <p>
 * Método responsável por excluir as {@link Despesas} cadastradas no banco de dados.</p>
     * @param desp 
 *
 *
 */ 
    public void excluirDespesa(Despesas desp) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM despesas WHERE id_despesa = ?");
            stmt.setInt(1, desp.getId_despesa());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Despesa excluída com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir despesa: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
