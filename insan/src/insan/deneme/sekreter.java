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
    int sayac =0;
    @Override
    public void maas(){
    System.out.println("maas 1000");
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
