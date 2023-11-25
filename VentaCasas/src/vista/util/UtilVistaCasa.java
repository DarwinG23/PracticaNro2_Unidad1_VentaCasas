/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.util;

import controlador.Dao.controladorDao.CasaControl;
import exeption.EmptyException;
import javax.swing.JComboBox;
import modelo.Casa;

/**
 *
 * @author darwin
 */
public class UtilVistaCasa {
    public static void cargarcomboCasa(JComboBox cbx) throws EmptyException{
        CasaControl cc = new CasaControl();
        cbx.removeAllItems();
        if(cc.getListC().isEmpty()){
            throw new EmptyException("No hay tipos de casa que mostrar");
        }
        else{
           for (int i = 0; i < cc.getListC().getLength(); i++) {
            cbx.addItem(cc.getListC().getInfo(i));
           }
        }
    }
    
    public static Casa obtenerCasa(JComboBox cbx){
        return (Casa) cbx.getSelectedItem();
    }
    
}
