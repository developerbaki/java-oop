/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciroapp;

/**
 *
 * @author baki
 */
public class CiroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CiroService ciroService = new CiroService(); // CiroService tipinde nesne oluşturduk.
        ciroService.getCirosOfYear(4);
    }

}
