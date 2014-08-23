/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

import parcial.Ejercicio3;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 *
 * @author F211
 */
public class TestEjercicio3 {
    
       @Test 
       public void sumaCorrecta(){
        Ejercicio3 ej = new Ejercicio3();
        Assert.assertEquals(ej.calcularSuma(), 55);
    }
 }

