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
public class CincinBola extends Bola{
    
    private final double rDasar = 10;
    private final double rAtas = 10;
    private final double pTaliBusur = 10;
    public double luas;
    public double volume;
    
    public CincinBola(){
        this.luas = this.hitungLuas();
        this.volume = this.hitungVolume();
    }
    
    @Override
    public double hitungLuas() {
        double luasLuar = 2 * Math.PI * CincinBola.R * CincinBola.TINGGI;
        double luasDalam= Math.PI * pTaliBusur * (this.rDasar+this.rAtas) ;
        return luasLuar + luasDalam;
    }

    @Override
    public double hitungVolume() {
       return (1/6) * Math.PI * CincinBola.TINGGI * Math.pow(pTaliBusur, 2);
    }
}
