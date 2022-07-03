package main;

import araclar.Araclar;
import kullanici.Musteri;
import dataBase.DataBase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormKaydolMusteri extends javax.swing.JFrame {

    public FormKaydolMusteri() {
        initComponents();
        
        spinnerYas.setForeground(new java.awt.Color(76, 175, 80));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textKullaniciAdi = new javax.swing.JTextField();
        textAd = new javax.swing.JTextField();
        textSoyad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passSifre = new javax.swing.JPasswordField();
        passSifreTekrar = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        textMarka = new javax.swing.JTextField();
        textModel = new javax.swing.JTextField();
        textPlaka = new javax.swing.JTextField();
        comboTur = new javax.swing.JComboBox();
        buttonHesapOlustur = new javax.swing.JButton();
        buttonIptal = new javax.swing.JButton();
        spinnerYas = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        textKullaniciAdi.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textKullaniciAdi.setForeground(new java.awt.Color(76, 175, 80));
        textKullaniciAdi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        textAd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textAd.setForeground(new java.awt.Color(76, 175, 80));
        textAd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        textSoyad.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textSoyad.setForeground(new java.awt.Color(76, 175, 80));
        textSoyad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 175, 80));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Müşteri Bilgileri");

        passSifre.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        passSifre.setForeground(new java.awt.Color(76, 175, 80));
        passSifre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        passSifreTekrar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        passSifreTekrar.setForeground(new java.awt.Color(76, 175, 80));
        passSifreTekrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 175, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Soyad :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 175, 80));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ad :");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 175, 80));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Şifre :");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 175, 80));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Şifre Tekrarı :");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 175, 80));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kullanıcı Adı :");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 175, 80));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Araç Bilgileri");

        jLabel13.setForeground(new java.awt.Color(76, 175, 80));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Marka :");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel14.setForeground(new java.awt.Color(76, 175, 80));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Araç Yaşı :");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel15.setForeground(new java.awt.Color(76, 175, 80));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Plaka :");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel16.setForeground(new java.awt.Color(76, 175, 80));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tür :");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        jLabel17.setForeground(new java.awt.Color(76, 175, 80));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Model :");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        textMarka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textMarka.setForeground(new java.awt.Color(76, 175, 80));
        textMarka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        textModel.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textModel.setForeground(new java.awt.Color(76, 175, 80));
        textModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        textPlaka.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textPlaka.setForeground(new java.awt.Color(76, 175, 80));
        textPlaka.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        comboTur.setForeground(new java.awt.Color(76, 175, 80));
        comboTur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Araba", "Kamyon", "Kamyonet", "Motosiklet", "Engelli" }));
        comboTur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));
        comboTur.setPreferredSize(new java.awt.Dimension(65, 40));

        buttonHesapOlustur.setBackground(new java.awt.Color(76, 175, 80));
        buttonHesapOlustur.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonHesapOlustur.setForeground(new java.awt.Color(255, 255, 255));
        buttonHesapOlustur.setText("Hesap Oluştur");
        buttonHesapOlustur.setBorder(null);
        buttonHesapOlustur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHesapOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHesapOlusturActionPerformed(evt);
            }
        });

        buttonIptal.setBackground(new java.awt.Color(76, 175, 80));
        buttonIptal.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonIptal.setForeground(new java.awt.Color(255, 255, 255));
        buttonIptal.setText("İptal Et");
        buttonIptal.setBorder(null);
        buttonIptal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonIptalActionPerformed(evt);
            }
        });

        spinnerYas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        spinnerYas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonIptal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passSifre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(textKullaniciAdi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textSoyad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passSifreTekrar)
                                    .addComponent(textAd))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonHesapOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboTur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textPlaka)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textMarka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(spinnerYas))))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spinnerYas))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPlaka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboTur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textModel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHesapOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIptal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButonIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonIptalActionPerformed
        Main.screenKaydolMusteri.setVisible(false);
        Main.screenLogin.setVisible(true);
    }//GEN-LAST:event_ButonIptalActionPerformed
    
    public Musteri musteri;
    public Araclar arac;
    
    
    
    
    private void buttonHesapOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHesapOlusturActionPerformed
        boolean boslukKontrol = textAd.getText().equals("") || textSoyad.getText().equals("")
                || textKullaniciAdi.getText().equals("") || textPlaka.getText().equals("")
                || textMarka.getText().equals("") || textModel.getText().equals("")
                || String.valueOf(passSifre.getPassword()).equals("")
                || String.valueOf(passSifreTekrar.getPassword()).equals("");

        boolean kullaniciAdiDurum = false, plakaDurum = false;

        if (boslukKontrol) {
            JOptionPane.showMessageDialog(null, "Herhangi Bir Parametre Boş Geçilemez!");
        } else if (!String.valueOf(passSifre.getPassword()).equals(String.valueOf(passSifreTekrar.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Şifreler Aynı Olmalı!");
        } else {
            
            String ad, soyad, plaka, tur, marka, model, kullaniciAdi, sifre;
            ad = DataBase.kelimeyiDuzelt(textAd.getText());
            soyad = DataBase.kelimeyiDuzelt(textSoyad.getText());
            kullaniciAdi = DataBase.kelimeyiDuzelt(textKullaniciAdi.getText()).toLowerCase();
            plaka = DataBase.kelimeyiDuzelt(textPlaka.getText());
            marka = DataBase.kelimeyiDuzelt(textMarka.getText());
            model = DataBase.kelimeyiDuzelt(textModel.getText());
            tur = DataBase.kelimeyiDuzelt(comboTur.getSelectedItem().toString());
            sifre = String.valueOf(passSifre.getPassword());
            int yas = (int) spinnerYas.getValue();
            
            for (Musteri item : DataBase.musteriArray) {
                if (kullaniciAdi.equals(item.getKullaniciAdi())) {
                    kullaniciAdiDurum = true;
                }
            }

            if (kullaniciAdiDurum) {
                    JOptionPane.showMessageDialog(null, "Girilen Kullanıcı Adı Mevcut!");
            } else {
                int aracId = 0;
                String[] markaModel = {marka, model};
                try {
                    arac = new Araclar(ad, soyad, plaka, tur, yas, markaModel, 0, -1, -1, -1);
                    DataBase.araclarArray.add(arac);
                    aracId = DataBase.araclarArray.get(DataBase.araclarArray.size() - 1).getAracId();
                } catch (IOException ex) {
                    Logger.getLogger(FormKaydolMusteri.class.getName()).log(Level.SEVERE, null, ex);
                }
                musteri = new Musteri(ad, soyad, kullaniciAdi, sifre, aracId);
                DataBase.musteriArray.add(musteri);
                Main.screenMusteriArayuz.kullaniciAl(musteri, arac);
                JOptionPane.showMessageDialog(null, "Hesap Oluşturuldu...");
                
                Main.screenLogin.setVisible(true);
                Main.screenKaydolMusteri.setVisible(false);
                Main.screenKaydolMusteri.dispose();

                try {
                    DataBase.verileriKaydetMusteri();
                    DataBase.verileriKaydetAraclar();
                } catch (IOException ex) {
                    Logger.getLogger(FormKaydolMusteri.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_buttonHesapOlusturActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHesapOlustur;
    private javax.swing.JButton buttonIptal;
    private javax.swing.JComboBox comboTur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField passSifre;
    private javax.swing.JPasswordField passSifreTekrar;
    private javax.swing.JSpinner spinnerYas;
    private javax.swing.JTextField textAd;
    private javax.swing.JTextField textKullaniciAdi;
    private javax.swing.JTextField textMarka;
    private javax.swing.JTextField textModel;
    private javax.swing.JTextField textPlaka;
    private javax.swing.JTextField textSoyad;
    // End of variables declaration//GEN-END:variables
}
