package kullanici;

import araclar.Araclar;
import java.time.LocalDateTime;
import dataBase.DataBase;

public class Yonetici extends Kullanici {

    private String id;

    public Yonetici(String isim, String soyIsim, String kullaniciAdi, String sifre, String id) {
        super(isim, soyIsim, kullaniciAdi, sifre);
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public static Yonetici kullaniciAra(String kullaniciAdi, String sifre) {
        Yonetici kullanici = null;
        
        for (Yonetici item : DataBase.yoneticiHesaplari) {
            if(item.getKullaniciAdi().equals(kullaniciAdi) && item.getSifre().equals(sifre)) {
                kullanici = item;
                break;
            }
        }
        return kullanici;
    }

//    public Musteri musteriEkle(String isim, String soyIsim, String kullaniciAdi, String plaka) {
//        Musteri temp = new Musteri(isim, soyIsim, kullaniciAdi, plaka,);
//        return temp;
//    }

    public void aracDuzenle(Araclar arac, int aracId, int aracYasi, String aracPlaka, String aracTuru, String[] markaModel) {
        arac.setAracId(aracId);
        arac.setAracYasi(aracYasi);
        arac.setAracPlaka(aracPlaka);
        arac.setAracTuru(aracTuru);
        arac.setMarkaModel(markaModel);
    }

    public void aracCikar(int id) {

    }

    public double parkUcretiHesapla(Araclar arac) {
        
        int girisSaati = arac.getParkSaati();
        int cikisSaati = LocalDateTime.now().getHour();
        double parkUcreti = 5.0;

        if ((cikisSaati - girisSaati) <= 1) {
            parkUcreti = 5.0;
        } else if ((cikisSaati - girisSaati) > 3) {
            parkUcreti = 13.0;
            parkUcreti += (cikisSaati - girisSaati - 3) * 3;
        } else if ((cikisSaati - girisSaati) >= 2) {
            parkUcreti += (cikisSaati - girisSaati - 1) * 4;
        }
        return parkUcreti;
    }
    
    
    
    public double paraUstuHesapla(Double gelenPara, Double ucret) {
        return gelenPara - ucret;
    }
    
    public void parkUcretiAl() {
        
    }

    @Override
    public String toString() {
        return super.toString() + " " + id;
    }
}
