package b;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import parcial.Ejercicio1;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestEjercicio1 {
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaMayorxVarIguales() {
        Ejercicio1 m = new Ejercicio1(4,4);
    }
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaMayorxVarEnCero(){
        Ejercicio1 m = new Ejercicio1(1, 0);
    }
    
    @Test
    public void bEsMayor(){
        Ejercicio1 m = new Ejercicio1(5, 10);        
        Assert.assertEquals(m.encontrarMayor(),"b es el mayor");
    }
    
    @Test void aEsMayor(){
        Ejercicio1 m = new Ejercicio1(20, 5);
        Assert.assertEquals(m.encontrarMayor(), "a es el mayor");
    }

    
}
