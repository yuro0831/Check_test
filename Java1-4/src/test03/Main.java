package test03;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*
         * 実験操作1、既に入っているデータの中身を変更する。
         */ 
        Map<String,Integer> prefs = new HashMap<String,Integer>();
        
        //左にキーを、右に値を入れる。
        prefs.put("銀河鉄道の夜", 9737);
        prefs.put("注文の多い料理店", 3829);
        prefs.put("風の又三郎", 1542);
        prefs.put("宮沢賢治詩集", 1094);
        prefs.put("セロ弾きのゴージュ", 842);
        
        System.out.println("人気度を確認します。");
        //本検索
        int popularity = prefs.get("銀河鉄道の夜");
        
        System.out.println(popularity + "いいね");
        
        //格納されている本の人気度を変更してみる。
        prefs.replace("銀河鉄道の夜",10524);
        
        System.out.println("人気度を確認します。");
        //本検索
        popularity = prefs.get("銀河鉄道の夜");
        //値が変更できていることを確認できる。
        System.out.println(popularity + "いいね");
        
        
        //更に本を追加してみる
        prefs.put("グスコーブドリの伝記", 530);
        prefs.put("よだかの星", 1035);
        
        System.out.println("人気度を確認します。");
        //本が格納されたかを確認
        popularity = prefs.get("よだかの星");
        
        System.out.println(popularity + "いいね");
        
        
        
        //本を削除してみて、消された本が取得できてしまうのかを確認する。
        prefs.remove("グスコーブドリの伝記");
        System.out.println("人気度を確認します。");       
        //存在しないものを検索するとどうなるか
        int popularity2 = prefs.get("グスコーブドリの伝記");
        System.out.println(popularity2 + "いいね");
    }
}
