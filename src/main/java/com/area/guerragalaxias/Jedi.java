/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.guerragalaxias;

/**
 *
 * @author clara.gregori
 */
public class Jedi {

    // l'ambit per defecte en java és de package. aquestes variables es veurien a dins de TOT el packet. sino, hauríem de fer privat i public.
    //ATRIBUTS::
    String nombre;
    String colorSableLuz;

    //CONSTUCTOR, menys quan és singleton, el constuctor serà public. mètodes per a construir l'objecte.
    //els constructors 1- es diuen igual que el nom de la classe 2- no retornen cap tipus
    //els constructors, ámbit nombre_classe (parámetres)
    // al constructor inicialitzem els atributs de l'objecte del tipus (clase) Jedi
    // aquest constructor es cridarà quan fem un "new" de la clase Jedi
    public Jedi(String nombre, String colorSableLux) { //per assignar valors a les variables de la classe
        this.nombre = nombre;
        this.colorSableLuz = colorSableLux;
    }

//    opció2 MENYS RECOMANADA
//    public Jedi(String pnombre, String pcolorSableLux) { //per assignar valors a les variables de la classe
//        nombre = pnombre; // no posem "this"
//        colorSableLuz = pcolorSableLux; // no posem "this"
//    }

    //MÈTODE D'OBJECTE
    public void mostrar() {
//        System.out.println("Soy un Jedi, mi nombres es " + this.nombre
//                + " y el color de mi sable de luz es " + this.colorSableLuz);
        System.out.println("Soy un Jedi, mi nombres es " + this.nombre
                + " y el color de mi sable de luz es " + this.colorSableLuz);

        // millor posar "this", pel cas que herdèssim d'una superclasse un atribut que es digués igual...
        // millor posar "this", perquè quedi clar que és D'AQUESTA CLASSE
    }

}
