package br.com.edg.marketplace.service;

import javax.swing.table.DefaultTableModel;

/**
 * Class for table utils (add, remove, and others)
 * 
 * @author Danilo
 */
public class TableService {
    
    private DefaultTableModel defaultTableModel = null;
    
    public TableService(javax.swing.JTable  tableUtils) {
        this.defaultTableModel = (DefaultTableModel) tableUtils.getModel();
    }

    public void addItem(Object[] args) {
        try {
            defaultTableModel.addRow(args);
        } catch (UnsupportedOperationException e) {
           throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    
    public void removeItem(int index) {
    	try {
            defaultTableModel.removeRow(index);
        } catch (UnsupportedOperationException e) {
           throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
