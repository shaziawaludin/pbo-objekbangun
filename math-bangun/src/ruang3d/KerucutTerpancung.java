/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

/**
 *
 * @author shazi awaludin
// */
public class KerucutTerpancung extends Kerucut{
    
    private double t1;
    private double t2;
    private double ratas;
    private double s2;
    public KerucutTerpancung(double t1, double t2, double ratas) {
        super(10);
        this.t1 = t1;
        this.t2 = t2;
        this.ratas = ratas;
        this.s2 = (Math.sqrt((Math.pow(super.r,2)
                        +Math.pow(this.t2,2))));
    }
    
    public double hitungLuas(){
        return Math.PI*s2*super.r+this.ratas;
    }
    
    public double hitungVolume(){
        return 1/3.0 * Math.PI*(this.t1+this.t2)*(Math.pow(super.r, 2)
                +(super.r*this.ratas)
                + Math.pow(this.ratas, 2));
    }
}
