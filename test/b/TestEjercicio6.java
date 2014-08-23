package b;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import parcial.Ejercicio6;
import static org.testng.Assert.*;
import org.testng.annotations.Test;


/**
 *
 * @author F211
 */
public class TestEjercicio6 {
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaMayorxVarEnCero(){
        Ejercicio6 ej = new Ejercicio6(0);
    }
}
