/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdacalculus;

/**
 *
 * @author baki
 */
public class Lambdacalculus {
    interface lambda{
    int calistir(int x, int y);
    
    }

    /**
     * @param args the command line arguments
     */
    int gv=100;
    public int f(int x){
    return (x*gv);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int j=5;
        Lambda_expression le = new Lambda_expression();
        System.out.println(""+ le.f(j));
        String s = "deneme";
        System.out.println(s.charAt(3));
       // s.charAt(3)= "k"; // Java da stringler immutable'dır. Değiştirilemez. 
        
        lambda l = ((int x, int y ) ->(x*y));
        System.out.println(l.calistir(5,6));
    }
    
}
