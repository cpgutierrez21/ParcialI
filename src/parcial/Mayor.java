package parcial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F211
 */
public class Mayor {
    private int a=0;
    private int b=0;
    private String s;

    public Mayor(int a, int b) {
        if(a==b){throw new IllegalArgumentException("Los números deben ser distintos");}
        if (a==0 || b==0){throw new IllegalArgumentException("Los números deben ser diferentes de 0");}
        this.a=a;
        this.b=b;
    }

    public String encontrarMayor() {        
        //return("10 es el mayor");
        if (a>b){s="a es el mayor";}
        else {s="b es el mayor";}
        return s;
    }
    
}
