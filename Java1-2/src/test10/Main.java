package test10;

public class Main {

    public static void main(String[] args) {
        // 命中したかを判定してみる
        System.out.println("攻撃！");
        
        //命中率を決める変数
        int hit = new java.util.Random().nextInt(10) +1;
        
        //条件分岐、５が入ると、5,4,3,2,1のcaseが動き出す。
        switch (hit) {
            case 10:
            case 9:
            case 8:
                System.out.println("急所に当たった！");
                break;
            case 7:
            case 6:
            case 5:
            case 4:
                System.out.println("当たった！");
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("当たらなかった・・・");
                default:
                    break;
                
        }

    }

}
