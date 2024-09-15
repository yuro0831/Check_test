package test06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        
        //現在日時を取得
        LocalDateTime nowDate =LocalDateTime.now();
        System.out.println("そのまま"+nowDate);
        
        /*
         * パターン１、通常変更方法
         */
        
        //表示形式を指定
        DateTimeFormatter dts1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
        //dts1に指定したフォーマットを出力する。
        String getDateTime = dts1.format(nowDate);
        System.out.println("変更後 "+getDateTime);
        
        /*
         * パターン２、わかりやすい見た目に
         */
        
        //表示形式を指定
        DateTimeFormatter dts2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH:mm:ss");
        
        //dts2に指定したフォーマットを出力する。
        getDateTime =dts2.format(nowDate);
        System.out.println("変更後 "+getDateTime);
        
        /*
         * パターン3、既存のパターンを入れてみる
         */
        
        //表示形式を指定
        DateTimeFormatter dts3 = DateTimeFormatter.ISO_DATE;
        
        //dts３に指定したフォーマットを出力する
        getDateTime = dts3.format(nowDate);
        System.out.println("変換後 "+getDateTime);
        
    }

}
