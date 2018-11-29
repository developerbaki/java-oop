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
interface ILambda {

    int run(int x, int y);

    String cevir(String s);

}

class Lambda_expression implements ILambda {

    String f(int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int run(int x, int y) {
        return (x * y + 2);
    }
    //Utility methods,Helper

    @Override
    public String cevir(String s) {
        //baki ikab
        char[] sArray = s.toCharArray();
        char[] cArray = new char[sArray.length];
        int c = 0;
        for (int i = sArray.length - 1; i >= 0; i--) {
            cArray[c] = sArray[i];
            c++;

        }
        System.out.println( new String(cArray));
        return s;
    }

}
