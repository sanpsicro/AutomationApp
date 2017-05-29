package windows_functionality;

import java.awt.Point;
import java.awt.dnd.DropTargetDropEvent;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.TransferHandler;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
	
	
	
	
    private String[] columnNames;
    
   

    private Object[][] data;
    
    public int getColumnCount() {
      return columnNames.length;
    }

    public int getRowCount() {
      return data.length;
    }

    public String getColumnName(int col) {
      return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
      return data[row][col];
    }
    
    public void setColumnNames(String[] columnas){
    	this.columnNames = columnas;
    	
    }
    
    public void setMatrixData(Object[][] datos){
    	this.data = datos;
    	
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
      Class clazz = String.class;
      switch (columnIndex) {
        case 0:
          clazz = Boolean.class;
          break;
      }
      return clazz;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
      return column == 0;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
   //     super.setValueAt(aValue, rowIndex, columnIndex); by default empty implementation is not necesary if direct parent is AbstractTableModel
        data[rowIndex][columnIndex] = aValue; 
        fireTableCellUpdated(rowIndex, columnIndex);// notify listeners
        System.out.println(aValue);
    }
    
    
 


    
     
}

