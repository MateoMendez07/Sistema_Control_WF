/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.math.BigDecimal;

/**
 *
 * @author tutut
 */
public class Saldo {
    private double saldoTotal;
    
    public Saldo(){
    }

    public Saldo(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public Double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
}
