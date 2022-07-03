package araclar;

import java.time.LocalDateTime;
import dataBase.DataBase;
import java.io.IOException;
import java.util.Arrays;

public class Araclar {

    private int aracId;
    private int aracYasi;
    private int parkGunu;
    private int parkSaati;
    private int parkDakikasi;
    private String aracSahibiIsım;
    private String aracSahibiSoyIsim;
    private String aracPlaka;
    private String aracTuru;
    private String[] markaModel = new String[2];


    public Araclar(String aracSahibiIsım, String aracSahibiSoyIsim, 
            String aracPlaka, String aracTuru, int aracYasi, 
            String[] markaModel, int aracId, int parkGunu,
            int parkSaati, int parkDakikasi) throws IOException {

        this.aracYasi = aracYasi;
        this.aracSahibiIsım = aracSahibiIsım;
        this.aracSahibiSoyIsim = aracSahibiSoyIsim;
        this.aracPlaka = aracPlaka;
        this.aracTuru = aracTuru;
        this.markaModel = markaModel;
        if (aracId == 0) {
            this.aracId = DataBase.yeniAracId();
            DataBase.verileriKaydetSonAracId();
        } else {
            this.aracId = aracId;
        }
        if(parkGunu == -1 && parkSaati == -1 && parkDakikasi == -1) {
            this.parkGunu = LocalDateTime.now().getDayOfMonth();
            this.parkSaati = LocalDateTime.now().getHour();
            this.parkDakikasi = LocalDateTime.now().getMinute();
        }else {
            this.parkGunu = parkGunu;
            this.parkSaati = parkSaati;
            this.parkDakikasi = parkDakikasi; 
        }
        
    }

    public int getParkDakikasi() {
        return parkDakikasi;
    }

    public String getAracSahibiIsım() {
        return aracSahibiIsım;
    }

    public String getAracSahibiSoyIsim() {
        return aracSahibiSoyIsim;
    }

    public int getAracId() {
        return aracId;
    }

    public int getAracYasi() {
        return aracYasi;
    }

    public int getParkGunu() {
        return parkGunu;
    }

    public int getParkSaati() {
        return parkSaati;
    }

    public String getAracPlaka() {
        return aracPlaka;
    }

    public String getAracTuru() {
        return aracTuru;
    }

    public String[] getMarkaModel() {
        return markaModel;
    }

    public void setAracId(int aracId) {
        this.aracId = aracId;
    }

    public void setAracYasi(int aracYasi) {
        this.aracYasi = aracYasi;
    }

    public void setParkGunu(int parkGunu) {
        this.parkGunu = parkGunu;
    }

    public void setParkSaati(int parkSaati) {
        this.parkSaati = parkSaati;
    }

    public void setAracPlaka(String aracPlaka) {
        this.aracPlaka = aracPlaka;
    }

    public void setAracTuru(String aracTuru) {
        this.aracTuru = aracTuru;
    }

    public void setMarkaModel(String[] markaModel) {
        this.markaModel = markaModel;
    }

    public void setParkDakikasi(int parkDakikasi) {
        this.parkDakikasi = parkDakikasi;
    }

    public void setAracSahibiIsım(String aracSahibiIsım) {
        this.aracSahibiIsım = aracSahibiIsım;
    }

    public void setAracSahibiSoyIsim(String aracSahibiSoyIsim) {
        this.aracSahibiSoyIsim = aracSahibiSoyIsim;
    }
    
    
    
    public static Araclar aracAra(int id) {
        
        Araclar arac = null;
        
        for (Araclar item : DataBase.araclarArray) {
            if(id == item.getAracId()) {
                arac = item;
                break;
            }
                
        }
        
        return arac;
    }
    
    public void aracParkEt() {
        this.parkGunu = LocalDateTime.now().getDayOfMonth();
        this.parkSaati = LocalDateTime.now().getHour();
        this.parkDakikasi = LocalDateTime.now().getMinute();
    }
    

    @Override
    public String toString() {
        return aracYasi + " " + aracPlaka + " " + aracTuru + " " + markaModel[0] + " " + markaModel[1] + " " + aracId;
    }

    public String toStringYonetici() {

        return aracSahibiIsım + " " + aracSahibiSoyIsim + " " + aracPlaka + " "
                + aracTuru + " " + aracYasi + " " + markaModel[0] + " " + markaModel[1] + " " + aracId;
    }

    public String toStringPark() {
        return aracSahibiIsım + " " + aracSahibiSoyIsim + " " + aracPlaka + " "
                + aracTuru + " " + aracYasi + " " + markaModel[0] + " "
                + markaModel[1] + " " + aracId + " " + parkGunu + " "
                + parkSaati + " " + parkDakikasi;
    }
    
    
    
}
