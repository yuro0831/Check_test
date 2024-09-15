package test06;

public class Main {

    public static void main(String[] args) {
       /*
        * 他の型での変換(Java17以降)
        */
        //int型
        int dataInt = 15;
        
        //byte型
        byte dataByte =0;
        
        //合わない型を無理やり当てはめようとすることでエラーが発生する。
       // dataByte = dataInt;
        
        System.out.println(dataInt + ":" + dataByte);

    }

}
