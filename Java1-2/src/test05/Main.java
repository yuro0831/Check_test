package test05;

public class Main {

    public static void main(String[] args) {
        
        //変数の事前準備
        int a = 5;
        int b = 5;
        int c = 3;
        
        /*
         * AかつBの条件式
         * &&を使って、a == bの条件とa == cの条件が両方満たされた時だけTRUE
         */
        System.out.println("AかつB条件");
        if (a == b && a == c) {
            System.out.println("結果:OK");
        } else {
            System.out.println("結果:NG");
        }
        
        /*
         * AまたはBの条件式
         * ||を使って、a == bの条件かa == cのどちらか満たされたらTRUE
         */
        System.out.println("AまたはB条件");
        if(a == b || a ==c) {
            System.out.println("結果:OK");
        } else {
            System.out.println("結果:NG");
        }
    }

}
