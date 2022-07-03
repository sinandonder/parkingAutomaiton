package main;

import araclar.Araclar;
import dataBase.DataBase;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import kullanici.Yonetici;

public class Main {

    //Varsayılan Ekran Çözünürlük Bilgisini Alma
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int screenWidth = (int) screenSize.getWidth();
    public static int screenHeight = (int) screenSize.getHeight();

    //Oluşturulan Formlar Heryerden Kontrol Edilebilsin Diye Main'de static Olarak tanımlamak
    public static FormLogin screenLogin = new FormLogin();
    public static FormKaydolMusteri screenKaydolMusteri = new FormKaydolMusteri();

    public static FormMusteriArayuzu screenMusteriArayuz = new FormMusteriArayuzu();

    public static FormKaydolYonetici screenKaydolYönetici = new FormKaydolYonetici();
    public static FormYoneticiArayuzu screenYoneticiArayuzu = new FormYoneticiArayuzu();

    public static void main(String[] args) throws IOException {

        screenLogin.setVisible(true);
        // Diskteki Verileri Belleğe Almak
        DataBase.verileriYukle();
        System.out.println("Veriler Yüklendi Program Başlatıldı.");

        // Açılan Pencerelerin Ekranın Ortasında Açılamasını Sağlamak 
        // Metodunu Yaz
        screenLogin.setLocation((screenWidth - screenLogin.getWidth()) / 2, (Main.screenHeight - screenLogin.getHeight()) / 2);
        screenKaydolMusteri.setLocation((screenWidth - screenKaydolMusteri.getWidth()) / 2, (Main.screenHeight - screenKaydolMusteri.getHeight()) / 2);
        screenKaydolYönetici.setLocation((screenWidth - screenKaydolYönetici.getWidth()) / 2, (Main.screenHeight - screenKaydolYönetici.getHeight()) / 2);
        screenYoneticiArayuzu.setLocation((screenWidth - screenYoneticiArayuzu.getWidth()) / 2, (Main.screenHeight - screenYoneticiArayuzu.getHeight()) / 2);
        screenMusteriArayuz.setLocation((screenWidth - screenMusteriArayuz.getWidth()) / 2, (Main.screenHeight - screenMusteriArayuz.getHeight()) / 2);

    }

}
