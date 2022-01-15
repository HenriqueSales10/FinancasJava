package connection;

import java.sql.*;
import java.util.logging.*;

/**
 * <h1>Classe responsável pela conexão com o banco</h1>
 *
 * <p>
 * Conecta o programa com o banco de dados MySQL referenciada.</p>
 *
 * @author Henrique
 */
public class ConnectionFactory {

    /**
     *
     * < h1>Inicia a conexao com o banco MySQL</h1>
     *
     * <p>
     * Prepara uma conexão JDBC com o mysql, informa url, user e password para
     * que possa ser iniciada a conexão com DB "dbFinancasPessoais"</p>
     *
     * @return conexao Connection, retorna a conexão caso tenha conseguido
     * estabelecer a conexão, e null caso não tenha conseguido.
     *
     * @author henrique
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbFinancasPessoais";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
