package main;

import araclar.Araclar;
import java.awt.Color;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import katlar.Katlar;
import kullanici.Musteri;

public class FormMusteriArayuzu extends javax.swing.JFrame {

    Katlar arabaKati = new Katlar(36, "ARABA");
    public static Araclar arac;
    public static Musteri musteri;

    public FormMusteriArayuzu() {
        initComponents();

        try {
            arabaKati.katDurumlariniYukle("files\\katlar\\arabaDurumlari.txt");

            arabaKati.katLabellariniYukle(labelA1, labelA2, labelA3, labelA4, labelA5, labelA6, labelA7, labelA8, labelA9,
                    labelA10, labelA11, labelA12, labelA13, labelA14, labelA15, labelA16, labelA17, labelA18, labelA19,
                    labelA20, labelA21, labelA22, labelA23, labelA24, labelA25, labelA26, labelA27, labelA28, labelA29,
                    labelA30, labelA31, labelA32, labelA33, labelA34, labelA35, labelA36);

            arabaKati.katAraclariniYukle("files\\katlar\\arabaAraclari.txt");

        } catch (IOException ex) {
            Logger.getLogger(FormMusteriArayuzu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void kullaniciAl(Musteri gelenMusteri, Araclar gelenArac) {
        arac = gelenArac;
        musteri = gelenMusteri;
    }
    
    public void kullaniciBilgileri(Musteri musteri, Araclar arac) {
        labelAd.setText(musteri.getIsim());
        labelSoyad.setText(musteri.getSoyIsim());
        labelKullaniciAdi.setText(musteri.getKullaniciAdi());
        labelTur.setText(arac.getAracTuru());
        labelYas.setText(String.valueOf(arac.getAracYasi()));
        labelPlaka.setText(arac.getAracPlaka());
        labelMarka.setText(arac.getMarkaModel()[0]);
        labelModel.setText(arac.getMarkaModel()[1]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHosgeldin = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelAd = new javax.swing.JLabel();
        labelSoyad = new javax.swing.JLabel();
        labelKullaniciAdi = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonAracParkEt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelTur = new javax.swing.JLabel();
        labelPlaka = new javax.swing.JLabel();
        labelYas = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelMarka = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        labelA2 = new javax.swing.JLabel();
        labelA3 = new javax.swing.JLabel();
        labelA4 = new javax.swing.JLabel();
        labelA5 = new javax.swing.JLabel();
        labelA6 = new javax.swing.JLabel();
        labelA7 = new javax.swing.JLabel();
        labelA8 = new javax.swing.JLabel();
        labelA9 = new javax.swing.JLabel();
        labelA1 = new javax.swing.JLabel();
        labelA11 = new javax.swing.JLabel();
        labelA12 = new javax.swing.JLabel();
        labelA13 = new javax.swing.JLabel();
        labelA14 = new javax.swing.JLabel();
        labelA15 = new javax.swing.JLabel();
        labelA16 = new javax.swing.JLabel();
        labelA17 = new javax.swing.JLabel();
        labelA18 = new javax.swing.JLabel();
        labelA10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelA20 = new javax.swing.JLabel();
        labelA21 = new javax.swing.JLabel();
        labelA22 = new javax.swing.JLabel();
        labelA23 = new javax.swing.JLabel();
        labelA19 = new javax.swing.JLabel();
        labelA25 = new javax.swing.JLabel();
        labelA26 = new javax.swing.JLabel();
        labelA27 = new javax.swing.JLabel();
        labelA28 = new javax.swing.JLabel();
        labelA29 = new javax.swing.JLabel();
        labelA30 = new javax.swing.JLabel();
        labelA31 = new javax.swing.JLabel();
        labelA32 = new javax.swing.JLabel();
        labelA24 = new javax.swing.JLabel();
        labelA34 = new javax.swing.JLabel();
        labelA35 = new javax.swing.JLabel();
        labelA36 = new javax.swing.JLabel();
        labelA33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelA37 = new javax.swing.JLabel();
        labelA38 = new javax.swing.JLabel();
        labelA39 = new javax.swing.JLabel();
        labelA40 = new javax.swing.JLabel();
        labelA41 = new javax.swing.JLabel();
        labelA42 = new javax.swing.JLabel();
        labelA43 = new javax.swing.JLabel();
        labelA44 = new javax.swing.JLabel();
        labelA45 = new javax.swing.JLabel();
        labelA46 = new javax.swing.JLabel();
        labelA47 = new javax.swing.JLabel();
        labelA48 = new javax.swing.JLabel();
        labelA49 = new javax.swing.JLabel();
        labelA50 = new javax.swing.JLabel();
        labelA51 = new javax.swing.JLabel();
        labelA52 = new javax.swing.JLabel();
        labelA53 = new javax.swing.JLabel();
        labelA54 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();

        labelHosgeldin.setText("Hoşgeldin Kullanıcı");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setForeground(new java.awt.Color(76, 175, 80));

        labelWelcome.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(76, 175, 80));
        labelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelWelcome.setText("HOŞGELDİN KULLANICI");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 175, 80));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ad");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 175, 80));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Soyad");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelAd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelAd.setForeground(new java.awt.Color(76, 175, 80));
        labelAd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAd.setText("--------------");
        labelAd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelSoyad.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelSoyad.setForeground(new java.awt.Color(76, 175, 80));
        labelSoyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSoyad.setText("--------------");
        labelSoyad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelKullaniciAdi.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelKullaniciAdi.setForeground(new java.awt.Color(76, 175, 80));
        labelKullaniciAdi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKullaniciAdi.setText("--------------");
        labelKullaniciAdi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(76, 175, 80));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Kullanıcı Adı");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profil", jPanel1);

        jPanel2.setForeground(new java.awt.Color(76, 175, 80));

        buttonAracParkEt.setBackground(new java.awt.Color(76, 175, 80));
        buttonAracParkEt.setForeground(new java.awt.Color(255, 255, 255));
        buttonAracParkEt.setText("Aracımı Park Et");
        buttonAracParkEt.setBorder(null);
        buttonAracParkEt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAracParkEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAracParkEtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 175, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tür");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelTur.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelTur.setForeground(new java.awt.Color(76, 175, 80));
        labelTur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTur.setText("--------------");
        labelTur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelPlaka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelPlaka.setForeground(new java.awt.Color(76, 175, 80));
        labelPlaka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaka.setText("--------------");
        labelPlaka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelYas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelYas.setForeground(new java.awt.Color(76, 175, 80));
        labelYas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelYas.setText("--------------");
        labelYas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelModel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelModel.setForeground(new java.awt.Color(76, 175, 80));
        labelModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModel.setText("--------------");
        labelModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 175, 80));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Yaş");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 175, 80));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Plaka");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 175, 80));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Marka");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 175, 80));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Model");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        labelMarka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelMarka.setForeground(new java.awt.Color(76, 175, 80));
        labelMarka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMarka.setText("--------------");
        labelMarka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAracParkEt, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelYas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTur, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTur, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonAracParkEt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aracım", jPanel2);

        jTabbedPane2.setForeground(new java.awt.Color(76, 175, 80));

        labelA2.setBackground(new java.awt.Color(85, 85, 85));
        labelA2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA2.setForeground(new java.awt.Color(255, 255, 255));
        labelA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA2.setText("A2");
        labelA2.setOpaque(true);

        labelA3.setBackground(new java.awt.Color(85, 85, 85));
        labelA3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA3.setForeground(new java.awt.Color(255, 255, 255));
        labelA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA3.setText("A3");
        labelA3.setOpaque(true);

        labelA4.setBackground(new java.awt.Color(85, 85, 85));
        labelA4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA4.setForeground(new java.awt.Color(255, 255, 255));
        labelA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA4.setText("A4");
        labelA4.setOpaque(true);

        labelA5.setBackground(new java.awt.Color(85, 85, 85));
        labelA5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA5.setForeground(new java.awt.Color(255, 255, 255));
        labelA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA5.setText("A5");
        labelA5.setOpaque(true);

        labelA6.setBackground(new java.awt.Color(85, 85, 85));
        labelA6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA6.setForeground(new java.awt.Color(255, 255, 255));
        labelA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA6.setText("A6");
        labelA6.setOpaque(true);

        labelA7.setBackground(new java.awt.Color(85, 85, 85));
        labelA7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA7.setForeground(new java.awt.Color(255, 255, 255));
        labelA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA7.setText("A7");
        labelA7.setOpaque(true);

        labelA8.setBackground(new java.awt.Color(85, 85, 85));
        labelA8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA8.setForeground(new java.awt.Color(255, 255, 255));
        labelA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA8.setText("A8");
        labelA8.setOpaque(true);

        labelA9.setBackground(new java.awt.Color(85, 85, 85));
        labelA9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA9.setForeground(new java.awt.Color(255, 255, 255));
        labelA9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA9.setText("A9");
        labelA9.setOpaque(true);

        labelA1.setBackground(new java.awt.Color(85, 85, 85));
        labelA1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA1.setForeground(new java.awt.Color(255, 255, 255));
        labelA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA1.setText("A1");
        labelA1.setOpaque(true);

        labelA11.setBackground(new java.awt.Color(85, 85, 85));
        labelA11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA11.setForeground(new java.awt.Color(255, 255, 255));
        labelA11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA11.setText("A11");
        labelA11.setOpaque(true);

        labelA12.setBackground(new java.awt.Color(85, 85, 85));
        labelA12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA12.setForeground(new java.awt.Color(255, 255, 255));
        labelA12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA12.setText("A12");
        labelA12.setOpaque(true);

        labelA13.setBackground(new java.awt.Color(85, 85, 85));
        labelA13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA13.setForeground(new java.awt.Color(255, 255, 255));
        labelA13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA13.setText("A13");
        labelA13.setOpaque(true);

        labelA14.setBackground(new java.awt.Color(85, 85, 85));
        labelA14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA14.setForeground(new java.awt.Color(255, 255, 255));
        labelA14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA14.setText("A14");
        labelA14.setOpaque(true);

        labelA15.setBackground(new java.awt.Color(85, 85, 85));
        labelA15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA15.setForeground(new java.awt.Color(255, 255, 255));
        labelA15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA15.setText("A15");
        labelA15.setOpaque(true);

        labelA16.setBackground(new java.awt.Color(85, 85, 85));
        labelA16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA16.setForeground(new java.awt.Color(255, 255, 255));
        labelA16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA16.setText("A16");
        labelA16.setOpaque(true);

        labelA17.setBackground(new java.awt.Color(85, 85, 85));
        labelA17.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA17.setForeground(new java.awt.Color(255, 255, 255));
        labelA17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA17.setText("A17");
        labelA17.setOpaque(true);

        labelA18.setBackground(new java.awt.Color(85, 85, 85));
        labelA18.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA18.setForeground(new java.awt.Color(255, 255, 255));
        labelA18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA18.setText("A18");
        labelA18.setOpaque(true);

        labelA10.setBackground(new java.awt.Color(85, 85, 85));
        labelA10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA10.setForeground(new java.awt.Color(255, 255, 255));
        labelA10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA10.setText("A10");
        labelA10.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
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
                        .addComponent(labelA9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
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
                        .addComponent(labelA18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Araba Katı 1", jPanel4);

        labelA20.setBackground(new java.awt.Color(85, 85, 85));
        labelA20.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA20.setForeground(new java.awt.Color(255, 255, 255));
        labelA20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA20.setText("A20");
        labelA20.setOpaque(true);

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

        labelA19.setBackground(new java.awt.Color(85, 85, 85));
        labelA19.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA19.setForeground(new java.awt.Color(255, 255, 255));
        labelA19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA19.setText("A19");
        labelA19.setOpaque(true);

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

        labelA27.setBackground(new java.awt.Color(85, 85, 85));
        labelA27.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA27.setForeground(new java.awt.Color(255, 255, 255));
        labelA27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA27.setText("A27");
        labelA27.setOpaque(true);

        labelA28.setBackground(new java.awt.Color(85, 85, 85));
        labelA28.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA28.setForeground(new java.awt.Color(255, 255, 255));
        labelA28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA28.setText("A28");
        labelA28.setOpaque(true);

        labelA29.setBackground(new java.awt.Color(85, 85, 85));
        labelA29.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA29.setForeground(new java.awt.Color(255, 255, 255));
        labelA29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA29.setText("A29");
        labelA29.setOpaque(true);

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

        labelA24.setBackground(new java.awt.Color(85, 85, 85));
        labelA24.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA24.setForeground(new java.awt.Color(255, 255, 255));
        labelA24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA24.setText("A24");
        labelA24.setOpaque(true);

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

        labelA33.setBackground(new java.awt.Color(85, 85, 85));
        labelA33.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA33.setForeground(new java.awt.Color(255, 255, 255));
        labelA33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA33.setText("A33");
        labelA33.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelA19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                        .addComponent(labelA27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelA28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                        .addComponent(labelA36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA27, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA30, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA31, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA35, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA36, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Araba Katı 2", jPanel5);

        labelA37.setBackground(new java.awt.Color(85, 85, 85));
        labelA37.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA37.setForeground(new java.awt.Color(255, 255, 255));
        labelA37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA37.setText("A19");
        labelA37.setOpaque(true);

        labelA38.setBackground(new java.awt.Color(85, 85, 85));
        labelA38.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA38.setForeground(new java.awt.Color(255, 255, 255));
        labelA38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA38.setText("A19");
        labelA38.setOpaque(true);

        labelA39.setBackground(new java.awt.Color(85, 85, 85));
        labelA39.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA39.setForeground(new java.awt.Color(255, 255, 255));
        labelA39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA39.setText("A19");
        labelA39.setOpaque(true);

        labelA40.setBackground(new java.awt.Color(85, 85, 85));
        labelA40.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA40.setForeground(new java.awt.Color(255, 255, 255));
        labelA40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA40.setText("A19");
        labelA40.setOpaque(true);

        labelA41.setBackground(new java.awt.Color(85, 85, 85));
        labelA41.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA41.setForeground(new java.awt.Color(255, 255, 255));
        labelA41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA41.setText("A19");
        labelA41.setOpaque(true);

        labelA42.setBackground(new java.awt.Color(85, 85, 85));
        labelA42.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA42.setForeground(new java.awt.Color(255, 255, 255));
        labelA42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA42.setText("A19");
        labelA42.setOpaque(true);

        labelA43.setBackground(new java.awt.Color(85, 85, 85));
        labelA43.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA43.setForeground(new java.awt.Color(255, 255, 255));
        labelA43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA43.setText("A19");
        labelA43.setOpaque(true);

        labelA44.setBackground(new java.awt.Color(85, 85, 85));
        labelA44.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA44.setForeground(new java.awt.Color(255, 255, 255));
        labelA44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA44.setText("A19");
        labelA44.setOpaque(true);

        labelA45.setBackground(new java.awt.Color(85, 85, 85));
        labelA45.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA45.setForeground(new java.awt.Color(255, 255, 255));
        labelA45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA45.setText("A19");
        labelA45.setOpaque(true);

        labelA46.setBackground(new java.awt.Color(85, 85, 85));
        labelA46.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA46.setForeground(new java.awt.Color(255, 255, 255));
        labelA46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA46.setText("A19");
        labelA46.setOpaque(true);

        labelA47.setBackground(new java.awt.Color(85, 85, 85));
        labelA47.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA47.setForeground(new java.awt.Color(255, 255, 255));
        labelA47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA47.setText("A19");
        labelA47.setOpaque(true);

        labelA48.setBackground(new java.awt.Color(85, 85, 85));
        labelA48.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA48.setForeground(new java.awt.Color(255, 255, 255));
        labelA48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA48.setText("A19");
        labelA48.setOpaque(true);

        labelA49.setBackground(new java.awt.Color(85, 85, 85));
        labelA49.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA49.setForeground(new java.awt.Color(255, 255, 255));
        labelA49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA49.setText("A19");
        labelA49.setOpaque(true);

        labelA50.setBackground(new java.awt.Color(85, 85, 85));
        labelA50.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA50.setForeground(new java.awt.Color(255, 255, 255));
        labelA50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA50.setText("A19");
        labelA50.setOpaque(true);

        labelA51.setBackground(new java.awt.Color(85, 85, 85));
        labelA51.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA51.setForeground(new java.awt.Color(255, 255, 255));
        labelA51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA51.setText("A19");
        labelA51.setOpaque(true);

        labelA52.setBackground(new java.awt.Color(85, 85, 85));
        labelA52.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA52.setForeground(new java.awt.Color(255, 255, 255));
        labelA52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA52.setText("A19");
        labelA52.setOpaque(true);

        labelA53.setBackground(new java.awt.Color(85, 85, 85));
        labelA53.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA53.setForeground(new java.awt.Color(255, 255, 255));
        labelA53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA53.setText("A19");
        labelA53.setOpaque(true);

        labelA54.setBackground(new java.awt.Color(85, 85, 85));
        labelA54.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelA54.setForeground(new java.awt.Color(255, 255, 255));
        labelA54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA54.setText("A19");
        labelA54.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelA37, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA54, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA38, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA43, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA44, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelA45, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA47, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA48, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA49, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA50, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA51, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA52, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelA53, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA37, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA39, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA38, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA40, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA41, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA42, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA43, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA44, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA54, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA45, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA46, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA47, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA48, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA49, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA50, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA51, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA52, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA53, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Motosiklet Katı", jPanel6);

        jLabel63.setBackground(new java.awt.Color(85, 85, 85));
        jLabel63.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("K1");
        jLabel63.setOpaque(true);

        jLabel64.setBackground(new java.awt.Color(85, 85, 85));
        jLabel64.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("K1");
        jLabel64.setOpaque(true);

        jLabel65.setBackground(new java.awt.Color(85, 85, 85));
        jLabel65.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("K1");
        jLabel65.setOpaque(true);

        jLabel66.setBackground(new java.awt.Color(85, 85, 85));
        jLabel66.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("K1");
        jLabel66.setOpaque(true);

        jLabel67.setBackground(new java.awt.Color(85, 85, 85));
        jLabel67.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("K1");
        jLabel67.setOpaque(true);

        jLabel68.setBackground(new java.awt.Color(85, 85, 85));
        jLabel68.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("K1");
        jLabel68.setOpaque(true);

        jLabel69.setBackground(new java.awt.Color(85, 85, 85));
        jLabel69.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("K1");
        jLabel69.setOpaque(true);

        jLabel70.setBackground(new java.awt.Color(85, 85, 85));
        jLabel70.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("K1");
        jLabel70.setOpaque(true);

        jLabel71.setBackground(new java.awt.Color(85, 85, 85));
        jLabel71.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("K1");
        jLabel71.setOpaque(true);

        jLabel72.setBackground(new java.awt.Color(85, 85, 85));
        jLabel72.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("K1");
        jLabel72.setOpaque(true);

        jLabel73.setBackground(new java.awt.Color(85, 85, 85));
        jLabel73.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("K1");
        jLabel73.setOpaque(true);

        jLabel74.setBackground(new java.awt.Color(85, 85, 85));
        jLabel74.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("K1");
        jLabel74.setOpaque(true);

        jLabel75.setBackground(new java.awt.Color(85, 85, 85));
        jLabel75.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("K1");
        jLabel75.setOpaque(true);

        jLabel76.setBackground(new java.awt.Color(85, 85, 85));
        jLabel76.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("K1");
        jLabel76.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Kamyonet Katı", jPanel7);

        jLabel77.setBackground(new java.awt.Color(85, 85, 85));
        jLabel77.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("B1");
        jLabel77.setOpaque(true);

        jLabel78.setBackground(new java.awt.Color(85, 85, 85));
        jLabel78.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("B1");
        jLabel78.setOpaque(true);

        jLabel79.setBackground(new java.awt.Color(85, 85, 85));
        jLabel79.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("B1");
        jLabel79.setOpaque(true);

        jLabel80.setBackground(new java.awt.Color(85, 85, 85));
        jLabel80.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("B1");
        jLabel80.setOpaque(true);

        jLabel81.setBackground(new java.awt.Color(85, 85, 85));
        jLabel81.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("B1");
        jLabel81.setOpaque(true);

        jLabel82.setBackground(new java.awt.Color(85, 85, 85));
        jLabel82.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("B1");
        jLabel82.setOpaque(true);

        jLabel83.setBackground(new java.awt.Color(85, 85, 85));
        jLabel83.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("B1");
        jLabel83.setOpaque(true);

        jLabel84.setBackground(new java.awt.Color(85, 85, 85));
        jLabel84.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("B1");
        jLabel84.setOpaque(true);

        jLabel85.setBackground(new java.awt.Color(85, 85, 85));
        jLabel85.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("B1");
        jLabel85.setOpaque(true);

        jLabel86.setBackground(new java.awt.Color(85, 85, 85));
        jLabel86.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("B1");
        jLabel86.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Kamyon Katı", jPanel8);

        jLabel87.setBackground(new java.awt.Color(85, 85, 85));
        jLabel87.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("E1");
        jLabel87.setOpaque(true);

        jLabel88.setBackground(new java.awt.Color(85, 85, 85));
        jLabel88.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("E1");
        jLabel88.setOpaque(true);

        jLabel89.setBackground(new java.awt.Color(85, 85, 85));
        jLabel89.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("E1");
        jLabel89.setOpaque(true);

        jLabel90.setBackground(new java.awt.Color(85, 85, 85));
        jLabel90.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("E1");
        jLabel90.setOpaque(true);

        jLabel91.setBackground(new java.awt.Color(85, 85, 85));
        jLabel91.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("E1");
        jLabel91.setOpaque(true);

        jLabel92.setBackground(new java.awt.Color(85, 85, 85));
        jLabel92.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("E1");
        jLabel92.setOpaque(true);

        jLabel93.setBackground(new java.awt.Color(85, 85, 85));
        jLabel93.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("E1");
        jLabel93.setOpaque(true);

        jLabel94.setBackground(new java.awt.Color(85, 85, 85));
        jLabel94.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("E1");
        jLabel94.setOpaque(true);

        jLabel95.setBackground(new java.awt.Color(85, 85, 85));
        jLabel95.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("E1");
        jLabel95.setOpaque(true);

        jLabel96.setBackground(new java.awt.Color(85, 85, 85));
        jLabel96.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("E1");
        jLabel96.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Engelli Katı", jPanel9);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Katlar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAracParkEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAracParkEtActionPerformed

        boolean parkHalinde = false;

        for (int i = 0; i < arabaKati.katAraclari.length; i++) {
            if (arabaKati.katAraclari[i] != null) {
                if (musteri.getAracId() == arabaKati.katAraclari[i].getAracId()) {
                    parkHalinde = true;
                }
            }

        }

        if (parkHalinde) {
            JOptionPane.showMessageDialog(null, "Aracınız Şuan Zaten Parkedilmiş Durumda...");
        } else {

            int konum = -1;
            try {
                konum = arabaKati.katParkYeribul("files\\katlar\\arabaDurumlari.txt");
            } catch (IOException ex) {
                Logger.getLogger(FormMusteriArayuzu.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (konum == -1) {
                JOptionPane.showMessageDialog(null, "Park Yerleri Tamamen Dolu!");
            } else {
                JOptionPane.showMessageDialog(null, "Araç Park Edildi Konum : " + arabaKati.katLabellari[konum].getText());
                arac.aracParkEt();
                arabaKati.katAraclari[konum] = arac;
                arabaKati.katDurumlari[konum] = true;
                arabaKati.katLabellari[konum].setText(arac.getAracPlaka());
                arabaKati.katLabellari[konum].setBackground(Color.red);
                try {
                    arabaKati.katAraclariniKaydet("files\\katlar\\arabaAraclari.txt");
                    arabaKati.katDurumlariniKaydet("files\\katlar\\arabaDurumlari.txt");
                } catch (IOException ex) {
                    Logger.getLogger(FormMusteriArayuzu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }//GEN-LAST:event_buttonAracParkEtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAracParkEt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelA1;
    private javax.swing.JLabel labelA10;
    private javax.swing.JLabel labelA11;
    private javax.swing.JLabel labelA12;
    private javax.swing.JLabel labelA13;
    private javax.swing.JLabel labelA14;
    private javax.swing.JLabel labelA15;
    private javax.swing.JLabel labelA16;
    private javax.swing.JLabel labelA17;
    private javax.swing.JLabel labelA18;
    private javax.swing.JLabel labelA19;
    private javax.swing.JLabel labelA2;
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
    private javax.swing.JLabel labelA3;
    private javax.swing.JLabel labelA30;
    private javax.swing.JLabel labelA31;
    private javax.swing.JLabel labelA32;
    private javax.swing.JLabel labelA33;
    private javax.swing.JLabel labelA34;
    private javax.swing.JLabel labelA35;
    private javax.swing.JLabel labelA36;
    private javax.swing.JLabel labelA37;
    private javax.swing.JLabel labelA38;
    private javax.swing.JLabel labelA39;
    private javax.swing.JLabel labelA4;
    private javax.swing.JLabel labelA40;
    private javax.swing.JLabel labelA41;
    private javax.swing.JLabel labelA42;
    private javax.swing.JLabel labelA43;
    private javax.swing.JLabel labelA44;
    private javax.swing.JLabel labelA45;
    private javax.swing.JLabel labelA46;
    private javax.swing.JLabel labelA47;
    private javax.swing.JLabel labelA48;
    private javax.swing.JLabel labelA49;
    private javax.swing.JLabel labelA5;
    private javax.swing.JLabel labelA50;
    private javax.swing.JLabel labelA51;
    private javax.swing.JLabel labelA52;
    private javax.swing.JLabel labelA53;
    private javax.swing.JLabel labelA54;
    private javax.swing.JLabel labelA6;
    private javax.swing.JLabel labelA7;
    private javax.swing.JLabel labelA8;
    private javax.swing.JLabel labelA9;
    private javax.swing.JLabel labelAd;
    public javax.swing.JLabel labelHosgeldin;
    private javax.swing.JLabel labelKullaniciAdi;
    private javax.swing.JLabel labelMarka;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelPlaka;
    private javax.swing.JLabel labelSoyad;
    private javax.swing.JLabel labelTur;
    public javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel labelYas;
    // End of variables declaration//GEN-END:variables
}
