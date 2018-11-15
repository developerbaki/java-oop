/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author baki
 */
public class Lambda2 {

    /**
     * @param args the command line arguments
     */
    int k =100;
    public static void main(String[] args) {
        // TODO code application logic here
        Lambda2 l2 = new Lambda2(); // static olmayan değişkeni static içinde tanımlayıp yazdırabilirim.
        int z=10;// dışarıda tanımlanan değişkene lambda içinde ulaşabilirim.
        List<Integer> list = Arrays.asList(1,2,3);
        int sum = list.stream().map( x -> x+x).reduce((x,y) -> x+y).get();
        System.out.println(sum);
        /*intSeq.forEach(x ->
                 {
            int y = x + 2+z+ l2.k;
            System.out.println(y);
        }
        );
*/
    }

}
