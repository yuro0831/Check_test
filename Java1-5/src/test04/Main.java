package test04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        /*
         * パターン1,文字列から値を取得し、LocalDate型に取り込む
         */
        
        String dateStringA = "2024/01/02";
        //LocalDate.parse("指定したい値",DateTimeFormatter.ofPattern("処理形式")
        LocalDate date = LocalDate.parse(dateStringA,DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        //データが格納されていることを確認する。
        System.out.println(date);
        
        //LocalTimeの場合
        String timeStringA = "11:23:00";
        
        LocalTime time = LocalTime.parse(timeStringA,DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        //データが格納されていることを確認する。
        System.out.println(time);
        
        //LocalDateTimeの場合
        String dateTimeStringA = "20240102:112300";
        
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStringA,DateTimeFormatter.ofPattern("yyyyMMdd:HHmmss"));
        
        //データが格納されていることを確認する。
        System.out.println(dateTime);
        
        /*
         * パターン2,DateFormaterの指定を使ってLocalDate型に値を取り込む
         */     
        String dateStringB = "20240102";
        //LocalDate.parse("指定したい値",DateTimeFormatter.ofPattern("処理形式")
        date = LocalDate.parse(dateStringB,DateTimeFormatter.BASIC_ISO_DATE);
        
    }
}
