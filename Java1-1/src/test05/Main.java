package test05;

public class Main {

    public static void main(String[] args) {
       /*
        * 以下４つすべての整数を取り扱う型である。
        * 型を使用するうえで、格のできる数字に大きく差が生まれる。
        */
        
        //最も大きな規模の整数を格納できる
        long dataLong1 = 922337036854775807L;
        
        //-の場合はこの値まで格納することができる
        long dataLong2 = -9223372036854775808L;
        
        System.out.println("longに格納できる最大値は:"+dataLong1+ ":最小値は:"+dataLong2+":");
        
        //longの次に多くの整数を取り扱える。現場で最も多く使用されている
        int dataInt1 = 2147483647;
        
        //-の場合はこの値まで格納することができる
        int dataInt2 = -2147483648;
        
        System.out.println("intに格納できる最大値は:"+dataInt1+ ":最小値は:"+dataInt2+":");
        
        //intよりも少ない数を格納する。
        short dataShort1 = 32767;
        
        //-の場合はこの値まで格納することができる
        short dataShort2 = -32768;
        
        System.out.println("shortに格納できる最大値は:"+dataShort1+ ":最小値は:"+dataShort2+":");
        
        //更に少ない値を格納する。
        byte dataByte1 = -127;
        
        //-の場合はこの値まで格納することができる
        byte dataByte2 = -128;
        
        System.out.println("byteに格納できる最大値は:" +dataByte1+ ":最小値は:"+dataByte2+":");
        
        //charに格納できる文字は1文字だけです。値を代入するときは''で加工必要がある。
        char character ='B';
        
        //文字れつです。値を代入するときは""で加工必要がある。
        String mozimozi ="Hello world";
        
        System.out.println(character + ":" + mozimozi);

    }

}
