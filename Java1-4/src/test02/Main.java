package test02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
         * 実験操作1、既に入っているデータの中身を変更する。
         */     
        List<String> list = new ArrayList<String>();

        list.add("注文の多い料理店");
        list.add("銀河鉄道の夜");
        list.add("風の又三郎");
        list.add("雨ニモ負ケズ");
        list.add("蜘蛛とナメクジと狸");
        
        //元のデータを確認
        System.out.println("取得した本は" + list.get(2) + "です");
        
        //listの3つめの値を変更してみる
        list.set(2, "鹿踊りのはじまり");
        //データが変更されたかを確認
        System.out.println("取得した本は" + list.get(2) + "です");
        
        
        /*
         * 実験操作2、既に入っているデータの中身を削除する
         */
        //元のデータを確認
        System.out.println("取得した本は" + list.get(3) + "です");
        
        //listの3つめの値を変更してみる
        list.remove(3);
        //データが変更されたかを確認
        System.out.println("取得した本は" + list.get(3) + "です");
    }
}
