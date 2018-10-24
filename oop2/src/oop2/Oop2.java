/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author baki
 */
public class Oop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3;
        System.out.println(a++);
        System.out.println(++a);
        if (a == 5 && ++a >= 2) {

        }
        System.out.println("a:" + a);
        a = (a < 4) ? 0 : 100;
        System.out.println("a:" + a);
        
        int b = 13;
        System.out.println("" +(b >> 1));//2lik tabanda sayıyı bir saga kaydırırken kullanırız.
        System.out.println("shift 2" + (b << 1));
    }
    
    

}
