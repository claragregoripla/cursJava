/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;//ho tenim pk al maven hem agregat la llibreria junit
import static org.junit.jupiter.api.Assertions.assertEquals;//ASKSERGI, per què és estàtic?

/**
 *
 * @author clara.gregori
 */
public class CalculadoraTest {

    //també es pot debugar el test. CalculadoraTest.java -> botó dret -> Debug test File

    Calculadora calculadora = new Calculadora();

//2.10f -> decimal de tipus float!!
    @Test //ara java sap que és test
    void testSumaFloat() { // test + nomDelMetode
        assertEquals(5.50, calculadora.suma(2.10f, 3.40f));//testejar si dos valors són iguals
    }

    @Test //ara java sap que és test
    void testSumaBigDecimal() {
        BigDecimal resultado = new BigDecimal("2.94");
//        resultado.setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(0, calculadora.suma(new BigDecimal("1.505"),
                new BigDecimal("1.440")).compareTo(resultado));
    }

}
