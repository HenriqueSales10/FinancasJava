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
import model.Transferencias;

/**
 *
 * @author Henrique
 * <p>
 * Classe responsável por realizar transferências entre {@link Contas}.</p>
 *
 *
 */
public class TransferenciasDAO {
    
    boolean encontrado;
    
    public void realizarTransferencia(Transferencias transf){
        Connection con = ConnectionFactory.getConnection();
        
        Contas cont = new Contas();
        
        PreparedStatement stmt = null , stmt2 = null, stmt3 = null;
        
         try {
          
            String sqlupdate = "update contas set saldo= saldo- ? where id_conta= ?";
            stmt = con.prepareStatement(sqlupdate);
            stmt.setDouble(1, transf.getValor_transferencia());
            stmt.setInt(2, transf.getConta_origem());

            stmt.executeUpdate();
            
            String sqlupdate2 = "update contas set saldo= saldo+ ? where id_conta= ?";
            stmt2 = con.prepareStatement(sqlupdate2);
            stmt2.setDouble(1, transf.getValor_transferencia());
            stmt2.setInt(2, transf.getConta_destino());
                       
            stmt2.executeUpdate();
            
            String sqlInsert = "insert into transferencias(conta_origem,conta_destino,valor_transferencia) values(?,?,?)";
            stmt3 = con.prepareStatement(sqlInsert);
            stmt3.setInt(1, transf.getConta_origem());
            stmt3.setInt(2, transf.getConta_destino());
            stmt3.setDouble(3, transf.getValor_transferencia());
            
            stmt3.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Transferência registrada com sucesso! O saldo da conta foi atualizado.");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            ConnectionFactory.closeConnection(con, stmt2);
            ConnectionFactory.closeConnection(con, stmt3);
            
        }
            
    }
    
    
     public List<Transferencias> listarTransferencias(int numConta) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Transferencias> transferencias = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM transferencias where conta_origem = ?");
            stmt.setInt(1, numConta);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Transferencias transferencia = new Transferencias();

                transferencia.setId_transferencia(rs.getInt("id_transferencia"));
                transferencia.setConta_origem(rs.getInt("conta_origem"));
                transferencia.setConta_destino(rs.getInt("conta_destino"));
                transferencia.setValor_transferencia(rs.getDouble("valor_transferencia"));

                transferencias.add(transferencia);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TransferenciasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return transferencias;

    }
    
    
}
