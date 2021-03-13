/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.gov.umanizales;

import java.io.Serializable;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vehiculo implements Serializable{
    
    private String numeroMotor;
    private String color;
    private String marca;
    private String placa;
    private String numeroChasis;

    public Vehiculo(String numeroMotor, String color, String marca, String placa, String numeroChasis) {
        this.numeroMotor = numeroMotor;
        this.color = color;
        this.marca = marca;
        this.placa = placa;
        this.numeroChasis = numeroChasis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numeroMotor=" + numeroMotor + ", color=" + color + ", marca=" + marca + ", placa=" + placa + ", numeroChasis=" + numeroChasis + '}';
    }

    
   
    

}
