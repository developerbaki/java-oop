/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insan.deneme;

/**
 *
 * @author baki
 */
public class sekreter extends calisan{
    private int sayac =0;
    int telefon; // sağ tuş tıkla insert code yap ve oradan hazır getter and setter ekleyebilirsin.
    int yas;
    boolean sigara;
    public boolean isSigara(){
    return sigara;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<=0||yas>=100) { // buradaki hazır set fonksiyonunu elle kontrol edebiliriz. Burada yasın 0 ve 100 aralıgında oldugunda ekrana yaz seklinde yazdık
        } else {
            this.yas = yas;
        }
    }
    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    @Override
    public void maas(){
    System.out.println("maas 1000");
    }
    public int getSayac(){
    return sayac;
    }
    public int setSayac(int x){
    return sayac= x;
    }
    public sekreter(){// ahmet ve ayseyi iki aynı obje olarak tuttugu için 1 sonucu alıyoruz fakat static yaparsak iki ayrı obje olarak hafızada tutar.
    sayac++;   
    } 
    public final void yetki(){// burada final kullanarak yetki gibi bir değer tanımladık ve sadce bu sekreter sınıfına ait oldu.
System.out.println("yetkimi kimseye devretme");
}
    public static void main (String args[]){
    sekreter ahmet= new sekreter();
    sekreter ayse= new sekreter();
    System.out.println(ahmet.sayac);
    }
}
/*
Encapsulation bir objenin dışarıya bakan yüzlerini bizim kontrolümüz de olması ve hiçbir özelliğinin dışarıya verilmemesi
Methodlarla ve get set fonskiyonlarla ayarlanması bizim kontrolümüzde geçmesi.




*/