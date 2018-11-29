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
public class Producer extends DenemeThread {
    Data d; // null değerindedir.
    public Producer(Data d){
    this.d=d;
    }
    public void run(){
    d.deger++;
    }
}
