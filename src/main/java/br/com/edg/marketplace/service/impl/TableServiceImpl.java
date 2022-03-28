package br.com.edg.marketplace.service.impl;

import br.com.edg.marketplace.service.TableService;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Class for table utils (add, remove, and others)
 * 
 * @author Danilo
 */
public class TableServiceImpl implements TableService {
    
    private final DefaultTableModel defaultTableModel;
    
    public TableServiceImpl(javax.swing.JTable tableUtils) {
        this.defaultTableModel = (DefaultTableModel) tableUtils.getModel();
    }

    @Override
    public void addItem(Object... args) {
        try {
            defaultTableModel.addRow(args);
        } catch (UnsupportedOperationException e) {
           throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    @Override
    public void removeItem(JTable tableUtils) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
