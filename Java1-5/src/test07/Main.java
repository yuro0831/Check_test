package test07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        
        //現在日時を取得
        LocalDateTime nowDate = LocalDateTime.now();
        //表示形式を指定
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH:mm:ss");
        String getDateTime = dtf.format(nowDate);
        System.out.println(" 現在:"+getDateTime);
        
        //5日後を設定する。
        nowDate = nowDate.plusDays(5);
        
        //5日後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println(" 5日後:"+getDateTime);
        
        //3日前に戻してみる。
        nowDate = nowDate.minusDays(3);
        
      //2日後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println(" 2日後:"+getDateTime);
        
        //2週間先に進めてみる。
        nowDate = nowDate.plusWeeks(2);
        
        //16日後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println("16日後:"+getDateTime);
        
        //1週間戻してみる
        nowDate = nowDate.minusWeeks(1);
        
        //9日後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println(" 9日後:"+getDateTime);
        
        //3カ月先にしてみる。
        nowDate = nowDate.plusMonths(3);
        
        //3カ月後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println(" 3カ月:"+getDateTime);
        
        //2カ月戻す。
        nowDate = nowDate.minusMonths(2);
        
        //1カ月後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println(" 1カ月:"+getDateTime);
        
        //3年先にしてみる。
        nowDate = nowDate.plusYears(3);
        
        //3年後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println(" 3年後:"+getDateTime);
        
        //2年戻す。
        nowDate = nowDate.minusYears(2);
        
        //1年後になっていることを確認する。
        getDateTime = dtf.format(nowDate);
        System.out.println(" 1年後:"+getDateTime);

    }

}
