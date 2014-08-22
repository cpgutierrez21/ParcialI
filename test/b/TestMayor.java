package b;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import parcial.Mayor;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestMayor {
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaMayorxVarIguales() {
        Mayor m = new Mayor(4,4);
    }
    
    @Test (expectedExceptions = {IllegalArgumentException.class})
    public void noCreaMayorxVarEnCero(){
        Mayor m = new Mayor(1, 0);
    }
    
    @Test
    public void bEsMayor(){
        Mayor m = new Mayor(5, 10);        
        Assert.assertEquals(m.encontrarMayor(),"b es el mayor");
    }
    
    @Test void aEsMayor(){
        Mayor m = new Mayor(20, 5);
        Assert.assertEquals(m.encontrarMayor(), "a es el mayor");
    }

    
}
