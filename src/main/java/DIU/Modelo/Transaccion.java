/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author tutut
 */
public class Transaccion {
    private int id;
    private String tipo;
    private BigDecimal monto;
    private LocalDateTime fechaHora;
    private String descripcion;
    private Administrador administrador;
    
    public Transaccion(){
    }

    public Transaccion(int id, String tipo, BigDecimal monto, LocalDateTime fechaHora, String descripcion, Administrador administrador) {
        this.id = id;
        this.tipo = tipo;
        this.monto = monto;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.administrador = administrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
}
