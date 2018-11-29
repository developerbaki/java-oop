/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop3;

class insan {

    int boy;
    int kilo;
    int yas;

    public insan() {// class ile aynı isme sahip bir return type yoktur.
        System.out.println("yeni bir insan oluşturuldu.");
    }

    public insan(int yas, int kilo, int boy) {

        this.yas = yas;
        this.boy = boy;
        this.kilo = kilo;
    }
}

/**
 *
 * @author baki
 */
public class Javaoop3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insan veli= new insan();               
        insan ali = new insan(23, 93, 180);
        veli.boy = 170;
        veli.yas = 28;
        System.out.println("alinin özeliikleri" + ali.yas + ali.boy);
        System.out.println("alinin özeliikleri" + veli.yas + veli.boy);
    }

}
