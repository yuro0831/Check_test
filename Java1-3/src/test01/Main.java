package test01;

public class Main {

    public static void main(String[] args) {
        // 各教科の点数
        int sansu = 20;
        int kokugo = 30;
        int rika =40;
        int eigo =50;
        int shakai =80;
        
        //５科目の合計
        int sum = sansu + kokugo + rika + eigo + shakai;
        //5科目の平均
        int avg = sum / 5;
        System.out.println("この方の平均点は" + avg);

    }

}
