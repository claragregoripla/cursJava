/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.exercisi29042021;

/**
 *
 * @author clara.gregori
 */
public class Empleado {

    private String nombre; //private!!!!!!!!!!

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    private String apellidos; //private
    private float sueldo; //private

    public Empleado(String nombre, String apellidos, float sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }

}
