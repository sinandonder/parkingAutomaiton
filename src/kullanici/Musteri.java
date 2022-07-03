package kullanici;

import dataBase.DataBase;

public class Musteri extends Kullanici{
    
    private int aracId;
    

    public Musteri(String isim, String soyIsim, String kullaniciAdi, String sifre, int aracId) {
        super(isim, soyIsim, kullaniciAdi, sifre);
        this.aracId = aracId;
    }

    public int getAracId() {
        return aracId;
    }

    public void setAracId(int aracId) {
        this.aracId = aracId;
    }
    
    
    public static Musteri kullaniciAra(String kullaniciAdi, String sifre) {
        
        Musteri musteri = null;
        
        for (Musteri item : DataBase.musteriArray) {
            if(item.getKullaniciAdi().equals(kullaniciAdi) && item.getSifre().equals(sifre)) {
                musteri = item;
                break;
            }
        }
        
        return musteri;
        
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + aracId;
    }
    
    
}
