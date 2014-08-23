/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

import org.testng.Assert;
import parcial.Ejercicio5;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import parcial.Ejercicio4;


/**
 *
 * @author F211
 */
public class TestEjercicio5 {
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaEje5xVarNegativos() {
        Ejercicio5 ej = new Ejercicio5(25,-52);
    }
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaEje5xVarEnCero() {
        Ejercicio5 ej = new Ejercicio5(25,0);
    }
    @Test void calcularVol(){
        Ejercicio5 ej = new Ejercicio5(3,15);
        Assert.assertEquals(ej.calcularVol(), 423);
    }
     @Test void calcularArea(){
        Ejercicio5 ej = new Ejercicio5(3,15);
        Assert.assertEquals(ej.calcularArea(), 282);
    }
    
}
