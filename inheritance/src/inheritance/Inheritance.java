/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author baki
 */
public class Inheritance { // bu sınıfta alltakiler üst classlardaki özellikleri alır. Böyle bir ilişki vardır.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insan ali = new insan();
        muhendis veli = new muhendis();
        veli.boy = 180;
        System.out.println(veli.boy);
        veli.kilo=75;
        veli.yemek();
        System.out.println(veli.kilo);
        veli.maas=1000;
        veli.zam();
        System.out.println(veli.maas);
    }

}
