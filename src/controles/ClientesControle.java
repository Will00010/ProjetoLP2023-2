package controles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import bean.ClientesCwmo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class ClientesControle extends AbstractTableModel {
  List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };
    public ClientesCwmo getBean(int row){
    return (ClientesCwmo)lista.get(row);
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
 
        ClientesCwmo clientesCwmo = (ClientesCwmo) lista.get(rowIndex);
        if (columnIndex == 0){
        return clientesCwmo.getIdClienteCwmo();
        }
        if (columnIndex == 1 && clientesCwmo.getUsuariosCwmo() != null){
        return clientesCwmo.getUsuariosCwmo().getNomeCwmo();
        }
        if (columnIndex == 2){
        return clientesCwmo.getTelefoneCwmo();
        }
        if (columnIndex == 3){
        return clientesCwmo.getEmailCwmo();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "ID Cliente";
        }
        if (column == 1){
        return "Nome Usuario";
        }
        if (column == 2){
        return "Telefone";
        }
        if (column == 3){
        return "Email";
        }
               
        return "";
      };
}
