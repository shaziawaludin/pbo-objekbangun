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
public class JuringBola extends Bola {

    private final double rDasar = 5;
    public double luas;
    public double volume;

    public JuringBola() {
        this.luas = this.hitungLuas();
        this.volume = this.hitungVolume();
    }

    @Override
    public double hitungLuas() {
        return (2)* Math.PI * JuringBola.R * (JuringBola.TINGGI + this.rDasar);
    }

    @Override
    public double hitungVolume() {
        return (2/3.0)* Math.PI * Math.pow(JuringBola.R,2) * JuringBola.TINGGI;
    }
}