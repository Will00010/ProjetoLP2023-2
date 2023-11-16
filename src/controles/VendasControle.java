/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;


import bean.VendasCwmo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class VendasControle extends AbstractTableModel{
      List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public VendasCwmo getBean(int row){
    return (VendasCwmo)lista.get(row);
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
    }
  
    @Override
    public int getColumnCount() {
return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
      VendasCwmo vendasCwmo = (VendasCwmo) lista.get(rowIndex);
        if (columnIndex == 0){
        return vendasCwmo.getIdvendasCwmo();
        }
        if (columnIndex == 1 && vendasCwmo.getClientesCwmo() != null){
        return vendasCwmo.getClientesCwmo().getIdClienteCwmo();
        }

        if (columnIndex == 2){
        return vendasCwmo.getDataCwmo();
        }
        if (columnIndex == 3){
        return vendasCwmo.getTotalCwmo();
        }
      return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "Numero da Compra";
        }
        if (column == 1){
        return "Cliente";
        }
        if (column == 2){
        return "Data";
        }
        if (column == 3){
        return "Total";
        }
               
        return "";
    };
}
