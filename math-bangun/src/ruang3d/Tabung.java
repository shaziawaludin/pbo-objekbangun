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
public class Tabung extends Lingkaran implements Ruang3d{
    public double luas;
    public double volume;
    
    @Override
    public double hitungLuas() {
        double luasSelimut = super.keliling * Tabung.TINGGI;
        return 2*super.luas+luasSelimut;
    }

    @Override
    public double hitungVolume() {
        return super.luas * Tabung.TINGGI;
    }
    
}
