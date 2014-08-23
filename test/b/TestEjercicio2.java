/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

import org.testng.Assert;
import parcial.Ejercicio2;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import parcial.Ejercicio1;

/**
 *
 * @author F211
 */
public class TestEjercicio2 {
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaMayorxVarIguales() {
        Ejercicio2 ej = new Ejercicio2(3,3,4);
    }
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaMayorxVarEnCero(){
        Ejercicio2 ej = new Ejercicio2(5, 0, 3);
    }
    
    @Test void aEsMayor(){
        Ejercicio2 ej = new Ejercicio2(20, 5, 10);
        Assert.assertEquals(ej.encontrarMayor(), "a es el mayor");
    }
    
     @Test void bEsMayor(){
        Ejercicio2 ej = new Ejercicio2(1, 25, 10);
        Assert.assertEquals(ej.encontrarMayor(), "b es el mayor");
    }
     
     @Test void cEsMayor(){
        Ejercicio2 ej = new Ejercicio2(20, 15, 50);
        Assert.assertEquals(ej.encontrarMayor(), "c es el mayor");
    }
    
    }

   

