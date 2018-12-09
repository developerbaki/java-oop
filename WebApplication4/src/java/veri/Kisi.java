/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.util.List;

/**
 *
 * @author baki
 */
public class Kisi {
   public String isim;
   public String sifre;

        public void setSifre(String sifre) { // dışarıdan gelen bir şifreyi içerdeki şifreye eşitliyorum.
        this.sifre = sifre;
    }

public boolean sifreKontrol(){
DbKatmanı dbk= new DbKatmanı();
return dbk.KullaniciKontrol(isim, sifre);
}
public List<Kisi> KullanıcıListesi(){
DbKatmanı dbk = new DbKatmanı();
return dbk.kullaniciListesi();

}
    

    public void setIsim(String isim) {
        this.isim = isim; // obje dolduruyorum.
    }
    public void main(String args[]){
    Kisi k= new Kisi();
    k.setIsim("baki");
    k.setSifre("123");
    }
}
