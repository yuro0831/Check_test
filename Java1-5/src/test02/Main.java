package test02;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        /*
         * 実験１、日付を取得
         */
        System.out.println("実験１");
        
        //時間を取得するAPIはLocalTimeを使用する。
        LocalTime time = LocalTime.now();
        System.out.println(" 時間:" + time);
        
        System.out.println();
        
        /*
         * 実験2-1,時間の中身を指定(hh,mm)
         */
        System.out.println("実験2-1");
        
        //日付を指定するときは「.of(時間,分)」を使って指定する
        time = LocalTime.of(11,23);
        System.out.println(" 時間:" + time);
        
        System.out.println();
        
        /*
         * 実験2-2、時間の中身を指定(hh,mm,ss)
         */
        System.out.println("実験2-2");
        
        //「.of(時間,分,秒,ミリ秒)」を使って指定する。
        time = LocalTime.of(11, 23, 15);
        System.out.println(" 時間:"+ time);
        
        System.out.println();
        
        /*
         * 実験2-3,日付の中身を指定(hh,mm,ss,nano)
         */
        System.out.println("実験2-3");
        
        //「.of(時間、分、秒、ミリ秒)」を使って指定する。
        time = LocalTime.of(11, 23 , 15, 100051);
        System.out.println(" 時間:" + time);
        
        System.out.println();
        
        /*
         * 実験3、時間の各地を取得してみる。
         */
        System.out.println("実験3");
        
        //今の時間を取得してtimeに格納
        time = LocalTime.now();
        
        //年を取得する。
        int hour = time.getHour();
        
        //int型の月を取得する。
        int minute = time.getMinute();
        
        //Month型の月を取得する。
        int second = time.getSecond();
        
        //曜日を取得する。(曜日はDayOfWeek で取得可能)
        int nano = time.getNano();
        
        System.out.println(" hour :" + hour);
        System.out.println(" minute :" + minute);
        System.out.println(" second :" + second);
        System.out.println(" nano :" + nano);
        
        System.out.println();
        
        /*
         * 実験4、存在しない火を入れようとしてみる
         */
        System.out.println("実験4");
        
        //今の時間を再取得してtimeに格納
        time = LocalTime.of(2025, 2, 29);
        //処理しようとすると失敗する。
        System.out.println("時間:" + time);

    }

}
