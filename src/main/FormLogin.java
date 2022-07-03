package main;

import araclar.Araclar;
import javax.swing.JOptionPane;
import kullanici.Musteri;
import dataBase.DataBase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kullanici.Yonetici;

public class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMenuLogin = new javax.swing.JTabbedPane();
        panelMusteri = new javax.swing.JPanel();
        textMusteri = new javax.swing.JTextField();
        buttonMusteriGiris = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonMusteriCikis = new javax.swing.JButton();
        labelMusteriHesapOlustur = new javax.swing.JLabel();
        passMusteri = new javax.swing.JPasswordField();
        panelYonetici = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textYonetici = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passYonetici = new javax.swing.JPasswordField();
        buttonYoneticiGiris = new javax.swing.JButton();
        buttonYoneticiCikis = new javax.swing.JButton();
        labelYoneticiHesapOlustur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabMenuLogin.setBackground(new java.awt.Color(231, 231, 231));
        tabMenuLogin.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N

        panelMusteri.setBackground(new java.awt.Color(231, 231, 231));

        textMusteri.setBackground(new java.awt.Color(255, 255, 255));
        textMusteri.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        textMusteri.setForeground(new java.awt.Color(0, 0, 0));
        textMusteri.setText("sinandonder");
        textMusteri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        buttonMusteriGiris.setBackground(new java.awt.Color(76, 175, 80));
        buttonMusteriGiris.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonMusteriGiris.setForeground(new java.awt.Color(255, 255, 255));
        buttonMusteriGiris.setText("Giriş");
        buttonMusteriGiris.setBorder(null);
        buttonMusteriGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMusteriGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonMusteriGirisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 175, 80));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 175, 80));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Şifre :");

        buttonMusteriCikis.setBackground(new java.awt.Color(76, 175, 80));
        buttonMusteriCikis.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonMusteriCikis.setForeground(new java.awt.Color(255, 255, 255));
        buttonMusteriCikis.setText("Çıkış");
        buttonMusteriCikis.setBorder(null);
        buttonMusteriCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMusteriCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCikisActionPerformed(evt);
            }
        });

        labelMusteriHesapOlustur.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        labelMusteriHesapOlustur.setForeground(new java.awt.Color(76, 175, 80));
        labelMusteriHesapOlustur.setText("Hesap Oluştur...");
        labelMusteriHesapOlustur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMusteriHesapOlustur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMusteriHesapOlusturMouseCliked(evt);
            }
        });

        passMusteri.setText("123");
        passMusteri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 175, 80)));

        javax.swing.GroupLayout panelMusteriLayout = new javax.swing.GroupLayout(panelMusteri);
        panelMusteri.setLayout(panelMusteriLayout);
        panelMusteriLayout.setHorizontalGroup(
            panelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMusteriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMusteriLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(passMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMusteriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonMusteriGiris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMusteriCikis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMusteriHesapOlustur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMusteriLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelMusteriLayout.setVerticalGroup(
            panelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMusteriLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonMusteriGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonMusteriCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMusteriHesapOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        tabMenuLogin.addTab("Müşteri Girişi", panelMusteri);

        panelYonetici.setBackground(new java.awt.Color(231, 231, 231));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 140, 186));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Kullanıcı Adı :");

        textYonetici.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        textYonetici.setText("sinandonder");
        textYonetici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 140, 186));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Şifre :");

        passYonetici.setText("123");
        passYonetici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 140, 186)));

        buttonYoneticiGiris.setBackground(new java.awt.Color(0, 140, 186));
        buttonYoneticiGiris.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonYoneticiGiris.setForeground(new java.awt.Color(255, 255, 255));
        buttonYoneticiGiris.setText("Giriş");
        buttonYoneticiGiris.setBorder(null);
        buttonYoneticiGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYoneticiGirisActionPerformed(evt);
            }
        });

        buttonYoneticiCikis.setBackground(new java.awt.Color(0, 140, 186));
        buttonYoneticiCikis.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        buttonYoneticiCikis.setForeground(new java.awt.Color(255, 255, 255));
        buttonYoneticiCikis.setText("Çıkış");
        buttonYoneticiCikis.setBorder(null);
        buttonYoneticiCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonYoneticiCikisActionPerformed(evt);
            }
        });

        labelYoneticiHesapOlustur.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        labelYoneticiHesapOlustur.setForeground(new java.awt.Color(0, 140, 186));
        labelYoneticiHesapOlustur.setText("Hesap Oluştur...");
        labelYoneticiHesapOlustur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelYoneticiHesapOlustur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelYoneticiHesapOlusturMouseCliked(evt);
            }
        });

        javax.swing.GroupLayout panelYoneticiLayout = new javax.swing.GroupLayout(panelYonetici);
        panelYonetici.setLayout(panelYoneticiLayout);
        panelYoneticiLayout.setHorizontalGroup(
            panelYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoneticiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoneticiLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(passYonetici, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoneticiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonYoneticiGiris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonYoneticiCikis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelYoneticiHesapOlustur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoneticiLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textYonetici, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelYoneticiLayout.setVerticalGroup(
            panelYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoneticiLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textYonetici, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelYoneticiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passYonetici, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonYoneticiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonYoneticiCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelYoneticiHesapOlustur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        tabMenuLogin.addTab("Yönetici Girişi", panelYonetici);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMenuLogin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabMenuLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static Musteri musteri = null;
    public static Yonetici yonetici = null;
    public static Araclar arac = null;
    
    
    
    private void labelMusteriHesapOlusturMouseCliked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMusteriHesapOlusturMouseCliked
        Main.screenLogin.setVisible(false);
        Main.screenKaydolMusteri.setVisible(true);
    }//GEN-LAST:event_labelMusteriHesapOlusturMouseCliked

    private void butonMusteriGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonMusteriGirisActionPerformed
        boolean boslukKontrol = textMusteri.getText().equals("") || String.valueOf(passMusteri.getPassword()).equals("");
        boolean durum = false;

        if (boslukKontrol) {
            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Boş Geçilemez");
        } else {
            musteri = Musteri.kullaniciAra(textMusteri.getText(), String.valueOf(passMusteri.getPassword()));
            if(musteri != null)
                arac = Araclar.aracAra(musteri.getAracId());
            if (musteri != null) {
                Main.screenLogin.setVisible(false);
                Main.screenLogin.dispose();
                Main.screenMusteriArayuz.setVisible(true);
                Main.screenMusteriArayuz.labelWelcome.setText("HOŞGELDİN " + musteri.getIsim() + " " + musteri.getSoyIsim());
                Main.screenMusteriArayuz.kullaniciAl(musteri, arac);
                Main.screenMusteriArayuz.kullaniciBilgileri(musteri, arac);
            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Hatalı");
            }
        }


    }//GEN-LAST:event_butonMusteriGirisActionPerformed

    private void labelYoneticiHesapOlusturMouseCliked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelYoneticiHesapOlusturMouseCliked
        Main.screenLogin.setVisible(false);
        Main.screenLogin.dispose();
        Main.screenKaydolYönetici.setVisible(true);
    }//GEN-LAST:event_labelYoneticiHesapOlusturMouseCliked

    private void buttonCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCikisActionPerformed
        System.exit(1);
    }//GEN-LAST:event_buttonCikisActionPerformed

    private void buttonYoneticiGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYoneticiGirisActionPerformed
        boolean boslukKontrol = textYonetici.getText().equals("") || String.valueOf(passYonetici.getPassword()).equals("");
        boolean durum = false;

        if (boslukKontrol) {
            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Boş Geçilemez");
        } else {
            yonetici = Yonetici.kullaniciAra(textYonetici.getText(), String.valueOf(passYonetici.getPassword()));

            if (yonetici != null) {
                Main.screenLogin.setVisible(false);
                Main.screenLogin.dispose();
                Main.screenYoneticiArayuzu.setVisible(true);
                Main.screenYoneticiArayuzu.kullaniciAl(yonetici);
                FormYoneticiArayuzu.labelKullanici.setText("HOŞGELDİN " + yonetici.getIsim() + " " + yonetici.getSoyIsim());
                
            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Hatalı");
            }
        }


    }//GEN-LAST:event_buttonYoneticiGirisActionPerformed

    private void buttonYoneticiCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonYoneticiCikisActionPerformed
        System.exit(1);
    }//GEN-LAST:event_buttonYoneticiCikisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMusteriCikis;
    private javax.swing.JButton buttonMusteriGiris;
    private javax.swing.JButton buttonYoneticiCikis;
    private javax.swing.JButton buttonYoneticiGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelMusteriHesapOlustur;
    private javax.swing.JLabel labelYoneticiHesapOlustur;
    private javax.swing.JPanel panelMusteri;
    private javax.swing.JPanel panelYonetici;
    private javax.swing.JPasswordField passMusteri;
    private javax.swing.JPasswordField passYonetici;
    private javax.swing.JTabbedPane tabMenuLogin;
    private javax.swing.JTextField textMusteri;
    private javax.swing.JTextField textYonetici;
    // End of variables declaration//GEN-END:variables

}
