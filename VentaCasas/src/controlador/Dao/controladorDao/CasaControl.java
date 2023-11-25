/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Dao.controladorDao;

import controlador.Dao.DaoImplement;
import controlador.listas.DynamicList;
import modelo.Casa;

/**
 *
 * @author darwi
 */
public class CasaControl extends DaoImplement <Casa>{
    private DynamicList<Casa> listCasa;
    private Casa casa;

    public CasaControl() {
        super(Casa.class);
    }
    

    public DynamicList<Casa> getListC() {
        listCasa = all();
        return listCasa;
    }

    public void setListC(DynamicList<Casa> ListC) {
        this.listCasa = ListC;
    }

    public Casa getCasa() {
        if(casa ==null){
            casa = new Casa();
        }
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
    public Boolean persist(){
        casa.setId(all().getLength()+1);
        return persist(casa);
    }
}
