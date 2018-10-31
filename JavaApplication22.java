/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import javaapplication22.JavaApplication22.Insan.Ogrenci;

/**
 *
 * @author baki
 */
public class JavaApplication22 {

    static class Insan {

        int boy;

        class Ogrenci extends Insan implements Cloneable {

            Object kopyala() throws CloneNotSupportedException {
                return this.clone();
            }

            Ogrenci kopyala2() {
                Ogrenci temp = new Ogrenci();
                temp.boy = this.boy;
                return temp;
            }

            boolean equals(Ogrenci rhs) {//burada eşit eşit kontrolü yerine override ettirdik ve boyları aynı ise bu kişiler aynı kişilerdir yazdırdık.
                return this.boy == rhs.boy;
            }
            @Override
            public String toString(){
            return "bu objenin boyu"+this.boy;// objeyi string olarak bastırmak istediğimiz de bu metodla ekrana bastırabiliriz.
            // fakat aşağıda ayşe objesinin hascode olarak çağırmamız gerekecektir.
            }
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here

        Insan ali = new Insan();
        Insan ahmet = ali;// Shallow copy(sığ kopyalama)
        ali.boy = 180;
        System.out.println(ahmet.boy);
        if (ali == ahmet) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
        if (ali.equals(ahmet)) {
            System.out.println("eşitler");
        }
        Ogrenci ayse = new Ogrenci();

        ayse.boy = 160;
        Ogrenci fatma = (Ogrenci) ayse.kopyala();
        System.out.println(fatma.boy);
        System.out.println(ayse.boy);
        fatma.boy = 190;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        if (ayse.equals(fatma)) {
            System.out.println("eşitler");
        }
        System.out.println(ayse);
        System.out.println(ayse.hashCode());

    }

}
//System.gc(); sitemdeki gereksiz dosyaları cıkarır.
/*Local Local classlarda içinde bir method tanımlayabildiğimiz classlardır.
        İnner classlar outer class ile beraber yaşabilen classlardır.
        İnheritance classlar inner classlarla karıştırılmamalıdır. Çünkü inheritance classlar birbirler ile ilişkili çalışmayadabilir.
        Anonymous classlar isimsiz classlardır ve inner classlardan farkı her zaman o classdan bir obje tanımlanır. override işlemlerinde
        sıkca kullanılır.
 */
