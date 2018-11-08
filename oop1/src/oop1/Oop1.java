/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import java.lang.reflect.Field;
import java.util.Scanner;
import oop1.Asi;

/**
 *
 * @author baki
 */
public class Oop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        // TODO code application logic here
    
            Scanner loginScanner = new Scanner(System.in);
            
        calisan mudur = new calisan();
        mudur.isim = "ali";
        mudur.boy = 1.80;
        mudur.kilo = 85;
        mudur.yas = 25;
        System.out.println(" mudurnin boyu: " + mudur.boy + " mudurnin yası: " + mudur.yas + " mudurnin kilosu " + mudur.kilo);
        insan insan1 = new insan();
        System.out.println(insan1.sacrengi);//direk constructor giderken instance name yazarsak sorgular ve insan.java daki sac rengini ekrana yazdırır.
        insan1.isim = "veli";
        insan1.boy = 1.90;
        insan1.yas = 26;
        insan1.kilo = 102;
        insan1.gözrengi = "siyah";
        System.out.println("insan1in özellik adedi" + insan1.getClass().getDeclaredFields().length);
        //insan1 property'lerinin kaç tane olduğunu gösteren kod olarak yukarıdaki kodu yazdık.
  String propertyName;
        for (int i=0;i<insan1.getClass().getDeclaredFields().length;i++) {
           propertyName = insan1.getClass().getDeclaredFields()[i].getGenericType().toString();
           if(propertyName=="class java.lang.String"){
            System.out.println(propertyName);
           }
           
        }
        insan1.sacrengi= "siyah";
        
/*
        insan1.sacrengi= "mavi";
        String value;
        for (Field field : insan1.getClass().getDeclaredFields()) {
            try{
            value= field.get(insan1).toString();
            }catch(NullPointerException exception){
                System.out.println(field.getName());
            continue;
            }
            
             System.out.println(field.getName() + " " +  value);
        }
        System.out.println("*********************************************");
        
        //yukarıdaki yazdıgımız classımın özelliklerini tanımlayan her şeyi sayar.
        //İnsan1'in bütün özelliklerini ekrana dinammik olarak yazan for döngüsü.
        System.out.println(insan1.isim + " " + insan1.boy + "insan1nin yası: " + insan1.yas + "insan1nin kilosu " + insan1.kilo);
        mudur.yemek();
        System.out.println(" mudurnin kilosu " + mudur.kilo);
        insan1.yemek();
        System.out.println("insan1nin kilo: " + insan1.kilo);
        mudur.maas = 1500;
        mudur.zam(5);
        System.out.println("mudur maas:" + mudur.maas);
*/
    insan1.addAsi(new Asi(1,"Grip","20 Eylüül", "Enjeksiyon"));
    insan1.addAsi(new Asi(2,"Tetenoz","15 Ekim", "Tüp"));
    insan1.addAsi(new Asi(3,"Verem","17 Kasım", "Enjeksiyon"));
      insan1.addAsi(new Asi(4,"blabla","17 Kasım", "Enjeksiyon"));
    System.out.println(insan1.getAsilar().size());      
    Asi findAsi= insan1.findAsi(2);
    System.out.println(findAsi.Isim);
    //findAsi.Isim= "betanozz";
    
    insan1.printAsi();
    
    System.out.println("*********************************************");
    
    UserActions userActions = new UserActions();
    userActions.signUp("bakieroglu2", "paw44","Baki Eroğlu", "12.02.1996");
    userActions.printUsers();
         System.out.println("UserName giriniz:");
         
           String userName= loginScanner.nextLine();
           System.out.println("Password giriniz:");
            String password= loginScanner.nextLine();
          boolean loginResult = userActions.login(userName, password);
             if(loginResult){
             System.out.println("Sisteme giriş başarılı");
             }
             else{
             System.out.println("Sisteme hatalı giriş yaptınız.");
             }
             
            }

}
