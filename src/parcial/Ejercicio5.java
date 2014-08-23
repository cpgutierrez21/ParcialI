/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

/**
 *
 * @author F211
 */
public class Ejercicio5 {
    private int r=0;
    private int h=0;
    private double pi=3.14;
    
    public Ejercicio5(int a, int b) {
        if(a<0 || b<0){throw new IllegalArgumentException("Los datos no pueden ser negativos");}
        if(a==0 || b==0){throw new IllegalArgumentException("Los datos no pueden ser cero");}
        r=a;
        h=b;
    }

    public Object calcularVol() {
        return ((int)(pi*Math.pow(r, 2)*h));
    }

    public Object calcularArea() {
        return ((int)(2*pi*r*h));
    }
    
}
