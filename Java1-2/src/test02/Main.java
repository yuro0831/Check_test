package test02;

public class Main {

    public static void main(String[] args) {
       /*
        * 数字を色んな方法で比較して見る
        */
        
        int a = 3;
        int b = 3;
        int c = 4;
        
        //パターン１
        System.out.println("pattern:a==b");
        if (a == b) {
            System.out.println("結果:TRUE");
        }else {
            System.out.println("結果:FALSE");
        }
        
        //パターン2
        System.out.println("pattern:a!=b");
        if (a != b) {
            System.out.println("結果:TRUE");
        } else {
            System.out.println("結果:FALSE");
        }
        
        //パターン3
        System.out.println("pattern:a>c");
        if (a > c) {
            System.out.println("結果:TRUE");
        } else {
            System.out.println("結果:FALSE");
        }
        
        //パターン４
        System.out.println("pattern:a<c");
        if (a < c) {
            System.out.println("結果:TRUE");
        } else {
            System.out.println("結果:false");
        }
        
        //パターン５
        System.out.println("pttern:a>=b");
        if (a >= b) {
            System.out.println("結果:TRUE");
        } else {
            System.out.println("結果:FALSE");
        }
        
        //パターン6
        System.out.println("pattern:a>=c");
        if (a >= c) {
            System.out.println("結果:TRUE");
        } else {
            System.out.println("結果:FALSE");
        }
        
        //パターン7
        System.out.println("pattern:a<=b");
        if (a <= b) {
            System.out.println("結果:TRUE");
        } else {
            System.out.println("結果:FALSE");
        }
        
        //パターン8
        System.out.println("pattern:a<=c");
        if (a <= c) {
            System.out.println("結果:TRUE");
        } else {
            System.out.println("結果:FALSE");
        }

    }

}