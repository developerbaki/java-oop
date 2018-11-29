/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciroapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author baki
 */
public class CiroService {

    // 2016 -  2017  -  2018
    // 500.0 - 700.0   900.0
    public String getCirosOfYear(int yearCount) {

        DataGenerator dataGenerator = new DataGenerator();
        List<CiroDataSet> cirosData = dataGenerator.GenerateCiroData(yearCount);
        Date dNow = new Date();
        SimpleDateFormat ft
                = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(ft.format(dNow));
        String StrYears = "";
        String StrToplam = "";
        for (int year = currentYear - (yearCount - 1); year <= currentYear; year++) {
            double toplam = 0;
            StrYears = StrYears.concat("" + year + "        "); // concat string fonksiyonudur. Birleştirme özelliği vardır.

            for (int i = 0; i < cirosData.size(); i++) {

                if (year == cirosData.get(i).year) {
                    toplam = toplam + cirosData.get(i).amount;
                }
            }
            StrToplam = StrToplam.concat("" + toplam + "     ");
        }
       // System.out.println(StrYears);
      //  System.out.println(StrToplam);

        return "";

    }
    // 2016.1 -  2016.2  -  2016.3  -  2016.4
    // 500.0   - 700.0   -   900.0  -    885.0
    public String getCirosOfQuarter(){
        int quarter = (Calendar.getInstance().get(Calendar.MONTH) / 3); // 1. ay ile 3 ay arasını alıyorum.
String[] mQuarterKey = {"qt1", "qt2", "qt3", "qt4"}; //string değişkenin de 4 ayrı şekilde yılı alıyorum
String strQuarter = mQuarterKey[quarter];
System.out.println("");
        return "";
    }
    
    // 2016.1 -  2018.1  
    // 500.0   - 700.0  
    public String compareQuarter(int aYear,int bYear,int quarter){
        return "ss";
    }

}
