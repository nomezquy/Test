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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String numeroMotor, String color) {
        this.numeroMotor = numeroMotor;
        this.color = color;
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
        return "Vehiculo{" + "numeroMotor=" + numeroMotor + ", color=" + color + ", marca=" + marca + '}';
    }

   
    

}
