/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma; //carpetes disn d'un compilat/packet per a distribuir de forma correcta el nostre codi

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author clara.gregori
 */
//"public" per accedir des de fora
//una classe -> un fitxers, expecio: "inner classes" per escoltar events, qua una classe cridi a una altra classe
public class Calculadora { //plantilla/model de software
//enter
    public int suma(int num1, int num2) {// cap enter
        return num1 + num2;
    }// cap enter
    //enter
    public float suma(float num1, float num2) {// cap enter
        return num1 + num2;
    }// cap enter
    //enter
    public BigDecimal suma(BigDecimal num1, BigDecimal num2) {// cap enter
        BigDecimal resultado = num1.add(num2); // versus fer new()
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);//2 decimals, el rounding es fa AL FINAL
        return rounded;
    }// cap enter
    //enter
    public int resta(int num1, int num2) {// cap enter
        return num1 - num2;
    }// cap enter
    //enter
    public BigDecimal resta(BigDecimal num1, BigDecimal num2) {// cap enter
        BigDecimal resultado = num1.subtract(num2); // versus fer new()
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);//2 decimals, el rounding es fa AL FINAL
        return rounded;
    }// cap enter
    //enter
    public int multiplicacio(int num1, int num2) {// cap enter
        return num1 * num2;
    }// cap enter
    //enter
    public BigDecimal multiplicacio(BigDecimal num1, BigDecimal num2) {// cap enter
        BigDecimal resultado = num1.multiply(num2); // versus fer new()
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);//2 decimals, el rounding es fa AL FINAL
        return rounded;
    }// cap enter
    //enter
    public int divisio(int num1, int num2) {// cap enter
        return num1 / num2;
    }// cap enter
    //enter
    public BigDecimal divisio(BigDecimal num1, BigDecimal num2) {// cap enter
        BigDecimal resultado = num1.divide(num2); // versus fer new()
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);//2 decimals, el rounding es fa AL FINAL
        return rounded;
    }// cap enter
    //enter
    public float modulo(int num1, int num2) {
        return num1 % num2;
    }
//    // enter
//    public BigDecimal modulo(BigDecimal num1, BigDecimal num2) {// cap enter
//        BigDecimal resultado = num1.m(num2); // versus fer new()
//        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);//2 decimals, el rounding es fa AL FINAL
//        return rounded;
//    }// cap enter
    //enter
}//cap enter des del últim parentesis
