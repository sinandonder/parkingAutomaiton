package katlar;

import araclar.Araclar;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;

public class Katlar {

    private String katTuru;
    private int kapasite;
    public Araclar[] katAraclari;
    public JLabel[] katLabellari;
    public boolean[] katDurumlari;
    

    public Katlar(int kapasite, String katTuru) {
        this.kapasite = kapasite;
        this.katAraclari = new Araclar[kapasite];
        this.katLabellari = new JLabel[kapasite];
        this.katDurumlari = new boolean[kapasite];
        this.katTuru = katTuru;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    //Katların Boş - Dolu Durumlarını Belleğe Almak
    public void katDurumlariniYukle(String filePath) throws FileNotFoundException, IOException {

        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileReader fileIn = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fileIn);
        String[] durumlar = new String[kapasite];
        durumlar = bReader.readLine().split(" ");

        for (int i = 0; i < katDurumlari.length; i++) {
            katDurumlari[i] = Boolean.valueOf(durumlar[i]);
        }
        bReader.close();
    }

    //Park Halinde Olan Araçları Belleğe Yüklemek ve Konumlarını Belirlemek
    public void katAraclariniYukle(String filePath) throws IOException {
        String line = "";
        String[] lineA;
        int i = 0;

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Kat Durumları Dosyası Bulunamadı");
        } else {
            FileReader fileIn = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fileIn);

            while (line != null && i < katDurumlari.length) {
                if (katDurumlari[i] == true) {
                    line = bReader.readLine();
                    lineA = line.split(" ");
                    katAraclari[i] = new Araclar(lineA[0], lineA[1], lineA[2], lineA[3],
                            Integer.parseInt(lineA[4]), (lineA[5] + " " + lineA[6]).split(" "),
                            Integer.parseInt(lineA[7]), Integer.parseInt(lineA[8]),
                            Integer.parseInt(lineA[9]), Integer.parseInt(lineA[10]));
                    katLabellari[i].setText(katAraclari[i].getAracPlaka());
                    katLabellari[i].setBackground(Color.red);
                }
                i++;
            }
            bReader.close();
        }

    }

    // Herhangi bir konuma araç yerleştirildiği anda konum durumunun kalıcı belleğe yazılması
    public void katDurumlariniKaydet(String filePath) throws IOException {
        FileWriter fileOut = new FileWriter(filePath, false);
        BufferedWriter bWriter = new BufferedWriter(fileOut);

        for (int i = 0; i < katDurumlari.length; i++) {
            if (i == (katDurumlari.length - 1)) {
                bWriter.write(String.valueOf(katDurumlari[i]));
            } else {
                bWriter.write(String.valueOf(katDurumlari[i]) + " ");
            }
        }
        bWriter.close();
    }

    public void katAraclariniKaydet(String filePath) throws IOException {
        FileWriter fileOut = new FileWriter(filePath, false);
        BufferedWriter bWriter = new BufferedWriter(fileOut);

        for (int i = 0; i < katAraclari.length; i++) {
            if (katAraclari[i] != null) {
                bWriter.write(katAraclari[i].toStringPark() + "\n");
            }
        }
        bWriter.close();
    }

    public int katParkYeribul(String filePath) throws IOException {
        int konum = -1;

        for (int i = 0; i < katDurumlari.length; i++) {
            if (katDurumlari[i] == false) {
                katDurumlari[i] = true;
                konum = i;
                break;
            }
        }
        katDurumlariniKaydet(filePath);
        return konum;
    }

    public void katLabellariniYukle(JLabel... labels) {

        for (int i = 0; i < labels.length; i++) {
            katLabellari[i] = labels[i];
        }

    }

}// end of class
