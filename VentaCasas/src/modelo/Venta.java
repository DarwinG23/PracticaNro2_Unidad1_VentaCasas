/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author darwin
 */
public class Venta {
    private Integer id;
    private Date fecha;
    private String precio;
    private String num_Casa;
    private String comision;
    private String detalle;
    private String id_vendedor;

    public Venta() {
        this.id = null;
        this.detalle = null;
        this.comision = null;
        this.num_Casa = null;
        this.fecha = new Date();
        this.precio = null;
        this.id_vendedor = null;
    }

    public Venta(Integer id, Date fecha, String precio, String id_Casa, String comision, String detalle, String id_Vendedor) {
        this.id = id;
        this.fecha = new Date();
        this.precio = precio;
        this.num_Casa = id_Casa;
        this.comision = comision;
        this.detalle = detalle;
        this.id_vendedor = id_Vendedor;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
    
   

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActualString = formato.format(fecha);
        return fechaActualString;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNum_Casa() {
        return num_Casa;
    }

    public void setNum_Casa(String id_Casa) {
        this.num_Casa = id_Casa;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }
    
    
    
    
}
