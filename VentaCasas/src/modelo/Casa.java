/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author darwin
 */
public class Casa {
    private Integer id;
    private String areaConstruccion;
    private String direccion;
    private TipoCasa id_tipoCasa;
    private String numPisos;
    private Boolean vedida;
    private String descripcion;
    private String costo;
    private String dimensionTerreno;
    private String num_Casa;
    private String id_vendedor;

    public Casa(Integer id, String areaConstruccion, String direccion, TipoCasa id_tipoCasa, String numPisos, Boolean vedida, String descripcion, String costo, String dimensionTerreno, String id_vendedor) {
        this.id = id;
        this.areaConstruccion = areaConstruccion;
        this.direccion = direccion;
        this.id_tipoCasa = id_tipoCasa;
        this.numPisos = numPisos;
        this.descripcion = descripcion;
        this.dimensionTerreno = dimensionTerreno;
        this.costo = costo;
        this.id_vendedor = id_vendedor;
    }
    
    public Casa() {
        this.id = null;
        this.areaConstruccion = null;
        this.direccion = null;
        this.id_tipoCasa = null;
        this.numPisos = null;
        this.vedida = null;
        this.descripcion = null;
        this.costo = null;
        this.dimensionTerreno = null;
        this.id_vendedor=null;
    }

    public String getNum_Casa() {
        return num_Casa;
    }

    public void setNum_Casa(String num_Casa) {
        this.num_Casa = num_Casa;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaConstruccion() {
        return areaConstruccion;
    }

    public void setAreaConstruccion(String areaConstruccion) {
        this.areaConstruccion = areaConstruccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoCasa getId_tipoCasa() {
        return id_tipoCasa;
    }

    public void setId_tipoCasa(TipoCasa id_tipoCasa) {
        this.id_tipoCasa = id_tipoCasa;
    }

    public String getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(String numPisos) {
        this.numPisos = numPisos;
    }

    public Boolean getVedida() {
        return vedida;
    }

    public void setVedida(Boolean vedida) {
        this.vedida = vedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getDimensionTerreno() {
        return dimensionTerreno;
    }

    public void setDimensionTerreno(String dimensionTerreno) {
        this.dimensionTerreno = dimensionTerreno;
    }   

    @Override
    public String toString() {
        return id_tipoCasa + " | " + num_Casa ;
    }
    
    
}
