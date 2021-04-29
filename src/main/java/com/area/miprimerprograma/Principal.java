/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;

import java.math.BigDecimal;

/**
 *
 * @author clara.gregori
 */
public class Principal {
//la línea vermella de la dreta == 80 caràcters (màxim recomanat per bona praxis)
    public static void main(String[] args) {
        //creo una instància, això morirà un cop s'hagi executat (NO ES SINGLETON)
        //Nom_Classe nom_objecte/variable = new Nom_classe();
        Calculadora calculadora = new Calculadora(); // un cop creat l'objecte puc accedir als mètdoes que NO tinguin la paraula Static // si el mètode té Static, són mètdoes de Clase i No d'objecte ex: main

        System.out.println("La suma de enteros es: " + calculadora.suma(2, 2)); //+ concatenar
        //si s'han de fer moltes concatenacions MILLOR utilitzar StringBuilder si tenim Single Thread
        //si és multithreading haurem de fer-ho d'una altra manera, tindrem un Stream? Buffer
System.out.println("El resultado de la suma con decimales es : "
                + calculadora.suma(new BigDecimal(1.505), new BigDecimal(1.440)));
    }//eliminem aquest nom_objecte/variable es fa de forma automàtica amb el Garbadge Collector

}
