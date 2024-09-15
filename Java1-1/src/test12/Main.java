package test12;

public class Main {

    public static void main(String[] args) {
        /*
         * パターン2_文字に対して大文字で出力する。
         */
        String test = "TEST";
        
        //まずはそのまま出力してみる。
        System.out.println("返還前:" + test);
        
        //ここで小文字を大文字にして出力
        test = test.toLowerCase();
        System.out.println("変換後:" + test);

    }

}
