/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.GuitarraCwmo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class GuitarraControle  extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public GuitarraCwmo getBean(int row){
    return (GuitarraCwmo)lista.get(row);
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
       
      GuitarraCwmo guitarraCwmo = (GuitarraCwmo) lista.get(rowIndex);
        if (columnIndex == 0){
        return guitarraCwmo.getIdprodutosCwmo();
        }
        if (columnIndex == 1){
        return guitarraCwmo.getModeloCwmo();
        }
        if (columnIndex == 2){
        return guitarraCwmo.getTipoCwmo();
        }
        if (columnIndex == 3){
        return guitarraCwmo.getPonteCwmo();
        }
      return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "Modelo";
        }
        if (column == 2){
        return "Tipo";
        }
        if (column == 3){
        return "Ponte";
        }
               
        return "";
    };
}
