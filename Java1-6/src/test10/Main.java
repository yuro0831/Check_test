package test10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        /*
         * パターン１、配列の中身をすべて出力してみる
         */
        //配列の中身をすべて出力してみる
        String[] fruits= {"apple","banana","meron"};
        
        //変数sの中にfruitsの値をどんどん格納して出力する。
        for(String s : fruits) {
            System.out.println(s);
        }
        
        /*
         * パターン2,listの中身をすべて出力してみる
         */
        //配列の中身をすべて出力してみる
        List<String> list =new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("meron");
        
        //変数sの中にfruitsの値をどんどん格納して出力する。
        for(String s : list) {
            System.out.println(s);
        }

    }

}
