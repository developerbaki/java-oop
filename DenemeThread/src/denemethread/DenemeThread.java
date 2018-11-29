/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemethread;

/**
 *
 * @author baki
 */
public class DenemeThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data d= new Data(); // bir tane obje tanımladık.
        d.deger = 100;
     Producer p = new Producer(d);
     Consumer c= new Consumer(c);
     Thread t= new Thread(c);
     p.start();
     c.start();
     


// burada d objesini constructor'a parametre olarak geçiriyoruz.
     // burada amacımız bir objeyi birden fazla şekilde gösterebilmek.(tek obje halinde.)

    }

}
