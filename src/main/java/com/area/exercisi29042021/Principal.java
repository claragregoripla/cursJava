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
public class Principal {

    public static void main(String[] args) {

        //opcio1
        Empleado empleadoList[];
        empleadoList = new Empleado[5];//aquí és on ocupa espai a la RAM
//        //opcio2
//        Empleado empleados[] = new Empleado[5];

        empleadoList[0] = new Empleado("A", "Ba", 23.00f);
        empleadoList[1] = new Empleado("B", "Ba", 24.00f);
        empleadoList[2] = new Empleado("C", "Ba", 21.00f);
        empleadoList[3] = new Empleado("D", "Ba", 20.00f);
        empleadoList[4] = new Empleado("E", "Ba", 19.00f);
        float sueldoTotal = 0.00f;

        //més recomanale "forEach", que el "for" per Orientació a objectes, TOT i que forEach és una mica més lent
        for (Empleado empleado : empleadoList) {// per a cada empleat de l'array empleats
            sueldoTotal = sueldoTotal + +empleado.getSueldo();
        }
        System.out.println("El sueldo total es " + sueldoTotal);




    }

}
