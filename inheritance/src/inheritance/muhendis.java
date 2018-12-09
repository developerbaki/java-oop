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
public class muhendis extends insan {
    int zam(){
    maas++;
    return maas;
    }
    // yemek fonksiyonuumuz daha önceden vardı fakat tekardan bir tane daha oluşturduk. Overriding yaptık.
    void yemek(){
    kilo = kilo + 2 ;
    }
}
