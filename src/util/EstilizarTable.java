package util;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * <h1>Classe responsável por estilizar as tabelas presentes no sistema</h1>
 *
 * <p>
 * Altera o design das tabelas do sistema.</p>
 *
 * @author Henrique
 */
public class EstilizarTable {
    
    public void estlizarTable(JTable tab){
        DefaultTableModel modelo = (DefaultTableModel) tab.getModel();
        tab.setRowSorter(new TableRowSorter(modelo));
        tab.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tab.getTableHeader().setOpaque(false);
        tab.getTableHeader().setBackground(new Color(0, 0, 0));
        tab.getTableHeader().setForeground(new Color(255, 255, 255));
    }
    
}
