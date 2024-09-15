package check1;

public class Check {

    public static void main(String[] args) {

        /*
         * 問題、頭文字だけが大文字で出力されるプログラムを作成しなさい。
         */

        String moji = "goodmorning";

        // ①変数を3つ作成してください。作成した変数は、頭文字用、文字用、回答用の変数としてください。
        // 頭文字
        String headCharacter;

        // 文字
        String remainingCharacters;

        // 回答用
        String result;

        // ②mojiから最初の一文字を抜き出して頭文字変数に格納する。
        // 格納した文字は大文字に変換する。
        headCharacter = moji.substring(0, 1).toUpperCase();

        // ③mojiから最初以外の文字を抜き出して文字変数に格納する。
        remainingCharacters = moji.substring(1);

        // ④頭文字と文字を回答用文字列に格納する。
        result = headCharacter + remainingCharacters;

        // 結果を出力する
        System.out.println(result);
    }
}
