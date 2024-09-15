package test15;

public class Main {

    public static void main(String[] args) {

        /*
         * 基本的なsubstringの使い方2
         */
        String name = "山田太郎";
        //substring(最初の一文字目=0,から2文字分)
        //
        name = name.substring(0,2);
        System.out.println(name);
        
        
        
        /*
         * よくある使用方法
         */
        String input = "最初の文字は「最初」";
        String output;
        
        //length()を使って文字数を取得
        int mojiLength = input.length();
        //使用されている文字数から最後の一文字(-1)を取得
        output = input.substring(0,mojiLength-(mojiLength -2));
        System.out.println(output);
        
        
    }

}
