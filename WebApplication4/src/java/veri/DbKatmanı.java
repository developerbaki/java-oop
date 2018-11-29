/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author baki
 */
public class DbKatmanı { // DATABASE BAGLANTI SAGLIYORUZ. BAGLANTI SAGLANDIGINDA CIKIYORUZ. İSTERSEK DÖNDÜRÜYORUZ.

    private Connection conn;
    String dburl = "jdbc:derby://localhost:1527/abc"; // bağlantı url verdik. Drivers propertiesden.
    String user = "baki"; // databasedeki değişkenlerimi burada tanıttım.
    String pass = "123456";

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

    public void kullaniciListesi() { // burada kullanıcıların bilgilerini listeliyorum.
        if (conn == null) {
            System.out.println("Bağlantı başarısız, bağlanıyorum.");
            baglan();
        }
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs= stmt.executeQuery("select + from kullanici");
            while (rs.next()){
            System.out.println("" +rs.getString(1)+ "" +rs.getString(2)+ "" +rs.getString(3)+ "" +rs.getString(4));
            }
        } catch (SQLException e) {
          e.printStackTrace();
            
        }
    }
    public static void main(String args[]){
    DbKatmanı dbk = new DbKatmanı();
    dbk.kullaniciListesi();
    }
   
}
