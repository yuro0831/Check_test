package test09;

public class Main {

    public static void main(String[] args) {
        System.out.println("みだれひっかき！！");
        
        //何回攻撃をするか決める変数
        int power = new java.util.Random().nextInt(10) +1;
        
        //攻撃した回数を数える変数
        int chainAttack =0;
        
        //条件分岐、5が入ると、5,4,3,2,1のcaseが動き出す。
        switch (power) {
            case 10:
            //攻撃した回数を数える。+=1で保持している変数+!
                chainAttack+=1;
                System.out.println(chainAttack + "回目");
            case 9:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 8:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 7:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 6:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 5:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 4:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 3:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 2:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
            case 1:
                //攻撃した回数を数える。+=1で保持している変数+!
                    chainAttack+=1;
                    System.out.println(chainAttack + "回目");
                    default:
                        break;
        }
        //最終的に攻撃した回数を数えた結果を格納する。
        System.out.println("合計で"+chainAttack+"回の攻撃を当てた！");

    }

}
