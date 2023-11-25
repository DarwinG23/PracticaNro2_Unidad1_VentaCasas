/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.util;

import controlador.Dao.controladorDao.VendedorControl;
import exeption.EmptyException;
import javax.swing.JComboBox;
import modelo.Vendedor;

/**
 *
 * @author darwi
 */
public class UtilVistaVendedor {
     public static void cargarcomboVendedor(JComboBox cbx) throws EmptyException{
        VendedorControl vc = new VendedorControl();
        cbx.removeAllItems();
        if(vc.getListVendedor().isEmpty()){
            throw new EmptyException("No hay vendedores que mostrar");
        }
        else{
           for (int i = 0; i < vc.getListVendedor().getLength(); i++) {
            cbx.addItem(vc.getListVendedor().getInfo(i));
           }
        }
    }
    
    public static Vendedor obtenerVendedor(JComboBox cbx){
        return (Vendedor) cbx.getSelectedItem();
    }
    
}
