/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baki
 */
public class DbKatmanı { // DATABASE BAGLANTI SAGLIYORUZ. BAGLANTI SAGLANDIGINDA CIKIYORUZ. İSTERSEK DÖNDÜRÜYORUZ.

    private Connection conn;
    String dburl = "jdbc:derby://localhost:1527/abc"; // bağlantı url verdik. Drivers propertiesden.
    String user = "abc"; // databasedeki değişkenlerimi burada tanıttım.
    String pass = "123";
public DbKatmanı(){
        if (conn == null) {
            System.out.println("Bağlantı başarısız, bağlanıyorum.");
            baglan();
        }

}
    public Connection baglan() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance(); // baglantı saglamak için kontrol ediyoruz databaseyi
            System.out.println("Bağlantı Başarılı");
            conn = DriverManager.getConnection(dburl, user, pass); // databasedeki tablomdakileri kullandım burada.
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.out.println("Bağlantı Sorun Var");
        }
        return conn;

    }

    public List<Kisi> kullaniciListesi() { // burada kullanıcıların bilgilerini listeliyorum.
        
        List<Kisi> kisiler = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement(); // statement query çalıştırabilmem için gerekli nesne.
            ResultSet rs = stmt.executeQuery("select * from kullanici");// resultset çalıştırdığım sorgunun dönüşü, sonucu.

            while (rs.next()) {
                Kisi kisi = new Kisi();
                kisi.isim = rs.getString("NAME");
                kisiler.add(kisi);
                System.out.println("" + rs.getString(1) + "" + rs.getString(2) + "" + rs.getString(3) + "" + rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            return kisiler;

        }
    }

    public boolean KullaniciKontrol(String kullaniciAdi, String sifre) { // kullanıcı adını ve sifreyi kontrol ettirdik.

        try {
            if(sifre==null){
               sifre="";
            }
            PreparedStatement stmt = conn.prepareStatement("select PASSWORD from ABC.KULLANICI where USERNAME=?");
            stmt.setString(1, kullaniciAdi);
            ResultSet rs = stmt.executeQuery();
            boolean isSuccess = false;
            while (rs.next()) {

               isSuccess = sifre.equals(rs.getString("PASSWORD"));
            }
            return isSuccess;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }

    public static void main(String args[]) {
        DbKatmanı dbk = new DbKatmanı();
        dbk.kullaniciListesi();
    }

}
