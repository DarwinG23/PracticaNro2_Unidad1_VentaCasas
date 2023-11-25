/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Dao.controladorDao;

import controlador.Dao.DaoImplement;
import controlador.listas.DynamicList;
import modelo.TipoCasa;

/**
 *
 * @author darwin
 */
public class TipoCasaControl extends DaoImplement<TipoCasa>{
    private DynamicList<TipoCasa> listTipoCasa;
    private TipoCasa tipoCasa;

    public TipoCasaControl() {
        super(TipoCasa.class);
    }
    

    public DynamicList<TipoCasa> getListC() {
        listTipoCasa = all();
        return listTipoCasa;
    }

    public void setListC(DynamicList<TipoCasa> ListTipoCasa) {
        this.listTipoCasa = ListTipoCasa;
    }

    public TipoCasa getTipoCasa() {
        if (tipoCasa == null){
            tipoCasa = new TipoCasa();
        }
        return tipoCasa;
    }

    public void setTipoCasa(TipoCasa tipoCasa) {
        this.tipoCasa = tipoCasa;
    }
    
    public Boolean persist(){
        tipoCasa.setId(all().getLength()+1);
        return persist(tipoCasa);
    }
    
    public static void main(String[] args) {
        TipoCasaControl tcc = new TipoCasaControl();
        tcc.getTipoCasa().setId(1);
        tcc.getTipoCasa().setNombre( "Unifamiliar");
        tcc.getTipoCasa().setDescripcion("lote individual y no comparte paredes con otras propiedades.");
        tcc.persist();
        tcc.setTipoCasa(null);
        
        tcc.getTipoCasa().setId(2);
        tcc.getTipoCasa().setNombre( "Apartamento");
        tcc.getTipoCasa().setDescripcion("Unidad residencial ubicada dentro de un edificio más grande que puede tener múltiples pisos.");
        tcc.persist();
        tcc.setTipoCasa(null);
        
        
        tcc.getTipoCasa().setId(3);
        tcc.getTipoCasa().setNombre( "Chalet");
        tcc.getTipoCasa().setDescripcion("Una casa más grande y lujosa, a menudo ubicada en zonas suburbanas o rurales, con amplios terrenos y comodidades adicionales como piscinas, jardines extensos, etc.");
        tcc.persist();
        tcc.setTipoCasa(null);        
    }
    
}
