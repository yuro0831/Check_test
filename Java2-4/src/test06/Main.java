package test06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            //コンソールに文字入力をさせるときにスペースを含めて実行してみて
            String mozi = sc.nextLine();
            spaceCheck(mozi);
            //作成したExceptionはcatchで使用可能
        }catch(SpaceException e) {
            e.printStackTrace();
        }
        sc.close();
    }
    
    /*
     * 入力された文字列にスペースが含まれているかを確認し、
     * 含まれている場合は作成したSpaceExceptionを発生させる。
     */
    public static void spaceCheck(String s) throws SpaceException{
        if(s.contains(" ")) {
            throw new SpaceException(Message.ME002);
        }else if(s.contains("　")) {
            throw new SpaceException(Message.ME003);
        }else {
            System.out.println("OK");
        }
    }
}
