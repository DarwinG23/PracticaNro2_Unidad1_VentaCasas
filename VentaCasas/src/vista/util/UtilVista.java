/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.util;

import controlador.Dao.controladorDao.TipoCasaControl;
import exeption.EmptyException;
import javax.swing.JComboBox;
import modelo.TipoCasa;

/**
 *
 * @author darwin
 */
public class UtilVista {
    public static void cargarcomboTipoCasa(JComboBox cbx) throws EmptyException{
        TipoCasaControl tc = new TipoCasaControl();
        cbx.removeAllItems();
        if(tc.getListC().isEmpty()){
            throw new EmptyException("No hay tipos de casa que mostrar");
        }
        else{
           for (int i = 0; i < tc.getListC().getLength(); i++) {
            cbx.addItem(tc.getListC().getInfo(i));
           }
        }
    }
    
    public static TipoCasa obtenerTipoCasaControl(JComboBox cbx){
        return (TipoCasa) cbx.getSelectedItem();
    }
    
}
