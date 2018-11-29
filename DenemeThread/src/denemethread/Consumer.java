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

public class Consumer implements Runnable { // runnable interface'inde run fonksiyonunu override etmesi gerekir.
    // interface de iki obje yada iki class'ın konusabilmesi için gerekli şeyler yazılır.
    @Override
    
    public void run(){ // consumer azaltıcıdır o yüzden değeri düşürerek gelir.
    Data d= null;
      
    
    
    d.deger--;
        }
    public Consumer(Data d){
    this.d = d;
    }
    
    
}
