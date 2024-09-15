package test03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        /*
         * 実験1、今の日時を取得
         */
        System.out.println("実験1");

        //時間を取得するAPIはLocalDateTimeを使用する。
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(" 時間:" + dateTime);

        System.out.println();

        /*
         * 実験2-1、日時の中身を指定(yyyy,MM,dd,hh,mm)
         */
        System.out.println("実験2-1");

        //日時の場合は「.of(年,月,日,時間,分)」を使って指定する。
        dateTime = LocalDateTime.of(2024, 1, 12, 11, 23);
        System.out.println(" 時間:" + dateTime);

        System.out.println();

        /*
         * 実験2-2、日時の中身を指定(yyyy,MM,dd,hh,mm,ss)
         */
        System.out.println("実験2-2");

        //元の指定に加えて秒を指定可能
        dateTime = LocalDateTime.of(2024, 1, 12, 11, 23,15);
        System.out.println(" 時間:" + dateTime);

        System.out.println();

        /*
         * 実験2-3、日時の中身を指定(yyyy,MM,dd,hh,mm,ss,nano)
         */
        System.out.println("実験2-3");

        //更に追加でnano秒を指定可能
        dateTime = LocalDateTime.of(2024, 1, 12, 11, 23,15,100051);
        System.out.println(" 時間:" + dateTime);

        System.out.println();

        /*
         * 実験2-4、日時の中身を指定(LocalDate,LocalTime)
         */
        System.out.println("実験2-4");

        //日時の場合は「.of(年,月,日,時間,分)」を使って指定する。
        LocalDate date = LocalDate.of(2025, 1, 9);
        LocalTime time = LocalTime.of(15, 20);
        dateTime = LocalDateTime.of(date,time);
        System.out.println(" 時間:" + dateTime);

        System.out.println();
        
        /*
         * 実験2-5、日時の中身を指定(Monthは使えるか？)
         */
        System.out.println("実験2-5");

        //日時の場合は「.of(年,月,日,時間,分)」を使って指定する。
        dateTime = LocalDateTime.of(2025,Month.JULY,9,5,12);
        System.out.println(" 時間:" + dateTime);

        System.out.println();


        /*
         * 実験3、時間の各値を取得してみる。
         */
        System.out.println("実験3");

        //今の時間を再取得してdateTimeに格納
        dateTime = LocalDateTime.now();
        
        //年を取得する。
        int year = dateTime.getYear();
        
        //int型の月を取得する。
        int month = dateTime.getMonthValue();
        
        //Month型の月を取得する。
        Month monthEn = dateTime.getMonth();
        
        //String型で月を取得する事も可能。
        String monthEnString = dateTime.getMonth().toString();
        
        //日を取得する。
        int day = dateTime.getDayOfMonth();
        
        //曜日を取得する。（曜日はDayOfWeekで取得可能）
        DayOfWeek week = dateTime.getDayOfWeek();
        
        //String型で月を取得することも可能
        String weekString = dateTime.getDayOfWeek().toString();

        //時間を取得する。
        int hour = dateTime.getHour();

        //分を取得する。
        int minute = dateTime.getMinute();

        //秒の月を取得する。
        int second = dateTime.getSecond();

        //ミリ秒を取得する。
        int nano = dateTime.getNano();
        
        System.out.println(" year         ：" + year);
        System.out.println(" month(int)   ：" + month);
        System.out.println(" month(Month) ：" + monthEn);
        System.out.println(" month(String)：" + monthEnString);
        System.out.println(" day          ：" + day);
        System.out.println(" week         ：" + week);
        System.out.println(" week(String) ：" + weekString);
        System.out.println(" hour         ：" + hour);
        System.out.println(" minute       ：" + minute);
        System.out.println(" second       ：" + second);
        System.out.println(" nano         ：" + nano);

        System.out.println();

        /*
         * 実験4、存在しない時間を入れようとしてみる
         */
        System.out.println("実験4");

        //今の時間を再取得してdateTimeに格納
        dateTime = LocalDateTime.of(2024, 1, 12, 11, 60);
        //処理しようとすると失敗する。
        System.out.println("時間:" + dateTime);
    }
}
