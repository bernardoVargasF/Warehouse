package Inventory;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Bernardo
 */
public class TableColorCellRenderer implements TableCellRenderer {
    
    private static final TableCellRenderer RENDERER = new DefaultTableCellRenderer();
    int min, max;
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        Component c = RENDERER.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
        
        if(column == 4) {
            Object result = table.getModel().getValueAt(row, column);
            min = Integer.parseInt(result.toString());
        }
        if(column == 5) {
            Object result = table.getModel().getValueAt(row, column);
            max = Integer.parseInt(result.toString());
        }

        if (column == 6) {
            Object result = table.getModel().getValueAt(row, column);
            int stock = Integer.parseInt(result.toString());
            

            Color color = null;
            if (stock > min && stock < max) {
                color = Color.GREEN;
            } else if (stock < min) {
                color = color.RED;
            } else if (stock > max) {
                color = color.YELLOW;
            }
            c.setBackground(color);
        }
        else {
            c.setBackground(Color.WHITE);
        }
        return c;
    }
    
}
