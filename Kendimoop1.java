/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendimoop1;

/**
 *
 * @author baki
 */
public class Kendimoop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hayvan kedi = new hayvan();
        hayvan balık = new hayvan();
        balık.akciger = "akciğer solunumu yapmaz";
        balık.ayak = 0;
        balık.omurgalı = "omurgalı değil";
        kedi.akciger = "akciğer solunmu yapar.";
        kedi.ayak = 4;
        kedi.omurgalı = "omurgalıdır.";
        System.out.println(" balık solunum: " + balık.akciger + " balık ayak sayısı " + balık.ayak + " kedi ayak sayısı " + kedi.ayak + " kedi solunum: " + kedi.akciger);
        kedi.sakat();
        System.out.println("kedi ayağı:" + kedi.ayak);
    }

}
