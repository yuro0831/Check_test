package check1;

public class Main {
    
    //問題①スコープ1にint型の変数xとyを作成してください。
    static int x;
    static int y;
    
    public static void main(String[] args) {

        
        //問題②inputメソッドとcalcメソッドを呼び出してください。
        //calcメソッドには、スコープ1のxとyを使って処理を呼び出してください。
        //ヒント,メソッドを呼び出す順番に注意        
        input();
        calc(x, y);
    }
    
    
    
    //問題③スコープ1のxとyに値を代入する「input」メソッドを作成してください。
    //xには10を、yには5を代入してください。 
    public static void input() {
        x = 10;
        y = 5;
    }

    //問題④calcメソッドを作成してください。
    //calcメソッド内では、引数をint a、int b、として指定を行い。
    //「2a+3b」の計算結果を出力する計算を行ってください。
    public static void calc(int a, int b) {
        int result = 2 * a + 3 * b;
        System.out.println("計算結果: " +result);
    }
}
