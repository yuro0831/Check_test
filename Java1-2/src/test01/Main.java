package test01;

public class Main {

    public static void main(String[] args) {
       /*
        * 条件通りに行ったパターン
        */
    
        System.out.println("１回目の処理");
        //条件用鵜の分岐
        boolean tenki =true;
        
        //ifの条件文に対して条件通りであればifの中身が実行されます。
        //条件が違う場合は
        if (tenki ==true ) {
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");  
        } else {
            System.out.println("DVDを見ます");
        }
        
        /*
         * 条件通りにいかなかったパターン
         */
        
        System.out.println("2回目の処理");
        //条件用の分岐
        boolean tenki2 =false;
        
        //if条件に対して条件通りであればifの中身が実行されます。
        //条件が違う場合はelseの処理が実行されます。
        if (tenki2 ==true) {
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        } else {
            System.out.println("DVDを見ます");
        }
        /*
         * elseの記載を省いたパターン
         */
        
        System.out.println("３回目の処理");
        //条件用の分岐
        boolean tenki3 =false;
        
        //elseの記載がなければ、条件に合わない場合特に処理されません
        if (tenki3 ==true) {
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        }
    }

}