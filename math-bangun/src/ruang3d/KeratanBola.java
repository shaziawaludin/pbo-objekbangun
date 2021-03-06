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
public class KeratanBola extends Bola{
    
    private final double t;
    private final double r1;
    private final double r2;
    public double luas;

    public KeratanBola(double t, double r1, double r2) {
        this.t = t;
        this.r1 = r1;
        this.r2 = r2;
        this.luas = this.hitungLuas();
    }
    
    @Override
    public double hitungLuas(){
        return 1/6.0 * Math.PI * Lingkaran.R;
    }
    
    @Override
    public double hitungVolume(){
        return 1/2.0 * Math.PI * Math.pow(this.r1, 2)*this.t + 1/2.0 * Math.PI * Math.pow(this.r2, 2) + 1/6.0 * Math.PI *Math.pow(this.t, 3);
    }
}
