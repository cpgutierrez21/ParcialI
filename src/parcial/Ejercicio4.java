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
public class Ejercicio4 {
    private double catA=0;
    private double catB=0;

    public Ejercicio4(double a, double b) {
        if(a<0 || b<0){throw new IllegalArgumentException("Los catetos no pueden ser negativos");}
        if(a==0 || b==0){throw new IllegalArgumentException("Los catetos no pueden ser cero");}
        catA=a;
        catB=b;
    }

    public double calcularHip() {
       return Math.sqrt(catA+catB); 
    }
    
}
