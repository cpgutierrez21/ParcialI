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
public class Ejercicio2 {
    private int a=0;
    private int b=0;
    private int c=0;
    private String s;
    public Ejercicio2(int a, int b, int c) {
        if(a==b || a==c || b==c){throw new IllegalArgumentException("Los números deben ser distintos");}
        if(a==0 || b==0 || c==0){throw new IllegalArgumentException("Los números deben ser diferentes de 0");}
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Object encontrarMayor() {
    //    s="a es el mayor";
        if (a>b && a>c){s="a es el mayor";}
        else if (b>a && b>c){s="b es el mayor";}
        else{s="c es el mayor";}
        return s;        
    }
    
}
