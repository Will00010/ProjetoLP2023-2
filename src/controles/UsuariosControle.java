/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import bean.UsuariosCwmo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class UsuariosControle  extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public UsuariosCwmo getBean(int row){
    return (UsuariosCwmo)lista.get(row);
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
       
      UsuariosCwmo usuariosCwmo = (UsuariosCwmo) lista.get(rowIndex);
        if (columnIndex == 0){
        return usuariosCwmo.getIdusuariosCwmo();
        }
        if (columnIndex == 1){
        return usuariosCwmo.getNomeCwmo();
        }
        if (columnIndex == 2){
        return usuariosCwmo.getApelidoCwmo();
        }
        if (columnIndex == 3){
        return usuariosCwmo.getCpfCwmo();
        }
      return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "nome";
        }
        if (column == 2){
        return "apelido";
        }
        if (column == 3){
        return "cpf";
        }
               
        return "";
    };
}
