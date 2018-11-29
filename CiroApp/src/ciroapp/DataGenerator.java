/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciroapp;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author baki
 */
//normal karşılaştırma
//bulunduğumuz yılı ve ayı kontrol ederek karşılaştırma. Olduğumuz aya kadar alacağız. Örneğin mayıstayız mayısa kadar.
//yıl bazlı günlük karşılaştırma.
public class DataGenerator {// veri oluşturucu-- ciro üreticez

   private final List<CiroDataSet> ciros = new  ArrayList<>();

   

    public List<CiroDataSet> GenerateCiroData(int yearCount) {

        //biz hangi 3 yılın datasını üreticez??
        //geçmişteki 2 yılın ve bu yılın.
        Date dNow = new Date();// şuan ki yılı almak için bir date tanımladım.
        SimpleDateFormat ft // aldığım date ne gibi bir formatta almak istediğimi belirledim.
                = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(ft.format(dNow)); //yılı int değişkeni şeklinde tanımladım.
        //System.out.println(year);
        for (int year = currentYear - (yearCount - 1); year <= currentYear; year++) {
            // System.out.println(i);
            for (int month = 1; month <= 12; month++) {

                String dateString = month + "/" + "01/" + year; // burada yılı,ayı,günü format ettirdim.

                LocalDate convertedDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("M/dd/yyyy")); // bu formatta yazdırdım.
                convertedDate = convertedDate.withDayOfMonth(
                        convertedDate.getMonth().length(convertedDate.isLeapYear()));
                Date date = Date.from(convertedDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                SimpleDateFormat convertedFormat // aldığım date ne gibi bir formatta almak istediğimi belirledim.
                        = new SimpleDateFormat("dd");
                int currentDay = Integer.parseInt(convertedFormat.format(date)); //yılı int değişkeni şeklinde tanımladım.
// burada currentDay seklinde ayın kacıncı günde bittiğini buldum.
                for (int day = 1; day <= currentDay; day++) { // bulduğum ayın son gününe kadar geldim.
                    //System.out.println(day); // ekrana bastırdım.
                    
                    CiroDataSet ciroDataSet= new CiroDataSet(); //nesne oluşturdum.
                    ciroDataSet.amount=Math.round(Math.random()*100) ;
                    ciroDataSet.day=day;
                    ciroDataSet.month=month;
                    ciroDataSet.year=year;
                    ciros.add(ciroDataSet);
                    //System.out.println(ciroDataSet.amount);
                   // this.ciros.add(e)
                           
                }
            }

        }

        return ciros;

    }

}
