/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.tablas;

import controlador.listas.DynamicList;
import exeption.EmptyException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelo.Venta;

/**
 *
 * @author darwin
 */
public class ModeloTablaVenta extends AbstractTableModel{
    
    private DynamicList<Venta> ventas;
    
    
    @Override
    public int getRowCount() {
        return ventas.getLength();
    }

    @Override
    public int getColumnCount() { //Agregar columnas
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venta v;
       try {
           v = (Venta)ventas.getInfo(rowIndex);
           switch (columnIndex) {
            case 0:
                return (v != null) ? v.getFecha(): " ";
            case 1:
                return (v != null) ? v.getPrecio() : " ";
            case 2:
                return (v != null) ? v.getComision(): "";
            case 3:
                return (v != null) ? v.getNum_Casa(): "";
            case 4:
                return (v != null) ? v.getDetalle() : "";
            case 5:
                return (v != null) ? v.getId_vendedor() : "";
            default:
                return null;
        }
       } catch (EmptyException e) {
           JOptionPane.showMessageDialog(null, "Ocurrió un error al obtener la información. Por favor, inténtelo de nuevo o contacte al soporte.", "Error", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        
    }
    

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "FECHA";
            case 1:
                return "VALOR PAGADO";
            case 2:
                return "COMISION";
            case 3:
                return "CASA";
            case 4:
                return "DETALLE";
            case 5:
                return "VENDEDOR ID";
            default:
                return null;
        }
    }
   
    /**
     * @return the personas
     */
    public DynamicList getVentas() {
        return ventas;
    }

    /**
     * 
     * @param ventas
     */
    public void setVentas(DynamicList ventas) {
        this.ventas = ventas;
    }
    
}
