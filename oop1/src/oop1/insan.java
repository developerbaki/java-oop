/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author baki
 */
public class insan {

    double boy;
    int kilo;
    int yas;
    String isim;
    String gözrengi;
    String sacrengi;

    public String getSacrengi() {
        return this.sacrengi;
    }

    private final List<Asi> asilar = new ArrayList<>();

    insan() {
        this.sacrengi = "kahverengi";
    }
    //CRUD
    //Create oluştur: Yeni nesne eklemek.
    //Read oku: İstenilen nesneleri okur.
    //Update güncelle: İstenilen nesneyi güncceller. İlk önce istenilen nesneyi bul sonra güncelle sonra yeni değeri yazdır.
    //Delete silme: İstenilen nesneyi siler.

    List<Asi> getAsilar() {// birden fazlaa içerisinde class,değişken tipinde içinde verileerin sakladıngı listlere array list denir.

        return this.asilar;
    }

    public void addAsi(Asi asi) {
        if(this.asilar.size()<3){
        this.asilar.add(asi);
        }
        else{
        System.out.println("3DENN fazla aşı giremezsiniz.");
        }
    }

    void updateAsi(Asi asi, int asiId) {
        Asi foundAsi;
        for (Asi asiItem : this.asilar) {
            if (asiItem.AsiId == asiId) {
                foundAsi = asiItem;
            }
        }

    }

    void updateAsi2(int asiId, String asiIsmi) {
        for (Asi asiItem : this.asilar) {
            if (asiItem.AsiId == asiId) {
                asiItem.Isim = "bETANOZ";
            }
        }

    }

    void updateAsi3(int asiId, String asiIsmi) {
        Asi asiItem = findAsi(asiId);
        asiItem.Isim = "bETANOZ2";
          

    }

    Asi findAsi(int asiId) {
        for (Asi asiItem : this.asilar) {
            if (asiItem.AsiId == asiId) {
                return asiItem;
            }

        }
        return null;
    }

    void printAsi() {
        for (Asi asiItem : this.asilar) {
            System.out.println(asiItem.AsiId + " " + asiItem.Isim);
        }
    }

    void yemek() {
        kilo++;
    }

}
