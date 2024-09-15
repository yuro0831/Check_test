package test11;

public class Main {

    public static void main(String[] args) {
        /*
         * パターン１_通常の文字列をそのまま出力してみる
         */
        String test1 ="test";
        System.out.println("パターン1:" + test1);
        
        /*
         * パターン2_文字に対して大文字で出力する。
         */
        String test2 = "test";
        
        System.out.println("パターン2:" + test2.toUpperCase());
        
        /*
         * パターン3_文字に対して大文字で出力する。
         */
        String test3 = "test";
        
        test3.toUpperCase();
        //
        System.out.println("パターン3" + test3);
        
        /*
         * パターン4_変換した文字を変数に入れて出力する。
         */
        String test4 = "test";
        
        test4 = test4.toUpperCase();
        //
        System.out.println("パターン4:" + test4);

    }

}