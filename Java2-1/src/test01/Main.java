package test01;

public class Main {

    public static void main(String[] args) {
        // メインメソッドに記載するときは個の記載だけ
        
        //helloメソッドを呼び出します。
        hello();
        //goodByeメソッドを呼び出します
        goodBye();
        
    }
    //mainメソッド{}より外側,Mainクラスの{}より内側にメソッドのタイトルを記載します。
    //メソッドの宣言は以下のように宣言します。
    public static void hello() {
        System.out.println("挨拶メソッドを実行します。");
        System.out.println("こんにちは！");
        System.out.println("挨拶メソッドを終了します。");
    }
    //mainメソッド{}より外側、Mainクラスの{}より内側にメソッドのタイトルを記載します。
    //メソッドの宣言は以下のように宣言します。
    public static void goodBye() {
        System.out.println("さよならメソッドを実行します。");
        System.out.println("またね！");
        System.out.println("さよならメソッドを終了します。");

    }

}
