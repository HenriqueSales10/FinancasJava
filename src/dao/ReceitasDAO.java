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
import model.Receitas;

/**
 *
 * @author Henrique
 * <p>
 * Classe reponsável por realizar consultas, inserções e atualizações de {@link Despesas}
 * no banco de dados .</p>
 *
 *
 */
public class ReceitasDAO {
/**
 *
 * 
 * <p>
 * Método responsável por inserir {@link Receitas} no banco de dados .</p>
 *
 *
     * @param rec
 */
    public void criarReceita(Receitas rec) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO receitas (id_conta,data_Recebimento,data_RecebimentoEsperado,descricao,tipo_Receita,valor_receita,recebimentoRegistrado)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, rec.getId_conta());
            stmt.setString(2, rec.getData_Recebimento());
            stmt.setString(3, rec.getData_RecebimentoEsperado());
            stmt.setString(4, rec.getDescricao());
            stmt.setString(5, rec.getTipo_Receita());
            stmt.setDouble(6, rec.getValor_Receita());
            stmt.setString(7, rec.getRecebimentoRegistrado());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Receita cadastrada com sucesso!");
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
 * Método responsável por registrar as  {@link Receitas} no banco de dados. Este método realiza a
 * a adição de valor no saldo da {@link Contas} conforme o valor da receita.</p>
 *
 *
 */
    public void registrarReceita(Receitas rec){
        Connection con = ConnectionFactory.getConnection();
        
        Contas cont = new Contas();
        
        PreparedStatement stmt = null, stmt2;

        try {
          
            String sqlupdate = "update contas set saldo= saldo+ ?, total_receitas= total_receitas+ ? where id_conta= ?";
            stmt = con.prepareStatement(sqlupdate);
            stmt.setDouble(1, rec.getValor_Receita());
            stmt.setDouble(2, rec.getValor_Receita());
            stmt.setInt(3, rec.getId_conta());

            stmt.executeUpdate();
            
            String sqlupdate2 = "update receitas set recebimentoRegistrado = 'Sim' where id_receita= ?";
            stmt2 = con.prepareStatement(sqlupdate2);
            stmt2.setInt(1, rec.getId_receita());
            
            
            stmt2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Receita registrada com sucesso! O saldo da sua conta foi atualizado.");
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
 * Método responsável por listar as receitas {@link Receitas} cadastradas no banco de dados.</p>
 *
 *
     * @param numConta
     * @return 
 */    
    public List<Receitas> listarReceitas(int numConta) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Receitas> receitas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM receitas where id_conta = ?");
            stmt.setInt(1, numConta);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Receitas receita = new Receitas();

                receita.setId_receita(rs.getInt("id_receita"));
                receita.setId_conta(rs.getInt("id_conta"));
                receita.setData_Recebimento(rs.getString("data_Recebimento"));
                receita.setData_RecebimentoEsperado(rs.getString("data_RecebimentoEsperado"));
                receita.setDescricao(rs.getString("descricao"));
                receita.setTipo_Receita(rs.getString("tipo_Receita"));
                receita.setValor_Receita(rs.getDouble("valor_receita"));
                receita.setRecebimentoRegistrado(rs.getString("recebimentoRegistrado"));
                receitas.add(receita);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReceitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return receitas;

    }
/**
 *
 * 
 * <p>
 * Método responsável por listar as receitas {@link Receitas} cadastradas no banco de dados realizando uma
 * filtragem pelo tipo da receita.</p>
 *
 *
     * @param tipo
     * @param idConta
     * @return 
 */    
    public List<Receitas> listarReceitasPorTipo(String tipo, int idConta) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Receitas> receitas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM receitas WHERE tipo_Receita = ? and id_conta = ?");
            stmt.setString(1, tipo);
            stmt.setInt(2, idConta);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Receitas receita = new Receitas();

                receita.setId_receita(rs.getInt("id_receita"));
                receita.setId_conta(rs.getInt("id_conta"));
                receita.setData_Recebimento(rs.getString("data_Recebimento"));
                receita.setData_RecebimentoEsperado(rs.getString("data_RecebimentoEsperado"));
                receita.setDescricao(rs.getString("descricao"));
                receita.setTipo_Receita(rs.getString("tipo_Receita"));
                receita.setValor_Receita(rs.getDouble("valor_receita"));
                receita.setRecebimentoRegistrado(rs.getString("recebimentoRegistrado"));
                receitas.add(receita);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReceitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return receitas;

    }
 /**
 *
 * 
 * <p>
 * Método reponsável por listar somente as {@link Receitas} registradas no banco de dados.
 * Ou seja, {@link Receitas} que foram registradas no sistema e somaram valores ao saldo da {@link Contas}</p>
     * @param idConta
     * @return 
 *
 *
 */ 
    public List<Receitas> listarSomenteReceitasRegistradas(int idConta) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Receitas> receitas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM receitas WHERE recebimentoRegistrado = 'Sim' and id_conta = ?");
            stmt.setInt(1, idConta);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Receitas receita = new Receitas();

                receita.setId_receita(rs.getInt("id_receita"));
                receita.setId_conta(rs.getInt("id_conta"));
                receita.setData_Recebimento(rs.getString("data_Recebimento"));
                receita.setData_RecebimentoEsperado(rs.getString("data_RecebimentoEsperado"));
                receita.setDescricao(rs.getString("descricao"));
                receita.setTipo_Receita(rs.getString("tipo_Receita"));
                receita.setValor_Receita(rs.getDouble("valor_receita"));
                receita.setRecebimentoRegistrado(rs.getString("recebimentoRegistrado"));
                receitas.add(receita);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReceitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return receitas;

    }
/**
 *
 * 
 * <p>
 * Método reponsável por editar as {@link Receitas} cadastradas no banco de dados. 
 *
 *
     * @param rec
 */     
    public void editarReceitas(Receitas rec) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE receitas SET data_Recebimento = ? ,data_RecebimentoEsperado = ?,descricao = ?, tipo_Receita = ?, valor_receita = ? WHERE id_receita = ?");
            stmt.setString(1, rec.getData_Recebimento());
            stmt.setString(2, rec.getData_RecebimentoEsperado());
            stmt.setString(3, rec.getDescricao());
            stmt.setString(4, rec.getTipo_Receita());
            stmt.setDouble(5, rec.getValor_Receita());
            stmt.setInt(6, rec.getId_receita());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Receita atualizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
/**
 *
 * 
 * <p>
 * Método reponsável por excluir as {@link Receitas} cadastradas no banco de dados. 
 *
 *
     * @param rec
 */     
     public void excluirReceita(Receitas rec) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM receitas WHERE id_receita = ?");
            stmt.setInt(1, rec.getId_receita());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Receita excluída com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
