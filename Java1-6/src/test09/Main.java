package test09;

public class Main {

    public static void main(String[] args) {
        
        //曲を作るときに出てくるコードがどれだけあるか数えて見る。
        
        //コードの土台を決める音A=ラ G=ソ,　#は半音上げる
        String[] baseCode = { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };
        
        //和音を構築するときのバリエーションを考えてみる
        String[] valCode = {"", "7", "6", "sus4", "m", "m7", "m7(-5)", "m6", "dim", "dim(-5)",
                "aug" };
                
        //コードの数をｋ数えるための変数
        int count = 0;
        
        //コードのの組み合わせを格納してみる
        String[][] codeA = new String[baseCode.length][valCode.length];
        for(int i = 0; i < baseCode.length; i++) {
            //コードのバリエーションを作る
            for (int j = 0; j < valCode.length; i++) {
                codeA[i][j] = baseCode[i] + valCode[j];
                System.out.println(codeA[i][j]);
                count++;
            }
        }
        System.out.println("コードは全部で" + count + "種類");

    }

}
