package test01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        //リストを作成する。
        List<String> list = new ArrayList<String>();
        
        list.add("注文の多い料理店");
        list.add("銀河鉄道の夜");
        list.add("風の又三郎");
        list.add("雨にも負けず");
        list.add("雲とナメクジと狸");
        
        //今は言っているリストの数を確認する。
        int book = list.size();
        System.out.println("現在の本の所持数は" + book + "冊です");
        
        //Listから出力したい値を指定する。
        System.out.println("最初の本は" + list.get(0) + "です");
        System.out.println("2冊目の本は" + list.get(1) + "です");
        
        //本をされあに追加してみる。
        list.add("氷と後光");
        list.add("こころの影を恐れるなと");
        list.add("さるのこしかけ");
        
        //見やすいように何も入っていないSystem.out.println()を入れる。
        System.out.println();
        System.out.println("新しく本が追加されました");
        
        //今は言っているリストの数を確認する。
        book = list.size();
        System.out.println("現在のほんの所持数は"+ book +"冊です。");
        
        //追加された本があるか確認する。
        System.out.println("追加された１冊目は" +list.get(5) +"です");
        System.out.println("２冊目の本は" + list.get(6) + "です");
        System.out.println("3冊目の本は" + list.get(7) + "です");
        
        
    }

}
