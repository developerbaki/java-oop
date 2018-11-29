/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciroapplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author baki
 */
public class DataGenerator {

    private final List<CiroDataSet> calendar = new ArrayList<>();

    public List<CiroDataSet> Calendar(int yearCount) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(ft.format(dNow));

        for (int year = currentYear - (currentYear - 1); year <= currentYear; year++) {
            //System.out.println(year);
            for(int month=1; month<=12; month++){
                CharSequence dateString = null;
/*String date_s = " 2011-01-18 00:00:00.0"; 
SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd "); 
Date date = dt.parse(date_s); 
SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
System.out.println(dt1.format(date));   

LocalDate now = LocalDate.now(); 
LocalDate lastDay = now.with(TemporalAdjusters.lastDayOfMonth()); 
System.out.println(lastDay);
*/
LocalDate convertedDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("M/dd/yyyy")); 
                convertedDate = convertedDate.withDayOfMonth(
                        convertedDate.getMonth().length(convertedDate.isLeapYear()));
                Date date = Date.from(convertedDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                SimpleDateFormat convertedFormat 
                        = new SimpleDateFormat("dd");
                int currentDay = Integer.parseInt(convertedFormat.format(date));
                for(int day=1; day<=currentDay; day++){
                CiroDataSet ciroDataSet = new CiroDataSet();
                ciroDataSet.day= day;
                ciroDataSet.month=month;
                ciroDataSet.year=year;
                calendar.add(ciroDataSet);
                }
            }

        }

        return calendar;

    }

}
