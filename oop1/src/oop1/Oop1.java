/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author baki
 */
public class Oop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insan ali = new insan();
        ali.boy = 1.80;
        ali.kilo = 85;
        ali.yas = 25;
        System.out.println(" alinin boyu: " + ali.boy + " alinin yası: " + ali.yas + " alinin kilosu " + ali.kilo);
        insan veli = new insan();
        veli.boy = 1.90;
        veli.yas = 26;
        veli.kilo = 102;
        System.out.println("velinin boyu: " + veli.boy + "velinin yası: " + veli.yas + "velinin kilosu " + veli.kilo);
        ali.yemek();
        System.out.println(" alinin kilosu " + ali.kilo);
        veli.yemek();
        System.out.println("velinin kilo: " + veli.kilo);
        ali.maas = 1500;
        ali.zam(5);
        System.out.println("veli maas:" + ali.maas);
        
    }

}
