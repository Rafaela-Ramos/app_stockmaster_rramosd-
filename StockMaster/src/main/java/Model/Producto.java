
package Model;

import java.util.Date;

public class Producto {
    private int idProducto;
    private String codigoUnico;
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidadStock;
    private int stockMinimo;
    private int idCategoria;
    private Date fechaIngreso;
    private Date fechaFabricacion;
    private Date fechaVencimiento;
    private int alertaVencimiento;

    public Producto() {
    }

    public Producto(int idProducto, String codigoUnico, String nombreProducto, String descripcion,
                    double precio, int cantidadStock, int stockMinimo, int idCategoria,
                    Date fechaIngreso, Date fechaFabricacion, Date fechaVencimiento, int alertaVencimiento) {
        this.idProducto = idProducto;
        this.codigoUnico = codigoUnico;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.stockMinimo = stockMinimo;
        this.idCategoria = idCategoria;
        this.fechaIngreso = fechaIngreso;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.alertaVencimiento = alertaVencimiento;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getAlertaVencimiento() {
        return alertaVencimiento;
    }

    public void setAlertaVencimiento(int alertaVencimiento) {
        this.alertaVencimiento = alertaVencimiento;
    }
}