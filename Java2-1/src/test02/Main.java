package test02;

public class Main {

    public static void main(String[] args) {
        // 足し算メソッドを呼び出す。()にはメソッドで定義した型のデータを入力します。
        //今回は(int x,int y)で指定されているので、int型データを2つ送ります
        addition(5, 3);
        
        //引き算メソッドを呼び出す。()にはメソッドで定義した型のデータを入力します。
        //今回は(int x,int y)で指定されているので、int型データを２つ送ります。
        subtraction(10, -5);
        
        //メソッドを呼び出す時に渡す因数を変数にしてもOKです。
        int x = 3;
        int y = 15;
        
        //掛け算メソッドを呼び出します。()にはメソッドで定義した型のデータを入力します。
        multiplication(x, y);
        
        //割り算メソッドを呼び出します。()にはメソッドで定義した型のデータを入力します。
        division(x, y);
        
        //文字加工メソッドを呼び出します。()にはメソッドで定義した型のデータを入力します。
        String word = "trendly Circle";
        characterConversion(word);
        
        //文字加工メソッドを呼び出します。()にはメソッドで定義した型のデータを入力します。
        FirstCharacterConversion(word, 70);
        
        //配列の合計を出すメソッドを呼び出します。
        int allIn[] = {25, 74, 347, 83, 291, 362, 22, 19, 469, 2926, 721, 2723, 111, 387 };
        //
        sumArray(allIn);
        
    }
    
    //足し算をするメソッド
    public static void addition(int x, int y) {
        int answer = x + y;
        System.out.println("足し算の結果は・・・");
        System.out.println(answer + "です！");
        
    }
    
    //引き算をするメソッド
    public static void subtraction(int y, int x) {
        int answer = x - y;
        System.out.println("引き算の結果は・・・");
        System.out.println(answer + "です！");
    }
    
    //掛け算をするメソッド
    public static void multiplication(int y, int x) {
        int answer = x * y;
        System.out.println("掛け算の結果は・・・");
        System.out.println(answer +"です！");
    }
    
    //割り算をするメソッド
    public static void division(int y, int x) {
        int answer = x * y;
        System.out.println("割り算の結果は・・・");
        System.out.println(answer + "です！");
    }
    
    //文字加工をするメソッド
    public static void characterConversion(String s) {
        String answer = s.trim();
        answer = answer.substring(0, 1).toUpperCase() + answer.substring(1, s.length() -1).toLowerCase();
        System.out.println("文字を加工した結果・・・");
        System.out.println(answer +"です！");
    }
    
    //一文字目の言葉だけ別の言葉に置き換えるメソッド
    public static void FirstCharacterConversion(String s, int x) {
        String answer = s.trim();
        char header = (char) x;
        answer = answer.replaceFirst(answer.substring(0, 1), String.valueOf(header));
        System.out.println("文字を加工した結果・・・");
        System.out.println(answer +"です！");
    }
    
    //配列の中身をまとめて合計を出力するメソッド
    //メソッドに指定する引数はListやMap、配列やクラスを渡すことも可能
    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("この配列の合計は・・・");
        System.out.println(sum + "です！");

    }

}
