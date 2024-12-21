/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_sobre_POO;

/**
 *
 * @author HP
 */
public class Cuenta {
    // Atributos
    String titular;
    double cantidad;

    // Constructor con cantidad opcional
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Constructor con titular y cantidad inicial
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0.0;
        }
    }
        public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    // Método para ingresar dinero a la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
            }
        }
    }

    // Método toString para representar la cuenta como cadena
    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }
}