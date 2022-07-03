package dataBase;

import kullanici.Musteri;
import araclar.Araclar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kullanici.Yonetici;

public class DataBase {

    public static ArrayList<Musteri> musteriArray = new ArrayList<>();
    public static ArrayList<Araclar> araclarArray = new ArrayList<>();

    public static ArrayList<Yonetici> yoneticiHesaplari = new ArrayList<>();

    public static String[] yoneticiIdleri = new String[10];

    public static String sonAracId = "1000";

    public static void verileriYukle() throws FileNotFoundException, IOException {
        String line = "";
        String[] lA = {};

        File musteriFile = new File("files\\data\\musteriArray.txt");
        if (!musteriFile.exists()) {
            musteriFile.createNewFile();
        }

        BufferedReader musteriReader = new BufferedReader(new FileReader("files\\data\\musteriArray.txt"));

        while ((line = musteriReader.readLine()) != null) {
            lA = line.split(" ");
            musteriArray.add(new Musteri(lA[0], lA[1], lA[2], lA[3], Integer.parseInt(lA[4])));
        }
        musteriReader.close();

        System.out.println(Arrays.toString(lA));

        File araclarFile = new File("files\\data\\araclarArray.txt");
        if (!araclarFile.exists()) {
            araclarFile.createNewFile();
        }

        BufferedReader araclarReader = new BufferedReader(new FileReader("files\\data\\araclarArray.txt"));

        while ((line = araclarReader.readLine()) != null) {
            lA = line.split(" ");
            araclarArray.add(new Araclar(lA[0], lA[1], lA[2], lA[3], Integer.parseInt(lA[4]), (lA[5] + " " + lA[6]).split(" "),
                    Integer.parseInt(lA[7]), Integer.parseInt(lA[8]), Integer.parseInt(lA[9]), Integer.parseInt(lA[10])));
        }
        System.out.println(Arrays.toString(lA));
        araclarReader.close();

        //Yönetici Id'lerini Belleğe Yükleme
        File yoneticiIdleriFile = new File("files\\ids\\ids.txt");
        if (!yoneticiIdleriFile.exists()) {
            yoneticiIdleriFile.createNewFile();
        }

        BufferedReader idReader = new BufferedReader(new FileReader("files\\ids\\ids.txt"));

        while ((line = idReader.readLine()) != null) {
            lA = line.split(" ");
            yoneticiIdleri = lA;
        }
        idReader.close();
        //Deneme Kodu
        System.out.println(Arrays.toString(yoneticiIdleri));

        //Yönetici Hesaplarını Belleğe Yükelemek
        File yHFile = new File("files\\data\\yoneticiHesaplari.txt");
        if (!yHFile.exists()) {
            yHFile.createNewFile();
        }

        BufferedReader yHReader = new BufferedReader(new FileReader("files\\data\\yoneticiHesaplari.txt"));

        while ((line = yHReader.readLine()) != null) {
            lA = line.split(" ");
            yoneticiHesaplari.add(new Yonetici(lA[0], lA[1], lA[2], lA[3], lA[4]));
        }
        yHReader.close();

        //Yeni arac id'sini okuma
        FileReader aracidFile = new FileReader("files\\ids\\sonAracID.txt");
        BufferedReader aracidReader = new BufferedReader(aracidFile);
        sonAracId = aracidReader.readLine();
        aracidReader.close();

    }

    public static String kelimeyiDuzelt(String gelenKelime) {
        String kelime = "";
        String[] gelenDizi = gelenKelime.toUpperCase().split(" ");
        for (int i = 0; i < gelenDizi.length; i++) {
            kelime += gelenDizi[i];
        }

        return kelime;
    }

    //Yeni arac id'sini okuma
    public static int yeniAracId() throws FileNotFoundException, IOException {
        FileReader aracidFile = new FileReader("files\\ids\\sonAracID.txt");
        BufferedReader aracidReader = new BufferedReader(aracidFile);
        sonAracId = aracidReader.readLine();
        aracidReader.close();

        return Integer.valueOf(sonAracId);
    }

    //Yeni arac id'sini yazma
    public static void verileriKaydetSonAracId() throws IOException {
        FileWriter file = new FileWriter("files\\ids\\sonAracID.txt", false);
        BufferedWriter idWriter = new BufferedWriter(file);
        idWriter.write(String.valueOf(Integer.valueOf(sonAracId) + 1));
        idWriter.close();
    }

    public static void verileriKaydetYoneticiHesaplari() throws IOException {
        FileWriter file = new FileWriter("files\\data\\yoneticiHesaplari.txt", true);
        BufferedWriter yWriter = new BufferedWriter(file);
        yWriter.write(yoneticiHesaplari.get(yoneticiHesaplari.size() - 1).toString() + "\n");
        yWriter.close();
    }

    public static void verileriKaydetMusteri() throws IOException {
        FileWriter file = new FileWriter("files\\data\\musteriArray.txt", true);
        BufferedWriter mWriter = new BufferedWriter(file);
        mWriter.write(musteriArray.get(musteriArray.size() - 1).toString() + "\n");
        mWriter.close();
    }

    public static void verileriKaydetAraclar() throws IOException {
        FileWriter file = new FileWriter("files\\data\\araclarArray.txt", true);
        BufferedWriter aWriter = new BufferedWriter(file);

        aWriter.write(araclarArray.get(araclarArray.size() - 1).toStringPark() + "\n");

        aWriter.close();
    }

}
