package main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import dataBase.DataBase;
import araclar.Araclar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JTextField;
import katlar.Katlar;
import kullanici.Yonetici;

public class FormYoneticiArayuzu extends javax.swing.JFrame {

    public static Yonetici yonetici;

    private static double toplamBakiye = 0;

    static String plaka;
    Color siyah = new java.awt.Color(85, 85, 85);
    Color kirmizi = new java.awt.Color(244, 67, 54);
    Color yesil = new java.awt.Color(76, 175, 80);
    Color mavi = new java.awt.Color(0, 140, 186);

    Katlar arabaKati = new Katlar(36, "ARABA");
    Katlar motosikletKati = new Katlar(18, "MOTOSIKLET");
    Katlar kamyonetKati = new Katlar(14, "KAMYONET");
    Katlar kamyonKati = new Katlar(10, "KAMYON");
    Katlar engelliKati = new Katlar(10, "ENGELLİ");

    public FormYoneticiArayuzu() {
        initComponents();

        try {

            //-------------------------------------------------------------------------------------------------------------------
            File file = new File("files\\kasa\\kasa.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println(file.getPath() + "Dosyası Oluşturuldu");
            }
            String line;
            FileReader fileIn = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fileIn);
            while ((line = bReader.readLine()) != null) {
                toplamBakiye = Double.parseDouble(line);
            }

            bReader.close();

            labelToplamBakiye.setText(String.valueOf(toplamBakiye));

            //-------------------------------------------------------------------------------------------------------------------
            arabaKati.katDurumlariniYukle("files\\katlar\\arabaDurumlari.txt");

            arabaKati.katLabellariniYukle(labelA1, labelA2, labelA3, labelA4, labelA5, labelA6, labelA7, labelA8, labelA9,
                    labelA10, labelA11, labelA12, labelA13, labelA14, labelA15, labelA16, labelA17, labelA18, labelA19,
                    labelA20, labelA21, labelA22, labelA23, labelA24, labelA25, labelA26, labelA27, labelA28, labelA29,
                    labelA30, labelA31, labelA32, labelA33, labelA34, labelA35, labelA36);

            arabaKati.katAraclariniYukle("files\\katlar\\arabaAraclari.txt");

            //-------------------------------------------------------------------------------------------------------------------
//            motosikletKati.katDurumlariniYukle("files\\katlar\\motosikletDurumlari.txt");
//
//            motosikletKati.katLabellariniYukle(labelM1, labelM2, labelM3, labelM4, labelM5, labelM6, labelM7, labelM8, labelM9,
//                    labelM10, labelM11, labelM12, labelM13, labelM14, labelM15, labelM16, labelM17, labelM18);
//
//            motosikletKati.katAraclariniYukle("files\\katlar\\motosikletAraclari.txt");
//
//            //-------------------------------------------------------------------------------------------------------------------
//            kamyonetKati.katDurumlariniYukle("files\\katlar\\kamyonetDurumlari.txt");
//
//            kamyonetKati.katLabellariniYukle(labelK1, labelK2, labelK3, labelK4, labelK5, labelK6, labelK7, labelK8, labelK9,
//                    labelK10, labelK11, labelK12, labelK13, labelK14);
//
//            kamyonetKati.katAraclariniYukle("files\\katlar\\kamyonetAraclari.txt");
//
//            //-------------------------------------------------------------------------------------------------------------------
//            kamyonKati.katDurumlariniYukle("files\\katlar\\kamyonDurumlari.txt");
//
//            kamyonKati.katLabellariniYukle(labelB1, labelB2, labelB3, labelB4, labelB5, labelB6, labelB7, labelB8, labelB9,
//                    labelB10);
//
//            kamyonKati.katAraclariniYukle("files\\katlar\\kamyonAraclari.txt");
//
//            //-------------------------------------------------------------------------------------------------------------------
//            engelliKati.katDurumlariniYukle("files\\katlar\\engelliDurumlari.txt");
//
//            engelliKati.katLabellariniYukle(labelK1, labelK2, labelK3, labelK4, labelK5, labelK6, labelK7, labelK8, labelK9, labelK10);
//
//            engelliKati.katAraclariniYukle("files\\katlar\\engelliAraclari.txt");
        } catch (IOException ex) {
            Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            toplamBakiye = 0;
        }

    }// end of FormYoneticiArayuzu()

    public void kullaniciAl(Yonetici gelenYonetici) {
        yonetici = gelenYonetici;
    }

    public void textClear(JTextField... values) {
        for (int i = 0; i < values.length; i++) {
            values[i].setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneMenu = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        labelKullanici = new javax.swing.JLabel();
        labelAd = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelSoyad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelAracYasi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelPlaka = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelTur = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        labelMarka = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        labelParaustu = new javax.swing.JLabel();
        labelUcret = new javax.swing.JLabel();
        spinnerGelenPara = new javax.swing.JSpinner();
        jLabel96 = new javax.swing.JLabel();
        labelToplamBakiye = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        buttonHesapla = new javax.swing.JButton();
        buttonHesapla1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textAracEkleAd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textAracEkleSoyad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        spinnerAracEkleYas = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        textAracEklePlaka = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        comboAracEkleTur = new javax.swing.JComboBox();
        textAracEkleMarka = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textAracEkleModel = new javax.swing.JTextField();
        buttonAracEkle = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        labelA2 = new javax.swing.JLabel();
        labelA3 = new javax.swing.JLabel();
        labelA4 = new javax.swing.JLabel();
        labelA5 = new javax.swing.JLabel();
        labelA6 = new javax.swing.JLabel();
        labelA7 = new javax.swing.JLabel();
        labelA1 = new javax.swing.JLabel();
        labelA10 = new javax.swing.JLabel();
        labelA12 = new javax.swing.JLabel();
        labelA13 = new javax.swing.JLabel();
        labelA14 = new javax.swing.JLabel();
        labelA16 = new javax.swing.JLabel();
        labelA11 = new javax.swing.JLabel();
        labelA9 = new javax.swing.JLabel();
        labelA17 = new javax.swing.JLabel();
        labelA15 = new javax.swing.JLabel();
        labelA8 = new javax.swing.JLabel();
        labelA18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        labelA27 = new javax.swing.JLabel();
        labelA21 = new javax.swing.JLabel();
        labelA22 = new javax.swing.JLabel();
        labelA23 = new javax.swing.JLabel();
        labelA24 = new javax.swing.JLabel();
        labelA25 = new javax.swing.JLabel();
        labelA26 = new javax.swing.JLabel();
        labelA20 = new javax.swing.JLabel();
        labelA19 = new javax.swing.JLabel();
        labelA28 = new javax.swing.JLabel();
        labelA30 = new javax.swing.JLabel();
        labelA31 = new javax.swing.JLabel();
        labelA32 = new javax.swing.JLabel();
        labelA33 = new javax.swing.JLabel();
        labelA34 = new javax.swing.JLabel();
        labelA35 = new javax.swing.JLabel();
        labelA36 = new javax.swing.JLabel();
        labelA29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelM2 = new javax.swing.JLabel();
        labelM1 = new javax.swing.JLabel();
        labelM4 = new javax.swing.JLabel();
        labelM5 = new javax.swing.JLabel();
        labelM6 = new javax.swing.JLabel();
        labelM7 = new javax.swing.JLabel();
        labelM8 = new javax.swing.JLabel();
        labelM9 = new javax.swing.JLabel();
        labelM10 = new javax.swing.JLabel();
        labelM11 = new javax.swing.JLabel();
        labelM12 = new javax.swing.JLabel();
        labelM13 = new javax.swing.JLabel();
        labelM14 = new javax.swing.JLabel();
        labelM15 = new javax.swing.JLabel();
        labelM16 = new javax.swing.JLabel();
        labelM17 = new javax.swing.JLabel();
        labelM18 = new javax.swing.JLabel();
        labelM3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelK2 = new javax.swing.JLabel();
        labelK3 = new javax.swing.JLabel();
        labelK4 = new javax.swing.JLabel();
        labelK5 = new javax.swing.JLabel();
        labelK6 = new javax.swing.JLabel();
        labelK1 = new javax.swing.JLabel();
        labelK8 = new javax.swing.JLabel();
        labelK9 = new javax.swing.JLabel();
        labelK10 = new javax.swing.JLabel();
        labelK11 = new javax.swing.JLabel();
        labelK12 = new javax.swing.JLabel();
        labelK7 = new javax.swing.JLabel();
        labelK14 = new javax.swing.JLabel();
        labelK13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelB2 = new javax.swing.JLabel();
        labelB1 = new javax.swing.JLabel();
        labelB4 = new javax.swing.JLabel();
        labelB5 = new javax.swing.JLabel();
        labelB6 = new javax.swing.JLabel();
        labelB7 = new javax.swing.JLabel();
        labelB8 = new javax.swing.JLabel();
        labelB9 = new javax.swing.JLabel();
        labelB10 = new javax.swing.JLabel();
        labelB3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelE2 = new javax.swing.JLabel();
        labelE1 = new javax.swing.JLabel();
        labelE4 = new javax.swing.JLabel();
        labelE5 = new javax.swing.JLabel();
        labelE6 = new javax.swing.JLabel();
        labelE7 = new javax.swing.JLabel();
        labelE8 = new javax.swing.JLabel();
        labelE9 = new javax.swing.JLabel();
        labelE10 = new javax.swing.JLabel();
        labelE3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabbedPaneMenu.setBackground(new java.awt.Color(231, 231, 231));
        tabbedPaneMenu.setForeground(new java.awt.Color(0, 140, 186));

        labelKullanici.setForeground(new java.awt.Color(0, 140, 186));
        labelKullanici.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelKullanici.setText("Hoşgeldin Kullanıcı");

        labelAd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelAd.setForeground(new java.awt.Color(0, 140, 186));
        labelAd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAd.setText("--------------");
        labelAd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 140, 186));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Plaka");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelSoyad.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelSoyad.setForeground(new java.awt.Color(0, 140, 186));
        labelSoyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSoyad.setText("--------------");
        labelSoyad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 140, 186));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Araç Yaşı");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelAracYasi.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelAracYasi.setForeground(new java.awt.Color(0, 140, 186));
        labelAracYasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAracYasi.setText("--------------");
        labelAracYasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 140, 186));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Marka");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelPlaka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelPlaka.setForeground(new java.awt.Color(0, 140, 186));
        labelPlaka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaka.setText("--------------");
        labelPlaka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 140, 186));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Araç Sahibi Soyisim");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 140, 186));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tür");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelTur.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelTur.setForeground(new java.awt.Color(0, 140, 186));
        labelTur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTur.setText("--------------");
        labelTur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 140, 186));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Model");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel19.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 140, 186));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Araç Sahibi İsim");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelMarka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelMarka.setForeground(new java.awt.Color(0, 140, 186));
        labelMarka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMarka.setText("--------------");
        labelMarka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel21.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 140, 186));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ücret");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelModel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelModel.setForeground(new java.awt.Color(0, 140, 186));
        labelModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModel.setText("--------------");
        labelModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelParaustu.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelParaustu.setForeground(new java.awt.Color(0, 140, 186));
        labelParaustu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelParaustu.setText("---------------");
        labelParaustu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelUcret.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelUcret.setForeground(new java.awt.Color(0, 140, 186));
        labelUcret.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUcret.setText("---------------");
        labelUcret.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        spinnerGelenPara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel96.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 140, 186));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Toplam Bakiye");
        jLabel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelToplamBakiye.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelToplamBakiye.setForeground(new java.awt.Color(0, 140, 186));
        labelToplamBakiye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelToplamBakiye.setText("---------------");
        labelToplamBakiye.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel98.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 140, 186));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("Paraüstü");
        jLabel98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel99.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 140, 186));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Gelen Para");
        jLabel99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        buttonHesapla.setBackground(new java.awt.Color(0, 140, 186));
        buttonHesapla.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonHesapla.setForeground(new java.awt.Color(255, 255, 255));
        buttonHesapla.setText("Hesapla");
        buttonHesapla.setBorder(null);
        buttonHesapla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHesaplaActionPerformed(evt);
            }
        });

        buttonHesapla1.setBackground(new java.awt.Color(0, 140, 186));
        buttonHesapla1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonHesapla1.setForeground(new java.awt.Color(255, 255, 255));
        buttonHesapla1.setText("Ücreti Al");
        buttonHesapla1.setBorder(null);
        buttonHesapla1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHesapla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUcretiAlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 724, Short.MAX_VALUE)
                        .addComponent(labelKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelAd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTur, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAracYasi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelUcret, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelParaustu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(spinnerGelenPara))))
                                .addComponent(buttonHesapla1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonHesapla, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelToplamBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(labelKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUcret, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerGelenPara, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAracYasi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParaustu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonHesapla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTur, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonHesapla1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelToplamBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        tabbedPaneMenu.addTab("Hesapla", jPanel4);

        jLabel2.setBackground(new java.awt.Color(0, 140, 186));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 140, 186));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Araç Sahibi Soyisim");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        textAracEkleAd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textAracEkleAd.setForeground(new java.awt.Color(0, 140, 186));
        textAracEkleAd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel3.setBackground(new java.awt.Color(0, 140, 186));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 140, 186));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Araç Sahibi İsim");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        textAracEkleSoyad.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textAracEkleSoyad.setForeground(new java.awt.Color(0, 140, 186));
        textAracEkleSoyad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel14.setBackground(new java.awt.Color(0, 140, 186));
        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 140, 186));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Araç Yaşı");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        spinnerAracEkleYas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        spinnerAracEkleYas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerAracEkleYas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel15.setBackground(new java.awt.Color(0, 140, 186));
        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 140, 186));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Plaka");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        textAracEklePlaka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textAracEklePlaka.setForeground(new java.awt.Color(0, 140, 186));
        textAracEklePlaka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel16.setBackground(new java.awt.Color(0, 140, 186));
        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 140, 186));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tür :");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        comboAracEkleTur.setForeground(new java.awt.Color(0, 140, 186));
        comboAracEkleTur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Araba", "Kamyon", "Kamyonet", "Motosiklet", "Engelli" }));
        comboAracEkleTur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));
        comboAracEkleTur.setPreferredSize(new java.awt.Dimension(65, 40));

        textAracEkleMarka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textAracEkleMarka.setForeground(new java.awt.Color(0, 140, 186));
        textAracEkleMarka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel13.setBackground(new java.awt.Color(0, 140, 186));
        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 140, 186));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Marka");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel17.setBackground(new java.awt.Color(0, 140, 186));
        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 140, 186));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Model");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        textAracEkleModel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textAracEkleModel.setForeground(new java.awt.Color(0, 140, 186));
        textAracEkleModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        buttonAracEkle.setBackground(new java.awt.Color(0, 140, 186));
        buttonAracEkle.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonAracEkle.setForeground(new java.awt.Color(255, 255, 255));
        buttonAracEkle.setText("Araç Parket...");
        buttonAracEkle.setBorder(null);
        buttonAracEkle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAracEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonParketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textAracEkleAd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textAracEkleSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spinnerAracEkleYas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(textAracEklePlaka))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(comboAracEkleTur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textAracEkleModel)
                                    .addComponent(textAracEkleMarka)))))
                    .addComponent(buttonAracEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(606, 606, 606))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAracEkleAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAracEkleSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerAracEkleYas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAracEklePlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAracEkleTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAracEkleMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAracEkleModel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonAracEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        tabbedPaneMenu.addTab("Müşteri İşlemleri", jPanel9);

        jTabbedPane1.setForeground(new java.awt.Color(0, 140, 186));

        labelA2.setBackground(new java.awt.Color(85, 85, 85));
        labelA2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA2.setForeground(new java.awt.Color(255, 255, 255));
        labelA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA2.setText("A2");
        labelA2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA2.setOpaque(true);
        labelA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA2MouseExited(evt);
            }
        });

        labelA3.setBackground(new java.awt.Color(85, 85, 85));
        labelA3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA3.setForeground(new java.awt.Color(255, 255, 255));
        labelA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA3.setText("A3");
        labelA3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA3.setOpaque(true);
        labelA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA3MouseExited(evt);
            }
        });

        labelA4.setBackground(new java.awt.Color(85, 85, 85));
        labelA4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA4.setForeground(new java.awt.Color(255, 255, 255));
        labelA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA4.setText("A4");
        labelA4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA4.setOpaque(true);
        labelA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA4MouseExited(evt);
            }
        });

        labelA5.setBackground(new java.awt.Color(85, 85, 85));
        labelA5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA5.setForeground(new java.awt.Color(255, 255, 255));
        labelA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA5.setText("A5");
        labelA5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA5.setOpaque(true);
        labelA5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA5MouseExited(evt);
            }
        });

        labelA6.setBackground(new java.awt.Color(85, 85, 85));
        labelA6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA6.setForeground(new java.awt.Color(255, 255, 255));
        labelA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA6.setText("A6");
        labelA6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA6.setOpaque(true);
        labelA6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA6MouseExited(evt);
            }
        });

        labelA7.setBackground(new java.awt.Color(85, 85, 85));
        labelA7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA7.setForeground(new java.awt.Color(255, 255, 255));
        labelA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA7.setText("A7");
        labelA7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA7.setOpaque(true);
        labelA7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA7MouseExited(evt);
            }
        });

        labelA1.setBackground(new java.awt.Color(85, 85, 85));
        labelA1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA1.setForeground(new java.awt.Color(255, 255, 255));
        labelA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA1.setText("A1");
        labelA1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA1.setOpaque(true);
        labelA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA1MouseExited(evt);
            }
        });

        labelA10.setBackground(new java.awt.Color(85, 85, 85));
        labelA10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA10.setForeground(new java.awt.Color(255, 255, 255));
        labelA10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA10.setText("A10");
        labelA10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA10.setOpaque(true);
        labelA10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA10MouseExited(evt);
            }
        });

        labelA12.setBackground(new java.awt.Color(85, 85, 85));
        labelA12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA12.setForeground(new java.awt.Color(255, 255, 255));
        labelA12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA12.setText("A12");
        labelA12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA12.setOpaque(true);

        labelA13.setBackground(new java.awt.Color(85, 85, 85));
        labelA13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA13.setForeground(new java.awt.Color(255, 255, 255));
        labelA13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA13.setText("A13");
        labelA13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA13.setOpaque(true);

        labelA14.setBackground(new java.awt.Color(85, 85, 85));
        labelA14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA14.setForeground(new java.awt.Color(255, 255, 255));
        labelA14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA14.setText("A14");
        labelA14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA14.setOpaque(true);

        labelA16.setBackground(new java.awt.Color(85, 85, 85));
        labelA16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA16.setForeground(new java.awt.Color(255, 255, 255));
        labelA16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA16.setText("A16");
        labelA16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA16.setOpaque(true);

        labelA11.setBackground(new java.awt.Color(85, 85, 85));
        labelA11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA11.setForeground(new java.awt.Color(255, 255, 255));
        labelA11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA11.setText("A11");
        labelA11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA11.setOpaque(true);

        labelA9.setBackground(new java.awt.Color(85, 85, 85));
        labelA9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA9.setForeground(new java.awt.Color(255, 255, 255));
        labelA9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA9.setText("A9");
        labelA9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA9.setOpaque(true);
        labelA9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA9MouseExited(evt);
            }
        });

        labelA17.setBackground(new java.awt.Color(85, 85, 85));
        labelA17.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA17.setForeground(new java.awt.Color(255, 255, 255));
        labelA17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA17.setText("A17");
        labelA17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA17.setOpaque(true);

        labelA15.setBackground(new java.awt.Color(85, 85, 85));
        labelA15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA15.setForeground(new java.awt.Color(255, 255, 255));
        labelA15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA15.setText("A15");
        labelA15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA15.setOpaque(true);

        labelA8.setBackground(new java.awt.Color(85, 85, 85));
        labelA8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA8.setForeground(new java.awt.Color(255, 255, 255));
        labelA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA8.setText("A8");
        labelA8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA8.setOpaque(true);
        labelA8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelA8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelA8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelA8MouseExited(evt);
            }
        });

        labelA18.setBackground(new java.awt.Color(85, 85, 85));
        labelA18.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA18.setForeground(new java.awt.Color(255, 255, 255));
        labelA18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA18.setText("A18");
        labelA18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelA18.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelA10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Araba Katı 1", jPanel2);

        labelA27.setBackground(new java.awt.Color(85, 85, 85));
        labelA27.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA27.setForeground(new java.awt.Color(255, 255, 255));
        labelA27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA27.setText("A27");
        labelA27.setOpaque(true);

        labelA21.setBackground(new java.awt.Color(85, 85, 85));
        labelA21.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA21.setForeground(new java.awt.Color(255, 255, 255));
        labelA21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA21.setText("A21");
        labelA21.setOpaque(true);

        labelA22.setBackground(new java.awt.Color(85, 85, 85));
        labelA22.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA22.setForeground(new java.awt.Color(255, 255, 255));
        labelA22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA22.setText("A22");
        labelA22.setOpaque(true);

        labelA23.setBackground(new java.awt.Color(85, 85, 85));
        labelA23.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA23.setForeground(new java.awt.Color(255, 255, 255));
        labelA23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA23.setText("A23");
        labelA23.setOpaque(true);

        labelA24.setBackground(new java.awt.Color(85, 85, 85));
        labelA24.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA24.setForeground(new java.awt.Color(255, 255, 255));
        labelA24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA24.setText("A24");
        labelA24.setOpaque(true);

        labelA25.setBackground(new java.awt.Color(85, 85, 85));
        labelA25.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA25.setForeground(new java.awt.Color(255, 255, 255));
        labelA25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA25.setText("A25");
        labelA25.setOpaque(true);

        labelA26.setBackground(new java.awt.Color(85, 85, 85));
        labelA26.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA26.setForeground(new java.awt.Color(255, 255, 255));
        labelA26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA26.setText("A26");
        labelA26.setOpaque(true);

        labelA20.setBackground(new java.awt.Color(85, 85, 85));
        labelA20.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA20.setForeground(new java.awt.Color(255, 255, 255));
        labelA20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA20.setText("A20");
        labelA20.setOpaque(true);

        labelA19.setBackground(new java.awt.Color(85, 85, 85));
        labelA19.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA19.setForeground(new java.awt.Color(255, 255, 255));
        labelA19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA19.setText("A19");
        labelA19.setOpaque(true);

        labelA28.setBackground(new java.awt.Color(85, 85, 85));
        labelA28.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA28.setForeground(new java.awt.Color(255, 255, 255));
        labelA28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA28.setText("A28");
        labelA28.setOpaque(true);

        labelA30.setBackground(new java.awt.Color(85, 85, 85));
        labelA30.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA30.setForeground(new java.awt.Color(255, 255, 255));
        labelA30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA30.setText("A30");
        labelA30.setOpaque(true);

        labelA31.setBackground(new java.awt.Color(85, 85, 85));
        labelA31.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA31.setForeground(new java.awt.Color(255, 255, 255));
        labelA31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA31.setText("A31");
        labelA31.setOpaque(true);

        labelA32.setBackground(new java.awt.Color(85, 85, 85));
        labelA32.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA32.setForeground(new java.awt.Color(255, 255, 255));
        labelA32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA32.setText("A32");
        labelA32.setOpaque(true);

        labelA33.setBackground(new java.awt.Color(85, 85, 85));
        labelA33.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA33.setForeground(new java.awt.Color(255, 255, 255));
        labelA33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA33.setText("A33");
        labelA33.setOpaque(true);

        labelA34.setBackground(new java.awt.Color(85, 85, 85));
        labelA34.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA34.setForeground(new java.awt.Color(255, 255, 255));
        labelA34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA34.setText("A34");
        labelA34.setOpaque(true);

        labelA35.setBackground(new java.awt.Color(85, 85, 85));
        labelA35.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA35.setForeground(new java.awt.Color(255, 255, 255));
        labelA35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA35.setText("A35");
        labelA35.setOpaque(true);

        labelA36.setBackground(new java.awt.Color(85, 85, 85));
        labelA36.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA36.setForeground(new java.awt.Color(255, 255, 255));
        labelA36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA36.setText("A36");
        labelA36.setOpaque(true);

        labelA29.setBackground(new java.awt.Color(85, 85, 85));
        labelA29.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA29.setForeground(new java.awt.Color(255, 255, 255));
        labelA29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA29.setText("A29");
        labelA29.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelA19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(labelA29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(labelA20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA27, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA31, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA35, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA36, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Araba Katı 2", jPanel8);

        labelM2.setBackground(new java.awt.Color(85, 85, 85));
        labelM2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM2.setForeground(new java.awt.Color(255, 255, 255));
        labelM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM2.setText("M2");
        labelM2.setOpaque(true);

        labelM1.setBackground(new java.awt.Color(85, 85, 85));
        labelM1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM1.setForeground(new java.awt.Color(255, 255, 255));
        labelM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM1.setText("M1");
        labelM1.setOpaque(true);

        labelM4.setBackground(new java.awt.Color(85, 85, 85));
        labelM4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM4.setForeground(new java.awt.Color(255, 255, 255));
        labelM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM4.setText("M4");
        labelM4.setOpaque(true);

        labelM5.setBackground(new java.awt.Color(85, 85, 85));
        labelM5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM5.setForeground(new java.awt.Color(255, 255, 255));
        labelM5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM5.setText("M5");
        labelM5.setOpaque(true);

        labelM6.setBackground(new java.awt.Color(85, 85, 85));
        labelM6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM6.setForeground(new java.awt.Color(255, 255, 255));
        labelM6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM6.setText("M6");
        labelM6.setOpaque(true);

        labelM7.setBackground(new java.awt.Color(85, 85, 85));
        labelM7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM7.setForeground(new java.awt.Color(255, 255, 255));
        labelM7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM7.setText("M7");
        labelM7.setOpaque(true);

        labelM8.setBackground(new java.awt.Color(85, 85, 85));
        labelM8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM8.setForeground(new java.awt.Color(255, 255, 255));
        labelM8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM8.setText("M8");
        labelM8.setOpaque(true);

        labelM9.setBackground(new java.awt.Color(85, 85, 85));
        labelM9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM9.setForeground(new java.awt.Color(255, 255, 255));
        labelM9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM9.setText("M9");
        labelM9.setOpaque(true);

        labelM10.setBackground(new java.awt.Color(85, 85, 85));
        labelM10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM10.setForeground(new java.awt.Color(255, 255, 255));
        labelM10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM10.setText("M10");
        labelM10.setOpaque(true);

        labelM11.setBackground(new java.awt.Color(85, 85, 85));
        labelM11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM11.setForeground(new java.awt.Color(255, 255, 255));
        labelM11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM11.setText("M11");
        labelM11.setOpaque(true);

        labelM12.setBackground(new java.awt.Color(85, 85, 85));
        labelM12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM12.setForeground(new java.awt.Color(255, 255, 255));
        labelM12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM12.setText("M12");
        labelM12.setOpaque(true);

        labelM13.setBackground(new java.awt.Color(85, 85, 85));
        labelM13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM13.setForeground(new java.awt.Color(255, 255, 255));
        labelM13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM13.setText("M13");
        labelM13.setOpaque(true);

        labelM14.setBackground(new java.awt.Color(85, 85, 85));
        labelM14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM14.setForeground(new java.awt.Color(255, 255, 255));
        labelM14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM14.setText("M14");
        labelM14.setOpaque(true);

        labelM15.setBackground(new java.awt.Color(85, 85, 85));
        labelM15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM15.setForeground(new java.awt.Color(255, 255, 255));
        labelM15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM15.setText("M15");
        labelM15.setOpaque(true);

        labelM16.setBackground(new java.awt.Color(85, 85, 85));
        labelM16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM16.setForeground(new java.awt.Color(255, 255, 255));
        labelM16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM16.setText("M16");
        labelM16.setOpaque(true);

        labelM17.setBackground(new java.awt.Color(85, 85, 85));
        labelM17.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM17.setForeground(new java.awt.Color(255, 255, 255));
        labelM17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM17.setText("M17");
        labelM17.setToolTipText("");
        labelM17.setOpaque(true);

        labelM18.setBackground(new java.awt.Color(85, 85, 85));
        labelM18.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM18.setForeground(new java.awt.Color(255, 255, 255));
        labelM18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM18.setText("M18");
        labelM18.setOpaque(true);

        labelM3.setBackground(new java.awt.Color(85, 85, 85));
        labelM3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelM3.setForeground(new java.awt.Color(255, 255, 255));
        labelM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelM3.setText("M3");
        labelM3.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelM1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelM10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelM18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelM10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelM18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Motosiklet Katı", jPanel6);

        labelK2.setBackground(new java.awt.Color(85, 85, 85));
        labelK2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK2.setForeground(new java.awt.Color(255, 255, 255));
        labelK2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK2.setText("K2");
        labelK2.setOpaque(true);

        labelK3.setBackground(new java.awt.Color(85, 85, 85));
        labelK3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK3.setForeground(new java.awt.Color(255, 255, 255));
        labelK3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK3.setText("K3");
        labelK3.setOpaque(true);

        labelK4.setBackground(new java.awt.Color(85, 85, 85));
        labelK4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK4.setForeground(new java.awt.Color(255, 255, 255));
        labelK4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK4.setText("K4");
        labelK4.setOpaque(true);

        labelK5.setBackground(new java.awt.Color(85, 85, 85));
        labelK5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK5.setForeground(new java.awt.Color(255, 255, 255));
        labelK5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK5.setText("K5");
        labelK5.setOpaque(true);

        labelK6.setBackground(new java.awt.Color(85, 85, 85));
        labelK6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK6.setForeground(new java.awt.Color(255, 255, 255));
        labelK6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK6.setText("K6");
        labelK6.setOpaque(true);

        labelK1.setBackground(new java.awt.Color(85, 85, 85));
        labelK1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK1.setForeground(new java.awt.Color(255, 255, 255));
        labelK1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK1.setText("K1");
        labelK1.setOpaque(true);

        labelK8.setBackground(new java.awt.Color(85, 85, 85));
        labelK8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK8.setForeground(new java.awt.Color(255, 255, 255));
        labelK8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK8.setText("K8");
        labelK8.setOpaque(true);

        labelK9.setBackground(new java.awt.Color(85, 85, 85));
        labelK9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK9.setForeground(new java.awt.Color(255, 255, 255));
        labelK9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK9.setText("K9");
        labelK9.setOpaque(true);

        labelK10.setBackground(new java.awt.Color(85, 85, 85));
        labelK10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK10.setForeground(new java.awt.Color(255, 255, 255));
        labelK10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK10.setText("K10");
        labelK10.setOpaque(true);

        labelK11.setBackground(new java.awt.Color(85, 85, 85));
        labelK11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK11.setForeground(new java.awt.Color(255, 255, 255));
        labelK11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK11.setText("K11");
        labelK11.setOpaque(true);

        labelK12.setBackground(new java.awt.Color(85, 85, 85));
        labelK12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK12.setForeground(new java.awt.Color(255, 255, 255));
        labelK12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK12.setText("K12");
        labelK12.setOpaque(true);

        labelK7.setBackground(new java.awt.Color(85, 85, 85));
        labelK7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK7.setForeground(new java.awt.Color(255, 255, 255));
        labelK7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK7.setText("K7");
        labelK7.setOpaque(true);

        labelK14.setBackground(new java.awt.Color(85, 85, 85));
        labelK14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK14.setForeground(new java.awt.Color(255, 255, 255));
        labelK14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK14.setText("K14");
        labelK14.setOpaque(true);

        labelK13.setBackground(new java.awt.Color(85, 85, 85));
        labelK13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelK13.setForeground(new java.awt.Color(255, 255, 255));
        labelK13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelK13.setText("K13");
        labelK13.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelK1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelK8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelK14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelK3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelK8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelK14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kamyonet Katı", jPanel3);

        labelB2.setBackground(new java.awt.Color(85, 85, 85));
        labelB2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB2.setForeground(new java.awt.Color(255, 255, 255));
        labelB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB2.setText("B2");
        labelB2.setOpaque(true);

        labelB1.setBackground(new java.awt.Color(85, 85, 85));
        labelB1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB1.setForeground(new java.awt.Color(255, 255, 255));
        labelB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB1.setText("B1");
        labelB1.setOpaque(true);

        labelB4.setBackground(new java.awt.Color(85, 85, 85));
        labelB4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB4.setForeground(new java.awt.Color(255, 255, 255));
        labelB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB4.setText("B4");
        labelB4.setOpaque(true);

        labelB5.setBackground(new java.awt.Color(85, 85, 85));
        labelB5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB5.setForeground(new java.awt.Color(255, 255, 255));
        labelB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB5.setText("B5");
        labelB5.setOpaque(true);

        labelB6.setBackground(new java.awt.Color(85, 85, 85));
        labelB6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB6.setForeground(new java.awt.Color(255, 255, 255));
        labelB6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB6.setText("B6");
        labelB6.setOpaque(true);

        labelB7.setBackground(new java.awt.Color(85, 85, 85));
        labelB7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB7.setForeground(new java.awt.Color(255, 255, 255));
        labelB7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB7.setText("B7");
        labelB7.setToolTipText("");
        labelB7.setOpaque(true);

        labelB8.setBackground(new java.awt.Color(85, 85, 85));
        labelB8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB8.setForeground(new java.awt.Color(255, 255, 255));
        labelB8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB8.setText("B8");
        labelB8.setOpaque(true);

        labelB9.setBackground(new java.awt.Color(85, 85, 85));
        labelB9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB9.setForeground(new java.awt.Color(255, 255, 255));
        labelB9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB9.setText("B9");
        labelB9.setOpaque(true);

        labelB10.setBackground(new java.awt.Color(85, 85, 85));
        labelB10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB10.setForeground(new java.awt.Color(255, 255, 255));
        labelB10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB10.setText("B10");
        labelB10.setOpaque(true);

        labelB3.setBackground(new java.awt.Color(85, 85, 85));
        labelB3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelB3.setForeground(new java.awt.Color(255, 255, 255));
        labelB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB3.setText("B3");
        labelB3.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(labelB1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(labelB6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelB10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelB1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelB6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kamyon Katı", jPanel7);

        labelE2.setBackground(new java.awt.Color(85, 85, 85));
        labelE2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE2.setForeground(new java.awt.Color(255, 255, 255));
        labelE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE2.setText("E2");
        labelE2.setOpaque(true);

        labelE1.setBackground(new java.awt.Color(85, 85, 85));
        labelE1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE1.setForeground(new java.awt.Color(255, 255, 255));
        labelE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE1.setText("E1");
        labelE1.setOpaque(true);

        labelE4.setBackground(new java.awt.Color(85, 85, 85));
        labelE4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE4.setForeground(new java.awt.Color(255, 255, 255));
        labelE4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE4.setText("E4");
        labelE4.setOpaque(true);

        labelE5.setBackground(new java.awt.Color(85, 85, 85));
        labelE5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE5.setForeground(new java.awt.Color(255, 255, 255));
        labelE5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE5.setText("E5");
        labelE5.setOpaque(true);

        labelE6.setBackground(new java.awt.Color(85, 85, 85));
        labelE6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE6.setForeground(new java.awt.Color(255, 255, 255));
        labelE6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE6.setText("E6");
        labelE6.setOpaque(true);

        labelE7.setBackground(new java.awt.Color(85, 85, 85));
        labelE7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE7.setForeground(new java.awt.Color(255, 255, 255));
        labelE7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE7.setText("E7");
        labelE7.setOpaque(true);

        labelE8.setBackground(new java.awt.Color(85, 85, 85));
        labelE8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE8.setForeground(new java.awt.Color(255, 255, 255));
        labelE8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE8.setText("E8");
        labelE8.setOpaque(true);

        labelE9.setBackground(new java.awt.Color(85, 85, 85));
        labelE9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE9.setForeground(new java.awt.Color(255, 255, 255));
        labelE9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE9.setText("E9");
        labelE9.setOpaque(true);

        labelE10.setBackground(new java.awt.Color(85, 85, 85));
        labelE10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE10.setForeground(new java.awt.Color(255, 255, 255));
        labelE10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE10.setText("E10");
        labelE10.setOpaque(true);

        labelE3.setBackground(new java.awt.Color(85, 85, 85));
        labelE3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelE3.setForeground(new java.awt.Color(255, 255, 255));
        labelE3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE3.setText("E3");
        labelE3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelE1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelE6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelE10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelE1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelE6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelE10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Engelli Katı", jPanel1);

        tabbedPaneMenu.addTab("Katlar", jTabbedPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        tabbedPaneMenu.addTab("Araç Ara", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneMenu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneMenu))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonParketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonParketActionPerformed

        boolean boslukKontrol = textAracEkleAd.getText().equals("") || textAracEkleMarka.getText().equals("")
                || textAracEklePlaka.getText().equals("") || textAracEkleModel.getText().equals("")
                || textAracEkleSoyad.getText().equals("");
        boolean plakaKontrol = false;

        if (boslukKontrol) {
            JOptionPane.showMessageDialog(null, "Herhangi Bir Parametre Boş Geçilemez!");
        } else {

            String ad, soyad, plaka, tur, marka, model;
            ad = DataBase.kelimeyiDuzelt(textAracEkleAd.getText());
            soyad = DataBase.kelimeyiDuzelt(textAracEkleSoyad.getText());
            plaka = DataBase.kelimeyiDuzelt(textAracEklePlaka.getText());
            marka = DataBase.kelimeyiDuzelt(textAracEkleMarka.getText());
            model = DataBase.kelimeyiDuzelt(textAracEkleModel.getText());
            tur = DataBase.kelimeyiDuzelt(comboAracEkleTur.getSelectedItem().toString());
            int yas = (int) spinnerAracEkleYas.getValue();

            int konumAraba = -1, konumMotosiklet = -1, konumKamyonet = -1, konumKamyon = -1, konumEngelli = -1;

            try {

                konumAraba = arabaKati.katParkYeribul("files\\katlar\\arabaDurumlari.txt");
                konumMotosiklet = motosikletKati.katParkYeribul("files\\katlar\\motosikletDurumlari.txt");
                konumKamyonet = kamyonetKati.katParkYeribul("files\\katlar\\kamyonetDurumlari.txt");
                konumKamyon = kamyonKati.katParkYeribul("files\\katlar\\kamyonDurumlari.txt");
                konumEngelli = engelliKati.katParkYeribul("files\\katlar\\engelliDurumlari.txt");

                if (konumAraba == -1) {
                    JOptionPane.showMessageDialog(null, "Park Yerleri Tamamen Dolu!");
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Araç Park Edildi Konum : " + arabaKati.katLabellari[konumAraba].getText());
                    Araclar arac = new Araclar(ad, soyad, plaka, tur, yas, (marka + " " + model).split(" "), 0, -1, -1, -1);
                    arac.aracParkEt();
                    
                    arabaKati.katAraclari[konumAraba] = arac;
                    arabaKati.katDurumlari[konumAraba] = true;
                    arabaKati.katLabellari[konumAraba].setText(arac.getAracPlaka());
                    arabaKati.katLabellari[konumAraba].setBackground(Color.red);
                    arabaKati.katAraclariniKaydet("files\\katlar\\arabaAraclari.txt");
                    arabaKati.katDurumlariniKaydet("files\\katlar\\arabaDurumlari.txt");
                    textClear(textAracEkleAd, textAracEkleSoyad, textAracEklePlaka, textAracEkleModel, textAracEkleMarka);
                }

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_buttonParketActionPerformed

    private void labelClicked(JLabel label, String defaultText, int index, Araclar arac,
            Araclar[] araclar, boolean[] aracDurumlari, String katAraclariYolu, String katDurumlariYolu) throws IOException {

        label.setText(defaultText);
        label.setBackground(siyah);
        labelAd.setText(arac.getAracSahibiIsım());
        labelSoyad.setText(arac.getAracSahibiSoyIsim());
        labelAracYasi.setText(String.valueOf(arac.getAracYasi()));
        labelPlaka.setText(arac.getAracPlaka());
        labelTur.setText(arac.getAracTuru());
        labelMarka.setText(arac.getMarkaModel()[0]);
        labelModel.setText(arac.getMarkaModel()[1]);
        labelUcret.setText(String.valueOf(yonetici.parkUcretiHesapla(arac)));

        araclar[index] = null;
        aracDurumlari[index] = false;

        arabaKati.katAraclariniKaydet(katAraclariYolu);
        arabaKati.katDurumlariniKaydet(katDurumlariYolu);

        JOptionPane.showMessageDialog(null, "Aracın Çıkışı Yapıldı ve Park Ücreti Hesaplandı. Görüntülemek İçin Hesapla Menüsüne Gidiniz...");

    }

    public void labelMouseEntered(JLabel label, String defaultText) {
        plaka = label.getText();
        if (label.getText() != defaultText) {
            label.setText("Çıkışını Yap");
            label.setBackground(mavi);
        }
    }

    public void labelMouseExited(JLabel label, String defaultText) {
        if (label.getText() != defaultText) {
            label.setBackground(Color.red);
            label.setText(plaka);

        }
    }

    private void labelA1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA1MouseEntered

        labelMouseEntered(labelA1, "A1");

    }//GEN-LAST:event_labelA1MouseEntered

    private void labelA1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA1MouseExited

        labelMouseExited(labelA1, "A1");


    }//GEN-LAST:event_labelA1MouseExited

    private void labelA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA1MouseClicked

        if (!labelA1.getText().equals("A1")) {

            try {

                labelClicked(labelA1, "A1", 0, arabaKati.katAraclari[0], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_labelA1MouseClicked

    private void labelA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA2MouseClicked
        if (!labelA1.getText().equals("A2")) {

            try {

                labelClicked(labelA2, "A2", 1, arabaKati.katAraclari[1], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_labelA2MouseClicked

    private void labelA2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA2MouseEntered
        labelMouseEntered(labelA2, "A2");
    }//GEN-LAST:event_labelA2MouseEntered

    private void labelA2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA2MouseExited
        labelMouseExited(labelA2, "A2");
    }//GEN-LAST:event_labelA2MouseExited

    private void labelA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA3MouseClicked
        if (!labelA3.getText().equals("A3")) {
            try {

                labelClicked(labelA3, "A3", 2, arabaKati.katAraclari[2], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA3MouseClicked

    private void labelA3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA3MouseEntered
        labelMouseEntered(labelA3, "A3");
    }//GEN-LAST:event_labelA3MouseEntered

    private void labelA3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA3MouseExited
        labelMouseExited(labelA3, "A3");
    }//GEN-LAST:event_labelA3MouseExited

    private void labelA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA4MouseClicked
        if (!labelA4.getText().equals("A4")) {
            try {

                labelClicked(labelA4, "A4", 3, arabaKati.katAraclari[3], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA4MouseClicked

    private void labelA4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA4MouseEntered
        labelMouseEntered(labelA4, "A4");
    }//GEN-LAST:event_labelA4MouseEntered

    private void labelA5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA5MouseClicked
        if (!labelA5.getText().equals("A5")) {
            try {

                labelClicked(labelA5, "A5", 4, arabaKati.katAraclari[4], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA5MouseClicked

    private void labelA6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA6MouseClicked
        if (!labelA6.getText().equals("A6")) {
            try {

                labelClicked(labelA6, "A6", 5, arabaKati.katAraclari[5], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA6MouseClicked

    private void labelA7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA7MouseClicked
        if (!labelA7.getText().equals("A7")) {
            try {

                labelClicked(labelA7, "A7", 6, arabaKati.katAraclari[6], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA7MouseClicked

    private void labelA8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA8MouseClicked
        if (!labelA8.getText().equals("A8")) {
            try {

                labelClicked(labelA8, "A8", 7, arabaKati.katAraclari[7], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA8MouseClicked

    private void labelA9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA9MouseClicked
        if (!labelA9.getText().equals("A9")) {
            try {

                labelClicked(labelA9, "A9", 8, arabaKati.katAraclari[8], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA9MouseClicked

    private void labelA10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA10MouseClicked
        if (!labelA10.getText().equals("A10")) {
            try {

                labelClicked(labelA10, "A10", 9, arabaKati.katAraclari[9], arabaKati.katAraclari, arabaKati.katDurumlari, "files\\katlar\\arabaAraclari.txt", "files\\katlar\\arabaDurumlari.txt");

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_labelA10MouseClicked

    private void labelA5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA5MouseEntered
        labelMouseEntered(labelA5, "A5");
    }//GEN-LAST:event_labelA5MouseEntered

    private void labelA6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA6MouseEntered
        labelMouseEntered(labelA6, "A6");
    }//GEN-LAST:event_labelA6MouseEntered

    private void labelA7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA7MouseEntered
        labelMouseEntered(labelA7, "A7");
    }//GEN-LAST:event_labelA7MouseEntered

    private void labelA8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA8MouseEntered
        labelMouseEntered(labelA8, "A8");
    }//GEN-LAST:event_labelA8MouseEntered

    private void labelA10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA10MouseEntered
        labelMouseEntered(labelA10, "A10");
    }//GEN-LAST:event_labelA10MouseEntered

    private void labelA4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA4MouseExited
        labelMouseExited(labelA4, "A4");
    }//GEN-LAST:event_labelA4MouseExited

    private void labelA5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA5MouseExited
        labelMouseExited(labelA5, "A5");
    }//GEN-LAST:event_labelA5MouseExited

    private void labelA6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA6MouseExited
        labelMouseExited(labelA6, "A6");
    }//GEN-LAST:event_labelA6MouseExited

    private void labelA7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA7MouseExited
        labelMouseExited(labelA7, "A7");
    }//GEN-LAST:event_labelA7MouseExited

    private void labelA8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA8MouseExited
        labelMouseExited(labelA8, "A8");
    }//GEN-LAST:event_labelA8MouseExited

    private void labelA9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA9MouseExited
        labelMouseExited(labelA9, "A9");
    }//GEN-LAST:event_labelA9MouseExited

    private void labelA10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA10MouseExited
        labelMouseExited(labelA10, "A10");
    }//GEN-LAST:event_labelA10MouseExited

    private void labelA9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelA9MouseEntered
        labelMouseEntered(labelA9, "A9");
    }//GEN-LAST:event_labelA9MouseEntered

    private void buttonHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHesaplaActionPerformed
        double paraUstu = 0, gelenPara, ucret;
        if (labelUcret.getText() != "---------------") {
            gelenPara = Double.parseDouble(spinnerGelenPara.getValue().toString());
            ucret = Double.parseDouble(labelUcret.getText());
            paraUstu = yonetici.paraUstuHesapla(gelenPara, ucret);

            labelParaustu.setText(String.valueOf(paraUstu));
        }


    }//GEN-LAST:event_buttonHesaplaActionPerformed

    private void buttonUcretiAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUcretiAlActionPerformed
        double ucret, toplamBakiye = Double.parseDouble(labelToplamBakiye.getText());

        if (labelUcret.getText() != "---------------") {

            ucret = Double.parseDouble(labelUcret.getText());

            try {
                FileWriter fileOut = new FileWriter("files\\kasa\\kasa.txt", false);
                BufferedWriter bWriter = new BufferedWriter(fileOut);

                toplamBakiye += ucret;
                bWriter.write(String.valueOf(toplamBakiye));
                bWriter.close();

            } catch (IOException ex) {
                Logger.getLogger(FormYoneticiArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }

            labelToplamBakiye.setText(String.valueOf(toplamBakiye));

        }


    }//GEN-LAST:event_buttonUcretiAlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAracEkle;
    private javax.swing.JButton buttonHesapla;
    private javax.swing.JButton buttonHesapla1;
    private javax.swing.JComboBox comboAracEkleTur;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel labelA1;
    public static javax.swing.JLabel labelA10;
    public static javax.swing.JLabel labelA11;
    public static javax.swing.JLabel labelA12;
    public static javax.swing.JLabel labelA13;
    public static javax.swing.JLabel labelA14;
    public static javax.swing.JLabel labelA15;
    public static javax.swing.JLabel labelA16;
    public static javax.swing.JLabel labelA17;
    public static javax.swing.JLabel labelA18;
    private javax.swing.JLabel labelA19;
    public static javax.swing.JLabel labelA2;
    private javax.swing.JLabel labelA20;
    private javax.swing.JLabel labelA21;
    private javax.swing.JLabel labelA22;
    private javax.swing.JLabel labelA23;
    private javax.swing.JLabel labelA24;
    private javax.swing.JLabel labelA25;
    private javax.swing.JLabel labelA26;
    private javax.swing.JLabel labelA27;
    private javax.swing.JLabel labelA28;
    private javax.swing.JLabel labelA29;
    public static javax.swing.JLabel labelA3;
    private javax.swing.JLabel labelA30;
    private javax.swing.JLabel labelA31;
    private javax.swing.JLabel labelA32;
    private javax.swing.JLabel labelA33;
    private javax.swing.JLabel labelA34;
    private javax.swing.JLabel labelA35;
    private javax.swing.JLabel labelA36;
    public static javax.swing.JLabel labelA4;
    public static javax.swing.JLabel labelA5;
    public static javax.swing.JLabel labelA6;
    public static javax.swing.JLabel labelA7;
    public static javax.swing.JLabel labelA8;
    public static javax.swing.JLabel labelA9;
    private javax.swing.JLabel labelAd;
    private javax.swing.JLabel labelAracYasi;
    private javax.swing.JLabel labelB1;
    private javax.swing.JLabel labelB10;
    private javax.swing.JLabel labelB2;
    private javax.swing.JLabel labelB3;
    private javax.swing.JLabel labelB4;
    private javax.swing.JLabel labelB5;
    private javax.swing.JLabel labelB6;
    private javax.swing.JLabel labelB7;
    private javax.swing.JLabel labelB8;
    private javax.swing.JLabel labelB9;
    private javax.swing.JLabel labelE1;
    private javax.swing.JLabel labelE10;
    private javax.swing.JLabel labelE2;
    private javax.swing.JLabel labelE3;
    private javax.swing.JLabel labelE4;
    private javax.swing.JLabel labelE5;
    private javax.swing.JLabel labelE6;
    private javax.swing.JLabel labelE7;
    private javax.swing.JLabel labelE8;
    private javax.swing.JLabel labelE9;
    private javax.swing.JLabel labelK1;
    private javax.swing.JLabel labelK10;
    private javax.swing.JLabel labelK11;
    private javax.swing.JLabel labelK12;
    private javax.swing.JLabel labelK13;
    private javax.swing.JLabel labelK14;
    private javax.swing.JLabel labelK2;
    private javax.swing.JLabel labelK3;
    private javax.swing.JLabel labelK4;
    private javax.swing.JLabel labelK5;
    private javax.swing.JLabel labelK6;
    private javax.swing.JLabel labelK7;
    private javax.swing.JLabel labelK8;
    private javax.swing.JLabel labelK9;
    public static javax.swing.JLabel labelKullanici;
    private javax.swing.JLabel labelM1;
    private javax.swing.JLabel labelM10;
    private javax.swing.JLabel labelM11;
    private javax.swing.JLabel labelM12;
    private javax.swing.JLabel labelM13;
    private javax.swing.JLabel labelM14;
    private javax.swing.JLabel labelM15;
    private javax.swing.JLabel labelM16;
    private javax.swing.JLabel labelM17;
    private javax.swing.JLabel labelM18;
    private javax.swing.JLabel labelM2;
    private javax.swing.JLabel labelM3;
    private javax.swing.JLabel labelM4;
    private javax.swing.JLabel labelM5;
    private javax.swing.JLabel labelM6;
    private javax.swing.JLabel labelM7;
    private javax.swing.JLabel labelM8;
    private javax.swing.JLabel labelM9;
    private javax.swing.JLabel labelMarka;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelParaustu;
    private javax.swing.JLabel labelPlaka;
    private javax.swing.JLabel labelSoyad;
    private javax.swing.JLabel labelToplamBakiye;
    private javax.swing.JLabel labelTur;
    private javax.swing.JLabel labelUcret;
    private javax.swing.JSpinner spinnerAracEkleYas;
    private javax.swing.JSpinner spinnerGelenPara;
    private javax.swing.JTabbedPane tabbedPaneMenu;
    private javax.swing.JTextField textAracEkleAd;
    private javax.swing.JTextField textAracEkleMarka;
    private javax.swing.JTextField textAracEkleModel;
    private javax.swing.JTextField textAracEklePlaka;
    private javax.swing.JTextField textAracEkleSoyad;
    // End of variables declaration//GEN-END:variables
}
