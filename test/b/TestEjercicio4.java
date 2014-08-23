/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b;

import org.testng.Assert;
import parcial.Ejercicio4;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import parcial.Ejercicio2;


/**
 *
 * @author F211
 */
public class TestEjercicio4 {
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaEje4xVarNegativos() {
        Ejercicio4 ej = new Ejercicio4(25,-52);
    }
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaEje4xVarEnCero() {
        Ejercicio4 ej = new Ejercicio4(25,0);
    }
    @Test void calculaHip(){
        Ejercicio4 ej = new Ejercicio4(10,15);
        Assert.assertEquals(ej.calcularHip(), 5.0);
    }
   
}
