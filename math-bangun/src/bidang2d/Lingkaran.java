/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2d;

/**
 *
 * @author shazi awaludin
 */
public class Lingkaran implements Bidang2d{
    public double luas ;
    
    public Lingkaran(){
        this.luas = hitungLuass();
    }

    @Override
    public double hitungLuass() {
        return Math.pow(this.R, 2) * Math.PI;
    }

    @Override
    public double hitungVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
