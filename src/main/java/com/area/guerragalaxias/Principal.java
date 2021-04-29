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
public class Principal {

    public static void main(String[] args) {
        System.out.println("\nEJERCICIO 2");
        Jedi lukeSkywalker = new Jedi("Luke Skywalker", "azul");
        Jedi maceWindu = new Jedi("A", "verde");

        lukeSkywalker.mostrar();
        maceWindu.mostrar();

    }

}
