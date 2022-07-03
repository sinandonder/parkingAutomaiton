package kullanici;

import dataBase.DataBase;
import araclar.Araclar;
import java.util.ArrayList;

public abstract class Kullanici {

    private String isim;
    private String soyIsim;
    private String kullaniciAdi;
    private String sifre;

    protected Kullanici(String isim, String soyIsim, String kullaniciAdi, String sifre) {
        this.isim = isim.toUpperCase().trim();
        this.soyIsim = soyIsim.toUpperCase().trim();
        this.kullaniciAdi = kullaniciAdi.trim();
        this.sifre = sifre;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String toString() {
        return isim + " " + soyIsim + " " + kullaniciAdi + " " + sifre;
    }

    // Plakasına göre Araç Arama
    public Araclar aracAramaPlaka(String arananPlaka) {
        arananPlaka = arananPlaka.toUpperCase().trim();
        Araclar temp = null;

        for (int i = 0; i < DataBase.araclarArray.size(); i++) {
            if (arananPlaka.equals(DataBase.araclarArray.get(i).getAracPlaka())) {
                temp = DataBase.araclarArray.get(i);
            }
        }

        return temp;

    }// end of aracArama

    // Türüne Göre Araç Arama
    public ArrayList<Integer> aracAramaTur(String arananTur) {
        arananTur = arananTur.toUpperCase().trim();

        ArrayList<Integer> indexs = new ArrayList<>();

        for (int i = 0; i < DataBase.araclarArray.size(); i++) {
            if (arananTur.equals(DataBase.araclarArray.get(i).getAracTuru())) {
                indexs.add(i);
            }
        }

        return indexs;
    }// end of aracAramaTur

    //Yaşa Göre Araç Arama
    public ArrayList<Integer> aracAramaYas(String arananYas) {
        arananYas = arananYas.toUpperCase().trim();

        ArrayList<Integer> indexs = new ArrayList<>();

        for (int i = 0; i < DataBase.araclarArray.size(); i++) {
            if (arananYas.equals(Integer.toString(DataBase.araclarArray.get(i).getAracYasi()))) {
                indexs.add(i);
            }
        }

        return indexs;
    }

    //Marka ve Modele Göre Araç Arama
    public ArrayList<Integer> aracAramaMarkaModel(String[] arananMarkaModel) {

        ArrayList<Integer> indexs = new ArrayList<>();

        for (int i = 0; i < DataBase.araclarArray.size(); i++) {
            if (arananMarkaModel[0].equals(DataBase.araclarArray.get(i).getMarkaModel()[0])
                    && arananMarkaModel[1].equals(DataBase.araclarArray.get(i).getMarkaModel()[1])) {
                indexs.add(i);
            }
        }

        return indexs;
    }

}// end of class
