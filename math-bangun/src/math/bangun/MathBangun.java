package math.bangun;

import bidang2d.Lingkaran;
import ruang3d.*;



public class MathBangun {

    public static void main(String[] args) {
       Lingkaran ling = new Lingkaran();
//       Bola bola = new Bola();
//       TemberengBola temBol = new TemberengBola();
        System.out.println(ling.hitungKeliling());
//        System.out.println(bola.luas);
////        System.out.println(bola.volume);
////        System.out.println(temBol.luas);
////        System.out.println(temBol.volume1);
//        System.out.println(temBol.volume1);
////        Kerucut krc = new Kerucut(12);
////        System.out.println(krc.hitungLuas());
////        System.out.println(krc.hitungVolume());
////        
////        KeratanBola krb = new KeratanBola(3, 3, 3);
////        System.out.println(krb.hitungLuas());
////        System.out.println(krb.hitungKeliling());
//        
//        JuringBola jr = new JuringBola();
//        System.out.println(jr.luas);

          System.out.println("<<|  |>>");
          KerucutTerpancung kt = new KerucutTerpancung(3, 3, 2);
          System.out.println(kt.hitungLuas());
          System.out.println(kt.hitungVolume());

    }
    
}
