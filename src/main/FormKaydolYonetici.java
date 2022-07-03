package main;

import javax.swing.JOptionPane;
import kullanici.Yonetici;
import dataBase.DataBase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormKaydolYonetici extends javax.swing.JFrame {

    public FormKaydolYonetici() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBasik = new javax.swing.JLabel();
        labelAd = new javax.swing.JLabel();
        passSifre = new javax.swing.JPasswordField();
        labelHesapOlusturmaID = new javax.swing.JLabel();
        labelKullaniciAdi = new javax.swing.JLabel();
        labelSoyad = new javax.swing.JLabel();
        labelSifreTekrar = new javax.swing.JLabel();
        labelSifre = new javax.swing.JLabel();
        textKullaniciAdi = new javax.swing.JTextField();
        textAd = new javax.swing.JTextField();
        textSoyad = new javax.swing.JTextField();
        passYoneticiID = new javax.swing.JPasswordField();
        passSifreTekrar = new javax.swing.JPasswordField();
        buttonIptalEt = new javax.swing.JButton();
        buttonKaydol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelBasik.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        labelBasik.setForeground(new java.awt.Color(0, 140, 186));
        labelBasik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBasik.setText("Yönetici Bilgileri");

        labelAd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelAd.setForeground(new java.awt.Color(0, 140, 186));
        labelAd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAd.setText("Ad :");
        labelAd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        passSifre.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        passSifre.setForeground(new java.awt.Color(0, 140, 186));
        passSifre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelHesapOlusturmaID.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelHesapOlusturmaID.setForeground(new java.awt.Color(0, 140, 186));
        labelHesapOlusturmaID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHesapOlusturmaID.setText("Hesap Oluşturma ID'si :");
        labelHesapOlusturmaID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelKullaniciAdi.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelKullaniciAdi.setForeground(new java.awt.Color(0, 140, 186));
        labelKullaniciAdi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKullaniciAdi.setText("Kullanıcı Adı :");
        labelKullaniciAdi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelSoyad.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelSoyad.setForeground(new java.awt.Color(0, 140, 186));
        labelSoyad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSoyad.setText("Soyad :");
        labelSoyad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelSifreTekrar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelSifreTekrar.setForeground(new java.awt.Color(0, 140, 186));
        labelSifreTekrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSifreTekrar.setText("Şifre Tekrarı :");
        labelSifreTekrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        labelSifre.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        labelSifre.setForeground(new java.awt.Color(0, 140, 186));
        labelSifre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSifre.setText("Şifre :");
        labelSifre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        textKullaniciAdi.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textKullaniciAdi.setForeground(new java.awt.Color(0, 140, 186));
        textKullaniciAdi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        textAd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textAd.setForeground(new java.awt.Color(0, 140, 186));
        textAd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        textSoyad.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textSoyad.setForeground(new java.awt.Color(0, 140, 186));
        textSoyad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        passYoneticiID.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        passYoneticiID.setForeground(new java.awt.Color(0, 140, 186));
        passYoneticiID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        passSifreTekrar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        passSifreTekrar.setForeground(new java.awt.Color(0, 140, 186));
        passSifreTekrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        buttonIptalEt.setBackground(new java.awt.Color(0, 140, 186));
        buttonIptalEt.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonIptalEt.setForeground(new java.awt.Color(255, 255, 255));
        buttonIptalEt.setText("İptal Et");
        buttonIptalEt.setBorder(null);
        buttonIptalEt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIptalEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIptalEtActionPerformed(evt);
            }
        });

        buttonKaydol.setBackground(new java.awt.Color(0, 140, 186));
        buttonKaydol.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonKaydol.setForeground(new java.awt.Color(255, 255, 255));
        buttonKaydol.setText("Kaydol");
        buttonKaydol.setBorder(null);
        buttonKaydol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKaydolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBasik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelKullaniciAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSoyad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelHesapOlusturmaID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(labelSifreTekrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonIptalEt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonKaydol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passYoneticiID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(textAd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSoyad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textKullaniciAdi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passSifre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passSifreTekrar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBasik, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelHesapOlusturmaID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passYoneticiID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSifreTekrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(passSifreTekrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonKaydol, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(buttonIptalEt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIptalEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIptalEtActionPerformed
        Main.screenKaydolYönetici.setVisible(false);
        Main.screenLogin.setVisible(true);
    }//GEN-LAST:event_buttonIptalEtActionPerformed

    private void buttonKaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKaydolActionPerformed
        boolean boslukKontrol = passYoneticiID.getPassword().equals("")
                || textAd.getText().equals("") || textSoyad.getText().equals("")
                || textKullaniciAdi.getText().equals("")
                || String.valueOf(passSifre.getPassword()).equals("")
                || String.valueOf(passSifreTekrar.getPassword()).equals("");
        
        boolean kullaniciAdiDurum = false, idDurum = false, idKontrol = false;
        
        if (boslukKontrol) {
            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Boş Geçilemez!");
        } else if (!String.valueOf(passSifre.getPassword()).equals(String.valueOf(passSifreTekrar.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Şifreler Aynı Olmalı!");
        } else {
            String ad, soyad, kullaniciAdi;
            ad = DataBase.kelimeyiDuzelt(textAd.getText());
            soyad = DataBase.kelimeyiDuzelt(textSoyad.getText());
            kullaniciAdi = DataBase.kelimeyiDuzelt(textKullaniciAdi.getText()).toLowerCase();
            
            
            
            
            for (String id : DataBase.yoneticiIdleri) {
                if(String.valueOf(passYoneticiID.getPassword()).equals(id)) {
                    idKontrol = true;
                    break;
                }    
            }
            
            for (Yonetici item : DataBase.yoneticiHesaplari) {
                if (textKullaniciAdi.getText().equals(item.getKullaniciAdi())) {
                    kullaniciAdiDurum = true;                    
                }
                if (String.valueOf(passYoneticiID.getPassword()).equals(item.getId())) {
                    idDurum = true;                    
                }
            }
            if (!idKontrol)
                JOptionPane.showMessageDialog(null, "Girilen ID Sistemdeki ID'lerde mevcut değil!");
            else if (kullaniciAdiDurum) {
                JOptionPane.showMessageDialog(null, "Girilen Kullanıcı Adı Mevcut!");
            } else if (idDurum) {
                JOptionPane.showMessageDialog(null, "Girilen ID Daha Önce Kullanılmış!");
            } else {
                DataBase.yoneticiHesaplari.add(new Yonetici(ad, soyad, kullaniciAdi, String.valueOf(passSifre.getPassword()),
                        String.valueOf(passYoneticiID.getPassword())));
                JOptionPane.showMessageDialog(null, "Hesap Oluşturuldu...");
                Main.screenKaydolYönetici.setVisible(false);
                Main.screenKaydolYönetici.dispose();
                Main.screenLogin.setVisible(true);
                try {
                    DataBase.verileriKaydetYoneticiHesaplari();
                } catch (IOException ex) {
                    Logger.getLogger(FormKaydolYonetici.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
            //Deneme Kodu
            for (Yonetici item : DataBase.yoneticiHesaplari)
                System.out.println(item.toString());
        }


    }//GEN-LAST:event_buttonKaydolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIptalEt;
    private javax.swing.JButton buttonKaydol;
    private javax.swing.JLabel labelAd;
    private javax.swing.JLabel labelBasik;
    private javax.swing.JLabel labelHesapOlusturmaID;
    private javax.swing.JLabel labelKullaniciAdi;
    private javax.swing.JLabel labelSifre;
    private javax.swing.JLabel labelSifreTekrar;
    private javax.swing.JLabel labelSoyad;
    private javax.swing.JPasswordField passSifre;
    private javax.swing.JPasswordField passSifreTekrar;
    private javax.swing.JPasswordField passYoneticiID;
    private javax.swing.JTextField textAd;
    private javax.swing.JTextField textKullaniciAdi;
    private javax.swing.JTextField textSoyad;
    // End of variables declaration//GEN-END:variables
}
