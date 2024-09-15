package test04;

public class Main {
    public static void main(String[] args) {
        //２次元配列の宣言。
        //変数作成と宣言は1行でまとめることも可能です。
        int[][] graph = new int[9][9];
        
        /*
         * 九のデータを格納してみる。 「0」始まりに注意
         */
        //１の段
        graph[0][0] = 1;
        graph[0][1] = 2;
        graph[0][2] = 3;
        graph[0][3] = 4;
        graph[0][4] = 5;
        graph[0][5] = 6;
        graph[0][6] = 7;
        graph[0][7] = 8;
        graph[0][8] = 9;
        
     // 2の段
        graph[1][0] = 2;
        graph[1][1] = 4;
        graph[1][2] = 6;
        graph[1][3] = 8;
        graph[1][4] = 10;
        graph[1][5] = 12;
        graph[1][6] = 14;
        graph[1][7] = 16;
        graph[1][8] = 18;

        // 3の段
        graph[2][0] = 3;
        graph[2][1] = 6;
        graph[2][2] = 9;
        graph[2][3] = 12;
        graph[2][4] = 15;
        graph[2][5] = 18;
        graph[2][6] = 21;
        graph[2][7] = 24;
        graph[2][8] = 27;

        // 4の段
        graph[3][0] = 4;
        graph[3][1] = 8;
        graph[3][2] = 12;
        graph[3][3] = 16;
        graph[3][4] = 20;
        graph[3][5] = 24;
        graph[3][6] = 28;
        graph[3][7] = 32;
        graph[3][8] = 36;

        // 5の段
        graph[4][0] = 5;
        graph[4][1] = 10;
        graph[4][2] = 15;
        graph[4][3] = 20;
        graph[4][4] = 25;
        graph[4][5] = 30;
        graph[4][6] = 35;
        graph[4][7] = 40;
        graph[4][8] = 45;

        // 6の段
        graph[5][0] = 6;
        graph[5][1] = 12;
        graph[5][2] = 18;
        graph[5][3] = 24;
        graph[5][4] = 30;
        graph[5][5] = 36;
        graph[5][6] = 42;
        graph[5][7] = 48;
        graph[5][8] = 56;

        // 7の段
        graph[6][0] = 7;
        graph[6][1] = 14;
        graph[6][2] = 21;
        graph[6][3] = 28;
        graph[6][4] = 35;
        graph[6][5] = 42;
        graph[6][6] = 49;
        graph[6][7] = 56;
        graph[6][8] = 63;

        // 8の段
        graph[7][0] = 8;
        graph[7][1] = 16;
        graph[7][2] = 24;
        graph[7][3] = 32;
        graph[7][4] = 40;
        graph[7][5] = 48;
        graph[7][6] = 56;
        graph[7][7] = 64;
        graph[7][8] = 72;

        // 9の段
        graph[8][0] = 9;
        graph[8][1] = 18;
        graph[8][2] = 27;
        graph[8][3] = 36;
        graph[8][4] = 45;
        graph[8][5] = 54;
        graph[8][6] = 63;
        graph[8][7] = 72;
        graph[8][8] = 81;
        
        //九九の答えを格納された答えから出力して見る。
        System.out.println("九九なら全部答えるよ");
        
        int x = new java.util.Random().nextInt(9);
        int y = new java.util.Random().nextInt(9);
        
        System.out.println((x + 1) +"と" +(y + 1) +"の答えは");
        System.out.println(graph[x][y]+"だって！");
    }

}
