 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_sobre_POO;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Persona {
    public final char SEXO_POR_DEFECTO = 'H';
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores
    public Persona() {
       
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        generarDNI();
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this(nombre, edad, sexo);
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos privados
    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }
    }

    private void generarDNI() {
        Random rand = new Random();
        int numeroDNI = rand.nextInt(99999999) + 10000000;
        char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numeroDNI % 23);
        DNI = String.valueOf(numeroDNI) + letra;
    }

    // Métodos públicos
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1; // Bajo peso
        } else if (imc >= 20 && imc <= 25) {
            return 0;  // Peso ideal
        } else {
            return 1;  // Sobrepeso
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

     @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo
                + "\nPeso: " + peso + " kg\nAltura: " + altura + " m";
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
