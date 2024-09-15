package test02;

public class Main {

    public static void main(String[] args) {
        //降水確率が５％以下の時だけ外に出る
        //という条件処理を作ってみる
        
        //降水確率をランダムで作る
        int rainProbability = new java.util.Random().nextInt(101);
        
        //whileを使って処理を行う
        //while(条件)内の条件が満たされ続ける場合は処理が継続され続ける
        while(rainProbability > 5) {
            System.out.println("今日の降水確率は"+ rainProbability +"だから外に出ない");
            rainProbability = new java.util.Random().nextInt(101);
        }
        
        //whileの条件に合致しなかった場合は、whileの処理は無視され、後続の処理が始まっていく
        System.out.println("今日の降水確率は"+ rainProbability +"だ！");
        System.out.println("出かけるぞ！");

    }

}
