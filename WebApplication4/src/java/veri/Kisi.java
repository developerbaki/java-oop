/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

/**
 *
 * @author baki
 */
public class Kisi {
    String isim;
public Kisi(){ // constructor
isim = null;
System.out.println("kisi objesi oluşturuldu.");
}
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
