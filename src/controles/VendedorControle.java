/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.VendedorCwmo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class VendedorControle extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public VendedorCwmo getBean(int row){
    return (VendedorCwmo)lista.get(row);
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
       
      VendedorCwmo vendedorCwmo = (VendedorCwmo) lista.get(rowIndex);
        if (columnIndex == 0){
        return vendedorCwmo.getIdvendedorCwmo();
        }
        if (columnIndex == 1 && vendedorCwmo.getUsuariosCwmo() != null){
        return vendedorCwmo.getUsuariosCwmo().getNomeCwmo();
        }
        if (columnIndex == 2){
        return vendedorCwmo.getTelefoneCwmo();
        }
        if (columnIndex == 3){
        return vendedorCwmo.getCidadeCwmo();
        }
      return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "Nome de Usuario";
        }
        if (column == 2){
        return "Telefone";
        }
        if (column == 3){
        return "Cidade";
        }
               
        return "";
    };
}