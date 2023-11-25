/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.tablas;

import controlador.listas.DynamicList;
import exeption.EmptyException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelo.Casa;

/**
 *
 * @author darwi
 */
public class ModeloTablaCasa extends  AbstractTableModel {
    private DynamicList<Casa> casas;
    
    
    @Override
    public int getRowCount() {
        return casas.getLength();
    }

    @Override
    public int getColumnCount() { //Agregar columnas
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Casa c;
       try {
           c = (Casa)casas.getInfo(rowIndex);
           switch (columnIndex) {
            case 0:
                return (c != null) ? c.getId_tipoCasa().getNombre(): " ";
            case 1:
                return (c != null) ? c.getNumPisos(): " ";
            case 2:
                return (c != null) ? c.getDimensionTerreno(): "";
            case 3:
                return (c != null) ? c.getDireccion(): "";
            case 4:
                return (c != null) ? c.getDescripcion(): "";
            case 5:
                return (c != null) ? c.getCosto(): "";
            case 6:
                return (c != null) ? c.getNum_Casa(): "";
            case 7:
                return (c != null) ? c.getAreaConstruccion(): "";
            case 8:
                return (c != null) ? c.getId_vendedor(): "";
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
                return "TIPO";
            case 1:
                return "PISOS";
            case 2:
                return "DIMENSIÓN TERRENO";
            case 3:
                return "DIRECCIÓN";
            case 4:
                return "DESCRIPCIÓN";
            case 5:
                return "COSTO";
            case 6:
                return "NÚMERO";
            case 7:
                return "ÁREA";
            case 8:
                return "VENDEDOR ID";
            default:
                return null;
        }
    }
    /**
     * @return the personas
     */
    public DynamicList getCasas() {
        return casas;
    }

    /**
     * @param casas the personas to set
     */
    public void setCasas(DynamicList casas) {
        this.casas = casas;
    }
}
