package controles;

import bean.VendasProdutoCwmo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
public class VendasProdutoControle  extends AbstractTableModel{
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    };

    @Override
    public int getRowCount() {
    return lista.size();
    }

    @Override
    public int getColumnCount() {
return 4;
    }
        public VendasProdutoCwmo getBean(int row){
    return (VendasProdutoCwmo)lista.get(row);
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        VendasProdutoCwmo vendasProdutosCwmo = (VendasProdutoCwmo) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendasProdutosCwmo.getGuitarraCwmo().getModeloCwmo();
        }
        if (columnIndex == 1) {
            return vendasProdutosCwmo.getQuantidadeCwmo();
        }
        if (columnIndex == 2) {
            return vendasProdutosCwmo.getValorunitarioCwmo();
        }
        if (columnIndex == 3) {
            return vendasProdutosCwmo.getValorunitarioCwmo() * vendasProdutosCwmo.getQuantidadeCwmo();
        }
        return "";
    }
     @Override
    public String getColumnName(int column){
        if (column == 0){
        return "Modelo da Guitarra";
        }
        if (column == 1){
        return "Quantidade";
        }
        if (column == 2){
        return "Valor Unitario";
        }
        if (column == 3){
        return "Total";
        }
               
        return "";
      };
    public void addBean(VendasProdutoCwmo vendasProdutoCwmo){
    lista.add(vendasProdutoCwmo);
    this.fireTableDataChanged();
    }
    public void updateBean(int index, VendasProdutoCwmo vendasProdutoCwmo){
    lista.set(index, vendasProdutoCwmo);
    this.fireTableDataChanged();
    }
    public void removeBean(int index) {
    lista.remove(index);
    this.fireTableDataChanged();
    }
}
