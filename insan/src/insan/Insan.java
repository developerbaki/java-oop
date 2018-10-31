/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insan;

/**
 *
 * @author baki
 */

public class Insan {
static class ders{

int kilo;
}
   
    int boy;
    public int yas; /*BURASI ÖNEMLİİİİ  public olduğunda herkes erişebilir. Boş olduğunda sadece package içindekiler erişebilir.
    Protected olduğunda ise o classın inheritance olduğu diğer classlar erişebilir.(package içinde olsun olmasınfarketmez.)
    Privated olduğunda ise sadece o classın içindekiler erişir.
    */
     int yasinkac(){
     return yas;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Insan ali=new Insan();
        ali.boy=180;
        ali.yas=20;
        
        System.out.println(ali.boy);
        System.out.println(+ali.yasinkac());// aynı package içindeki yaşı return ettirerek burada alinin yaşını öğrendik.
        
    }
    
}
