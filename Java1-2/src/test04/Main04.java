package test04;

public class Main04 {

    public static void main(String[] args) {
        /*
         * 文字列が含まれているか1
         */
        
        String s1 = "こんにちわ。山田です。";
        
        String checkS1 = "こんにちわ";
        // .contains(比較対象の文字列)
        if  (s1.contains(checkS1)) {
            System.out.println("結果:挨拶した");
        } else {
            System.out.println("結果:挨拶していない");
        }
        
        /*
         * 文字列が含まれているか2
         * ※複雑なデータでも文字が含まれていればOK
         */
        
        String s2 = "vranvuoahnvualivfhomcanrfbngvccegfvieawbjfdgavwbensydzfaxbgsbckudnmfyjdxajbekcydfjyngxksbucydjf,naxgkcwebysjdfngkrfmnbrgnfhacmlnruevgnacbl";
        
        String check2 = "gkrfm";
        // .contains(比較対象の文字列)
        if (s2.contains(check2)) {
            System.out.println("結果:含まれている");
        } else {
            System.out.println("結果:含まれていない");
        }
        
        /*
         * 文字列が含まれているか３
         * ""のような文字列が入っていないものは含まれている扱いになるので注意
         */
        
        String s3 = "aaa" ;
        
        String checkS3 = "";
        // .contains(比較対象の文字列)
        if (s3.contains(checkS3)) {
            System.out.println("結果:含まれている");
        } else {
            System.out.println("結果:含まれていない");
        }
        
        /*
         * 文字列が含まれているか4
         * nullはそもそも比較しようとするとエラーを出してしまう。
         */
        
        String s4 = "aaa";
        
        String checkS4 = null;
        // .contains(比較対象の文字列)
        if (s4.contains(checkS4)) {
            System.out.println("結果:含まれている");
        } else {
            System.out.println("結果:含まれていない");
        }

    }

}
