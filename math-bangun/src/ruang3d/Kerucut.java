/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

import bidang2d.Lingkaran;

/**
 *
 * @author shazi awaludin
 */
public class Kerucut extends Lingkaran implements Ruang3d{

    private final double tinggi;
    
    public Kerucut(double tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return super.hitungLuass() 
                + ((Math.sqrt((Math.pow(Lingkaran.R,2)
                        +Math.pow(this.tinggi,2))))
                *Lingkaran.R*Math.PI);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungVolume() {
        return (1/3.0) * Math.PI*Lingkaran.R*Lingkaran.R*this.tinggi;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
