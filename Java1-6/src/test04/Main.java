package test04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        /*
         * パターン１、条件に合致する場合
         */
        System.out.println("パターン１の場合");
        int i =0;
        
        //do while構文、どんな条件だったとしても必ず一回は実行する。
        do {
            //iの2乗をlistの中に格納していく。
            list.add(i * i);
            
            //格納した結果をコンソールに出力する。
            //出力結果が見やすくなるようにif条件で成形してみる。
            if(i < 9) {
                System.out.println(" " + (i +1) + "回目の処理:\t" + list.get(i));
            } else {
                System.out.println((i +1) +"回目の処理:\t" + list.get(i));
            }
            i++;
        }while (i <50);
        /*
         * パターン２、条件に合致しない場合
         */
        System.out.println();
        System.out.println("パターン２の場合");
        
        //iを一度初期化
        i = 0;
        
        do {
            list.add(i * i);
            
            if (i < 9) {
                System.out.println(" " + (i+ 1) +"回目の処理:\t" +list.get(i));
            } else {
                System.out.println((i + 1) + "回目の処理:\t" + list.get(i));
            }
            i++;
        }while (i == 0);
        }

    }

