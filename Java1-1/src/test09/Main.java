package test09;

public class Main {

    public static void main(String[] args) {
        /*
         * 2, 変換した値が元の値の許容量を超えてしまうパターン
         */
        int inputData = 257;
        
        byte outputData = 0;
        
        //byte型に入る最大値は127のため、最大値を超える
        //値を代入しようとすると想定外の値を出力する、
        outputData = (byte) inputData ;
        
        System.out.println(inputData + ":" + outputData);
        
    }

}
