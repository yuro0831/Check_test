package test16;

public class Main {

    public static void main(String[] args) {

        /*
         * 基本的なsubstringの使い方2
         */
        String test = "100文字も文字数内";
        //substringで100文字を取得しようとしてみる。
        test = test.substring(0,100);
        System.out.println(test);
    }

}
