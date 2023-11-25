/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Dao.controladorDao;

import controlador.Dao.DaoImplement;
import controlador.listas.DynamicList;
import exeption.EmptyException;
import modelo.Vendedor;

/**
 *
 * @author darwi
 */
public class VendedorControl extends DaoImplement<Vendedor>{
    private DynamicList<Vendedor> listVendedor;
    private Vendedor vendedor;

    public VendedorControl() {
        super(Vendedor.class);
    }
    

    public DynamicList<Vendedor> getListVendedor() {
        listVendedor = all();
        return listVendedor;
    }

    public void setListC(DynamicList<Vendedor> ListTipoCasa) {
        this.listVendedor= ListTipoCasa;
    }

    public Vendedor getVendedor() {
        if (vendedor == null){
            vendedor = new Vendedor();
        }
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public Boolean persist(){
        vendedor.setId(all().getLength()+1);
        return persist(vendedor);
    }
    
    
}
