package check2;

public class Main {

    public static void main(String[] args) {
    
        int x = 10;
        
        int y = 5;
        
        int ans = 0;

        //問題①
        //int x,int yを使って問題②で作成するメソッドを実行し、
        //ansの中に格納して出力する事
        
        //足し算の結果を格納
        ans = calcAdd(x, y);
        System.out.println("足し算の結果:"+ans);
        
        //引き算の結果を格納
        ans =calcSub(x ,y);
        System.out.println("引き算の結果:" +ans);
        
        //掛け算の結果を格納
        ans = calcMul(x, y);
        System.out.println("掛け算の結果:" +ans);
    }
    //問題②
    //int x,int yの値を引数として取得し、
    //足し算、引き算、掛け算の結果を戻り値として返却するcalcメソッドを作成してください。
    //ただし、calcメソッドは3つ作り、1つのメソッドに対して1つの計算のみを記載してください。
    //ヒント、オーバーロードを使いこなしましょう。
    //ヒント2、引数は渡したからといって必ず使う必要はありません。
    
    public static int calcAdd(int x, int y) {
        return x + y;
    }
    public static int calcSub(int x, int y) {
        return x - y;
    }
    public static int calcMul(int x, int y) {
        return x * y;
    }
}