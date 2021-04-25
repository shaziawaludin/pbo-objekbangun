/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

/**
 *
 * @author shazi awaludin
 */
public class TemberengBola extends Bola{
    private final double rDasar = 10;
    private final double rAtas = 10;
    public double luas;
    public double volume1;
    public double volume2;
    
    public TemberengBola(){
        this.luas = this.hitungLuas();
        this.volume1 = this.hitungVolume();
        this.volume2 = this.hitungVolume2();
    }
    
    @Override
    public double hitungLuas() {
        double luasDasar = 2 * Math.PI * TemberengBola.R * TemberengBola.TINGGI;
        double luasSelimut= Math.PI * Math.pow(this.rDasar, 2);
        return luasDasar + luasSelimut;
    }

    @Override
    public double hitungVolume() {
       return (1/6) * Math.PI * TemberengBola.TINGGI * (Math.pow(this.rDasar, 2) + Math.pow(this.rAtas, 2) + Math.pow(TemberengBola.TINGGI, 2));
    }
    
    public double hitungVolume2() {
       return (1/3) * Math.PI * Math.pow(TemberengBola.TINGGI, 2)*(TemberengBola.R*3 - TemberengBola.TINGGI);
    }
}
