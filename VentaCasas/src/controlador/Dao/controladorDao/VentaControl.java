/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Dao.controladorDao;

import controlador.Dao.DaoImplement;
import controlador.listas.DynamicList;
import modelo.Venta;

/**
 *
 * @author darwin
 */
public class VentaControl extends DaoImplement<Venta>{
    private DynamicList<Venta> listVenta;
    private Venta venta;

    public VentaControl() {
        super(Venta.class);
    }
    

    public DynamicList<Venta> getListC() {
        listVenta = all();
        return listVenta;
    }

    public void setListC(DynamicList<Venta> listVenta) {
        this.listVenta = listVenta;
    }

    public Venta getVenta() {
        if (venta == null){
            venta = new Venta();
        }
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    public Boolean persist(){
        venta.setId(all().getLength()+1);
        return persist(venta);
    }
    
}
